package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import com.yandex.passport.R;
import defpackage.aqi;
import defpackage.b2c;
import defpackage.dpo;
import defpackage.ftr;
import defpackage.g0g;
import defpackage.ges;
import defpackage.gld;
import defpackage.gq5;
import defpackage.grb;
import defpackage.gz2;
import defpackage.h0l;
import defpackage.hq5;
import defpackage.i95;
import defpackage.j95;
import defpackage.kb5;
import defpackage.kjn;
import defpackage.kx0;
import defpackage.mqr;
import defpackage.nfp;
import defpackage.o2g;
import defpackage.o9s;
import defpackage.oq5;
import defpackage.ouj;
import defpackage.pl3;
import defpackage.qx0;
import defpackage.rdt;
import defpackage.rvf;
import defpackage.sa5;
import defpackage.ta5;
import defpackage.tiv;
import defpackage.u1g;
import defpackage.vci;
import defpackage.vdt;
import defpackage.vnj;
import defpackage.wcs;
import defpackage.wp5;
import defpackage.xmn;
import defpackage.xp5;
import defpackage.yci;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class s0 {
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cb, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r12.K(), java.lang.Integer.valueOf(r14)) == false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(h0 h0Var, com.yandex.passport.internal.report.reporters.h0 h0Var2, Function1 function1, yci yciVar, hq5 hq5Var, int i) {
        gz2 gz2Var;
        String M;
        gz2 gz2Var2;
        boolean z;
        int i2;
        aqi aqiVar;
        vci vciVar;
        float f;
        int i3;
        Object h0lVar;
        int i4;
        kjn kjnVar;
        Function1 function12;
        h0Var.getClass();
        h0Var2.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-919531927);
        int i5 = i | (oq5Var.h(h0Var) ? 4 : 2) | (oq5Var.f(h0Var2) ? 32 : 16) | (oq5Var.h(function1) ? 256 : 128) | (oq5Var.f(yciVar) ? 2048 : 1024);
        if ((i5 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Unit unit = Unit.a;
            int i6 = i5 & 112;
            boolean h = (i6 == 32) | oq5Var.h(h0Var);
            Object K = oq5Var.K();
            kjn kjnVar2 = gq5.a;
            if (h || K == kjnVar2) {
                K = new com.yandex.passport.internal.storage.a(h0Var2, h0Var, null, 10);
                oq5Var.k0(K);
            }
            gld.w(oq5Var, unit, (Function2) K);
            kx0 kx0Var = qx0.c;
            gz2 gz2Var3 = b2c.n;
            ta5 a = sa5.a(kx0Var, gz2Var3, oq5Var, 0);
            int i7 = oq5Var.P;
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
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O) {
                gz2Var = gz2Var3;
            } else {
                gz2Var = gz2Var3;
            }
            ouj.x(i7, oq5Var, i7, kb5Var3);
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            List list = h0Var.f;
            boolean z2 = h0Var.e;
            if (list.size() < 2) {
                oq5Var.Z(-407331254);
                M = rvf.M(R.string.passport_logout_sheet_title, oq5Var);
                oq5Var.p(false);
            } else {
                oq5Var.Z(-407236735);
                M = rvf.M(R.string.passport_logout_sheet_title_profiles, oq5Var);
                oq5Var.p(false);
            }
            ges gesVar = ((rdt) oq5Var.j(vdt.a)).d;
            String str = M;
            long j = ((i95) oq5Var.j(j95.a)).a;
            gz2 gz2Var4 = b2c.o;
            float f2 = 44;
            yci q = androidx.compose.foundation.layout.a.q(new HorizontalAlignElement(gz2Var4), 0.0f, f2, 0.0f, 0.0f, 13);
            float f3 = 24;
            yci o = androidx.compose.foundation.layout.a.o(q, f3, 0.0f, 2);
            float f4 = 8;
            yci q2 = androidx.compose.foundation.layout.a.q(o, 0.0f, 0.0f, 0.0f, f4, 7);
            Object K2 = oq5Var.K();
            if (K2 == kjnVar2) {
                K2 = new com.yandex.passport.internal.storage.d(9);
                oq5Var.k0(K2);
            }
            gz2 gz2Var5 = gz2Var;
            wcs.b(str, nfp.b(q2, false, (Function1) K2), j, 0L, null, 0L, new o9s(3), 0L, 0, false, 0, 0, gesVar, oq5Var, 0, 0, 65016);
            if (h0Var.d) {
                oq5Var.Z(-406685121);
                String M2 = rvf.M(R.string.passport_logout_delete_account, oq5Var);
                i2 = 32;
                boolean h2 = (i6 == 32) | ((i5 & 896) == 256) | oq5Var.h(h0Var);
                Object K3 = oq5Var.K();
                if (h2 || K3 == kjnVar2) {
                    K3 = new ftr(25, function1, h0Var2, h0Var);
                    oq5Var.k0(K3);
                }
                gz2Var2 = gz2Var4;
                z = false;
                t0.a(0, oq5Var, new HorizontalAlignElement(gz2Var2), M2, (Function0) K3);
            } else {
                gz2Var2 = gz2Var4;
                z = false;
                i2 = 32;
                oq5Var.Z(-409208893);
            }
            oq5Var.p(z);
            int size = list.size();
            vci vciVar2 = vci.a;
            if (size < 2) {
                oq5Var.Z(-406261010);
                u1g.l(oq5Var, androidx.compose.foundation.layout.d.m(vciVar2, z2 ? i2 : f2).f(new HorizontalAlignElement(gz2Var2)));
                oq5Var.p(z);
            } else {
                oq5Var.Z(-406045715);
                b.a(48, oq5Var, androidx.compose.foundation.layout.a.o(vciVar2, 0.0f, i2, 1), list);
                oq5Var.p(z);
            }
            Object[] objArr = {Boolean.valueOf(z2)};
            Object K4 = oq5Var.K();
            if (K4 == kjnVar2) {
                K4 = new com.yandex.passport.internal.push.w0(12);
                oq5Var.k0(K4);
            }
            boolean z3 = z;
            aqi aqiVar2 = (aqi) o2g.g0(objArr, null, (Function0) K4, oq5Var, 3072, 6);
            if (z2) {
                oq5Var.Z(-405675823);
                yci b = nfp.b(androidx.compose.foundation.layout.a.q(vciVar2, 12, 0.0f, f3, f3, 2), z3, dpo.I);
                ta5 a2 = sa5.a(kx0Var, gz2Var5, oq5Var, z3 ? 1 : 0);
                int i8 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, b);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, a2, kb5Var);
                g0g.U(oq5Var, l2, kb5Var2);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i8))) {
                    ouj.x(i8, oq5Var, i8, kb5Var3);
                }
                g0g.U(oq5Var, H2, kb5Var4);
                boolean z4 = ((o1) aqiVar2.getValue()) == o1.a ? true : z3 ? 1 : 0;
                String M3 = rvf.M(R.string.passport_logout_current_app_option, oq5Var);
                String M4 = rvf.M(R.string.passport_logout_current_app_hint, oq5Var);
                boolean f5 = oq5Var.f(aqiVar2);
                Object K5 = oq5Var.K();
                if (f5 || K5 == kjnVar2) {
                    K5 = new tiv(aqiVar2, 10);
                    oq5Var.k0(K5);
                }
                vciVar = vciVar2;
                f = f3;
                com.yandex.plus.core.network.api.utils.a.e(z4, M3, M4, (Function0) K5, null, oq5Var, 0);
                boolean z5 = ((o1) aqiVar2.getValue()) == o1.b ? true : z3 ? 1 : 0;
                String M5 = rvf.M(R.string.passport_logout_all_apps_option, oq5Var);
                String M6 = rvf.M(h0Var.c ? R.string.passport_logout_all_apps_hint : R.string.passport_logout_all_apps_hint_whitelabel, oq5Var);
                boolean f6 = oq5Var.f(aqiVar2);
                Object K6 = oq5Var.K();
                if (f6 || K6 == kjnVar2) {
                    K6 = new tiv(aqiVar2, 11);
                    oq5Var.k0(K6);
                }
                aqiVar = aqiVar2;
                com.yandex.plus.core.network.api.utils.a.e(z5, M5, M6, (Function0) K6, null, oq5Var, 0);
                oq5Var.p(true);
            } else {
                aqiVar = aqiVar2;
                vciVar = vciVar2;
                f = f3;
                oq5Var.Z(-409208893);
            }
            oq5Var.p(z3);
            String M7 = rvf.M(R.string.passport_logout_exit, oq5Var);
            int i9 = i5 & 896;
            boolean f7 = oq5Var.f(aqiVar) | oq5Var.h(h0Var) | (i9 == 256 ? true : z3 ? 1 : 0) | (i6 != 32 ? z3 ? 1 : 0 : true);
            Object K7 = oq5Var.K();
            if (f7 || K7 == kjnVar2) {
                i3 = 256;
                i4 = 2;
                kjnVar = kjnVar2;
                h0lVar = new h0l(h0Var, function1, h0Var2, aqiVar, 7);
                function12 = function1;
                oq5Var.k0(h0lVar);
            } else {
                i3 = 256;
                function12 = function1;
                kjnVar = kjnVar2;
                h0lVar = K7;
                i4 = 2;
            }
            Function0 function0 = (Function0) h0lVar;
            vci vciVar3 = vciVar;
            float f8 = f;
            int i10 = i3;
            com.yandex.plus.pay.ui.core.b.e(384, 8, oq5Var, androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.d.d(vciVar3, 1.0f), f8, 0.0f, i4), M7, function0, false);
            oq5Var = oq5Var;
            u1g.l(oq5Var, androidx.compose.foundation.layout.d.m(vciVar3, f4));
            String M8 = rvf.M(R.string.passport_reg_cancel, oq5Var);
            boolean z6 = i9 == i10;
            Object K8 = oq5Var.K();
            if (z6 || K8 == kjnVar) {
                K8 = new pl3(10, function12);
                oq5Var.k0(K8);
            }
            com.yandex.plus.pay.ui.core.b.f(384, oq5Var, androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.d.d(vciVar3, 1.0f), f8, 0.0f, 2), M8, (Function0) K8, false);
            u1g.l(oq5Var, androidx.compose.foundation.layout.d.m(vciVar3, f8).f(new HorizontalAlignElement(gz2Var2)));
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new mqr(i, 17, h0Var, h0Var2, function1, yciVar);
        }
    }
}
