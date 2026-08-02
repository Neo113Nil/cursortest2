package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.d;
import com.yandex.music.core.ui.compose.b;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.h0;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.p;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.s0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class x91 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ x91(qzl qzlVar, nab nabVar, thj thjVar, tvd tvdVar, dvl dvlVar, hab habVar, Function0 function0, aqi aqiVar) {
        this.a = 3;
        this.b = qzlVar;
        this.c = nabVar;
        this.d = thjVar;
        this.h = tvdVar;
        this.e = dvlVar;
        this.f = habVar;
        this.g = function0;
        this.i = aqiVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x04fb, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r7.K(), java.lang.Integer.valueOf(r9)) == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02c5, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r10.K(), java.lang.Integer.valueOf(r15)) == false) goto L72;
     */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        ges gesVar;
        thj thjVar;
        yci a;
        int i = this.a;
        vci vciVar = vci.a;
        kjn kjnVar = gq5.a;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.c;
        Object obj10 = this.b;
        switch (i) {
            case 0:
                q0d q0dVar = (q0d) obj10;
                a1d a1dVar = (a1d) obj9;
                ka1 ka1Var = (ka1) obj8;
                gvd gvdVar = (gvd) obj7;
                pbu pbuVar = (pbu) obj6;
                yi1 yi1Var = (yi1) obj5;
                tvd tvdVar = (tvd) obj4;
                dib dibVar = (dib) obj3;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                vci vciVar2 = vci.a;
                if (q0dVar != null && a1dVar != null) {
                    oq5 oq5Var2 = (oq5) hq5Var;
                    oq5Var2.Z(684506412);
                    bs4.f.p(q0dVar, new d1d(hd6.a, true, false), d.c(vciVar2, 1.0f), oq5Var2, 384);
                    oq5Var2.p(false);
                } else if (ka1Var.d.length() == 0) {
                    oq5 oq5Var3 = (oq5) hq5Var;
                    oq5Var3.Z(685028824);
                    qo6 qo6Var = qo6.d;
                    boolean v = v7g.v(pbuVar);
                    boolean h = oq5Var3.h(yi1Var);
                    Object K = oq5Var3.K();
                    if (h || K == kjnVar) {
                        K = new m71(0, yi1Var, yi1.class, "onCoverClick", "onCoverClick()V", 0, 4);
                        oq5Var3.k0(K);
                    }
                    h9f h9fVar = (h9f) K;
                    Object K2 = oq5Var3.K();
                    if (K2 == kjnVar) {
                        K2 = vz1.h(oq5Var3);
                    }
                    yci d = a.d(vciVar2, (uoi) K2, null, v, null, null, (Function0) h9fVar, 24);
                    boolean f = oq5Var3.f(tvdVar);
                    Object K3 = oq5Var3.K();
                    if (f || K3 == kjnVar) {
                        K3 = new nr(tvdVar, 4);
                        oq5Var3.k0(K3);
                    }
                    men.n(gvdVar, qo6Var, b.c(wyf.s(d, (Function0) K3), "cover_type", "stub"), oq5Var3, 48);
                    oq5Var3.p(false);
                } else {
                    oq5 oq5Var4 = (oq5) hq5Var;
                    oq5Var4.Z(685810303);
                    String str = ka1Var.d;
                    qo6 qo6Var2 = qo6.d;
                    boolean h2 = oq5Var4.h(yi1Var);
                    Object K4 = oq5Var4.K();
                    if (h2 || K4 == kjnVar) {
                        K4 = new m71(0, yi1Var, yi1.class, "onCoverClick", "onCoverClick()V", 0, 5);
                        oq5Var4.k0(K4);
                    }
                    men.m(str, dibVar, qo6Var2, v7g.v(pbuVar), (Function0) ((h9f) K4), b.c(vciVar2, "cover_type", "full_screen"), oq5Var4, 196992, 0);
                    oq5Var4.p(false);
                }
                return Unit.a;
            case 1:
                yci yciVar = (yci) obj10;
                ges gesVar2 = (ges) obj9;
                ges gesVar3 = (ges) obj8;
                ges gesVar4 = (ges) obj7;
                iu5 iu5Var = (iu5) obj6;
                String str2 = (String) obj5;
                String str3 = (String) obj4;
                String str4 = (String) obj3;
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var5 = (oq5) hq5Var2;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        return Unit.a;
                    }
                }
                yci d2 = androidx.compose.foundation.layout.a.d(d.e(yciVar, w1g.p(gesVar4, 0, hq5Var2, 0, 2) + w1g.p(gesVar3, 0, hq5Var2, 0, 2) + w1g.p(gesVar2, 0, hq5Var2, 0, 2) + w1g.p(gesVar2, 0, hq5Var2, 0, 2) + 13), 0.82f);
                kfh d3 = ug3.d(b2c.f, false);
                oq5 oq5Var6 = (oq5) hq5Var2;
                int i2 = oq5Var6.P;
                androidx.compose.runtime.internal.a l = oq5Var6.l();
                yci H = vnj.H(hq5Var2, d2);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var6.d0();
                if (oq5Var6.O) {
                    oq5Var6.k(grbVar);
                } else {
                    oq5Var6.n0();
                }
                kb5 kb5Var = wp5.f;
                g0g.U(hq5Var2, d3, kb5Var);
                kb5 kb5Var2 = wp5.e;
                g0g.U(hq5Var2, l, kb5Var2);
                kb5 kb5Var3 = wp5.g;
                if (!oq5Var6.O) {
                    gesVar = gesVar2;
                    break;
                } else {
                    gesVar = gesVar2;
                }
                ouj.x(i2, oq5Var6, i2, kb5Var3);
                kb5 kb5Var4 = wp5.d;
                g0g.U(hq5Var2, H, kb5Var4);
                irf.r(a0g.E(2131231131, 0, hq5Var2), null, d.c(vciVar, 1.0f), null, null, 0.0f, null, hq5Var2, 432, 120);
                yci c = d.c(androidx.compose.foundation.layout.a.j(vciVar, -8, -13), 1.0f);
                ta5 a2 = sa5.a(qx0.e, b2c.o, hq5Var2, 54);
                int i3 = oq5Var6.P;
                androidx.compose.runtime.internal.a l2 = oq5Var6.l();
                yci H2 = vnj.H(hq5Var2, c);
                oq5Var6.d0();
                if (oq5Var6.O) {
                    oq5Var6.k(grbVar);
                } else {
                    oq5Var6.n0();
                }
                g0g.U(hq5Var2, a2, kb5Var);
                g0g.U(hq5Var2, l2, kb5Var2);
                if (oq5Var6.O || !Intrinsics.d(oq5Var6.K(), Integer.valueOf(i3))) {
                    ouj.x(i3, oq5Var6, i3, kb5Var3);
                }
                g0g.U(hq5Var2, H2, kb5Var4);
                iu5 iu5Var2 = iu5.a;
                yci a3 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.k(vciVar, 0.0f, iu5Var == iu5Var2 ? 6 : 5, 1), "month");
                agr agrVar = eq0.a;
                oq5 oq5Var7 = (oq5) hq5Var2;
                xcs.b(str2, a3, ((dq0) oq5Var7.j(agrVar)).b.b, 0L, null, 0L, null, new o9s(3), 0L, 1, false, 1, 0, null, gesVar, hq5Var2, 0, 3120, 54776);
                xcs.b(str3, androidx.compose.ui.platform.a.a(iu5Var == iu5Var2 ? androidx.compose.foundation.layout.a.k(vciVar, 0.0f, -2, 1) : vciVar, "day_of_month"), ((dq0) oq5Var7.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, gesVar3, hq5Var2, 0, 0, 65528);
                xcs.b(str4, androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.k(vciVar, 0.0f, iu5Var == iu5Var2 ? -9 : -5, 1), "day_of_week"), ((dq0) oq5Var7.j(agrVar)).b.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, gesVar4, hq5Var2, 0, 0, 65528);
                oq5Var6.p(true);
                oq5Var6.p(true);
                return Unit.a;
            case 2:
                ((Integer) obj2).getClass();
                ot0.o((v2h) obj10, (wn5) obj9, (wn5) obj8, (wn5) obj7, (wn5) obj6, (wn5) obj5, (wn5) obj4, (yci) obj3, (hq5) obj, rvf.R(1797553));
                return Unit.a;
            case 3:
                qzl qzlVar = (qzl) obj10;
                nab nabVar = (nab) obj9;
                thj thjVar2 = (thj) obj8;
                tvd tvdVar2 = (tvd) obj4;
                dvl dvlVar = (dvl) obj7;
                iab iabVar = dvlVar.a;
                hab habVar = (hab) obj6;
                Function0 function0 = (Function0) obj5;
                sdr sdrVar = (sdr) obj3;
                hq5 hq5Var3 = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var8 = (oq5) hq5Var3;
                if (oq5Var8.P(intValue & 1, (intValue & 3) != 2)) {
                    boolean h3 = oq5Var8.h(qzlVar) | oq5Var8.h(nabVar) | oq5Var8.h(thjVar2);
                    Object K5 = oq5Var8.K();
                    if (h3 || K5 == kjnVar) {
                        K5 = new q6h(22, qzlVar, nabVar, thjVar2);
                        oq5Var8.k0(K5);
                    }
                    vci vciVar3 = vci.a;
                    yci b = com.yandex.music.core.ui.compose.a.b(vciVar3, null, 0L, 0.0f, null, (Function2) K5, 15);
                    iz2 iz2Var = b2c.b;
                    kfh d4 = ug3.d(iz2Var, false);
                    int i4 = oq5Var8.P;
                    androidx.compose.runtime.internal.a l3 = oq5Var8.l();
                    yci H3 = vnj.H(oq5Var8, b);
                    xp5.T.getClass();
                    grb grbVar2 = wp5.b;
                    oq5Var8.d0();
                    if (oq5Var8.O) {
                        oq5Var8.k(grbVar2);
                    } else {
                        oq5Var8.n0();
                    }
                    kb5 kb5Var5 = wp5.f;
                    g0g.U(oq5Var8, d4, kb5Var5);
                    kb5 kb5Var6 = wp5.e;
                    g0g.U(oq5Var8, l3, kb5Var6);
                    kb5 kb5Var7 = wp5.g;
                    if (!oq5Var8.O) {
                        thjVar = thjVar2;
                        break;
                    } else {
                        thjVar = thjVar2;
                    }
                    ouj.x(i4, oq5Var8, i4, kb5Var7);
                    kb5 kb5Var8 = wp5.d;
                    g0g.U(oq5Var8, H3, kb5Var8);
                    long f2 = ((ma5) oq5Var8.j(pa5.a)).f();
                    boolean e = oq5Var8.e(f2) | oq5Var8.f(tvdVar2);
                    Object K6 = oq5Var8.K();
                    if (e || K6 == kjnVar) {
                        K6 = new lv(f2, tvdVar2, 4);
                        oq5Var8.k0(K6);
                    }
                    yci c2 = androidx.compose.ui.draw.a.c(vciVar3, (Function1) K6);
                    kfh d5 = ug3.d(iz2Var, false);
                    int i5 = oq5Var8.P;
                    androidx.compose.runtime.internal.a l4 = oq5Var8.l();
                    yci H4 = vnj.H(oq5Var8, c2);
                    oq5Var8.d0();
                    if (oq5Var8.O) {
                        oq5Var8.k(grbVar2);
                    } else {
                        oq5Var8.n0();
                    }
                    g0g.U(oq5Var8, d5, kb5Var5);
                    g0g.U(oq5Var8, l4, kb5Var6);
                    if (oq5Var8.O || !Intrinsics.d(oq5Var8.K(), Integer.valueOf(i5))) {
                        ouj.x(i5, oq5Var8, i5, kb5Var7);
                    }
                    g0g.U(oq5Var8, H4, kb5Var8);
                    gvd gvdVar2 = dvlVar.c;
                    j0q j0qVar = qzlVar.r;
                    yci d6 = d.d(vciVar3, 1.0f);
                    pbu pbuVar2 = (pbu) sdrVar.getValue();
                    qo6 qo6Var3 = qo6.e;
                    thj thjVar3 = thjVar;
                    boolean h4 = oq5Var8.h(qzlVar) | oq5Var8.h(nabVar) | oq5Var8.h(thjVar3);
                    Object K7 = oq5Var8.K();
                    if (h4 || K7 == kjnVar) {
                        K7 = new esl(qzlVar, nabVar, thjVar3, 7);
                        oq5Var8.k0(K7);
                    }
                    Function0 function02 = (Function0) K7;
                    boolean h5 = oq5Var8.h(qzlVar) | oq5Var8.h(nabVar) | oq5Var8.h(thjVar3);
                    Object K8 = oq5Var8.K();
                    if (h5 || K8 == kjnVar) {
                        K8 = new esl(qzlVar, nabVar, thjVar3, 8);
                        oq5Var8.k0(K8);
                    }
                    Function0 function03 = (Function0) K8;
                    boolean h6 = oq5Var8.h(qzlVar) | oq5Var8.h(nabVar) | oq5Var8.h(thjVar3);
                    Object K9 = oq5Var8.K();
                    if (h6 || K9 == kjnVar) {
                        K9 = new esl(qzlVar, nabVar, thjVar3, 9);
                        oq5Var8.k0(K9);
                    }
                    Function0 function04 = (Function0) K9;
                    Object K10 = oq5Var8.K();
                    if (K10 == kjnVar) {
                        K10 = new hvl(3);
                        oq5Var8.k0(K10);
                    }
                    pd.m(iabVar, gvdVar2, habVar, tvdVar2, j0qVar, function02, function03, function04, (Function0) K10, pbuVar2, qo6Var3, d6, function0, null, oq5Var8, 100663296, 122880);
                    iz2 iz2Var2 = b2c.i;
                    androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.a;
                    zsd.r(function0, tvdVar2, androidx.compose.foundation.layout.a.j(bVar.a(vciVar3, iz2Var2), 0, 160), oq5Var8, 0);
                    wdg.e(qzlVar, iabVar.i, dvlVar.d, dvlVar.e, tvdVar2, nabVar, thjVar3, androidx.compose.foundation.layout.a.q(bVar.a(vciVar3, iz2Var2), 0.0f, 0.0f, 0.0f, 20, 7), oq5Var8, 0);
                    oq5Var8.p(true);
                    oq5Var8.p(true);
                } else {
                    oq5Var8.S();
                }
                return Unit.a;
            case 4:
                jzk jzkVar = vnj.i;
                Function0 function05 = (Function0) obj10;
                yci yciVar2 = (yci) obj9;
                d85 d85Var = (d85) obj8;
                r2n r2nVar = (r2n) obj7;
                String str5 = (String) obj6;
                d85 d85Var2 = (d85) obj5;
                String str6 = (String) obj4;
                String str7 = (String) obj3;
                hq5 hq5Var4 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var9 = (oq5) hq5Var4;
                if (oq5Var9.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    agr agrVar2 = eq0.a;
                    long j = ((dq0) oq5Var9.j(agrVar2)).b.a;
                    long j2 = ((dq0) oq5Var9.j(agrVar2)).c.c;
                    oq5Var9.Z(-1237627466);
                    yci u = xp3.u(d.g(yciVar2, p2n.a, 0.0f, 2), ugo.a);
                    if (d85Var != null) {
                        a = a.b(u, d85Var.a, jzkVar);
                    } else {
                        int ordinal = r2nVar.ordinal();
                        if (ordinal == 0) {
                            oq5Var9.Z(2127525274);
                            oq5Var9.p(false);
                            a = a.a(u, j66.m0());
                        } else if (ordinal == 1) {
                            oq5Var9.Z(2127529541);
                            a = a.b(u, ((dq0) oq5Var9.j(agrVar2)).d.c, jzkVar);
                            oq5Var9.p(false);
                        } else {
                            if (ordinal != 2) {
                                throw vz1.i(oq5Var9, 2127523797, false);
                            }
                            oq5Var9.Z(2127527447);
                            oq5Var9.p(false);
                            a = a.b(u, d85.m, jzkVar);
                        }
                    }
                    oq5Var9.p(false);
                    pd.o(1572912, 32, j, j2, ild.C(-1862648121, new lc(str5, d85Var2, r2nVar, str6, str7, 17), oq5Var9), oq5Var9, androidx.compose.ui.platform.a.a(a, "purchase_block_button"), function05, true, false);
                } else {
                    oq5Var9.S();
                }
                return Unit.a;
            case 5:
                xsq xsqVar = (xsq) obj10;
                nb6 nb6Var = (nb6) obj9;
                wn5 wn5Var = (wn5) obj8;
                zsq zsqVar = (zsq) obj7;
                ys4 ys4Var = (ys4) obj6;
                ws4 ws4Var = (ws4) obj5;
                hvq hvqVar = (hvq) obj4;
                o3k o3kVar = (o3k) obj3;
                hq5 hq5Var5 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var10 = (oq5) hq5Var5;
                    if (oq5Var10.z()) {
                        oq5Var10.S();
                        return Unit.a;
                    }
                }
                pcg.l(ild.C(-1274158145, new g0d(xsqVar, nb6Var, wn5Var, zsqVar, ys4Var, ws4Var, hvqVar, o3kVar, 3), hq5Var5), hq5Var5, 6);
                return Unit.a;
            case 6:
                ((Integer) obj2).getClass();
                y1g.n((yj2) obj10, (sdr) obj9, (sdr) obj8, (Function0) obj7, (Function0) obj6, (Function0) obj5, (ccg) obj4, (yci) obj3, (hq5) obj, rvf.R(3073));
                return Unit.a;
            default:
                h0 h0Var = (h0) obj10;
                p pVar = (p) obj9;
                mm6 mm6Var = (mm6) obj8;
                zcq zcqVar = (zcq) obj7;
                Function0 function06 = (Function0) obj6;
                Function1 function1 = (Function1) obj5;
                Function0 function07 = (Function0) obj4;
                aqi aqiVar = (aqi) obj3;
                hq5 hq5Var6 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var11 = (oq5) hq5Var6;
                    if (oq5Var11.z()) {
                        oq5Var11.S();
                        return Unit.a;
                    }
                }
                com.yandex.passport.internal.report.reporters.h0 logoutReporter = pVar.getLogoutReporter();
                oq5 oq5Var12 = (oq5) hq5Var6;
                boolean h7 = oq5Var12.h(mm6Var) | oq5Var12.f(zcqVar) | oq5Var12.f(function06) | oq5Var12.f(function1) | oq5Var12.f(function07);
                Object K11 = oq5Var12.K();
                if (h7 || K11 == kjnVar) {
                    K11 = new m10(mm6Var, zcqVar, function06, function1, function07, aqiVar);
                    oq5Var12.k0(K11);
                }
                s0.a(h0Var, logoutReporter, (Function1) K11, bfg.Q(vciVar, bfg.C(oq5Var12), false, 14), oq5Var12, 0);
                return Unit.a;
        }
    }

    public /* synthetic */ x91(Object obj, Object obj2, Object obj3, syc sycVar, syc sycVar2, syc sycVar3, Object obj4, yci yciVar, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = sycVar;
        this.f = sycVar2;
        this.g = sycVar3;
        this.h = obj4;
        this.i = yciVar;
    }

    public /* synthetic */ x91(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
        this.i = obj8;
    }
}
