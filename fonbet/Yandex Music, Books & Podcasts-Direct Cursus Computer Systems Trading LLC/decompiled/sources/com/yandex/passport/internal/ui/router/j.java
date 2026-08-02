package com.yandex.passport.internal.ui.router;

import com.yandex.passport.R;
import defpackage.a0g;
import defpackage.b2c;
import defpackage.d85;
import defpackage.g0g;
import defpackage.grb;
import defpackage.hd6;
import defpackage.hq5;
import defpackage.kb5;
import defpackage.kfh;
import defpackage.kg5;
import defpackage.oq5;
import defpackage.ouj;
import defpackage.r0w;
import defpackage.ug3;
import defpackage.vci;
import defpackage.vnj;
import defpackage.vz1;
import defpackage.w4k;
import defpackage.w85;
import defpackage.wp5;
import defpackage.xmn;
import defpackage.xp5;
import defpackage.yci;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class j {
    public static final void a(i iVar, hq5 hq5Var, int i) {
        w4k w85Var;
        iVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-766802496);
        if ((((oq5Var.f(iVar) ? 4 : 2) | i) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci c = androidx.compose.foundation.layout.d.c(vci.a, 1.0f);
            if (iVar instanceof f) {
                oq5Var.Z(1118163347);
                oq5Var.p(false);
                w85Var = new w85(d85.m);
            } else if (iVar instanceof g) {
                oq5Var.Z(1118306257);
                w85Var = a0g.E(((g) iVar).a, 0, oq5Var);
                oq5Var.p(false);
            } else {
                if (!(iVar instanceof h)) {
                    throw vz1.i(oq5Var, 1837182778, false);
                }
                oq5Var.Z(1118449167);
                w85Var = new w85(kg5.r(R.color.passport_roundabout_background, oq5Var));
                oq5Var.p(false);
            }
            yci d = androidx.compose.ui.draw.a.d(c, w85Var, null, hd6.g, 0.0f, null, 54);
            kfh d2 = ug3.d(b2c.b, false);
            int i2 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, d);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new r0w(iVar, i, 9);
        }
    }
}
