package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import androidx.compose.foundation.layout.VerticalAlignElement;
import com.yandex.passport.R;
import defpackage.a0g;
import defpackage.aqi;
import defpackage.b2c;
import defpackage.fae;
import defpackage.g0g;
import defpackage.ges;
import defpackage.gld;
import defpackage.gq5;
import defpackage.grb;
import defpackage.hq5;
import defpackage.i95;
import defpackage.in1;
import defpackage.j95;
import defpackage.kb5;
import defpackage.kjn;
import defpackage.lho;
import defpackage.meo;
import defpackage.nho;
import defpackage.noa;
import defpackage.o9s;
import defpackage.oq5;
import defpackage.ouj;
import defpackage.qx0;
import defpackage.rdt;
import defpackage.szf;
import defpackage.tqc;
import defpackage.uoi;
import defpackage.vdt;
import defpackage.vnj;
import defpackage.vz1;
import defpackage.w4k;
import defpackage.wcs;
import defpackage.wp5;
import defpackage.xmn;
import defpackage.xp5;
import defpackage.yci;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class t0 {
    public static final void a(int i, hq5 hq5Var, yci yciVar, String str, Function0 function0) {
        long j;
        long j2;
        str.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-418425144);
        int i2 = i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = vz1.h(oq5Var);
            }
            uoi uoiVar = (uoi) K;
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = szf.g0(Boolean.FALSE);
                oq5Var.k0(K2);
            }
            aqi aqiVar = (aqi) K2;
            Object K3 = oq5Var.K();
            if (K3 == kjnVar) {
                K3 = new noa(uoiVar, aqiVar, null, 2);
                oq5Var.k0(K3);
            }
            gld.w(oq5Var, uoiVar, (Function2) K3);
            yci d = androidx.compose.foundation.a.d(yciVar, uoiVar, null, false, null, new meo(0), function0, 12);
            nho a = lho.a(qx0.a, b2c.k, oq5Var, 0);
            int i3 = oq5Var.P;
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
            g0g.U(oq5Var, a, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            ges gesVar = ((rdt) oq5Var.j(vdt.a)).k;
            tqc tqcVar = tqc.n;
            if (((Boolean) aqiVar.getValue()).booleanValue()) {
                oq5Var.Z(1356392147);
                j = ((i95) oq5Var.j(j95.a)).a;
            } else {
                oq5Var.Z(1356393397);
                j = ((i95) oq5Var.j(j95.a)).f;
            }
            oq5Var.p(false);
            wcs.b(str, null, j, 0L, tqcVar, 0L, new o9s(3), 0L, 0, false, 0, 0, gesVar, oq5Var, (i2 & 14) | 196608, 0, 64986);
            oq5Var = oq5Var;
            w4k E = a0g.E(R.drawable.passport_logout_delete_trailing, 0, oq5Var);
            VerticalAlignElement verticalAlignElement = new VerticalAlignElement(b2c.l);
            if (((Boolean) aqiVar.getValue()).booleanValue()) {
                oq5Var.Z(1356402611);
                j2 = ((i95) oq5Var.j(j95.a)).a;
            } else {
                oq5Var.Z(1356403861);
                j2 = ((i95) oq5Var.j(j95.a)).f;
            }
            oq5Var.p(false);
            fae.a(E, null, verticalAlignElement, j2, oq5Var, 48, 0);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new in1(str, function0, yciVar, i, 3);
        }
    }
}
