package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import androidx.fragment.app.y;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.yandex.passport.sloth.ui.z1;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.PlaybackScope;

/* loaded from: classes3.dex */
public final /* synthetic */ class pli implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ pli(d85 d85Var, hvq hvqVar, zsq zsqVar, um0 um0Var, kfs kfsVar) {
        this.a = 17;
        this.c = d85Var;
        this.f = hvqVar;
        this.e = zsqVar;
        this.b = um0Var;
        this.d = kfsVar;
    }

    private final Object a(Object obj, Object obj2) {
        long j;
        d85 d85Var = (d85) this.c;
        hvq hvqVar = (hvq) this.f;
        zsq zsqVar = (zsq) this.e;
        um0 um0Var = (um0) this.b;
        kfs kfsVar = (kfs) this.d;
        hq5 hq5Var = (hq5) obj;
        if ((((Integer) obj2).intValue() & 3) == 2) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        oq5 oq5Var2 = (oq5) hq5Var;
        Object K = oq5Var2.K();
        Object obj3 = gq5.a;
        if (K == obj3) {
            K = szf.g0(Boolean.TRUE);
            oq5Var2.k0(K);
        }
        aqi aqiVar = (aqi) K;
        Object K2 = oq5Var2.K();
        if (K2 == obj3) {
            K2 = szf.g0(Boolean.TRUE);
            oq5Var2.k0(K2);
        }
        aqi aqiVar2 = (aqi) K2;
        if (d85Var == null) {
            oq5Var2.Z(273741816);
            j = ((dq0) oq5Var2.j(eq0.a)).b.d;
            oq5Var2.p(false);
        } else {
            oq5Var2.Z(273740700);
            oq5Var2.p(false);
            j = d85Var.a;
        }
        long j2 = j;
        vci vciVar = vci.a;
        yci o = a.o(d.c(vciVar, 1.0f), 16, 0.0f, 2);
        boolean h = oq5Var2.h(hvqVar) | oq5Var2.h(zsqVar);
        Object K3 = oq5Var2.K();
        if (h || K3 == obj3) {
            K3 = new ko1(hvqVar, zsqVar, 13);
            oq5Var2.k0(K3);
        }
        yci b = com.yandex.music.core.ui.compose.a.b(o, null, 0L, 0.0f, null, (Function2) K3, 15);
        ta5 a = sa5.a(qx0.c, b2c.o, oq5Var2, 48);
        int i = oq5Var2.P;
        androidx.compose.runtime.internal.a l = oq5Var2.l();
        yci H = vnj.H(oq5Var2, b);
        xp5.T.getClass();
        Function0 function0 = wp5.b;
        oq5Var2.d0();
        if (oq5Var2.O) {
            oq5Var2.k(function0);
        } else {
            oq5Var2.n0();
        }
        g0g.U(oq5Var2, a, wp5.f);
        g0g.U(oq5Var2, l, wp5.e);
        kb5 kb5Var = wp5.g;
        if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i))) {
            ouj.x(i, oq5Var2, i, kb5Var);
        }
        g0g.U(oq5Var2, H, wp5.d);
        vm0 b2 = fn0.b(0, 0.0f, um0Var, oq5Var2, 6, 2);
        String str = kfsVar.a;
        ges f = nu0.f();
        long j3 = nu0.f().b.c;
        v7g.p(j3);
        ges b3 = ges.b(f, 0L, 0L, null, null, 0L, 0, v7g.D(kes.c(j3) * 0.85f, j3 & 1095216660480L), null, new h6g(17, e6g.c), 0, 0, 15597567);
        ozm ozmVar = eq0.a;
        long j4 = ((dq0) oq5Var2.j(ozmVar)).b.a;
        boolean f2 = oq5Var2.f(b2);
        Object K4 = oq5Var2.K();
        if (f2 || K4 == obj3) {
            K4 = new a9q(b2, 26);
            oq5Var2.k0(K4);
        }
        xcs.b(str, wyf.s(vciVar, (Function0) K4), j4, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, b3, oq5Var2, 0, 0, 65016);
        String str2 = kfsVar.b;
        ges c = nu0.c();
        long j5 = ((dq0) oq5Var2.j(ozmVar)).b.a;
        boolean f3 = oq5Var2.f(b2);
        Object K5 = oq5Var2.K();
        if (f3 || K5 == obj3) {
            K5 = new a9q(b2, 27);
            oq5Var2.k0(K5);
        }
        xcs.b(str2, wyf.s(vciVar, (Function0) K5), j5, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, c, oq5Var2, 0, 0, 65016);
        wa5 wa5Var = wa5.a;
        float f4 = 20;
        yci g = d.g(wa5Var.b(1.0f, vciVar, true), f4, 0.0f, 2);
        float Q = ff7.Q(f4, oq5Var2);
        Object K6 = oq5Var2.K();
        if (K6 == obj3) {
            K6 = new xes(1, aqiVar, aqiVar2);
            oq5Var2.k0(K6);
        }
        Function0 function02 = (Function0) K6;
        Object[] objArr = new Object[0];
        Object K7 = oq5Var2.K();
        if (K7 == obj3) {
            K7 = new x6s(4);
            oq5Var2.k0(K7);
        }
        Object obj4 = (aqi) o2g.g0(objArr, null, (Function0) K7, oq5Var2, 0, 6);
        boolean c2 = oq5Var2.c(Q) | oq5Var2.f(obj4);
        Object K8 = oq5Var2.K();
        if (c2 || K8 == obj3) {
            K8 = new po1(Q, function02, obj4, 2);
            oq5Var2.k0(K8);
        }
        u1g.l(oq5Var2, androidx.compose.ui.layout.a.d(g, (Function1) K8));
        vm0 b4 = fn0.b(1, 0.0f, um0Var, oq5Var2, 6, 2);
        jfs jfsVar = kfsVar.c;
        boolean booleanValue = ((Boolean) aqiVar.getValue()).booleanValue();
        boolean booleanValue2 = ((Boolean) aqiVar2.getValue()).booleanValue();
        boolean f5 = oq5Var2.f(b4);
        Object K9 = oq5Var2.K();
        if (f5 || K9 == obj3) {
            K9 = new a9q(b4, 28);
            oq5Var2.k0(K9);
        }
        gdg.e(jfsVar, j2, booleanValue, booleanValue2, wyf.s(vciVar, (Function0) K9), oq5Var2, 8);
        u1g.l(oq5Var2, wa5Var.b(1.0f, d.g(vciVar, f4, 0.0f, 2), true));
        vm0 b5 = fn0.b(2, 0.0f, um0Var, oq5Var2, 6, 2);
        jfs jfsVar2 = kfsVar.d;
        boolean booleanValue3 = ((Boolean) aqiVar.getValue()).booleanValue();
        boolean booleanValue4 = ((Boolean) aqiVar2.getValue()).booleanValue();
        boolean f6 = oq5Var2.f(b5);
        Object K10 = oq5Var2.K();
        if (f6 || K10 == obj3) {
            K10 = new a9q(b5, 29);
            oq5Var2.k0(K10);
        }
        gdg.e(jfsVar2, j2, booleanValue3, booleanValue4, wyf.s(vciVar, (Function0) K10), oq5Var2, 8);
        u1g.l(oq5Var2, wa5Var.b(1.0f, d.g(vciVar, f4, 0.0f, 2), true));
        oq5Var2.p(true);
        return Unit.a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        boolean z;
        int i = this.a;
        int i2 = 10;
        int i3 = 9;
        vci vciVar = vci.a;
        kjn kjnVar = gq5.a;
        final int i4 = 2;
        final int i5 = 1;
        Object obj4 = this.d;
        Object obj5 = this.b;
        final int i6 = 3;
        Object obj6 = this.e;
        Object obj7 = this.f;
        Object obj8 = this.c;
        switch (i) {
            case 0:
                cmi cmiVar = (cmi) obj8;
                ek ekVar = (ek) obj7;
                Function0 function0 = (Function0) obj6;
                rli rliVar = (rli) obj5;
                fvf fvfVar = (fvf) obj4;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    WeakHashMap weakHashMap = rqv.w;
                    vm C = ghh.C(p6g.n(z7l.h(oq5Var).f, oq5Var), a.c(0.0f, mu0.i, 0.0f, 0.0f, 13));
                    vm C2 = ghh.C(ghh.C(C, zs4.g(oq5Var)), ogp.A(oq5Var));
                    Object K = oq5Var.K();
                    if (K == kjnVar) {
                        K = new p1i(20);
                        oq5Var.k0(K);
                    }
                    ot0.l(cmiVar, (Function1) K, null, null, "music_history_content_crossfade", false, ild.C(-1793353465, new lc(C, function0, rliVar, C2, fvfVar, 7), oq5Var), oq5Var, 1597488, 44);
                    String M = rvf.M(R.string.listening_history_header_title, oq5Var);
                    n5g a = mp0.a(oq5Var);
                    yci a2 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.a.b(vciVar, svd.a(oq5Var), vnj.i), "music_history_top_bar");
                    Object K2 = oq5Var.K();
                    if (K2 == kjnVar) {
                        K2 = new p1i(21);
                        oq5Var.k0(K2);
                    }
                    yd5.b(ekVar, M, a, nfp.b(a2, false, (Function1) K2), null, ild.C(1517775938, new ykf(i2, rliVar), oq5Var), 0L, oq5Var, 196608, 80);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                rli rliVar2 = (rli) obj5;
                cmi cmiVar2 = (cmi) obj8;
                fvf fvfVar2 = (fvf) obj4;
                vm vmVar = (vm) obj7;
                Function0 function02 = (Function0) obj6;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Unit unit = Unit.a;
                    boolean h = oq5Var2.h(rliVar2);
                    Object K3 = oq5Var2.K();
                    if (h || K3 == kjnVar) {
                        K3 = new qli(rliVar2, null, false ? 1 : 0);
                        oq5Var2.k0(K3);
                    }
                    gld.w(oq5Var2, unit, (Function2) K3);
                    bmi bmiVar = (bmi) cmiVar2;
                    boolean f = oq5Var2.f(rliVar2);
                    Object K4 = oq5Var2.K();
                    if (f || K4 == kjnVar) {
                        K4 = new xli(rliVar2.b, rliVar2.c, rliVar2.f, rliVar2.g, rliVar2.h, rliVar2.i, rliVar2.j, rliVar2.k, rliVar2.m, rliVar2.n, rliVar2.o, rliVar2.p);
                        oq5Var2.k0(K4);
                    }
                    xli xliVar = (xli) K4;
                    yci a3 = androidx.compose.ui.platform.a.a(vciVar, "music_history_success_screen");
                    boolean f2 = oq5Var2.f(vmVar) | oq5Var2.f(function02);
                    Object K5 = oq5Var2.K();
                    if (f2 || K5 == kjnVar) {
                        K5 = new y6g(11, vmVar, function02);
                        oq5Var2.k0(K5);
                    }
                    y5g.c(bmiVar, fvfVar2, xliVar, (Function0) K5, a3, oq5Var2, 24576);
                } else {
                    oq5Var2.S();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                y5g.c((bmi) obj8, (fvf) obj4, (xli) obj7, (Function0) obj6, (yci) obj5, (hq5) obj, rvf.R(24577));
                break;
            case 3:
                ((Integer) obj2).getClass();
                v5g.c((String) obj8, (ebj) obj7, (tmb) obj6, (qnq) obj5, (nnq) obj4, (hq5) obj, rvf.R(4609));
                break;
            case 4:
                Function1 function1 = (Function1) obj8;
                Function1 function12 = (Function1) obj7;
                Function0 function03 = (Function0) obj6;
                Function0 function04 = (Function0) obj5;
                rrf rrfVar = (rrf) obj4;
                hq5 hq5Var3 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Object K6 = oq5Var3.K();
                    Object obj9 = K6;
                    if (K6 == kjnVar) {
                        mm6 R = gld.R(g.a, oq5Var3);
                        oq5Var3.k0(R);
                        obj9 = R;
                    }
                    mm6 mm6Var = (mm6) obj9;
                    boolean f3 = oq5Var3.f(function1) | oq5Var3.h(mm6Var);
                    Object K7 = oq5Var3.K();
                    Object obj10 = K7;
                    if (f3 || K7 == kjnVar) {
                        cqj cqjVar = new cqj(function1, mm6Var, false ? 1 : 0);
                        oq5Var3.k0(cqjVar);
                        obj10 = cqjVar;
                    }
                    Function0 function05 = (Function0) obj10;
                    boolean f4 = oq5Var3.f(function12) | oq5Var3.h(mm6Var);
                    Object K8 = oq5Var3.K();
                    Object obj11 = K8;
                    if (f4 || K8 == kjnVar) {
                        cqj cqjVar2 = new cqj(function12, mm6Var, i5);
                        oq5Var3.k0(cqjVar2);
                        obj11 = cqjVar2;
                    }
                    Function0 function06 = (Function0) obj11;
                    boolean f5 = oq5Var3.f(function03);
                    Object K9 = oq5Var3.K();
                    Object obj12 = K9;
                    if (f5 || K9 == kjnVar) {
                        g1j g1jVar = new g1j(4, function03);
                        oq5Var3.k0(g1jVar);
                        obj12 = g1jVar;
                    }
                    Function0 function07 = (Function0) obj12;
                    boolean f6 = oq5Var3.f(function04);
                    Object K10 = oq5Var3.K();
                    Object obj13 = K10;
                    if (f6 || K10 == kjnVar) {
                        g1j g1jVar2 = new g1j(5, function04);
                        oq5Var3.k0(g1jVar2);
                        obj13 = g1jVar2;
                    }
                    wyf.c(function05, function06, function07, (Function0) obj13, null, oq5Var3, 0, 33);
                    rrfVar.getUi().invoke(oq5Var3, 0);
                } else {
                    oq5Var3.S();
                }
                break;
            case 5:
                k4k k4kVar = (k4k) obj8;
                wn5 wn5Var = (wn5) obj7;
                o0k o0kVar = (o0k) obj5;
                Function0 function08 = (Function0) obj6;
                tmb tmbVar = (tmb) obj4;
                hq5 hq5Var4 = (hq5) obj;
                int intValue4 = ((Integer) obj2).intValue();
                oq5 oq5Var4 = (oq5) hq5Var4;
                if (oq5Var4.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (k4kVar.a) {
                        oq5Var4.Z(-346000934);
                        wn5Var.invoke(o0kVar, oq5Var4, 0);
                    } else {
                        oq5Var4.Z(-349504120);
                    }
                    oq5Var4.p(false);
                    if (Intrinsics.d(k4kVar.b, i4k.a)) {
                        oq5Var4.Z(-345879910);
                        pd.g(6, 0, oq5Var4, d.x(d.c(vciVar, 1.0f), null, 3));
                    } else {
                        oq5Var4.Z(-349504120);
                    }
                    oq5Var4.p(false);
                    if (k4kVar.c) {
                        oq5Var4.Z(-345654416);
                        yci x = d.x(bfg.Q(d.c(a.l(vciVar, o0kVar), 1.0f), bfg.C(oq5Var4), false, 14), b2c.f, 2);
                        boolean f7 = oq5Var4.f(function08);
                        Object K11 = oq5Var4.K();
                        if (f7 || K11 == kjnVar) {
                            K11 = new ex(16, function08);
                            oq5Var4.k0(K11);
                        }
                        rvf.j((Function1) K11, tmbVar, x, 0, true, null, oq5Var4, 24640, 40);
                    } else {
                        oq5Var4.Z(-349504120);
                    }
                    oq5Var4.p(false);
                } else {
                    oq5Var4.S();
                }
                break;
            case 6:
                na0 na0Var = (na0) obj8;
                jx7 jx7Var = (jx7) obj7;
                adl adlVar = (adl) obj6;
                sdr sdrVar = (sdr) obj5;
                h4b h4bVar = (h4b) obj4;
                hq5 hq5Var5 = (hq5) obj;
                int intValue5 = ((Integer) obj2).intValue();
                oq5 oq5Var5 = (oq5) hq5Var5;
                if (oq5Var5.P(intValue5 & 1, (intValue5 & 3) != 2)) {
                    bg3.a(null, null, false, ild.C(-1088845001, new lc(na0Var, jx7Var, adlVar, sdrVar, h4bVar, 9), oq5Var5), oq5Var5, 3072, 7);
                } else {
                    oq5Var5.S();
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                y1g.j((dvl) obj8, (nab) obj7, (thj) obj6, (qzl) obj5, (tvd) obj4, (hq5) obj, rvf.R(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                ocg.d((xam) obj8, (u0s) obj7, (jab) obj6, (thj) obj5, (rbm) obj4, (hq5) obj, rvf.R(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                pcg.g((ham) obj8, (wdj) obj7, (Function0) obj6, (Function0) obj5, (yci) obj4, (hq5) obj, rvf.R(3073));
                break;
            case 10:
                wbm wbmVar = (wbm) obj8;
                jbm jbmVar = (jbm) obj7;
                fud fudVar = (fud) obj6;
                sdr sdrVar2 = (sdr) obj5;
                sdr sdrVar3 = (sdr) obj4;
                hq5 hq5Var6 = (hq5) obj;
                int intValue6 = ((Integer) obj2).intValue();
                oq5 oq5Var6 = (oq5) hq5Var6;
                if (oq5Var6.P(intValue6 & 1, (intValue6 & 3) != 2)) {
                    mt mtVar = wbmVar.a;
                    jab jabVar = new jab(qkb.Header, 1, 1, 1);
                    mxs mxsVar = wbmVar.f;
                    jbmVar.getClass();
                    boolean f8 = oq5Var6.f(mtVar);
                    Object K12 = oq5Var6.K();
                    if (f8 || K12 == kjnVar) {
                        gcm gcmVar = jbmVar.a;
                        qbj qbjVar = jbmVar.b;
                        rbj rbjVar = jbmVar.c;
                        tmb tmbVar2 = jbmVar.d;
                        obj3 = null;
                        K12 = new rbm(gcmVar, qbjVar, rbjVar, mtVar, tmbVar2, tmbVar2.a(jabVar, null), mxsVar);
                        oq5Var6.k0(K12);
                    } else {
                        obj3 = null;
                    }
                    rbm rbmVar = (rbm) K12;
                    xdr xdrVar = rbmVar.f;
                    xdrVar.getClass();
                    xdrVar.m(obj3, mxsVar);
                    iab iabVar = wbmVar.b;
                    dam damVar = new dam(iabVar, etn.f0(iabVar.c, fudVar, jbmVar.i, oq5Var6, 0, 8), wbmVar.c);
                    oq oqVar = mtVar.a;
                    oqVar.getClass();
                    wdg.f(damVar, c3x.w(lxe.B(oqVar), 0, 0), new gvl(rbmVar, wbmVar, sdrVar2, sdrVar3, 9), rbmVar, oq5Var6, 0);
                } else {
                    oq5Var6.S();
                }
                break;
            case 11:
                qec qecVar = (qec) obj8;
                kjm kjmVar = (kjm) obj7;
                Context context = (Context) obj6;
                y yVar = (y) obj5;
                bci bciVar = (bci) obj4;
                hq5 hq5Var7 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var7 = (oq5) hq5Var7;
                    if (oq5Var7.z()) {
                        oq5Var7.S();
                        break;
                    }
                }
                context.getClass();
                yVar.getClass();
                dn9 dn9Var = (dn9) qecVar.b;
                ebm ebmVar = (ebm) dn9Var.c;
                j6e j6eVar = new j6e(new m((PlaybackScope) dn9Var.b, ebmVar, context, yVar, null, 48), ebmVar);
                njm njmVar = (njm) ((jyr) dn9Var.e).getValue();
                k68 k68Var = (k68) ((jyr) dn9Var.f).getValue();
                lkm lkmVar = (lkm) ((jyr) dn9Var.d).getValue();
                njmVar.getClass();
                k68Var.getClass();
                lkmVar.getClass();
                oq5 oq5Var8 = (oq5) hq5Var7;
                boolean h2 = oq5Var8.h(kjmVar) | oq5Var8.h(njmVar) | oq5Var8.h(k68Var) | oq5Var8.h(lkmVar);
                Object K13 = oq5Var8.K();
                if (h2 || K13 == kjnVar) {
                    K13 = new i50(kjmVar, njmVar, k68Var, lkmVar, 18);
                    oq5Var8.k0(K13);
                }
                Function1 function13 = (Function1) K13;
                oq5Var8.a0(419377738);
                kfu a4 = rpg.a(oq5Var8);
                if (a4 == null) {
                    xq0.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    break;
                } else {
                    bfu R2 = ngg.R(ern.a(ujm.class), a4, null, k5r.g(ujm.class, new p97(1), function13), a4 instanceof ssd ? ((ssd) a4).getDefaultViewModelCreationExtras() : gs6.b, oq5Var8);
                    oq5Var8.p(false);
                    ujm ujmVar = (ujm) R2;
                    Object K14 = oq5Var8.K();
                    if (K14 == kjnVar) {
                        K14 = new ojm(j6eVar, ujmVar);
                        oq5Var8.k0(K14);
                    }
                    a0g.l((ojm) K14, bciVar, hq5Var7, 64);
                }
            case 12:
                mqs mqsVar = (mqs) obj8;
                final p8n p8nVar = (p8n) obj7;
                m8n m8nVar = (m8n) obj6;
                final l8n l8nVar = (l8n) obj5;
                sdr sdrVar4 = (sdr) obj4;
                hq5 hq5Var8 = (hq5) obj;
                int intValue7 = ((Integer) obj2).intValue();
                oq5 oq5Var9 = (oq5) hq5Var8;
                if (oq5Var9.P(intValue7 & 1, (intValue7 & 3) != 2)) {
                    po6 a5 = oo6.a.a(mqsVar);
                    bzj bzjVar = p8nVar.g ? bzj.a : bzj.b;
                    bg5 H = up6.H(mqsVar, m8nVar, oq5Var9, 6, 4);
                    boolean booleanValue = ((Boolean) sdrVar4.getValue()).booleanValue();
                    int c = l8nVar.c();
                    String M2 = rvf.M(R.string.move_to_start, oq5Var9);
                    boolean h3 = oq5Var9.h(l8nVar) | oq5Var9.h(p8nVar);
                    Object K15 = oq5Var9.K();
                    if (h3 || K15 == kjnVar) {
                        final int i7 = false ? 1 : 0;
                        K15 = new Function0() { // from class: k8n
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i7) {
                                    case 0:
                                        int c2 = l8nVar.c();
                                        p8n p8nVar2 = p8nVar;
                                        if (p8nVar2.g && c2 > 0) {
                                            p8n.v(p8nVar2, c2, 0);
                                        }
                                        break;
                                    case 1:
                                        int c3 = l8nVar.c();
                                        p8n p8nVar3 = p8nVar;
                                        boolean z2 = p8nVar3.g;
                                        ArrayList arrayList = p8nVar3.f;
                                        if (z2 && c3 < u75.g(arrayList)) {
                                            p8n.v(p8nVar3, c3, arrayList.size() - 1);
                                        }
                                        break;
                                    case 2:
                                        int c4 = l8nVar.c();
                                        p8n p8nVar4 = p8nVar;
                                        if (p8nVar4.g && c4 > 0) {
                                            p8n.v(p8nVar4, c4, c4 - 1);
                                        }
                                        break;
                                    default:
                                        int c5 = l8nVar.c();
                                        p8n p8nVar5 = p8nVar;
                                        if (p8nVar5.g && c5 < u75.g(p8nVar5.f)) {
                                            p8n.v(p8nVar5, c5, c5 + 1);
                                        }
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var9.k0(K15);
                    }
                    qfi qfiVar = new qfi(M2, (Function0) K15);
                    String M3 = rvf.M(R.string.move_to_end, oq5Var9);
                    boolean h4 = oq5Var9.h(l8nVar) | oq5Var9.h(p8nVar);
                    Object K16 = oq5Var9.K();
                    if (h4 || K16 == kjnVar) {
                        K16 = new Function0() { // from class: k8n
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i5) {
                                    case 0:
                                        int c2 = l8nVar.c();
                                        p8n p8nVar2 = p8nVar;
                                        if (p8nVar2.g && c2 > 0) {
                                            p8n.v(p8nVar2, c2, 0);
                                        }
                                        break;
                                    case 1:
                                        int c3 = l8nVar.c();
                                        p8n p8nVar3 = p8nVar;
                                        boolean z2 = p8nVar3.g;
                                        ArrayList arrayList = p8nVar3.f;
                                        if (z2 && c3 < u75.g(arrayList)) {
                                            p8n.v(p8nVar3, c3, arrayList.size() - 1);
                                        }
                                        break;
                                    case 2:
                                        int c4 = l8nVar.c();
                                        p8n p8nVar4 = p8nVar;
                                        if (p8nVar4.g && c4 > 0) {
                                            p8n.v(p8nVar4, c4, c4 - 1);
                                        }
                                        break;
                                    default:
                                        int c5 = l8nVar.c();
                                        p8n p8nVar5 = p8nVar;
                                        if (p8nVar5.g && c5 < u75.g(p8nVar5.f)) {
                                            p8n.v(p8nVar5, c5, c5 + 1);
                                        }
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var9.k0(K16);
                    }
                    qfi qfiVar2 = new qfi(M3, (Function0) K16);
                    String M4 = rvf.M(R.string.move_up, oq5Var9);
                    boolean h5 = oq5Var9.h(l8nVar) | oq5Var9.h(p8nVar);
                    Object K17 = oq5Var9.K();
                    if (h5 || K17 == kjnVar) {
                        K17 = new Function0() { // from class: k8n
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i4) {
                                    case 0:
                                        int c2 = l8nVar.c();
                                        p8n p8nVar2 = p8nVar;
                                        if (p8nVar2.g && c2 > 0) {
                                            p8n.v(p8nVar2, c2, 0);
                                        }
                                        break;
                                    case 1:
                                        int c3 = l8nVar.c();
                                        p8n p8nVar3 = p8nVar;
                                        boolean z2 = p8nVar3.g;
                                        ArrayList arrayList = p8nVar3.f;
                                        if (z2 && c3 < u75.g(arrayList)) {
                                            p8n.v(p8nVar3, c3, arrayList.size() - 1);
                                        }
                                        break;
                                    case 2:
                                        int c4 = l8nVar.c();
                                        p8n p8nVar4 = p8nVar;
                                        if (p8nVar4.g && c4 > 0) {
                                            p8n.v(p8nVar4, c4, c4 - 1);
                                        }
                                        break;
                                    default:
                                        int c5 = l8nVar.c();
                                        p8n p8nVar5 = p8nVar;
                                        if (p8nVar5.g && c5 < u75.g(p8nVar5.f)) {
                                            p8n.v(p8nVar5, c5, c5 + 1);
                                        }
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var9.k0(K17);
                    }
                    qfi qfiVar3 = new qfi(M4, (Function0) K17);
                    String M5 = rvf.M(R.string.move_down, oq5Var9);
                    boolean h6 = oq5Var9.h(l8nVar) | oq5Var9.h(p8nVar);
                    Object K18 = oq5Var9.K();
                    if (h6 || K18 == kjnVar) {
                        K18 = new Function0() { // from class: k8n
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i6) {
                                    case 0:
                                        int c2 = l8nVar.c();
                                        p8n p8nVar2 = p8nVar;
                                        if (p8nVar2.g && c2 > 0) {
                                            p8n.v(p8nVar2, c2, 0);
                                        }
                                        break;
                                    case 1:
                                        int c3 = l8nVar.c();
                                        p8n p8nVar3 = p8nVar;
                                        boolean z2 = p8nVar3.g;
                                        ArrayList arrayList = p8nVar3.f;
                                        if (z2 && c3 < u75.g(arrayList)) {
                                            p8n.v(p8nVar3, c3, arrayList.size() - 1);
                                        }
                                        break;
                                    case 2:
                                        int c4 = l8nVar.c();
                                        p8n p8nVar4 = p8nVar;
                                        if (p8nVar4.g && c4 > 0) {
                                            p8n.v(p8nVar4, c4, c4 - 1);
                                        }
                                        break;
                                    default:
                                        int c5 = l8nVar.c();
                                        p8n p8nVar5 = p8nVar;
                                        if (p8nVar5.g && c5 < u75.g(p8nVar5.f)) {
                                            p8n.v(p8nVar5, c5, c5 + 1);
                                        }
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var9.k0(K18);
                    }
                    qfi qfiVar4 = new qfi(M5, (Function0) K18);
                    boolean h7 = oq5Var9.h(p8nVar);
                    Object K19 = oq5Var9.K();
                    if (h7 || K19 == kjnVar) {
                        K19 = new m3l(p8nVar, i5);
                        oq5Var9.k0(K19);
                    }
                    u7g.k(a5, booleanValue, bzjVar, H, c, qfiVar, qfiVar2, qfiVar3, qfiVar4, (Function1) K19, oq5Var9, 0);
                } else {
                    oq5Var9.S();
                }
                break;
            case 13:
                uln ulnVar = (uln) obj8;
                bci bciVar2 = (bci) obj7;
                sai saiVar = (sai) obj6;
                pu0 pu0Var = (pu0) obj5;
                mjm mjmVar = (mjm) obj4;
                hq5 hq5Var9 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var10 = (oq5) hq5Var9;
                    if (oq5Var10.z()) {
                        oq5Var10.S();
                        break;
                    }
                }
                j0p j0pVar = ulnVar.a;
                oq5 oq5Var11 = (oq5) hq5Var9;
                boolean h8 = oq5Var11.h(j0pVar);
                Object K20 = oq5Var11.K();
                Object obj14 = K20;
                if (h8 || K20 == kjnVar) {
                    mjm mjmVar2 = new mjm(10, j0pVar);
                    oq5Var11.k0(mjmVar2);
                    obj14 = mjmVar2;
                }
                Function1 function14 = (Function1) obj14;
                oq5Var11.a0(419377738);
                kfu a6 = rpg.a(oq5Var11);
                if (a6 == null) {
                    xq0.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    break;
                } else {
                    bfu R3 = ngg.R(ern.a(vmn.class), a6, null, k5r.g(vmn.class, new p97(1), function14), a6 instanceof ssd ? ((ssd) a6).getDefaultViewModelCreationExtras() : gs6.b, oq5Var11);
                    oq5Var11.p(false);
                    vmn vmnVar = (vmn) R3;
                    boolean f9 = oq5Var11.f(vmnVar);
                    Object K21 = oq5Var11.K();
                    Object obj15 = K21;
                    if (f9 || K21 == kjnVar) {
                        wln wlnVar = new wln(vmnVar);
                        oq5Var11.k0(wlnVar);
                        obj15 = wlnVar;
                    }
                    wln wlnVar2 = (wln) obj15;
                    long j = d85.m;
                    boolean f10 = oq5Var11.f(saiVar) | oq5Var11.h(wlnVar2);
                    Object K22 = oq5Var11.K();
                    Object obj16 = K22;
                    if (f10 || K22 == kjnVar) {
                        rln rlnVar = new rln(i5, saiVar, wlnVar2);
                        oq5Var11.k0(rlnVar);
                        obj16 = rlnVar;
                    }
                    yd5.f(null, null, bciVar2, null, (Function0) obj16, false, false, false, j, 0L, 0.0f, ild.C(-1187386254, new mdn(pu0Var, wlnVar2, mjmVar, saiVar, 2), oq5Var11), oq5Var11, 805310464, 3543);
                }
            case 14:
                ((Integer) obj2).getClass();
                wyf.k((tx) obj8, (Function2) obj7, (Function2) obj6, (yci) obj5, (Function2) obj4, (hq5) obj, rvf.R(9));
                break;
            case 15:
                s2p s2pVar = (s2p) obj8;
                c0p c0pVar = (c0p) obj7;
                tmb tmbVar3 = (tmb) obj5;
                Function0 function09 = (Function0) obj6;
                Function0 function010 = (Function0) obj4;
                hq5 hq5Var10 = (hq5) obj;
                int intValue8 = ((Integer) obj2).intValue();
                oq5 oq5Var12 = (oq5) hq5Var10;
                if (oq5Var12.P(intValue8 & 1, (intValue8 & 3) != 2)) {
                    kfh d = ug3.d(b2c.b, false);
                    int i8 = oq5Var12.P;
                    androidx.compose.runtime.internal.a l = oq5Var12.l();
                    yci H2 = vnj.H(oq5Var12, vciVar);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var12.d0();
                    if (oq5Var12.O) {
                        oq5Var12.k(grbVar);
                    } else {
                        oq5Var12.n0();
                    }
                    g0g.U(oq5Var12, d, wp5.f);
                    g0g.U(oq5Var12, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var12.O || !Intrinsics.d(oq5Var12.K(), Integer.valueOf(i8))) {
                        ouj.x(i8, oq5Var12, i8, kb5Var);
                    }
                    g0g.U(oq5Var12, H2, wp5.d);
                    a3p a3pVar = (a3p) gld.M(s2pVar.q, oq5Var12).getValue();
                    ogp.g.e(a3pVar instanceof x2p, a3pVar instanceof y2p, ogp.r().d(), oq5Var12, 4096, 0);
                    boolean booleanValue2 = ((Boolean) gld.M(s2pVar.r, oq5Var12).getValue()).booleanValue();
                    boolean h9 = oq5Var12.h(s2pVar);
                    Object K23 = oq5Var12.K();
                    if (h9 || K23 == kjnVar) {
                        r9n r9nVar = new r9n(0, s2pVar, s2p.class, "onRefresh", "onRefresh()V", 0, 22);
                        oq5Var12.k0(r9nVar);
                        K23 = r9nVar;
                    }
                    Function0 function011 = (Function0) ((h9f) K23);
                    if (!Intrinsics.d(a3pVar, x2p.a) && !Intrinsics.d(a3pVar, y2p.a)) {
                        if (!Intrinsics.d(a3pVar, w2p.a) && !(a3pVar instanceof z2p)) {
                            b6e.s();
                            break;
                        } else {
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                    bfg.f(booleanValue2, function011, null, null, z, ild.C(-1040319429, new pr(a3pVar, c0pVar, s2pVar, tmbVar3, function09, function010, 18), oq5Var12), oq5Var12, 196608, 12);
                    oq5Var12.p(true);
                } else {
                    oq5Var12.S();
                }
                break;
            case 16:
                b6p b6pVar = (b6p) obj8;
                r6p r6pVar = (r6p) obj7;
                qnq qnqVar = (qnq) obj6;
                c3r c3rVar = (c3r) obj5;
                i1r i1rVar = (i1r) obj4;
                hq5 hq5Var11 = (hq5) obj;
                int intValue9 = ((Integer) obj2).intValue();
                oq5 oq5Var13 = (oq5) hq5Var11;
                if (oq5Var13.P(intValue9 & 1, (intValue9 & 3) != 2)) {
                    kfh d2 = ug3.d(b2c.b, false);
                    int i9 = oq5Var13.P;
                    androidx.compose.runtime.internal.a l2 = oq5Var13.l();
                    yci H3 = vnj.H(oq5Var13, vciVar);
                    xp5.T.getClass();
                    grb grbVar2 = wp5.b;
                    oq5Var13.d0();
                    if (oq5Var13.O) {
                        oq5Var13.k(grbVar2);
                    } else {
                        oq5Var13.n0();
                    }
                    g0g.U(oq5Var13, d2, wp5.f);
                    g0g.U(oq5Var13, l2, wp5.e);
                    kb5 kb5Var2 = wp5.g;
                    if (oq5Var13.O || !Intrinsics.d(oq5Var13.K(), Integer.valueOf(i9))) {
                        ouj.x(i9, oq5Var13, i9, kb5Var2);
                    }
                    g0g.U(oq5Var13, H3, wp5.d);
                    tmb x2 = b6pVar.x();
                    nnq nnqVar = ((uoq) b6pVar.w.getValue()).e;
                    boolean f11 = oq5Var13.f(c3rVar) | oq5Var13.h(b6pVar);
                    Object K24 = oq5Var13.K();
                    if (f11 || K24 == kjnVar) {
                        K24 = new rln(8, c3rVar, b6pVar);
                        oq5Var13.k0(K24);
                    }
                    Function0 function012 = (Function0) K24;
                    boolean h10 = oq5Var13.h(b6pVar);
                    Object K25 = oq5Var13.K();
                    if (h10 || K25 == kjnVar) {
                        K25 = new r5p(b6pVar, i3);
                        oq5Var13.k0(K25);
                    }
                    u7g.m(r6pVar, x2, nnqVar, qnqVar, function012, null, (Function0) K25, oq5Var13, 4160);
                    rzf.k(i1rVar, a.l(vciVar, ogp.A(oq5Var13)), oq5Var13, 6);
                    oq5Var13.p(true);
                } else {
                    oq5Var13.S();
                }
                break;
            case 17:
                break;
            case 18:
                ((Integer) obj2).getClass();
                q5g.o((Function2) obj8, (Function1) obj7, (Function2) obj5, (Function0) obj6, (wn5) obj4, (hq5) obj, rvf.R(24577));
                break;
            case 19:
                ((Integer) obj2).getClass();
                u7g.q((String) obj8, (Function0) obj6, (Function0) obj7, (q84) obj5, (yci) obj4, (hq5) obj, rvf.R(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                p1g.q((p5t) obj8, (wn5) obj7, (Function0) obj6, (Function0) obj5, (yci) obj4, (hq5) obj, rvf.R(49));
                break;
            case 21:
                sjt sjtVar = (sjt) obj8;
                njt njtVar = (njt) obj7;
                tmb tmbVar4 = (tmb) obj6;
                o0k o0kVar2 = (o0k) obj5;
                wn5 wn5Var2 = (wn5) obj4;
                hq5 hq5Var12 = (hq5) obj;
                int intValue10 = ((Integer) obj2).intValue();
                oq5 oq5Var14 = (oq5) hq5Var12;
                if (oq5Var14.P(intValue10 & 1, (intValue10 & 3) != 2)) {
                    tt0.g(sjtVar, null, null, "universalScrollableContainerCrossfade", ild.C(246737605, new mdn(njtVar, tmbVar4, o0kVar2, wn5Var2, 9), oq5Var14), oq5Var14, 27648, 6);
                } else {
                    oq5Var14.S();
                }
                break;
            case 22:
                ((Integer) obj2).getClass();
                rzf.n((yci) obj8, (String) obj7, (String) obj6, (String) obj5, (onq) obj4, (hq5) obj, rvf.R(1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                pcg.n((rru) obj8, (Function0) obj6, (fvf) obj4, (o0k) obj7, (yci) obj5, (hq5) obj, rvf.R(24577));
                break;
            case 24:
                ((Integer) obj2).getClass();
                gdg.n((sru) obj8, (nru) obj7, (fvf) obj4, (o0k) obj6, (yci) obj5, (hq5) obj, rvf.R(24577));
                break;
            case 25:
                ((Integer) obj2).getClass();
                zdg.l((gsu) obj8, (nru) obj7, (sai) obj6, (bci) obj5, (yci) obj4, (hq5) obj, rvf.R(4105));
                break;
            case 26:
                ((Integer) obj2).getClass();
                t7g.l((i4v) obj8, (q6v) obj7, (tmb) obj5, (p1v) obj4, (Function0) obj6, (hq5) obj, rvf.R(521));
                break;
            case 27:
                ((Integer) obj2).getClass();
                o2g.o((String) obj8, (jzb) obj7, (ukd) obj6, (kes) obj5, (plv) obj4, (hq5) obj, rvf.R(1));
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((Integer) obj2).getClass();
                bfg.j((cyv) obj8, (fvf) obj4, (rxv) obj7, (d8t) obj6, (yci) obj5, (hq5) obj, rvf.R(1));
                break;
            default:
                sdr sdrVar5 = (sdr) obj8;
                aqi aqiVar = (aqi) obj7;
                j1w j1wVar = (j1w) obj6;
                rxv rxvVar = (rxv) obj5;
                d8t d8tVar = (d8t) obj4;
                hq5 hq5Var13 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var15 = (oq5) hq5Var13;
                    if (oq5Var15.z()) {
                        oq5Var15.S();
                        break;
                    }
                }
                oq5 oq5Var16 = (oq5) hq5Var13;
                boolean f12 = oq5Var16.f(sdrVar5);
                Object K26 = oq5Var16.K();
                if (f12 || K26 == kjnVar) {
                    K26 = new f6u(sdrVar5, 29);
                    oq5Var16.k0(K26);
                }
                yci s = wyf.s(vciVar, (Function0) K26);
                boolean f13 = oq5Var16.f(aqiVar);
                Object K27 = oq5Var16.K();
                if (f13 || K27 == kjnVar) {
                    K27 = new z1(aqiVar, 1);
                    oq5Var16.k0(K27);
                }
                avf.p(j1wVar, rxvVar, d8tVar, nfp.b(s, false, (Function1) K27), oq5Var16, 0);
        }
        return Unit.a;
    }

    public /* synthetic */ pli(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.a = i2;
        this.c = obj;
        this.f = obj2;
        this.e = obj3;
        this.b = obj4;
        this.d = obj5;
    }

    public /* synthetic */ pli(rli rliVar, cmi cmiVar, fvf fvfVar, vm vmVar, Function0 function0) {
        this.a = 1;
        this.b = rliVar;
        this.c = cmiVar;
        this.d = fvfVar;
        this.f = vmVar;
        this.e = function0;
    }

    public /* synthetic */ pli(k4k k4kVar, wn5 wn5Var, o0k o0kVar, Function0 function0, tmb tmbVar) {
        this.a = 5;
        this.c = k4kVar;
        this.f = wn5Var;
        this.b = o0kVar;
        this.e = function0;
        this.d = tmbVar;
    }

    public /* synthetic */ pli(s2p s2pVar, c0p c0pVar, tmb tmbVar, Function0 function0, Function0 function02) {
        this.a = 15;
        this.c = s2pVar;
        this.f = c0pVar;
        this.b = tmbVar;
        this.e = function0;
        this.d = function02;
    }

    public /* synthetic */ pli(rru rruVar, Function0 function0, fvf fvfVar, o0k o0kVar, yci yciVar, int i) {
        this.a = 23;
        this.c = rruVar;
        this.e = function0;
        this.d = fvfVar;
        this.f = o0kVar;
        this.b = yciVar;
    }

    public /* synthetic */ pli(sru sruVar, nru nruVar, fvf fvfVar, o0k o0kVar, yci yciVar, int i) {
        this.a = 24;
        this.c = sruVar;
        this.f = nruVar;
        this.d = fvfVar;
        this.e = o0kVar;
        this.b = yciVar;
    }

    public /* synthetic */ pli(i4v i4vVar, q6v q6vVar, tmb tmbVar, p1v p1vVar, Function0 function0, int i) {
        this.a = 26;
        this.c = i4vVar;
        this.f = q6vVar;
        this.b = tmbVar;
        this.d = p1vVar;
        this.e = function0;
    }

    public /* synthetic */ pli(Object obj, fvf fvfVar, Object obj2, Object obj3, yci yciVar, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = fvfVar;
        this.f = obj2;
        this.e = obj3;
        this.b = yciVar;
    }

    public /* synthetic */ pli(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.c = obj;
        this.f = obj2;
        this.e = obj3;
        this.b = obj4;
        this.d = obj5;
    }

    public /* synthetic */ pli(String str, Function0 function0, Function0 function02, q84 q84Var, yci yciVar, int i) {
        this.a = 19;
        this.c = str;
        this.e = function0;
        this.f = function02;
        this.b = q84Var;
        this.d = yciVar;
    }

    public /* synthetic */ pli(Function2 function2, Function1 function1, Function2 function22, Function0 function0, wn5 wn5Var, int i) {
        this.a = 18;
        this.c = function2;
        this.f = function1;
        this.b = function22;
        this.e = function0;
        this.d = wn5Var;
    }
}
