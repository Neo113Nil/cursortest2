package com.yandex.passport.internal.usecase;

import android.os.Build;
import android.util.Base64;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.y6;
import defpackage.btd;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* loaded from: classes4.dex */
public final class n {
    public final e1 a;
    public final com.yandex.passport.internal.flags.i b;
    public final com.yandex.passport.internal.report.reporters.w c;
    public final btd d;

    public n(com.yandex.passport.internal.flags.i iVar, com.yandex.passport.internal.report.reporters.w wVar, e1 e1Var) {
        e1Var.getClass();
        iVar.getClass();
        wVar.getClass();
        this.a = e1Var;
        this.b = iVar;
        this.c = wVar;
        this.d = Build.VERSION.SDK_INT >= 26 ? new btd(new l(1), 5) : null;
    }

    public static byte[] a(byte[] bArr, SecretKey secretKey) {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, secretKey);
        byte[] doFinal = cipher.doFinal(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bytes = "PASSPORT_ENCRYPTED:".getBytes(e1.d);
        bytes.getClass();
        byteArrayOutputStream.write(bytes);
        byteArrayOutputStream.write(cipher.getIV());
        byteArrayOutputStream.write(doFinal);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    public final byte[] b(byte[] bArr, SecretKey secretKey) {
        Cipher cipher;
        byte[] byteArray;
        btd btdVar = this.d;
        if (btdVar == null || (cipher = (Cipher) btdVar.get()) == null) {
            cipher = Cipher.getInstance("AES/GCM/NoPadding");
        }
        cipher.getClass();
        synchronized (cipher) {
            cipher.init(1, secretKey);
            byte[] doFinal = cipher.doFinal(bArr);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bytes = "PASSPORT_ENCRYPTED:".getBytes(e1.d);
            bytes.getClass();
            byteArrayOutputStream.write(bytes);
            byteArrayOutputStream.write(cipher.getIV());
            byteArrayOutputStream.write(doFinal);
            byteArray = byteArrayOutputStream.toByteArray();
            byteArray.getClass();
        }
        return byteArray;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [t7o] */
    public final Serializable c(String str, String str2) {
        byte[] a;
        com.yandex.passport.internal.flags.i iVar = this.b;
        try {
            r7o r7oVar = z7o.b;
            if ((((Boolean) iVar.b(com.yandex.passport.internal.flags.o.g0)).booleanValue() || ((Boolean) iVar.b(com.yandex.passport.internal.flags.o.f0)).booleanValue()) && !((List) iVar.b(com.yandex.passport.internal.flags.o.s0)).contains(Build.MODEL)) {
                if (str != null) {
                    boolean booleanValue = ((Boolean) iVar.b(com.yandex.passport.internal.flags.o.t0)).booleanValue();
                    e1 e1Var = this.a;
                    if (!booleanValue || Build.VERSION.SDK_INT < 26) {
                        byte[] bytes = str.getBytes(e1.d);
                        bytes.getClass();
                        Serializable a2 = e1Var.a(str2, "encrypt");
                        qgg.h0(a2);
                        a = a(bytes, (SecretKey) a2);
                    } else {
                        byte[] bytes2 = str.getBytes(e1.d);
                        bytes2.getClass();
                        Serializable a3 = e1Var.a(str2, "encrypt");
                        qgg.h0(a3);
                        a = b(bytes2, (SecretKey) a3);
                    }
                    str = Base64.encodeToString(a, 2);
                    str.getClass();
                } else {
                    str = null;
                }
            }
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            str = new t7o(th);
        }
        Throwable a4 = z7o.a(str);
        if (a4 != null) {
            com.yandex.passport.internal.report.reporters.w wVar = this.c;
            wVar.getClass();
            wVar.n(y6.d, new ff(a4), new com.yandex.passport.internal.report.f(str2, 11));
        }
        return str;
    }
}
