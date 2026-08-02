package com.netcetera.threeds.sdk.infrastructure;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.io.UnsupportedEncodingException;

/* loaded from: classes5.dex */
public class rr {
    public static String ThreeDS2Service(byte[] bArr, String str) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, str);
        } catch (UnsupportedEncodingException unused) {
            throw ThreeDS2ServiceInstance(str);
        }
    }

    private static IllegalStateException ThreeDS2ServiceInstance(String str) {
        return new IllegalStateException(Recorder$$ExternalSyntheticOutline2.m("Unknown or unsupported character set name: ", str));
    }

    public static byte[] get(String str) {
        return getWarnings(str, "US-ASCII");
    }

    public static byte[] getWarnings(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(str2);
        } catch (UnsupportedEncodingException unused) {
            throw ThreeDS2ServiceInstance(str2);
        }
    }

    public static String initialize(byte[] bArr) {
        return ThreeDS2Service(bArr, "UTF-8");
    }

    public static byte[] ThreeDS2Service(String str) {
        return getWarnings(str, "UTF-8");
    }
}
