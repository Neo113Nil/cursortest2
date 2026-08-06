package io.appmetrica.analytics.coreutils.internal.io;

import R1.l;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.util.zip.GZIPInputStream;
import z1.a;

/* loaded from: classes.dex */
public final class Base64Utils {
    public static final Base64Utils INSTANCE = new Base64Utils();
    public static final int IO_BUFFER_SIZE = 4096;

    private Base64Utils() {
    }

    public static final String compressBase64(byte[] bArr) {
        try {
            return Base64.encodeToString(GZIPUtils.gzipBytes(bArr), 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final String compressBase64String(String str) {
        byte[] bytes;
        if (str != null) {
            try {
                bytes = str.getBytes(a.f8620a);
            } catch (Throwable unused) {
                return null;
            }
        } else {
            bytes = null;
        }
        return compressBase64(bytes);
    }

    public static final byte[] decompressBase64GzipAsBytes(String str) {
        GZIPInputStream gZIPInputStream;
        byte[] bArr;
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(Base64.decode(str, 0));
            try {
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream2);
                try {
                    bArr = l.w(gZIPInputStream);
                } catch (Throwable unused) {
                    byteArrayInputStream = byteArrayInputStream2;
                    try {
                        bArr = new byte[0];
                        byteArrayInputStream2 = byteArrayInputStream;
                        return bArr;
                    } finally {
                        CloseableUtilsKt.closeSafely(gZIPInputStream);
                        CloseableUtilsKt.closeSafely(byteArrayInputStream);
                    }
                }
            } catch (Throwable unused2) {
                gZIPInputStream = null;
            }
        } catch (Throwable unused3) {
            gZIPInputStream = null;
        }
        return bArr;
    }

    public static final String decompressBase64GzipAsString(String str) {
        try {
            return new String(decompressBase64GzipAsBytes(str), a.f8620a);
        } catch (Throwable unused) {
            return null;
        }
    }
}
