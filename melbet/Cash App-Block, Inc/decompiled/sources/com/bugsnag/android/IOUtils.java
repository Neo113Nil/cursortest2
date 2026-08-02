package com.bugsnag.android;

import com.squareup.cash.clientroutes.ClientRoute;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.Writer;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class IOUtils {
    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void copy(BufferedReader bufferedReader, Writer writer) {
        char[] cArr = new char[4096];
        while (true) {
            int read = bufferedReader.read(cArr);
            if (-1 == read) {
                return;
            } else {
                writer.write(cArr, 0, read);
            }
        }
    }

    public static void deleteFile(File file, Logger logger) {
        try {
            if (file.delete()) {
                return;
            }
            file.deleteOnExit();
        } catch (Exception e) {
            logger.w("Failed to delete file", e);
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewLinkedBankAccounts.deepLinkSpecs;
    }
}
