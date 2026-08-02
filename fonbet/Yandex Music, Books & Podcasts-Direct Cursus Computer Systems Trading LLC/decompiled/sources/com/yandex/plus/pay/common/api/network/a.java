package com.yandex.plus.pay.common.api.network;

import defpackage.fi3;
import defpackage.hi3;
import defpackage.twh;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {
    public final hi3 a;
    public final twh b;
    public final String c;

    public a(hi3 hi3Var, twh twhVar, String str) {
        this.a = hi3Var;
        this.b = twhVar;
        this.c = str;
    }

    public final void a(com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar) {
        Throwable th;
        GZIPInputStream gZIPInputStream;
        aVar.r("-- BODY --");
        String str = this.c;
        boolean z = str == null || "identity".equalsIgnoreCase(str);
        boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(str);
        hi3 hi3Var = this.a;
        if (z) {
            b(aVar, hi3Var.clone());
            return;
        }
        if (!equalsIgnoreCase) {
            com.yandex.plus.home.plaque.animator.internal.utils.a.a(aVar, "Body with unknown encoding '" + str + "'.");
            return;
        }
        hi3 clone = hi3Var.clone();
        if (clone.b >= 2) {
            hi3 hi3Var2 = new hi3();
            clone.I(hi3Var2, 0L, 2L);
            byte[] X = hi3Var2.X(hi3Var2.b);
            if (X[0] == 31 && X[1] == -117) {
                hi3 hi3Var3 = new hi3();
                GZIPInputStream gZIPInputStream2 = null;
                try {
                    try {
                        try {
                            gZIPInputStream = new GZIPInputStream(new fi3(clone, 0));
                        } catch (IOException unused) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        hi3Var3.j0(gZIPInputStream);
                        b(aVar, hi3Var3);
                        gZIPInputStream.close();
                    } catch (IOException unused2) {
                        gZIPInputStream2 = gZIPInputStream;
                        com.yandex.plus.home.plaque.animator.internal.utils.a.a(aVar, "Failed to decode gzipped body buffer.");
                        if (gZIPInputStream2 != null) {
                            gZIPInputStream2.close();
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                        gZIPInputStream2 = gZIPInputStream;
                        if (gZIPInputStream2 == null) {
                            throw th;
                        }
                        try {
                            gZIPInputStream2.close();
                            throw th;
                        } catch (IOException unused3) {
                            throw th;
                        }
                    }
                    return;
                } catch (IOException unused4) {
                    return;
                }
            }
        }
        com.yandex.plus.home.plaque.animator.internal.utils.a.a(aVar, "Content-encoding is GZIP, but the GZIP magic header is missing.");
    }

    public final void b(com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar, hi3 hi3Var) {
        hi3 hi3Var2;
        hi3 hi3Var3;
        int i;
        try {
            twh twhVar = this.b;
            Charset a = twhVar != null ? twhVar.a(null) : null;
            if (a == null) {
                a = c.b;
                a.getClass();
            }
            if (Intrinsics.d(c.b, a)) {
                try {
                    hi3Var2 = new hi3();
                    long j = hi3Var.b;
                    hi3Var3 = hi3Var;
                    hi3Var3.I(hi3Var2, 0L, j < 64 ? j : 64L);
                } catch (EOFException unused) {
                }
                for (i = 0; i < 16; i++) {
                    if (hi3Var2.N()) {
                        break;
                    }
                    int H0 = hi3Var2.H0();
                    if (Character.isISOControl(H0) && !Character.isWhitespace(H0)) {
                        com.yandex.plus.home.plaque.animator.internal.utils.a.a(aVar, "Buffer did not contain UTF-8 plaintext, but should have had.");
                        return;
                    }
                }
            } else {
                hi3Var3 = hi3Var;
            }
            aVar.r(hi3Var3.F0(hi3Var3.b, a));
        } catch (UnsupportedCharsetException unused2) {
            com.yandex.plus.home.plaque.animator.internal.utils.a.a(aVar, "Charset is likely malformed.");
        }
    }
}
