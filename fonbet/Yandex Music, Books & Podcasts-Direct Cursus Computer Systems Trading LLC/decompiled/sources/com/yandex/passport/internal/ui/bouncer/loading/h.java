package com.yandex.passport.internal.ui.bouncer.loading;

import com.yandex.passport.R;
import com.yandex.passport.internal.push.w0;
import com.yandex.passport.internal.ui.bouncer.model.t1;
import com.yandex.passport.internal.ui.bouncer.n;
import com.yandex.passport.internal.ui.bouncer.p;
import com.yandex.passport.internal.ui.bouncer.s;
import com.yandex.passport.internal.ui.bouncer.u;
import defpackage.agr;
import defpackage.aqi;
import defpackage.b2c;
import defpackage.g0g;
import defpackage.gld;
import defpackage.gq5;
import defpackage.grb;
import defpackage.hq5;
import defpackage.i95;
import defpackage.j95;
import defpackage.kb5;
import defpackage.kjn;
import defpackage.l1p;
import defpackage.o2g;
import defpackage.oq5;
import defpackage.ouj;
import defpackage.qx0;
import defpackage.rdt;
import defpackage.rvf;
import defpackage.sa5;
import defpackage.ta5;
import defpackage.vci;
import defpackage.vdt;
import defpackage.vnj;
import defpackage.wcs;
import defpackage.wp5;
import defpackage.xmn;
import defpackage.xp5;
import defpackage.yci;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class h {
    public static final void a(u uVar, t1 t1Var, hq5 hq5Var, int i) {
        boolean z;
        uVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-301773506);
        int i2 = i | (oq5Var.f(uVar) ? 4 : 2) | (oq5Var.f(t1Var) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            s wishSource = uVar.getWishSource();
            com.yandex.passport.sloth.ui.l networkObserver = uVar.getNetworkObserver();
            com.yandex.passport.common.ui.progress.g progressProperties = uVar.getProgressProperties();
            Object[] objArr = new Object[0];
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new w0(9);
                oq5Var.k0(K);
            }
            aqi aqiVar = (aqi) o2g.g0(objArr, null, (Function0) K, oq5Var, 0, 6);
            boolean f = ((i2 & 112) == 32) | oq5Var.f(aqiVar);
            Object K2 = oq5Var.K();
            if (f || K2 == kjnVar) {
                K2 = new l1p((Object) t1Var, aqiVar, (Continuation) null, 14);
                oq5Var.k0(K2);
            }
            gld.w(oq5Var, t1Var, (Function2) K2);
            boolean h = oq5Var.h(networkObserver) | oq5Var.h(wishSource);
            Object K3 = oq5Var.K();
            if (h || K3 == kjnVar) {
                K3 = new com.yandex.passport.internal.storage.a(networkObserver, wishSource, null, 5);
                oq5Var.k0(K3);
            }
            gld.w(oq5Var, uVar, (Function2) K3);
            vci vciVar = vci.a;
            yci c = androidx.compose.foundation.layout.d.c(vciVar, 1.0f);
            agr agrVar = j95.a;
            yci b = androidx.compose.foundation.a.b(c, ((i95) oq5Var.j(agrVar)).n, vnj.i);
            ta5 a = sa5.a(qx0.e, b2c.o, oq5Var, 54);
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
            g0g.U(oq5Var, a, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            float f2 = 2;
            yci q = androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 0.0f, 0.0f, f2, 7);
            com.yandex.passport.common.ui.progress.g gVar = com.yandex.passport.common.ui.progress.g.e;
            com.yandex.passport.internal.ui.a.h(progressProperties, q, oq5Var, 48, 0);
            wcs.b(rvf.M(R.string.passport_webview_coonection_lost_error_text, oq5Var), androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 0.0f, 0.0f, f2, 7), ((i95) oq5Var.j(agrVar)).a, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((rdt) oq5Var.j(vdt.a)).k, oq5Var, 48, 0, 65528);
            oq5Var = oq5Var;
            if (!((Boolean) aqiVar.getValue()).booleanValue() || t1Var.a) {
                z = false;
                oq5Var.Z(-526988690);
            } else {
                oq5Var.Z(-523635792);
                String M = rvf.M(R.string.passport_webview_back_button_text, oq5Var);
                boolean h2 = oq5Var.h(wishSource);
                Object K4 = oq5Var.K();
                if (h2 || K4 == kjnVar) {
                    K4 = new n(wishSource, 3);
                    oq5Var.k0(K4);
                }
                com.yandex.plus.pay.ui.core.b.e(384, 8, oq5Var, androidx.compose.foundation.layout.d.e(vciVar, 48), M, (Function0) K4, false);
                z = false;
            }
            oq5Var.p(z);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new p(uVar, t1Var, i, 3);
        }
    }
}
