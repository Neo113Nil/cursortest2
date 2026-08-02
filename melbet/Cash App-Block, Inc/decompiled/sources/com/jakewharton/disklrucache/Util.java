package com.jakewharton.disklrucache;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.Closeable;
import java.io.File;
import java.nio.charset.Charset;

/* loaded from: classes4.dex */
public abstract class Util {
    public static final Charset US_ASCII = Charset.forName("US-ASCII");
    public static final Charset UTF_8 = Charset.forName("UTF-8");

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void deleteContents(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            a$$ExternalSyntheticBUOutline0.m$3(file, "not a readable directory: ");
            return;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                deleteContents(file2);
            }
            if (!file2.delete()) {
                a$$ExternalSyntheticBUOutline0.m$3(file2, "failed to delete file: ");
                return;
            }
        }
    }
}
