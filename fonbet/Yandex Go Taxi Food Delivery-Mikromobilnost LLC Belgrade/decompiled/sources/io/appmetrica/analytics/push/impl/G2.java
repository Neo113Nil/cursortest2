package io.appmetrica.analytics.push.impl;

import io.appmetrica.analytics.push.logger.internal.PublicLogger;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.net.URL;

/* loaded from: classes4.dex */
public final class G2 implements D0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x002d: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:36:0x002d */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.io.Closeable] */
    @Override // io.appmetrica.analytics.push.impl.D0
    public final byte[] a(String str) {
        OutOfMemoryError e;
        Closeable closeable;
        Exception e2;
        Closeable closeable2;
        Closeable closeable3;
        ByteArrayOutputStream byteArrayOutputStream;
        Closeable closeable4;
        Closeable closeable5;
        Closeable closeable6;
        Closeable closeable7 = null;
        r0 = null;
        byte[] bArr = null;
        closeable7 = null;
        try {
            try {
                str = new URL(str).openConnection().getInputStream();
            } catch (Throwable th) {
                th = th;
                closeable7 = closeable3;
            }
        } catch (Exception e3) {
            e2 = e3;
            closeable2 = null;
        } catch (OutOfMemoryError e4) {
            e = e4;
            closeable = null;
        } catch (Throwable th2) {
            th = th2;
            str = 0;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr2 = new byte[1024];
                while (true) {
                    int read = str.read(bArr2);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr2, 0, read);
                }
                bArr = byteArrayOutputStream.toByteArray();
                closeable6 = str;
            } catch (Exception e5) {
                e2 = e5;
                closeable5 = str;
                PublicLogger.INSTANCE.error(e2, e2.getMessage(), new Object[0]);
                closeable6 = closeable5;
                H2.a(closeable6);
                H2.a(byteArrayOutputStream);
                return bArr;
            } catch (OutOfMemoryError e6) {
                e = e6;
                closeable4 = str;
                PublicLogger.INSTANCE.error(e, e.getMessage(), new Object[0]);
                closeable6 = closeable4;
                H2.a(closeable6);
                H2.a(byteArrayOutputStream);
                return bArr;
            }
        } catch (Exception e7) {
            e2 = e7;
            closeable2 = str;
            byteArrayOutputStream = null;
            closeable5 = closeable2;
            PublicLogger.INSTANCE.error(e2, e2.getMessage(), new Object[0]);
            closeable6 = closeable5;
            H2.a(closeable6);
            H2.a(byteArrayOutputStream);
            return bArr;
        } catch (OutOfMemoryError e8) {
            e = e8;
            closeable = str;
            byteArrayOutputStream = null;
            closeable4 = closeable;
            PublicLogger.INSTANCE.error(e, e.getMessage(), new Object[0]);
            closeable6 = closeable4;
            H2.a(closeable6);
            H2.a(byteArrayOutputStream);
            return bArr;
        } catch (Throwable th3) {
            th = th3;
            H2.a((Closeable) str);
            H2.a(closeable7);
            throw th;
        }
        H2.a(closeable6);
        H2.a(byteArrayOutputStream);
        return bArr;
    }
}
