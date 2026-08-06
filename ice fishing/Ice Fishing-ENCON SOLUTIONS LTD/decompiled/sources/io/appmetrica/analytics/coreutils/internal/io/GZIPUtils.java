package io.appmetrica.analytics.coreutils.internal.io;

import R1.l;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public final class GZIPUtils {
    public static final GZIPUtils INSTANCE = new GZIPUtils();

    private GZIPUtils() {
    }

    public static final byte[] gzipBytes(byte[] bArr) {
        GZIPOutputStream gZIPOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr2 = null;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        if (bArr != null) {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = null;
                }
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream = null;
            }
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.finish();
                bArr2 = byteArrayOutputStream.toByteArray();
                CloseableUtilsKt.closeSafely(gZIPOutputStream);
                CloseableUtilsKt.closeSafely(byteArrayOutputStream);
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream2 = byteArrayOutputStream;
                CloseableUtilsKt.closeSafely(gZIPOutputStream);
                CloseableUtilsKt.closeSafely(byteArrayOutputStream2);
                throw th;
            }
        }
        return bArr2;
    }

    public static final byte[] unGzipBytes(byte[] bArr) {
        Throwable th;
        GZIPInputStream gZIPInputStream;
        ByteArrayInputStream byteArrayInputStream;
        byte[] bArr2 = null;
        ByteArrayInputStream byteArrayInputStream2 = null;
        if (bArr != null) {
            try {
                ByteArrayInputStream byteArrayInputStream3 = new ByteArrayInputStream(bArr);
                try {
                    gZIPInputStream = new GZIPInputStream(byteArrayInputStream3);
                    try {
                        bArr2 = l.w(gZIPInputStream);
                        CloseableUtilsKt.closeSafely(gZIPInputStream);
                        CloseableUtilsKt.closeSafely(byteArrayInputStream3);
                    } catch (Throwable th2) {
                        byteArrayInputStream = byteArrayInputStream3;
                        th = th2;
                        byteArrayInputStream2 = byteArrayInputStream;
                        CloseableUtilsKt.closeSafely(gZIPInputStream);
                        CloseableUtilsKt.closeSafely(byteArrayInputStream2);
                        throw th;
                    }
                } catch (Throwable th3) {
                    byteArrayInputStream = byteArrayInputStream3;
                    th = th3;
                    gZIPInputStream = null;
                }
            } catch (Throwable th4) {
                th = th4;
                gZIPInputStream = null;
            }
        }
        return bArr2;
    }
}
