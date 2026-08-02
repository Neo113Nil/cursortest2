package ru.CryptoPro.JCP.VMInspector;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarOutputStream;

/* loaded from: classes4.dex */
public class CorruptJar {
    private static final int BUFFER_SIZE = 4096;
    public static final String CORRUP_EXT = ".corrupt";
    public static final String STR_USAGE = "Use CorruptJar with file name argument";
    private static final byte[] buffer = new byte[4096];

    private CorruptJar() {
    }

    public static void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        int read;
        do {
            byte[] bArr = buffer;
            read = inputStream.read(bArr, 0, bArr.length);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            }
        } while (read != -1);
    }

    public static void main(String[] strArr) throws IOException {
        JarOutputStream jarOutputStream;
        JarFile jarFile;
        if (strArr.length != 1) {
            System.out.getClass();
            return;
        }
        String str = strArr[0];
        JarFile jarFile2 = null;
        try {
            jarFile = new JarFile(str);
            try {
                jarOutputStream = new JarOutputStream(new FileOutputStream(str + CORRUP_EXT));
            } catch (Throwable th) {
                th = th;
                jarOutputStream = null;
            }
        } catch (Throwable th2) {
            th = th2;
            jarOutputStream = null;
        }
        try {
            proc(jarFile, jarOutputStream);
            setEntry(jarOutputStream, CORRUP_EXT, new ByteArrayInputStream(CORRUP_EXT.getBytes()));
            jarFile.close();
            jarOutputStream.close();
        } catch (Throwable th3) {
            th = th3;
            jarFile2 = jarFile;
            if (jarFile2 != null) {
                jarFile2.close();
            }
            if (jarOutputStream != null) {
                jarOutputStream.close();
            }
            throw th;
        }
    }

    public static void proc(JarFile jarFile, JarOutputStream jarOutputStream) throws IOException {
        Enumeration<JarEntry> entries = jarFile.entries();
        while (entries.hasMoreElements()) {
            procEntry(jarFile, entries.nextElement(), jarOutputStream);
        }
    }

    public static void procEntry(JarFile jarFile, JarEntry jarEntry, JarOutputStream jarOutputStream) throws IOException {
        InputStream inputStream;
        JarEntry jarEntry2 = new JarEntry(jarEntry.getName());
        jarEntry2.setMethod(jarEntry.getMethod());
        jarEntry2.setTime(jarEntry.getTime());
        jarOutputStream.putNextEntry(jarEntry2);
        try {
            inputStream = jarFile.getInputStream(jarEntry);
            try {
                copy(inputStream, jarOutputStream);
                if (inputStream != null) {
                    inputStream.close();
                }
                jarOutputStream.closeEntry();
            } catch (Throwable th) {
                th = th;
                if (inputStream != null) {
                    inputStream.close();
                }
                jarOutputStream.closeEntry();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static void setEntry(JarOutputStream jarOutputStream, String str, InputStream inputStream) throws IOException {
        jarOutputStream.putNextEntry(new JarEntry(str));
        try {
            copy(inputStream, jarOutputStream);
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            jarOutputStream.closeEntry();
        }
    }
}
