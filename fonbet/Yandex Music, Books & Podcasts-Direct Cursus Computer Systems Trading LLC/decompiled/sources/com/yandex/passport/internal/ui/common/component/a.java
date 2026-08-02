package com.yandex.passport.internal.ui.common.component;

import com.yandex.passport.R;
import defpackage.a0g;
import defpackage.b2c;
import defpackage.fae;
import defpackage.g0g;
import defpackage.grb;
import defpackage.hq5;
import defpackage.i95;
import defpackage.j95;
import defpackage.kb5;
import defpackage.kfh;
import defpackage.n10;
import defpackage.oq5;
import defpackage.ouj;
import defpackage.ug3;
import defpackage.vci;
import defpackage.vnj;
import defpackage.wp5;
import defpackage.xmn;
import defpackage.xp5;
import defpackage.yci;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class a {
    public static final void a(int i, int i2, hq5 hq5Var, yci yciVar, boolean z) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1168546822);
        if ((i & 6) == 0) {
            i3 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.h(null) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            if (i4 != 0) {
                yciVar = vci.a;
            }
            oq5Var.Z(-1468001656);
            oq5Var.p(false);
            kfh d = ug3.d(b2c.f, false);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            if (z) {
                oq5Var.Z(1780599305);
                fae.a(a0g.E(R.drawable.passport_logout_radio_checked, 0, oq5Var), null, null, ((i95) oq5Var.j(j95.a)).a, oq5Var, 48, 4);
                oq5Var.p(false);
            } else {
                oq5Var.Z(1780832394);
                fae.a(a0g.E(R.drawable.passport_logout_radio_normal, 0, oq5Var), null, null, ((i95) oq5Var.j(j95.a)).A, oq5Var, 48, 4);
                oq5Var.p(false);
            }
            oq5Var.p(true);
        }
        yci yciVar2 = yciVar;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new n10(z, yciVar2, i, i2, 9);
        }
    }
}
