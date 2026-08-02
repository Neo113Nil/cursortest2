package com.yandex.passport.internal.ui.challenge.webview;

import com.yandex.passport.R;
import defpackage.agr;
import defpackage.b2c;
import defpackage.g0g;
import defpackage.grb;
import defpackage.hq5;
import defpackage.hv;
import defpackage.i95;
import defpackage.j95;
import defpackage.kb5;
import defpackage.kfh;
import defpackage.oq5;
import defpackage.ouj;
import defpackage.qx0;
import defpackage.rdt;
import defpackage.rvf;
import defpackage.sa5;
import defpackage.ta5;
import defpackage.ug3;
import defpackage.vci;
import defpackage.vdt;
import defpackage.vnj;
import defpackage.wcs;
import defpackage.wp5;
import defpackage.xmn;
import defpackage.xp5;
import defpackage.yci;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class j {
    public static final void a(String str, Function0 function0, hq5 hq5Var, int i) {
        String str2;
        Function0 function02 = function0;
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2064540694);
        int i2 = i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.h(function02) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            str2 = str;
        } else {
            vci vciVar = vci.a;
            yci c = androidx.compose.foundation.layout.d.c(vciVar, 1.0f);
            agr agrVar = j95.a;
            yci b = androidx.compose.foundation.a.b(c, ((i95) oq5Var.j(agrVar)).p, vnj.i);
            kfh d = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, b);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, d, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            yci a = androidx.compose.foundation.layout.b.a.a(vciVar, b2c.f);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, a);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            wcs.b(str, null, ((i95) oq5Var.j(agrVar)).q, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((rdt) oq5Var.j(vdt.a)).j, oq5Var, i2 & 14, 0, 65530);
            str2 = str;
            oq5Var = oq5Var;
            com.yandex.plus.pay.ui.core.b.e((i2 & 112) | 384, 8, oq5Var, androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 8, 0.0f, 0.0f, 13), rvf.M(R.string.passport_reg_try_again, oq5Var), function0, false);
            function02 = function0;
            oq5Var.p(true);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hv(i, 3, str2, function02);
        }
    }
}
