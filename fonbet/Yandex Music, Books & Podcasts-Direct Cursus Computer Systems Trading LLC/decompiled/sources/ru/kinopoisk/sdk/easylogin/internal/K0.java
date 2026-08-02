package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.act;
import defpackage.fgq;
import defpackage.gq5;
import defpackage.hq5;
import defpackage.irf;
import defpackage.jyn;
import defpackage.m85;
import defpackage.nya;
import defpackage.oq5;
import defpackage.w4k;
import defpackage.weo;
import defpackage.wje;
import defpackage.xmn;
import defpackage.yci;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class K0 {
    public static final void a(@NotNull w4k w4kVar, yci yciVar, float f, act actVar, jyn jynVar, m85 m85Var, hq5 hq5Var, int i) {
        w4k w4kVar2;
        int i2;
        act S;
        int i3;
        jyn jynVar2;
        float f2;
        act actVar2;
        float f3;
        w4kVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-146887300);
        if ((i & 6) == 0) {
            w4kVar2 = w4kVar;
            i2 = (oq5Var.h(w4kVar2) ? 4 : 2) | i;
        } else {
            w4kVar2 = w4kVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        int i4 = i2 | 3456;
        if ((i & 24576) == 0) {
            i4 = i2 | 11648;
        }
        int i5 = 196608 | i4;
        if ((1572864 & i) == 0) {
            i5 |= oq5Var.f(m85Var) ? 1048576 : 524288;
        }
        int i6 = i5 | 12582912;
        if ((4793491 & i6) == 4793490 && oq5Var.z()) {
            oq5Var.S();
            f3 = f;
            actVar2 = actVar;
            jynVar2 = jynVar;
        } else {
            oq5Var.U();
            if ((i & 1) == 0 || oq5Var.y()) {
                S = weo.S(1332, 0, nya.d, 2);
                i3 = i6 & (-57345);
                jynVar2 = jyn.a;
                f2 = 360.0f;
            } else {
                oq5Var.S();
                f2 = f;
                jynVar2 = jynVar;
                i3 = i6 & (-57345);
                S = actVar;
            }
            oq5Var.q();
            int i7 = i3 >> 3;
            wje s = fgq.s(fgq.D(null, oq5Var, 1), 0.0f, f2, weo.C(S, jynVar2, 0L, 4), null, oq5Var, (i7 & 896) | (i7 & 112) | 8 | 4096, 8);
            float f4 = f2;
            yci a = androidx.compose.ui.platform.a.a(yciVar, "CircularProgressIndicator rotation=" + ((Number) s.d.getValue()).floatValue());
            oq5Var.a0(-1071587881);
            boolean f5 = oq5Var.f(s);
            Object K = oq5Var.K();
            if (f5 || K == gq5.a) {
                K = new I0(s);
                oq5Var.k0(K);
            }
            oq5Var.p(false);
            irf.r(w4kVar2, null, androidx.compose.ui.graphics.a.a(a, (Function1) K), null, null, 0.0f, m85Var, oq5Var, (i3 & 14) | ((i3 >> 18) & 112) | (i3 & 3670016), 56);
            oq5Var = oq5Var;
            actVar2 = S;
            f3 = f4;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new J0(w4kVar, yciVar, f3, actVar2, jynVar2, m85Var, i);
        }
    }
}
