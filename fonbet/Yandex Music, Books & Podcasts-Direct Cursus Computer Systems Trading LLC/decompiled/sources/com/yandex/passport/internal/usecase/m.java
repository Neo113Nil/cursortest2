package com.yandex.passport.internal.usecase;

import android.os.Build;
import android.util.Base64;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.x6;
import defpackage.btd;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.uz0;
import defpackage.z7o;
import java.io.Serializable;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* loaded from: classes4.dex */
public final class m {
    public final e1 a;
    public final com.yandex.passport.internal.report.reporters.w b;
    public final com.yandex.passport.internal.flags.i c;
    public final btd d;

    public m(com.yandex.passport.internal.flags.i iVar, com.yandex.passport.internal.report.reporters.w wVar, e1 e1Var) {
        e1Var.getClass();
        wVar.getClass();
        iVar.getClass();
        this.a = e1Var;
        this.b = wVar;
        this.c = iVar;
        this.d = Build.VERSION.SDK_INT >= 26 ? new btd(new l(0), 4) : null;
    }

    public final byte[] a(String str, byte[] bArr) {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        byte[] j = uz0.j(bArr, 0, 12);
        byte[] j2 = uz0.j(bArr, 12, bArr.length);
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, j);
        Serializable a = this.a.a(str, "decrypt");
        qgg.h0(a);
        cipher.init(2, (SecretKey) a, gCMParameterSpec);
        byte[] doFinal = cipher.doFinal(j2);
        doFinal.getClass();
        return doFinal;
    }

    public final byte[] b(String str, byte[] bArr) {
        Cipher cipher;
        byte[] doFinal;
        btd btdVar = this.d;
        if (btdVar == null || (cipher = (Cipher) btdVar.get()) == null) {
            cipher = Cipher.getInstance("AES/GCM/NoPadding");
        }
        byte[] j = uz0.j(bArr, 0, 12);
        byte[] j2 = uz0.j(bArr, 12, bArr.length);
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, j);
        Serializable a = this.a.a(str, "decrypt");
        qgg.h0(a);
        SecretKey secretKey = (SecretKey) a;
        cipher.getClass();
        synchronized (cipher) {
            cipher.init(2, secretKey, gCMParameterSpec);
            doFinal = cipher.doFinal(j2);
            doFinal.getClass();
        }
        return doFinal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [t7o] */
    public final Serializable c(String str, String str2) {
        String str3;
        try {
            r7o r7oVar = z7o.b;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            str3 = new t7o(th);
        }
        if (str == null) {
            str = null;
        } else {
            try {
                byte[] decode = Base64.decode(str, 2);
                decode.getClass();
                byte[] bytes = "PASSPORT_ENCRYPTED:".getBytes(e1.d);
                bytes.getClass();
                if (decode.length >= bytes.length) {
                    int length = bytes.length;
                    for (int i = 0; i < length; i++) {
                        if (decode[i] != bytes[i]) {
                            break;
                        }
                    }
                    byte[] j = uz0.j(decode, bytes.length, decode.length);
                    str3 = (!((Boolean) this.c.b(com.yandex.passport.internal.flags.o.t0)).booleanValue() || Build.VERSION.SDK_INT < 26) ? new String(a(str2, j), e1.d) : new String(b(str2, j), e1.d);
                    str = str3;
                }
            } catch (IllegalArgumentException e) {
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "decoded exception: " + e, 8);
                }
            }
        }
        Throwable a = z7o.a(str);
        if (a != null) {
            com.yandex.passport.internal.report.reporters.w wVar = this.b;
            wVar.getClass();
            wVar.n(x6.d, new ff(a), new com.yandex.passport.internal.report.f(str2, 11));
        }
        return str;
    }
}
