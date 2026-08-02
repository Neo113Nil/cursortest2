package com.yandex.passport.internal.ui.bouncer;

import com.yandex.passport.R;
import com.yandex.passport.internal.push.w0;
import com.yandex.passport.internal.ui.bouncer.model.m1;
import com.yandex.passport.internal.ui.bouncer.model.n1;
import com.yandex.passport.internal.ui.bouncer.model.o1;
import com.yandex.passport.internal.ui.bouncer.model.p1;
import com.yandex.passport.internal.ui.bouncer.model.q1;
import com.yandex.passport.internal.ui.bouncer.model.r1;
import com.yandex.passport.internal.ui.bouncer.model.s1;
import com.yandex.passport.internal.ui.bouncer.model.t1;
import com.yandex.passport.internal.ui.bouncer.model.u1;
import com.yandex.passport.internal.ui.bouncer.model.v1;
import com.yandex.passport.internal.ui.challenge.c0;
import com.yandex.passport.sloth.c1;
import defpackage.a0g;
import defpackage.aqi;
import defpackage.b2c;
import defpackage.dfi;
import defpackage.eta;
import defpackage.g0g;
import defpackage.gq5;
import defpackage.grb;
import defpackage.hd6;
import defpackage.hq5;
import defpackage.irf;
import defpackage.kb5;
import defpackage.kfh;
import defpackage.kjn;
import defpackage.o2g;
import defpackage.oq5;
import defpackage.ouj;
import defpackage.q0v;
import defpackage.szm;
import defpackage.u0v;
import defpackage.ug3;
import defpackage.vci;
import defpackage.vnj;
import defpackage.vz1;
import defpackage.wp5;
import defpackage.xmn;
import defpackage.xp5;
import defpackage.yci;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class q {
    public static final void a(u uVar, m1 m1Var, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(541811724);
        if ((((oq5Var.f(uVar) ? 4 : 2) | i | (oq5Var.h(m1Var) ? 32 : 16)) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object[] objArr = new Object[0];
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new w0(7);
                oq5Var.k0(K);
            }
            String str = (String) o2g.g0(objArr, null, (Function0) K, oq5Var, 0, 6);
            s wishSource = uVar.getWishSource();
            c0 c0Var = m1Var.a;
            com.yandex.passport.common.ui.progress.g progressProperties = uVar.getProgressProperties();
            boolean h = oq5Var.h(wishSource) | oq5Var.h(m1Var);
            Object K2 = oq5Var.K();
            if (h || K2 == kjnVar) {
                K2 = new o(0, wishSource, m1Var);
                oq5Var.k0(K2);
            }
            com.yandex.passport.common.ui.progress.g gVar = com.yandex.passport.common.ui.progress.g.e;
            com.yandex.passport.internal.ui.a.b(c0Var, progressProperties, str, (Function1) K2, oq5Var, 0, 0);
            oq5Var = oq5Var;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new p(uVar, m1Var, i, 0);
        }
    }

    public static final void b(u uVar, n1 n1Var, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-81446156);
        if ((((oq5Var.f(uVar) ? 4 : 2) | i | (oq5Var.h(n1Var) ? 32 : 16)) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            com.yandex.passport.internal.ui.bouncer.chooser.a aVar = (com.yandex.passport.internal.ui.bouncer.chooser.a) uVar.getBouncerMasterChooserComponentBuilderProvider().get();
            s wishSource = uVar.getWishSource();
            boolean f = oq5Var.f(n1Var) | oq5Var.f(aVar);
            Object K = oq5Var.K();
            Object obj = gq5.a;
            if (f || K == obj) {
                K = aVar.setMasters(n1Var.b).setCreateMasterEnterPhoneNumberOption(n1Var.a).build();
                oq5Var.k0(K);
            }
            com.yandex.passport.internal.ui.bouncer.chooser.b bVar = (com.yandex.passport.internal.ui.bouncer.chooser.b) K;
            Object[] objArr = new Object[0];
            Object K2 = oq5Var.K();
            if (K2 == obj) {
                K2 = new w0(6);
                oq5Var.k0(K2);
            }
            String str = (String) o2g.g0(objArr, null, (Function0) K2, oq5Var, 0, 6);
            boolean h = oq5Var.h(wishSource);
            Object K3 = oq5Var.K();
            if (h || K3 == obj) {
                K3 = new n(wishSource, 1);
                oq5Var.k0(K3);
            }
            Function0 function0 = (Function0) K3;
            boolean h2 = oq5Var.h(wishSource);
            Object K4 = oq5Var.K();
            if (h2 || K4 == obj) {
                K4 = new q0v(27, wishSource);
                oq5Var.k0(K4);
            }
            com.yandex.plus.core.locale.b.a(bVar, function0, (Function1) K4, str, oq5Var, 0, 0);
            oq5Var = oq5Var;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u0v(uVar, n1Var, i, 29);
        }
    }

    public static final void c(u uVar, v1 v1Var, hq5 hq5Var, int i) {
        uVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1647176310);
        int i2 = (oq5Var.f(uVar) ? 4 : 2) | i | (oq5Var.f(v1Var) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else if (v1Var instanceof o1) {
            oq5Var.Z(-1027925644);
            e(uVar, (o1) v1Var, oq5Var, i2 & 14);
            oq5Var.p(false);
        } else if (v1Var instanceof q1) {
            oq5Var.Z(-1027819655);
            f(uVar, (q1) v1Var, oq5Var, i2 & 14);
            oq5Var.p(false);
        } else if (v1Var instanceof r1) {
            oq5Var.Z(-1027715619);
            com.yandex.passport.internal.ui.bouncer.roundabout.p.a(uVar, (r1) v1Var, oq5Var, i2 & 14);
            oq5Var.p(false);
        } else if (v1Var instanceof s1) {
            oq5Var.Z(-1027620325);
            d(uVar, (s1) v1Var, oq5Var, i2 & 14);
            oq5Var.p(false);
        } else if (v1Var instanceof p1) {
            oq5Var.Z(-1027520257);
            com.yandex.plus.core.network.api.utils.a.d(uVar, (p1) v1Var, oq5Var, i2 & 14);
            oq5Var.p(false);
        } else if (v1Var instanceof m1) {
            oq5Var.Z(-1027422793);
            a(uVar, (m1) v1Var, oq5Var, i2 & 14);
            oq5Var.p(false);
        } else if (v1Var instanceof u1) {
            oq5Var.Z(-1027315006);
            com.yandex.passport.internal.ui.bouncer.error.s.a(uVar, oq5Var, i2 & 14);
            oq5Var.p(false);
        } else if (v1Var instanceof t1) {
            oq5Var.Z(-1027215527);
            com.yandex.passport.internal.ui.bouncer.loading.h.a(uVar, (t1) v1Var, oq5Var, i2 & 14);
            oq5Var.p(false);
        } else {
            if (!(v1Var instanceof n1)) {
                throw vz1.i(oq5Var, 1906503038, false);
            }
            oq5Var.Z(-1027109197);
            b(uVar, (n1) v1Var, oq5Var, i2 & 14);
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u0v(uVar, v1Var, i, 26);
        }
    }

    public static final void d(u uVar, s1 s1Var, hq5 hq5Var, int i) {
        c1 c1Var = s1Var.b;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1003962924);
        if ((((oq5Var.f(uVar) ? 4 : 2) | i | (oq5Var.h(s1Var) ? 32 : 16)) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            szm bouncerSlothComposeComponentBuilderProvider = uVar.getBouncerSlothComposeComponentBuilderProvider();
            boolean f = oq5Var.f(s1Var) | oq5Var.f(bouncerSlothComposeComponentBuilderProvider);
            Object K = oq5Var.K();
            Object obj = gq5.a;
            if (f || K == obj) {
                K = ((com.yandex.passport.internal.ui.bouncer.sloth.b) bouncerSlothComposeComponentBuilderProvider.get()).slothUiInteractor(c1Var).build();
                oq5Var.k0(K);
            }
            com.yandex.passport.internal.ui.bouncer.sloth.c cVar = (com.yandex.passport.internal.ui.bouncer.sloth.c) K;
            Object[] objArr = new Object[0];
            boolean h = oq5Var.h(s1Var);
            Object K2 = oq5Var.K();
            if (h || K2 == obj) {
                K2 = new com.yandex.passport.internal.common.e(12, s1Var);
                oq5Var.k0(K2);
            }
            aqi aqiVar = (aqi) o2g.g0(objArr, null, (Function0) K2, oq5Var, 0, 6);
            if (!c1Var.a.a.a.equals(((v) aqiVar.getValue()).a)) {
                aqiVar.setValue(new v(c1Var.a.a.a, eta.e()));
            }
            v vVar = (v) aqiVar.getValue();
            String str = vVar.a + '|' + vVar.b;
            oq5Var.W(-1559241318, str);
            com.yandex.passport.sloth.ui.c1.b(cVar, str, oq5Var, 0, 0);
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new p(uVar, s1Var, i, 1);
        }
    }

    public static final void e(u uVar, o1 o1Var, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-645172060);
        if ((((oq5Var.f(uVar) ? 4 : 2) | i | (oq5Var.h(o1Var) ? 32 : 16)) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            s wishSource = uVar.getWishSource();
            StringBuilder sb = new StringBuilder("Error(");
            sb.append(o1Var.a);
            sb.append(", ");
            Exception exc = new Exception(dfi.i(sb, o1Var.b, ')'));
            boolean z = !uVar.isWhiteLabel();
            boolean h = oq5Var.h(wishSource);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new n(wishSource, 0);
                oq5Var.k0(K);
            }
            com.yandex.passport.internal.ui.common.screen.e.a(exc, true, z, (Function0) K, oq5Var, 48, 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u0v(uVar, o1Var, i, 27);
        }
    }

    public static final void f(u uVar, q1 q1Var, hq5 hq5Var, int i) {
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(795806597);
        if ((((oq5Var2.f(uVar) ? 4 : 2) | i | (oq5Var2.f(q1Var) ? 32 : 16)) & 19) == 18 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            vci vciVar = vci.a;
            yci c = androidx.compose.foundation.layout.d.c(vciVar, 1.0f);
            kfh d = ug3.d(b2c.b, false);
            int i2 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, c);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, d, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var2, i2, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            if (q1Var.b) {
                oq5Var2.Z(314845126);
                oq5Var = oq5Var2;
                irf.r(a0g.E(R.drawable.passport_background_main, 0, oq5Var2), null, androidx.compose.foundation.layout.d.c(vciVar, 1.0f), null, hd6.g, 0.0f, null, oq5Var, 25008, 104);
            } else {
                oq5Var = oq5Var2;
                oq5Var.Z(310299255);
            }
            oq5Var.p(false);
            com.yandex.passport.common.ui.progress.g progressProperties = uVar.getProgressProperties();
            com.yandex.passport.common.ui.progress.g gVar = com.yandex.passport.common.ui.progress.g.e;
            com.yandex.passport.internal.ui.a.i(null, progressProperties, false, oq5Var, 384, 1);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u0v(uVar, q1Var, i, 28);
        }
    }
}
