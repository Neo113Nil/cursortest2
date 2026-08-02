package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.d85;
import defpackage.hq5;
import defpackage.oq5;
import defpackage.vci;
import defpackage.xmn;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.kc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1113kc {
    public static final void a(vci vciVar, @NotNull T8 t8, hq5 hq5Var, int i) {
        T8 t82;
        U8 u8 = U8.Themed;
        t8.getClass();
        u8.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-270403371);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(t8) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(u8) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            t82 = t8;
        } else {
            oq5Var.a0(2137911767);
            oq5Var.a0(-888501717);
            long j = ((d85) ((Vb) oq5Var.j(Wb.a)).m.getValue()).a;
            oq5Var.p(false);
            oq5Var.p(false);
            vci vciVar2 = vci.a;
            t82 = t8;
            S8.a(vciVar2, t82, j, oq5Var, i2 & 126, 0);
            vciVar = vciVar2;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new C1099jc(vciVar, t82, i);
        }
    }
}
