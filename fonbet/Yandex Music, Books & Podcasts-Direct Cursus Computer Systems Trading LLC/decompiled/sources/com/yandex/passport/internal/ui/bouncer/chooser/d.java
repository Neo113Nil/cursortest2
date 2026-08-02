package com.yandex.passport.internal.ui.bouncer.chooser;

import com.yandex.passport.R;
import com.yandex.passport.internal.push.w0;
import defpackage.agr;
import defpackage.as7;
import defpackage.b2c;
import defpackage.bfg;
import defpackage.dpo;
import defpackage.ftr;
import defpackage.g0g;
import defpackage.ges;
import defpackage.gq5;
import defpackage.grb;
import defpackage.gz2;
import defpackage.hq5;
import defpackage.i95;
import defpackage.j95;
import defpackage.jdp;
import defpackage.kb5;
import defpackage.kjn;
import defpackage.kx0;
import defpackage.lho;
import defpackage.meo;
import defpackage.nfp;
import defpackage.nho;
import defpackage.o2g;
import defpackage.o9s;
import defpackage.oq5;
import defpackage.ouj;
import defpackage.qme;
import defpackage.qx0;
import defpackage.rdt;
import defpackage.rvf;
import defpackage.sa5;
import defpackage.ta5;
import defpackage.u6k;
import defpackage.u75;
import defpackage.vav;
import defpackage.vci;
import defpackage.vdt;
import defpackage.vnj;
import defpackage.vz1;
import defpackage.wcs;
import defpackage.wp5;
import defpackage.xmn;
import defpackage.xp5;
import defpackage.yci;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class d {
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ae, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r7.K(), java.lang.Integer.valueOf(r15)) == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(List list, Function1 function1, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        List list2;
        Function1 function12;
        String M;
        list.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2054229622);
        int i3 = (i & 6) == 0 ? (oq5Var.h(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= oq5Var.h(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            function12 = function1;
            list2 = list;
        } else {
            float f = 16;
            yci m = androidx.compose.foundation.layout.a.m(androidx.compose.foundation.layout.d.d(yciVar, 1.0f), f);
            kx0 kx0Var = qx0.c;
            gz2 gz2Var = b2c.n;
            ta5 a = sa5.a(kx0Var, gz2Var, oq5Var, 0);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, m);
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
                i2 = i3;
            } else {
                i2 = i3;
            }
            ouj.x(i4, oq5Var, i4, kb5Var3);
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            String M2 = rvf.M(R.string.passport_choose_master_title, oq5Var);
            agr agrVar = vdt.a;
            ges gesVar = ((rdt) oq5Var.j(agrVar)).d;
            agr agrVar2 = j95.a;
            long j = ((i95) oq5Var.j(agrVar2)).a;
            vci vciVar = vci.a;
            float f2 = 24;
            vci vciVar2 = vciVar;
            float f3 = 1.0f;
            wcs.b(M2, androidx.compose.foundation.layout.a.q(androidx.compose.foundation.layout.d.d(vciVar, 1.0f), f2, f2, f2, 0.0f, 8), j, 0L, null, 0L, new o9s(3), 0L, 0, false, 0, 0, gesVar, oq5Var, 48, 0, 65016);
            wcs.b(rvf.M(R.string.passport_choose_master_hint, oq5Var), androidx.compose.foundation.layout.a.q(androidx.compose.foundation.layout.d.d(vciVar2, 1.0f), f2, 8, f2, 0.0f, 8), ((i95) oq5Var.j(agrVar2)).a, 0L, null, 0L, new o9s(3), 0L, 0, false, 0, 0, ((rdt) oq5Var.j(agrVar)).k, oq5Var, 48, 0, 65016);
            Object[] objArr = new Object[0];
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new w0(8);
                oq5Var.k0(K);
            }
            Object g0 = o2g.g0(objArr, null, (Function0) K, oq5Var, 0, 6);
            oq5Var = oq5Var;
            u6k u6kVar = (u6k) g0;
            yci b = nfp.b(vciVar2, false, dpo.I);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            yci Q = bfg.Q(androidx.compose.foundation.layout.a.q(vz1.g(1.0f, b, false), f2, 32, f2, 0.0f, 8), bfg.C(oq5Var), false, 14);
            ta5 a2 = sa5.a(kx0Var, gz2Var, oq5Var, 0);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, Q);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            oq5Var.Z(-230819926);
            int i6 = 0;
            for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                Object next = it.next();
                int i7 = i6 + 1;
                if (i6 < 0) {
                    u75.n();
                    throw null;
                }
                v vVar = (v) next;
                yci e = androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.d(vciVar2, f3), 56);
                boolean z = u6kVar.h() == i6;
                meo meoVar = new meo(3);
                boolean f4 = oq5Var.f(u6kVar) | oq5Var.d(i6);
                Object K2 = oq5Var.K();
                if (f4 || K2 == kjnVar) {
                    K2 = new as7(i6, u6kVar, 6);
                    oq5Var.k0(K2);
                }
                yci q = vnj.q(e, new jdp(z, meoVar, (Function0) K2, 0));
                nho a3 = lho.a(qx0.a, b2c.l, oq5Var, 48);
                int i8 = oq5Var.P;
                androidx.compose.runtime.internal.a l3 = oq5Var.l();
                yci H3 = vnj.H(oq5Var, q);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar2);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, a3, wp5.f);
                g0g.U(oq5Var, l3, wp5.e);
                kb5 kb5Var5 = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i8))) {
                    ouj.x(i8, oq5Var, i8, kb5Var5);
                }
                g0g.U(oq5Var, H3, wp5.d);
                com.yandex.passport.internal.ui.common.component.a.a(48, 4, oq5Var, null, u6kVar.h() == i6);
                if (vVar instanceof t) {
                    oq5Var.Z(832431166);
                    oq5Var.p(false);
                    M = ((t) vVar).a.b;
                } else {
                    if (!(vVar instanceof u)) {
                        throw vz1.i(oq5Var, 832428216, false);
                    }
                    oq5Var.Z(832433681);
                    M = rvf.M(R.string.passport_choose_master_option_another, oq5Var);
                    oq5Var.p(false);
                }
                vci vciVar3 = vciVar2;
                oq5 oq5Var2 = oq5Var;
                wcs.b(M, androidx.compose.foundation.layout.a.q(vciVar3, f, 0.0f, 0.0f, 0.0f, 14), ((i95) oq5Var.j(j95.a)).a, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((rdt) oq5Var.j(vdt.a)).k, oq5Var2, 48, 0, 65528);
                oq5Var = oq5Var2;
                oq5Var.p(true);
                i6 = i7;
                f3 = 1.0f;
                vciVar2 = vciVar3;
            }
            vci vciVar4 = vciVar2;
            oq5Var.p(false);
            oq5Var.p(true);
            String M3 = rvf.M(R.string.passport_choose_master_button_continue, oq5Var);
            boolean z2 = u6kVar.h() != -1;
            yci m2 = androidx.compose.foundation.layout.a.m(androidx.compose.foundation.layout.d.d(vciVar4, 1.0f), f2);
            list2 = list;
            boolean f5 = oq5Var.f(u6kVar) | ((i2 & 112) == 32) | oq5Var.h(list2);
            Object K3 = oq5Var.K();
            if (f5 || K3 == kjnVar) {
                function12 = function1;
                K3 = new ftr(23, function12, list2, u6kVar);
                oq5Var.k0(K3);
            } else {
                function12 = function1;
            }
            com.yandex.plus.pay.ui.core.b.e(384, 0, oq5Var, m2, M3, (Function0) K3, z2);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vav(list2, function12, yciVar, i, 1);
        }
    }
}
