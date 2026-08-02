package io.appmetrica.analytics.coreutils.internal.io;

import defpackage.rzo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lio/appmetrica/analytics/coreutils/internal/io/GZIPUtils;", "", "", "input", "gzipBytes", "unGzipBytes", "core-utils_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class GZIPUtils {
    public static final GZIPUtils INSTANCE = new GZIPUtils();

    private GZIPUtils() {
    }

    public static final byte[] gzipBytes(byte[] input) throws IOException {
        GZIPOutputStream gZIPOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        if (input == null) {
            return null;
        }
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
            gZIPOutputStream.write(input);
            gZIPOutputStream.finish();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            CloseableUtils.closeSafely(gZIPOutputStream);
            CloseableUtils.closeSafely(byteArrayOutputStream);
            return byteArray;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream2 = byteArrayOutputStream;
            CloseableUtils.closeSafely(gZIPOutputStream);
            CloseableUtils.closeSafely(byteArrayOutputStream2);
            throw th;
        }
    }

    public static final byte[] unGzipBytes(byte[] input) throws IOException {
        Throwable th;
        GZIPInputStream gZIPInputStream;
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayInputStream byteArrayInputStream2 = null;
        if (input == null) {
            return null;
        }
        try {
            ByteArrayInputStream byteArrayInputStream3 = new ByteArrayInputStream(input);
            try {
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream3);
                try {
                    byte[] R = rzo.R(gZIPInputStream);
                    CloseableUtils.closeSafely(gZIPInputStream);
                    CloseableUtils.closeSafely(byteArrayInputStream3);
                    return R;
                } catch (Throwable th2) {
                    byteArrayInputStream = byteArrayInputStream3;
                    th = th2;
                    byteArrayInputStream2 = byteArrayInputStream;
                    CloseableUtils.closeSafely(gZIPInputStream);
                    CloseableUtils.closeSafely(byteArrayInputStream2);
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
}
