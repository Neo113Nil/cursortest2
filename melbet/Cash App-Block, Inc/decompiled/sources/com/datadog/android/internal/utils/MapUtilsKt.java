package com.datadog.android.internal.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes4.dex */
public abstract class MapUtilsKt {
    public static final Object NULL_MAP_VALUE = new Object();

    public static final String loggableStackTrace(Throwable th) {
        th.getClass();
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        stringWriter2.getClass();
        return stringWriter2;
    }

    public static final String toHexString(byte[] bArr) {
        bArr.getClass();
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append("0123456789abcdef".charAt((b & 255) >>> 4));
            sb.append("0123456789abcdef".charAt(b & 15));
        }
        return sb.toString();
    }
}
