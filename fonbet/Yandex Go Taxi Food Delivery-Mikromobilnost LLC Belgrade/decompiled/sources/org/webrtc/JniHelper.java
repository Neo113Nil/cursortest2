package org.webrtc;

import defpackage.kbs;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* loaded from: classes4.dex */
class JniHelper {
    public static Object getKey(Map.Entry entry) {
        return entry.getKey();
    }

    public static byte[] getStringBytes(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException unused) {
            kbs.g("ISO-8859-1 is unsupported");
            return null;
        }
    }

    public static Object getStringClass() {
        return String.class;
    }

    public static Object getValue(Map.Entry entry) {
        return entry.getValue();
    }
}
