package com.plaid.internal;

import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.plaid.internal.v1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0306v1 {
    public static byte[] a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
            gZIPOutputStream.flush();
            a(gZIPOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            a(gZIPOutputStream);
            throw th;
        }
    }

    public static LinkedHashMap b(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String encodedQuery = Uri.parse(str).getEncodedQuery();
        if (encodedQuery != null) {
            int length = encodedQuery.length();
            int i = 0;
            while (true) {
                int indexOf = encodedQuery.indexOf(38, i);
                int i2 = indexOf != -1 ? indexOf : length;
                int indexOf2 = encodedQuery.indexOf(61, i);
                if (indexOf2 > i2 || indexOf2 == -1) {
                    indexOf2 = i2;
                }
                String decode = Uri.decode(encodedQuery.substring(i, indexOf2));
                if (indexOf2 == i2) {
                    linkedHashMap.put(decode, "");
                } else {
                    linkedHashMap.put(decode, Uri.decode(encodedQuery.substring(indexOf2 + 1, i2)));
                }
                if (indexOf == -1) {
                    break;
                }
                i = indexOf + 1;
            }
        }
        return linkedHashMap;
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
