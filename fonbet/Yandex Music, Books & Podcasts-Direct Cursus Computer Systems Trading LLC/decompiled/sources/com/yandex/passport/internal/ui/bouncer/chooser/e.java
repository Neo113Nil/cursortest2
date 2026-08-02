package com.yandex.passport.internal.ui.bouncer.chooser;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.passport.R;
import defpackage.a0g;
import defpackage.b2c;
import defpackage.b6e;
import defpackage.ff7;
import defpackage.g0g;
import defpackage.gq5;
import defpackage.grb;
import defpackage.gut;
import defpackage.hq5;
import defpackage.i95;
import defpackage.irf;
import defpackage.iz2;
import defpackage.j95;
import defpackage.k32;
import defpackage.kb5;
import defpackage.kfh;
import defpackage.kjn;
import defpackage.nfp;
import defpackage.oq5;
import defpackage.ouj;
import defpackage.pp;
import defpackage.qx0;
import defpackage.rdt;
import defpackage.rvf;
import defpackage.sa5;
import defpackage.ta5;
import defpackage.u1g;
import defpackage.ug3;
import defpackage.v4w;
import defpackage.vci;
import defpackage.vdt;
import defpackage.vnj;
import defpackage.vu0;
import defpackage.wcs;
import defpackage.wp5;
import defpackage.xmn;
import defpackage.xp5;
import defpackage.yci;
import defpackage.zkl;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class e {
    public static final void a(Function0 function0, boolean z, com.yandex.passport.api.d dVar, Locale locale, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        boolean z2;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1655385641);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= oq5Var.g(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & 384) == 0) {
            i2 |= (i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var.f(dVar) : oq5Var.h(dVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(locale) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if ((i3 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            vci vciVar = vci.a;
            yci d = androidx.compose.foundation.layout.d.d(vciVar, 1.0f);
            kfh d2 = ug3.d(b2c.b, false);
            int i4 = oq5Var.P;
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            iz2 iz2Var = b2c.e;
            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.a;
            ff7.n(function0, bVar.a(vciVar, iz2Var), false, null, z.a, oq5Var, (i3 & 14) | 196608, 28);
            c(z2, dVar, locale, bVar.a(vciVar, b2c.f), oq5Var, (i3 >> 3) & 1022);
            oq5Var.p(true);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vu0(function0, z, dVar, locale, yciVar2, i, 10);
        }
    }

    public static final void b(b bVar, List list, Function0 function0, Function1 function1, hq5 hq5Var, int i) {
        int i2;
        bVar.getClass();
        list.getClass();
        function0.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(551438349);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var.f(bVar) : oq5Var.h(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(function1) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            String M = rvf.M(R.string.passport_choose_master_title, oq5Var);
            vci vciVar = vci.a;
            yci r1 = gut.r1(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.d.c(vciVar, 1.0f), ((i95) oq5Var.j(j95.a)).n, vnj.i));
            boolean f = oq5Var.f(M);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (f || K == kjnVar) {
                K = new v4w(M, 10);
                oq5Var.k0(K);
            }
            yci b = nfp.b(r1, false, (Function1) K);
            ta5 a = sa5.a(qx0.c, b2c.n, oq5Var, 0);
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
            a(function0, bVar.isWhiteLabel(), bVar.getBranding(), ((com.yandex.passport.internal.ui.lang.a) bVar.getUiLanguageProvider()).b(), null, oq5Var, (i2 >> 6) & 14);
            u1g.l(oq5Var, androidx.compose.foundation.layout.d.e(vciVar, 32));
            boolean z = (i2 & 7168) == 2048;
            Object K2 = oq5Var.K();
            if (z || K2 == kjnVar) {
                K2 = new k32(9, function1);
                oq5Var.k0(K2);
            }
            d.a(list, (Function1) K2, androidx.compose.foundation.layout.d.t(vciVar, 0.0f, 400, 1).f(new HorizontalAlignElement(b2c.o)), oq5Var, (i2 >> 3) & 14);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new zkl(i, 20, bVar, list, function0, function1);
        }
    }

    public static final void c(boolean z, com.yandex.passport.api.d dVar, Locale locale, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        Locale locale2;
        yci yciVar2;
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-191299172);
        if ((i & 6) == 0) {
            i2 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? oq5Var.f(dVar) : oq5Var.h(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            locale2 = locale;
            i2 |= oq5Var.h(locale2) ? 256 : 128;
        } else {
            locale2 = locale;
        }
        if ((i & 3072) == 0) {
            yciVar2 = yciVar;
            i2 |= oq5Var.f(yciVar2) ? 2048 : 1024;
        } else {
            yciVar2 = yciVar;
        }
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else if (z) {
            oq5Var.Z(428155796);
            yci yciVar3 = yciVar2;
            wcs.b(rvf.M(R.string.passport_accounts, oq5Var), yciVar3, ((i95) oq5Var.j(j95.a)).a, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((rdt) oq5Var.j(vdt.a)).d, oq5Var, (i2 >> 6) & 112, 0, 65528);
            oq5Var = oq5Var;
            oq5Var.p(false);
        } else {
            oq5Var.Z(428407330);
            if (dVar instanceof com.yandex.passport.api.b) {
                i3 = ((com.yandex.passport.api.b) dVar).a;
            } else {
                if (!(dVar instanceof com.yandex.passport.api.c)) {
                    b6e.s();
                    return;
                }
                int i4 = com.yandex.passport.common.ui.lang.a.a;
                String language = locale2.getLanguage();
                language.getClass();
                String lowerCase = language.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                i3 = (lowerCase.equals(new Locale("ru").getLanguage()) || lowerCase.equals(new Locale("az").getLanguage()) || lowerCase.equals(new Locale("uk").getLanguage()) || lowerCase.equals(new Locale("kk").getLanguage()) || lowerCase.equals(new Locale("ky").getLanguage()) || lowerCase.equals(new Locale("be").getLanguage()) || lowerCase.equals(new Locale("bg").getLanguage())) ? R.drawable.passport_logo_ya_id_ru : R.drawable.passport_logo_ya_id_en;
            }
            irf.r(a0g.E(i3, 0, oq5Var), null, yciVar, null, null, 0.0f, null, oq5Var, ((i2 >> 3) & 896) | 48, 120);
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pp(z, dVar, locale2, yciVar, i, 20);
        }
    }
}
