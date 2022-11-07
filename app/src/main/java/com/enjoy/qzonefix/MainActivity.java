package com.enjoy.qzonefix;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Utils.test();


        //pathClassloader->BootClassLoader
        ClassLoader parent = MainActivity.class.getClassLoader().getParent();
    }

}
