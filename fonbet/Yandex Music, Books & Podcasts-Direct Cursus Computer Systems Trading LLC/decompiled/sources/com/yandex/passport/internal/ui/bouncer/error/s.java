package com.yandex.passport.internal.ui.bouncer.error;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import com.yandex.passport.R;
import com.yandex.passport.internal.ui.bouncer.u;
import defpackage.b2c;
import defpackage.g0g;
import defpackage.gq5;
import defpackage.grb;
import defpackage.hq5;
import defpackage.kb5;
import defpackage.oq5;
import defpackage.ouj;
import defpackage.qx0;
import defpackage.r0w;
import defpackage.rvf;
import defpackage.sa5;
import defpackage.ta5;
import defpackage.vci;
import defpackage.vnj;
import defpackage.wp5;
import defpackage.xmn;
import defpackage.xp5;
import defpackage.yci;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class s {
    public static final void a(u uVar, hq5 hq5Var, int i) {
        uVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1010336273);
        if ((((oq5Var.f(uVar) ? 4 : 2) | i) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            com.yandex.passport.internal.ui.bouncer.s wishSource = uVar.getWishSource();
            vci vciVar = vci.a;
            yci c = androidx.compose.foundation.layout.d.c(vciVar, 1.0f);
            ta5 a = sa5.a(qx0.e, b2c.n, oq5Var, 6);
            int i2 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, c);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            boolean h = oq5Var.h(wishSource);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new com.yandex.passport.internal.ui.bouncer.n(wishSource, 2);
                oq5Var.k0(K);
            }
            com.yandex.passport.internal.ui.common.screen.b.b(true, (Function0) K, androidx.compose.foundation.layout.d.d(vciVar, 1.0f).f(new HorizontalAlignElement(b2c.o)), rvf.M(R.string.passport_error_login_not_available, oq5Var), rvf.M(R.string.passport_am_choose_another_account, oq5Var), oq5Var, 6, 0);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new r0w(uVar, i, 4);
        }
    }
}
