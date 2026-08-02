package defpackage;

import androidx.compose.animation.a;
import androidx.compose.foundation.layout.d;
import com.yandex.passport.common.ui.compose.theme.c;
import com.yandex.passport.internal.social.esia.EsiaBindActivity;
import com.yandex.passport.internal.ui.account_upgrade.AccountUpgraderActivity;
import com.yandex.passport.internal.ui.account_upgrade.k;
import com.yandex.passport.internal.ui.bouncer.model.n1;
import com.yandex.passport.internal.ui.bouncer.model.o1;
import com.yandex.passport.internal.ui.bouncer.model.q1;
import com.yandex.passport.internal.ui.bouncer.model.v1;
import com.yandex.passport.internal.ui.bouncer.q;
import com.yandex.passport.internal.ui.bouncer.u;
import com.yandex.plus.pay.ui.core.b;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class u0v implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u0v(y3 y3Var, qav qavVar, kxi kxiVar) {
        this.a = 8;
        this.b = qavVar;
        this.c = kxiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        oq5 oq5Var;
        long b;
        oq5 oq5Var2;
        int i = this.a;
        int i2 = 16;
        vci vciVar = vci.a;
        Continuation continuation = null;
        Object obj3 = gq5.a;
        int i3 = 2;
        int i4 = 3;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                pyc pycVar = (pyc) obj5;
                l2v l2vVar = (l2v) obj4;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        return Unit.a;
                    }
                }
                pycVar.invoke(l2vVar, hq5Var, 0);
                return Unit.a;
            case 1:
                s2v s2vVar = (s2v) obj5;
                onu onuVar = (onu) obj4;
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var4 = (oq5) hq5Var2;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var5 = (oq5) hq5Var2;
                boolean h = oq5Var5.h(s2vVar);
                Object K = oq5Var5.K();
                if (h || K == obj3) {
                    Object vtuVar = new vtu(0, s2vVar, s2v.class, "onPlayClick", "onPlayClick()V", 0, 1);
                    oq5Var5.k0(vtuVar);
                    K = vtuVar;
                }
                u1g.p((Function0) ((h9f) K), false, onuVar, d.c(vciVar, 1.0f), null, null, oq5Var5, 3120, 48);
                return Unit.a;
            case 2:
                aqi aqiVar = (aqi) obj5;
                aqi aqiVar2 = (aqi) obj4;
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var6 = (oq5) hq5Var3;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        return Unit.a;
                    }
                }
                if (((Number) ((Function0) aqiVar.getValue()).invoke()).floatValue() > 0.0f) {
                    oq5Var = (oq5) hq5Var3;
                    oq5Var.Z(-1267251605);
                    u1g.q(432, oq5Var, d.c(vciVar, 1.0f), (Function0) aqiVar2.getValue(), (Function0) aqiVar.getValue());
                    z = false;
                } else {
                    z = false;
                    oq5Var = (oq5) hq5Var3;
                    oq5Var.Z(-1276612117);
                }
                oq5Var.p(z);
                return Unit.a;
            case 3:
                a9v a9vVar = (a9v) obj5;
                n7v n7vVar = (n7v) obj4;
                hq5 hq5Var4 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var7 = (oq5) hq5Var4;
                    if (oq5Var7.z()) {
                        oq5Var7.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var8 = (oq5) hq5Var4;
                Object K2 = oq5Var8.K();
                if (K2 == obj3) {
                    K2 = new t0v(13);
                    oq5Var8.k0(K2);
                }
                a.b(a9vVar, null, (Function1) K2, null, "WaveWordsFeedbackContent", null, ild.C(-1987990622, new t31(23, n7vVar), oq5Var8), oq5Var8, 1597824, 42);
                return Unit.a;
            case 4:
                z8v z8vVar = (z8v) obj5;
                Object obj6 = (n7v) obj4;
                hq5 hq5Var5 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var9 = (oq5) hq5Var5;
                    if (oq5Var9.z()) {
                        oq5Var9.S();
                        return Unit.a;
                    }
                }
                x2i x2iVar = qx0.a;
                float f = 8;
                nx0 h2 = qx0.h(f, b2c.o);
                nx0 g = qx0.g(f);
                yci m = androidx.compose.foundation.layout.a.m(d.d(vciVar, 1.0f), 16);
                gu6 gu6Var = knc.a;
                oq5 oq5Var10 = (oq5) hq5Var5;
                boolean d = oq5Var10.d(Integer.MAX_VALUE);
                Object K3 = oq5Var10.K();
                if (d || K3 == obj3) {
                    float f2 = h2.d;
                    gu6 gu6Var2 = knc.a;
                    float f3 = g.d;
                    onc.a.getClass();
                    smc smcVar = smc.a;
                    Object n5bVar = new n5b(i4, new fnc(h2, g, f2, gu6Var2, f3, new xmc()));
                    oq5Var10.k0(n5bVar);
                    K3 = n5bVar;
                }
                kfh kfhVar = (kfh) K3;
                int i5 = oq5Var10.P;
                androidx.compose.runtime.internal.a l = oq5Var10.l();
                yci H = vnj.H(hq5Var5, m);
                xp5.T.getClass();
                Function0 function0 = wp5.b;
                oq5Var10.d0();
                if (oq5Var10.O) {
                    oq5Var10.k(function0);
                } else {
                    oq5Var10.n0();
                }
                g0g.U(hq5Var5, kfhVar, wp5.f);
                g0g.U(hq5Var5, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var10.O || !Intrinsics.d(oq5Var10.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var10, i5, kb5Var);
                }
                g0g.U(hq5Var5, H, wp5.d);
                oq5 oq5Var11 = (oq5) hq5Var5;
                if (((ma5) oq5Var11.j(pa5.a)).g()) {
                    oq5Var10.Z(433396938);
                    b = ((dq0) oq5Var11.j(eq0.a)).d.c;
                    oq5Var10.p(false);
                } else {
                    oq5Var10.Z(433481847);
                    b = d85.b(((dq0) oq5Var11.j(eq0.a)).d.c, 0.08f, 0.0f, 0.0f, 0.0f, 14);
                    oq5Var10.p(false);
                }
                long j = b;
                oq5Var10.Z(1815104071);
                int i6 = 0;
                for (Object obj7 : z8vVar.d) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        u75.n();
                        throw null;
                    }
                    final p6v p6vVar = (p6v) obj7;
                    yci g2 = d.g(vciVar, 32, 0.0f, i3);
                    boolean h3 = oq5Var10.h(obj6) | oq5Var10.h(p6vVar) | oq5Var10.d(i6) | oq5Var10.h(z8vVar);
                    Object K4 = oq5Var10.K();
                    if (h3 || K4 == obj3) {
                        z8v z8vVar2 = z8vVar;
                        K4 = new h00(obj6, p6vVar, i6, z8vVar2, 11);
                        z8vVar = z8vVar2;
                        oq5Var10.k0(K4);
                    }
                    yci e = androidx.compose.foundation.a.e(g2, false, null, null, (Function0) K4, 7);
                    float f4 = 4;
                    vm C = ghh.C(new q0k(f, f, f, f), androidx.compose.foundation.layout.a.c(0.0f, 0.0f, f4, 0.0f, 11));
                    final int i8 = 0;
                    wn5 C2 = ild.C(-1406190661, new Function2() { // from class: o7v
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj8, Object obj9) {
                            switch (i8) {
                                case 0:
                                    hq5 hq5Var6 = (hq5) obj8;
                                    if ((((Integer) obj9).intValue() & 3) == 2) {
                                        oq5 oq5Var12 = (oq5) hq5Var6;
                                        if (oq5Var12.z()) {
                                            oq5Var12.S();
                                            break;
                                        }
                                    }
                                    o8g.a(48, hq5Var6, d.m(vci.a, 20), p6vVar.a);
                                default:
                                    hq5 hq5Var7 = (hq5) obj8;
                                    if ((((Integer) obj9).intValue() & 3) == 2) {
                                        oq5 oq5Var13 = (oq5) hq5Var7;
                                        if (oq5Var13.z()) {
                                            oq5Var13.S();
                                            break;
                                        }
                                    }
                                    xcs.b(p6vVar.b, null, ((dq0) ((oq5) hq5Var7).j(eq0.a)).b.a, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.i(), hq5Var7, 0, 3120, 55290);
                            }
                            return Unit.a;
                        }
                    }, hq5Var5);
                    final int i9 = 1;
                    ox6.e(e, C, f4, j, C2, ild.C(-1847673540, new Function2() { // from class: o7v
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj8, Object obj9) {
                            switch (i9) {
                                case 0:
                                    hq5 hq5Var6 = (hq5) obj8;
                                    if ((((Integer) obj9).intValue() & 3) == 2) {
                                        oq5 oq5Var12 = (oq5) hq5Var6;
                                        if (oq5Var12.z()) {
                                            oq5Var12.S();
                                            break;
                                        }
                                    }
                                    o8g.a(48, hq5Var6, d.m(vci.a, 20), p6vVar.a);
                                default:
                                    hq5 hq5Var7 = (hq5) obj8;
                                    if ((((Integer) obj9).intValue() & 3) == 2) {
                                        oq5 oq5Var13 = (oq5) hq5Var7;
                                        if (oq5Var13.z()) {
                                            oq5Var13.S();
                                            break;
                                        }
                                    }
                                    xcs.b(p6vVar.b, null, ((dq0) ((oq5) hq5Var7).j(eq0.a)).b.a, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.i(), hq5Var7, 0, 3120, 55290);
                            }
                            return Unit.a;
                        }
                    }, hq5Var5), hq5Var5, 1769856);
                    i6 = i7;
                    r9 = false;
                    i3 = 2;
                }
                oq5Var10.p(r9);
                oq5Var10.p(true);
                return Unit.a;
            case 5:
                ((Integer) obj2).getClass();
                pcg.d((w7v) obj5, (fk0) obj4, (hq5) obj, rvf.R(65));
                return Unit.a;
            case 6:
                r4v r4vVar = (r4v) obj5;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str = (String) obj2;
                str.getClass();
                r4vVar.getClass();
                exa a = r4vVar.a();
                cvo b2 = r4vVar.b();
                b2.getClass();
                a.b(booleanValue, str, vq2.V(b2, sj2.o((m6v) obj4)), "");
                return Unit.a;
            case 7:
                r4v r4vVar2 = (r4v) obj5;
                n6v n6vVar = (n6v) obj4;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                String str2 = (String) obj2;
                str2.getClass();
                r4vVar2.getClass();
                n6vVar.getClass();
                r4vVar2.a().b(booleanValue2, str2, vq2.s(n6vVar, r4vVar2.b()), "");
                return Unit.a;
            case 8:
                qav qavVar = (qav) obj5;
                kxi kxiVar = (kxi) obj4;
                hq5 hq5Var6 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var12 = (oq5) hq5Var6;
                    if (oq5Var12.z()) {
                        oq5Var12.S();
                        return Unit.a;
                    }
                }
                wn5 wn5Var = q6k.e;
                oq5 oq5Var13 = (oq5) hq5Var6;
                boolean f5 = oq5Var13.f(qavVar);
                Object K5 = oq5Var13.K();
                if (f5 || K5 == obj3) {
                    K5 = new kav(qavVar, kxiVar);
                    oq5Var13.k0(K5);
                }
                wn5Var.invoke((kav) K5, oq5Var13, 0);
                return Unit.a;
            case 9:
                ((Integer) obj2).getClass();
                y7g.o((jzb) obj5, (yci) obj4, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 10:
                muv muvVar = (muv) obj5;
                stv stvVar = (stv) obj4;
                hq5 hq5Var7 = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var14 = (oq5) hq5Var7;
                if (oq5Var14.P(intValue & 1, (intValue & 3) != 2)) {
                    boolean f6 = oq5Var14.f(muvVar) | oq5Var14.f(stvVar);
                    Object K6 = oq5Var14.K();
                    if (f6 || K6 == obj3) {
                        K6 = new cvv(muvVar, stvVar, stvVar.b);
                        oq5Var14.k0(K6);
                    }
                    gdg.p((cvv) K6, null, false, oq5Var14, 0, 6);
                } else {
                    oq5Var14.S();
                }
                return Unit.a;
            case 11:
                ((Integer) obj2).getClass();
                hdg.z((wvv) obj5, (yci) obj4, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 12:
                ((Integer) obj2).getClass();
                ldg.i((dwv) obj5, (sdr) obj4, (hq5) obj, rvf.R(49));
                return Unit.a;
            case 13:
                ((Integer) obj2).getClass();
                wdg.r((lwv) obj5, (fvf) obj4, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 14:
                ((Float) obj).getClass();
                x97.y((mm6) obj5, null, null, new c90((rxv) obj4, ((Float) obj2).floatValue(), continuation, 5), 3);
                return Boolean.TRUE;
            case 15:
                j1w j1wVar = (j1w) obj5;
                aqi aqiVar3 = (aqi) obj4;
                hq5 hq5Var8 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var15 = (oq5) hq5Var8;
                    if (oq5Var15.z()) {
                        oq5Var15.S();
                        return Unit.a;
                    }
                }
                h1w h1wVar = (h1w) aqiVar3.getValue();
                if (Intrinsics.d(h1wVar, d1w.a)) {
                    oq5 oq5Var16 = (oq5) hq5Var8;
                    oq5Var16.Z(1685182276);
                    oq5Var16.p(false);
                } else if (Intrinsics.d(h1wVar, g1w.a)) {
                    oq5 oq5Var17 = (oq5) hq5Var8;
                    oq5Var17.Z(1685246384);
                    j1wVar.getClass();
                    Object K7 = oq5Var17.K();
                    if (K7 == obj3) {
                        l1w l1wVar = j1wVar.a;
                        K7 = new z1w(l1wVar.T(), new z6n(17, j1wVar), l1wVar.K(), ((k1w) l1wVar.U().getValue()).d);
                        oq5Var17.k0(K7);
                    }
                    zwf.s((z1w) K7, null, oq5Var17, 0);
                    oq5Var17.p(false);
                } else if (Intrinsics.d(h1wVar, c1w.a)) {
                    oq5 oq5Var18 = (oq5) hq5Var8;
                    oq5Var18.Z(1685459044);
                    j1wVar.getClass();
                    Object K8 = oq5Var18.K();
                    if (K8 == obj3) {
                        l1w l1wVar2 = j1wVar.a;
                        K8 = new hxv(l1wVar2.N(), new c5p(i2, j1wVar), l1wVar2.K(), ((k1w) l1wVar2.U().getValue()).d);
                        oq5Var18.k0(K8);
                    }
                    zdg.o((hxv) K8, oq5Var18, 0);
                    oq5Var18.p(false);
                } else if (Intrinsics.d(h1wVar, e1w.a)) {
                    oq5 oq5Var19 = (oq5) hq5Var8;
                    oq5Var19.Z(1685681128);
                    j1wVar.getClass();
                    Object K9 = oq5Var19.K();
                    if (K9 == obj3) {
                        K9 = new izv(new gao(j1wVar));
                        oq5Var19.k0(K9);
                    }
                    ivf.s((izv) K9, oq5Var19, 0);
                    oq5Var19.p(false);
                } else if (Intrinsics.d(h1wVar, f1w.a)) {
                    oq5 oq5Var20 = (oq5) hq5Var8;
                    oq5Var20.Z(1685900422);
                    j1wVar.getClass();
                    Object K10 = oq5Var20.K();
                    if (K10 == obj3) {
                        K10 = new rzv(j1wVar.a.S());
                        oq5Var20.k0(K10);
                    }
                    qzv.b((rzv) K10, oq5Var20, 0);
                    oq5Var20.p(false);
                } else {
                    if (!Intrinsics.d(h1wVar, b1w.a)) {
                        throw vz1.i((oq5) hq5Var8, -499829925, false);
                    }
                    oq5 oq5Var21 = (oq5) hq5Var8;
                    oq5Var21.Z(1686114694);
                    boolean h4 = oq5Var21.h(j1wVar);
                    Object K11 = oq5Var21.K();
                    if (h4 || K11 == obj3) {
                        Object vtuVar2 = new vtu(0, j1wVar, j1w.class, "onRetryClick", "onRetryClick()V", 0, 20);
                        oq5Var21.k0(vtuVar2);
                        K11 = vtuVar2;
                    }
                    avf.o((Function0) ((h9f) K11), oq5Var21, 0);
                    oq5Var21.p(false);
                }
                return Unit.a;
            case 16:
                ((Integer) obj2).getClass();
                ((v0w) obj5).A((wn5) obj4, (hq5) obj, rvf.R(7));
                return Unit.a;
            case 17:
                sai saiVar = (sai) obj5;
                v0w v0wVar = (v0w) obj4;
                hq5 hq5Var9 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var22 = (oq5) hq5Var9;
                if (oq5Var22.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean f7 = oq5Var22.f(saiVar);
                    Object K12 = oq5Var22.K();
                    if (f7 || K12 == obj3) {
                        Object vtuVar3 = new vtu(0, saiVar, sai.class, "hide", "hide()V", 0, 22);
                        oq5Var22.k0(vtuVar3);
                        K12 = vtuVar3;
                    }
                    Function0 function02 = (Function0) ((h9f) K12);
                    l1w l1wVar3 = (l1w) v0wVar.m.getValue();
                    boolean h5 = oq5Var22.h(l1wVar3);
                    Object K13 = oq5Var22.K();
                    if (h5 || K13 == obj3) {
                        Object vtuVar4 = new vtu(0, l1wVar3, l1w.class, "onCloseWizardClick", "onCloseWizardClick()V", 0, 23);
                        oq5Var22.k0(vtuVar4);
                        K13 = vtuVar4;
                    }
                    Function0 function03 = (Function0) ((h9f) K13);
                    boolean f8 = oq5Var22.f(saiVar);
                    Object K14 = oq5Var22.K();
                    if (f8 || K14 == obj3) {
                        oq5Var2 = oq5Var22;
                        Object vtuVar5 = new vtu(0, saiVar, sai.class, "hide", "hide()V", 0, 24);
                        oq5Var2.k0(vtuVar5);
                        K14 = vtuVar5;
                    } else {
                        oq5Var2 = oq5Var22;
                    }
                    fxf.r(function02, function03, (Function0) ((h9f) K14), null, oq5Var2, 0);
                } else {
                    oq5Var22.S();
                }
                return Unit.a;
            case 18:
                l1w l1wVar4 = (l1w) obj5;
                mm6 mm6Var = (mm6) obj4;
                hq5 hq5Var10 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var23 = (oq5) hq5Var10;
                    if (oq5Var23.z()) {
                        oq5Var23.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var24 = (oq5) hq5Var10;
                Object K15 = oq5Var24.K();
                if (K15 == obj3) {
                    K15 = new j1w(l1wVar4, mm6Var);
                    oq5Var24.k0(K15);
                }
                swf.u((j1w) K15, oq5Var24, 0);
                return Unit.a;
            case 19:
                ((Integer) obj2).getClass();
                zwf.s((z1w) obj5, (yci) obj4, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 20:
                ((Integer) obj2).getClass();
                zwf.o((Function0) obj5, (Function1) obj4, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 21:
                ((Integer) obj2).getClass();
                zwf.q((e2w) obj5, (Function2) obj4, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 22:
                ((Integer) obj2).getClass();
                b.b((pjc) obj5, (Function2) obj4, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 23:
                i95 i95Var = (i95) obj5;
                wn5 wn5Var2 = (wn5) obj4;
                hq5 hq5Var11 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var25 = (oq5) hq5Var11;
                    if (oq5Var25.z()) {
                        oq5Var25.S();
                        return Unit.a;
                    }
                }
                rdh.a(i95Var, com.yandex.passport.common.ui.compose.theme.d.c, c.a, wn5Var2, hq5Var11, 432, 0);
                return Unit.a;
            case 24:
                com.yandex.passport.common.ui.a aVar = (com.yandex.passport.common.ui.a) obj5;
                EsiaBindActivity esiaBindActivity = (EsiaBindActivity) obj4;
                hq5 hq5Var12 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int i10 = EsiaBindActivity.h;
                if ((intValue3 & 3) == 2) {
                    oq5 oq5Var26 = (oq5) hq5Var12;
                    if (oq5Var26.z()) {
                        oq5Var26.S();
                        return Unit.a;
                    }
                }
                com.yandex.passport.common.ui.compose.theme.d.a(b.z(aVar, hq5Var12), false, ild.C(-1144470166, new r0w(i4, esiaBindActivity), hq5Var12), hq5Var12, 384, 2);
                return Unit.a;
            case 25:
                com.yandex.passport.common.ui.a aVar2 = (com.yandex.passport.common.ui.a) obj5;
                AccountUpgraderActivity accountUpgraderActivity = (AccountUpgraderActivity) obj4;
                hq5 hq5Var13 = (hq5) obj;
                int intValue4 = ((Integer) obj2).intValue();
                int i11 = AccountUpgraderActivity.f;
                if ((intValue4 & 3) == 2) {
                    oq5 oq5Var27 = (oq5) hq5Var13;
                    if (oq5Var27.z()) {
                        oq5Var27.S();
                        return Unit.a;
                    }
                }
                com.yandex.passport.common.ui.compose.theme.d.a(b.z(aVar2, hq5Var13), accountUpgraderActivity.e.getProperties().x, k.a, hq5Var13, 384, 0);
                return Unit.a;
            case 26:
                ((Integer) obj2).getClass();
                q.c((u) obj5, (v1) obj4, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 27:
                ((Integer) obj2).getClass();
                q.e((u) obj5, (o1) obj4, (hq5) obj, rvf.R(1));
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((Integer) obj2).getClass();
                q.f((u) obj5, (q1) obj4, (hq5) obj, rvf.R(1));
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                q.b((u) obj5, (n1) obj4, (hq5) obj, rvf.R(1));
                return Unit.a;
        }
    }

    public /* synthetic */ u0v(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ u0v(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
