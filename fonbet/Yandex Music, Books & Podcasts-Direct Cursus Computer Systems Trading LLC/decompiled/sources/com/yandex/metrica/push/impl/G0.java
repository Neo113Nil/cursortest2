package com.yandex.metrica.push.impl;

import com.yandex.metrica.push.common.utils.PublicLogger;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.net.URL;

/* loaded from: classes3.dex */
public class G0 implements D0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x002c: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:45), block:B:37:0x002c */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.io.Closeable] */
    @Override // com.yandex.metrica.push.impl.D0
    public byte[] a(String str) {
        Throwable th;
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
        r1 = null;
        byte[] bArr = null;
        closeable7 = null;
        try {
            try {
                str = new URL(str).openConnection().getInputStream();
            } catch (Throwable th2) {
                th = th2;
                closeable7 = closeable3;
            }
        } catch (Exception e3) {
            e2 = e3;
            closeable2 = null;
        } catch (OutOfMemoryError e4) {
            e = e4;
            closeable = null;
        } catch (Throwable th3) {
            th = th3;
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
                PublicLogger.e(e2, e2.getMessage(), new Object[0]);
                closeable6 = closeable5;
                com.yandex.metrica.push.utils.f.a(closeable6);
                com.yandex.metrica.push.utils.f.a(byteArrayOutputStream);
                return bArr;
            } catch (OutOfMemoryError e6) {
                e = e6;
                closeable4 = str;
                PublicLogger.e(e, e.getMessage(), new Object[0]);
                closeable6 = closeable4;
                com.yandex.metrica.push.utils.f.a(closeable6);
                com.yandex.metrica.push.utils.f.a(byteArrayOutputStream);
                return bArr;
            }
        } catch (Exception e7) {
            e2 = e7;
            closeable2 = str;
            byteArrayOutputStream = null;
            closeable5 = closeable2;
            PublicLogger.e(e2, e2.getMessage(), new Object[0]);
            closeable6 = closeable5;
            com.yandex.metrica.push.utils.f.a(closeable6);
            com.yandex.metrica.push.utils.f.a(byteArrayOutputStream);
            return bArr;
        } catch (OutOfMemoryError e8) {
            e = e8;
            closeable = str;
            byteArrayOutputStream = null;
            closeable4 = closeable;
            PublicLogger.e(e, e.getMessage(), new Object[0]);
            closeable6 = closeable4;
            com.yandex.metrica.push.utils.f.a(closeable6);
            com.yandex.metrica.push.utils.f.a(byteArrayOutputStream);
            return bArr;
        } catch (Throwable th4) {
            th = th4;
            com.yandex.metrica.push.utils.f.a((Closeable) str);
            com.yandex.metrica.push.utils.f.a(closeable7);
            throw th;
        }
        com.yandex.metrica.push.utils.f.a(closeable6);
        com.yandex.metrica.push.utils.f.a(byteArrayOutputStream);
        return bArr;
    }
}
