package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.d;
import com.yandex.music.core.ui.compose.b;
import com.yandex.passport.internal.core.accounts.h;
import com.yandex.passport.internal.entities.j;
import com.yandex.plus.bdui.action.a;
import com.yandex.plus.bdui.plus.content.controller.e;
import com.yandex.plus.bdui.plus.content.i;
import com.yandex.plus.bdui.plus.content.serializer.t0;
import com.yandex.plus.bdui.plus.shared.f;
import com.yandex.plus.divkit.impl.n;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final /* synthetic */ class ln1 implements ryc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ln1(psv psvVar, geh gehVar, rxv rxvVar, aqi aqiVar) {
        this.a = 6;
        this.b = psvVar;
        this.c = gehVar;
        this.e = rxvVar;
        this.d = aqiVar;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        qkl qklVar;
        int i;
        boolean z;
        m0s m0sVar;
        kb5 kb5Var;
        kb5 kb5Var2;
        wn5 wn5Var;
        grb grbVar;
        ulf ulfVar;
        oq5 oq5Var;
        kb5 kb5Var3;
        kb5 kb5Var4;
        yci u;
        boolean z2;
        oq5 oq5Var2;
        hq5 hq5Var;
        int i2;
        boolean z3;
        int i3;
        xsv xsvVar;
        boolean z4;
        a aVar;
        int i4 = this.a;
        int i5 = 12;
        vci vciVar = vci.a;
        Continuation continuation = null;
        kjn kjnVar = gq5.a;
        final int i6 = 1;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        Object obj8 = this.b;
        final int i7 = 0;
        switch (i4) {
            case 0:
                rn1 rn1Var = (rn1) obj8;
                vm1 vm1Var = (vm1) obj7;
                aqi aqiVar = (aqi) obj6;
                aqi aqiVar2 = (aqi) obj5;
                Integer num = (Integer) obj2;
                int intValue = num.intValue();
                hq5 hq5Var2 = (hq5) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                ((b3k) obj).getClass();
                List list = rn1Var.a;
                gjl gjlVar = rn1Var.b;
                if (intValue < list.size()) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    oq5Var3.Z(-2029626529);
                    dn1 dn1Var = (dn1) list.get(intValue);
                    boolean f = oq5Var3.f(dn1Var.c.a) | oq5Var3.f(gjlVar) | ((((intValue2 & 112) ^ 48) > 32 && oq5Var3.d(intValue)) || (intValue2 & 48) == 32);
                    Object K = oq5Var3.K();
                    if (f || K == kjnVar) {
                        if (gjlVar == null) {
                            qklVar = null;
                        } else {
                            pkb pkbVar = pkb.Artist;
                            String str = dn1Var.c.a;
                            str.getClass();
                            qklVar = new qkl(gjlVar, new thj(pkbVar, str, intValue + 1, 1, ""));
                        }
                        oq5Var3.k0(qklVar);
                        K = qklVar;
                    }
                    on1.a(dn1Var, vm1Var, (qkl) K, d.d(vciVar, 1.0f), oq5Var3, 3080);
                    oq5Var3.p(false);
                } else {
                    oq5 oq5Var4 = (oq5) hq5Var2;
                    oq5Var4.Z(-2028585487);
                    Integer valueOf = Integer.valueOf(list.size());
                    boolean h = oq5Var4.h(rn1Var) | ((((intValue2 & 112) ^ 48) > 32 && oq5Var4.d(intValue)) || (intValue2 & 48) == 32) | oq5Var4.f(aqiVar) | oq5Var4.f(aqiVar2);
                    Object K2 = oq5Var4.K();
                    if (h || K2 == kjnVar) {
                        k3 k3Var = new k3(intValue, rn1Var, aqiVar, aqiVar2, (Continuation) null);
                        oq5Var4.k0(k3Var);
                        K2 = k3Var;
                    }
                    gld.y(num, valueOf, (Function2) K2, oq5Var4);
                    oq5Var4.p(false);
                }
                return Unit.a;
            case 1:
                List list2 = (List) obj8;
                String str2 = (String) obj7;
                Function2 function2 = (Function2) obj6;
                Function1 function1 = (Function1) obj5;
                int intValue3 = ((Integer) obj).intValue();
                m0s m0sVar2 = (m0s) obj2;
                hq5 hq5Var3 = (hq5) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                m0sVar2.getClass();
                if ((intValue4 & 6) == 0) {
                    i = intValue4 | (((oq5) hq5Var3).d(intValue3) ? 4 : 2);
                } else {
                    i = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i |= ((oq5) hq5Var3).f(m0sVar2) ? 32 : 16;
                }
                oq5 oq5Var5 = (oq5) hq5Var3;
                if (oq5Var5.P(i & 1, (i & 147) != 146)) {
                    boolean contains = list2.contains(m0sVar2.getId());
                    float f2 = 40;
                    yci b = androidx.compose.foundation.a.b(xp3.u(d.e(vciVar, f2), ugo.a(f2)), d85.m, vnj.i);
                    boolean g = oq5Var5.g(contains) | oq5Var5.f(str2);
                    Object K3 = oq5Var5.K();
                    if (g || K3 == kjnVar) {
                        z = false;
                        K3 = new ag3(contains, str2, (int) (false ? 1 : 0));
                        oq5Var5.k0(K3);
                    } else {
                        z = false;
                    }
                    yci b2 = nfp.b(b, z, (Function1) K3);
                    boolean f3 = ((i & 112) == 32) | oq5Var5.f(function2) | oq5Var5.f(function1) | ((i & 14) == 4);
                    Object K4 = oq5Var5.K();
                    if (f3 || K4 == kjnVar) {
                        K4 = new h00(m0sVar2, function2, function1, intValue3, 4);
                        m0sVar = m0sVar2;
                        oq5Var5.k0(K4);
                    } else {
                        m0sVar = m0sVar2;
                    }
                    f1s.b(false, (Function0) K4, b2, false, ild.C(778101210, new xf3(contains, m0sVar, 0), oq5Var5), 0L, 0L, oq5Var5, 24582);
                } else {
                    oq5Var5.S();
                }
                return Unit.a;
            case 2:
                d85 d85Var = (d85) obj7;
                zsq zsqVar = (zsq) obj6;
                hvq hvqVar = (hvq) obj5;
                int intValue5 = ((Integer) obj2).intValue();
                hq5 hq5Var4 = (hq5) obj3;
                ((Integer) obj4).getClass();
                ((b3k) obj).getClass();
                qs4 qs4Var = (qs4) CollectionsKt.S(((ys4) obj8).b.a, intValue5);
                if (qs4Var == null) {
                    oq5 oq5Var6 = (oq5) hq5Var4;
                    oq5Var6.Z(799828873);
                    oq5Var6.p(false);
                } else {
                    oq5 oq5Var7 = (oq5) hq5Var4;
                    oq5Var7.Z(799828874);
                    boolean h2 = oq5Var7.h(zsqVar) | oq5Var7.h(hvqVar);
                    Object K5 = oq5Var7.K();
                    if (h2 || K5 == kjnVar) {
                        K5 = new ko1(zsqVar, hvqVar, 5);
                        oq5Var7.k0(K5);
                    }
                    ff7.f(qs4Var, d85Var, com.yandex.music.core.ui.compose.a.b(vci.a, null, 0L, 0.0f, null, (Function2) K5, 15), oq5Var7, 0, 0);
                    oq5Var7.p(false);
                }
                return Unit.a;
            case 3:
                ml4 ml4Var = (ml4) obj8;
                o3k o3kVar = (o3k) obj7;
                wn5 wn5Var2 = (wn5) obj6;
                List list3 = (List) obj5;
                int intValue6 = ((Integer) obj2).intValue();
                hq5 hq5Var5 = (hq5) obj3;
                ((Integer) obj4).getClass();
                ((b3k) obj).getClass();
                int i8 = intValue6 % ml4Var.b;
                String M = rvf.M(R.string.slide_go_to_next, hq5Var5);
                String M2 = rvf.M(R.string.slide_go_to_previous, hq5Var5);
                oq5 oq5Var8 = (oq5) hq5Var5;
                Object K6 = oq5Var8.K();
                if (K6 == kjnVar) {
                    K6 = tlm.f(gld.R(g.a, oq5Var8), oq5Var8);
                }
                mm6 mm6Var = ((fs5) K6).a;
                boolean z5 = i8 == ml4Var.a();
                M.getClass();
                M2.getClass();
                o3kVar.getClass();
                yci b3 = androidx.compose.foundation.a.b(xp3.u(d.c(ksw.D(z5 ? nfp.b(vciVar, true, new i6i(M, M2, mm6Var, o3kVar, i8)) : nfp.a(vciVar, new hpj(17)), rvf.N(R.string.slide_current_position, new Object[]{Integer.valueOf(i8 + 1), Integer.valueOf(ml4Var.b)}, oq5Var8), null), 1.0f), ugo.a(xvq.a)), ((dq0) oq5Var8.j(eq0.a)).c.b, vnj.i);
                kfh d = ug3.d(b2c.b, false);
                int i9 = oq5Var8.P;
                androidx.compose.runtime.internal.a l = oq5Var8.l();
                yci H = vnj.H(oq5Var8, b3);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var8.d0();
                if (oq5Var8.O) {
                    oq5Var8.k(grbVar2);
                } else {
                    oq5Var8.n0();
                }
                g0g.U(oq5Var8, d, wp5.f);
                g0g.U(oq5Var8, l, wp5.e);
                kb5 kb5Var5 = wp5.g;
                if (oq5Var8.O || !Intrinsics.d(oq5Var8.K(), Integer.valueOf(i9))) {
                    ouj.x(i9, oq5Var8, i9, kb5Var5);
                }
                g0g.U(oq5Var8, H, wp5.d);
                wn5Var2.invoke(list3.get(i8), ml4Var, Integer.valueOf(i8), oq5Var8, 0);
                oq5Var8.p(true);
                return Unit.a;
            case 4:
                jkf jkfVar = (jkf) obj8;
                yci yciVar = (yci) obj7;
                sdr sdrVar = (sdr) obj6;
                wn5 wn5Var3 = (wn5) obj5;
                vlf vlfVar = (vlf) obj2;
                hq5 hq5Var6 = (hq5) obj3;
                ((Integer) obj4).getClass();
                ((cl0) obj).getClass();
                vlfVar.getClass();
                yci c = d.c(vciVar, 1.0f);
                gz2 gz2Var = b2c.o;
                ov6 ov6Var = yvt.a;
                ta5 a = sa5.a(new kx0(2), gz2Var, hq5Var6, 48);
                oq5 oq5Var9 = (oq5) hq5Var6;
                int i10 = oq5Var9.P;
                androidx.compose.runtime.internal.a l2 = oq5Var9.l();
                yci H2 = vnj.H(hq5Var6, c);
                xp5.T.getClass();
                grb grbVar3 = wp5.b;
                oq5Var9.d0();
                if (oq5Var9.O) {
                    oq5Var9.k(grbVar3);
                } else {
                    oq5Var9.n0();
                }
                kb5 kb5Var6 = wp5.f;
                g0g.U(hq5Var6, a, kb5Var6);
                kb5 kb5Var7 = wp5.e;
                g0g.U(hq5Var6, l2, kb5Var7);
                kb5 kb5Var8 = wp5.g;
                if (oq5Var9.O || !Intrinsics.d(oq5Var9.K(), Integer.valueOf(i10))) {
                    ouj.x(i10, oq5Var9, i10, kb5Var8);
                }
                kb5 kb5Var9 = wp5.d;
                g0g.U(hq5Var6, H2, kb5Var9);
                if (vlfVar.equals(klf.a)) {
                    oq5Var9.Z(235247051);
                    oq5Var9.p(false);
                } else {
                    if (!(vlfVar instanceof nlf)) {
                        if (vlfVar instanceof mlf) {
                            oq5Var9.Z(-1296226101);
                            mlf mlfVar = (mlf) vlfVar;
                            ulf ulfVar2 = mlfVar.a;
                            boolean f4 = oq5Var9.f(jkfVar);
                            Object K7 = oq5Var9.K();
                            if (f4 || K7 == kjnVar) {
                                oq5Var2 = oq5Var9;
                                pef pefVar = new pef(0, jkfVar, jkf.class, "onMyVibeClick", "onMyVibeClick()V", 0, 16);
                                oq5Var2.k0(pefVar);
                                K7 = pefVar;
                            } else {
                                oq5Var2 = oq5Var9;
                            }
                            Function0 function0 = (Function0) ((h9f) K7);
                            yci e = d.e(androidx.compose.foundation.layout.a.q(yciVar, 0.0f, 8, 0.0f, 0.0f, 13), 72);
                            boolean f5 = oq5Var2.f(sdrVar);
                            Object K8 = oq5Var2.K();
                            if (f5 || K8 == kjnVar) {
                                K8 = new xp(sdrVar, 12);
                                oq5Var2.k0(K8);
                            }
                            hdg.l(ulfVar2, function0, androidx.compose.ui.graphics.a.a(e, (Function1) K8), hq5Var6, 0);
                            tlf tlfVar = mlfVar.b;
                            boolean f6 = oq5Var2.f(jkfVar);
                            Object K9 = oq5Var2.K();
                            if (f6 || K9 == kjnVar) {
                                hq5Var = hq5Var6;
                                pef pefVar2 = new pef(0, jkfVar, jkf.class, "onWaveSettingClick", "onWaveSettingClick()V", 0, 17);
                                oq5Var2.k0(pefVar2);
                                K9 = pefVar2;
                            } else {
                                hq5Var = hq5Var6;
                            }
                            Function0 function02 = (Function0) ((h9f) K9);
                            boolean f7 = oq5Var2.f(jkfVar);
                            Object K10 = oq5Var2.K();
                            if (f7 || K10 == kjnVar) {
                                pef pefVar3 = new pef(0, jkfVar, jkf.class, "onClearVibeCustomizationClick", "onClearVibeCustomizationClick()V", 0, 18);
                                oq5Var2.k0(pefVar3);
                                K10 = pefVar3;
                            }
                            Function0 function03 = (Function0) ((h9f) K10);
                            boolean f8 = oq5Var2.f(sdrVar);
                            Object K11 = oq5Var2.K();
                            if (f8 || K11 == kjnVar) {
                                K11 = new xp(sdrVar, 7);
                                oq5Var2.k0(K11);
                            }
                            q5g.s(tlfVar, function02, function03, androidx.compose.ui.graphics.a.a(vciVar, (Function1) K11), hq5Var, 0);
                            oq5Var2.p(false);
                            oq5Var = oq5Var2;
                            z2 = true;
                            oq5Var.p(z2);
                            return Unit.a;
                        }
                        if (!(vlfVar instanceof olf)) {
                            throw vz1.i(oq5Var9, 235247772, false);
                        }
                        oq5Var9.Z(-1295265783);
                        ulf ulfVar3 = ((olf) vlfVar).a;
                        boolean f9 = oq5Var9.f(jkfVar);
                        Object K12 = oq5Var9.K();
                        if (f9 || K12 == kjnVar) {
                            kb5Var = kb5Var9;
                            kb5Var2 = kb5Var6;
                            wn5Var = wn5Var3;
                            grbVar = grbVar3;
                            ulfVar = ulfVar3;
                            oq5Var = oq5Var9;
                            kb5Var3 = kb5Var7;
                            kb5Var4 = kb5Var8;
                            pef pefVar4 = new pef(0, jkfVar, jkf.class, "onMyVibeClick", "onMyVibeClick()V", 0, 13);
                            oq5Var.k0(pefVar4);
                            K12 = pefVar4;
                        } else {
                            kb5Var = kb5Var9;
                            kb5Var3 = kb5Var7;
                            kb5Var4 = kb5Var8;
                            grbVar = grbVar3;
                            kb5Var2 = kb5Var6;
                            wn5Var = wn5Var3;
                            oq5Var = oq5Var9;
                            ulfVar = ulfVar3;
                        }
                        Function0 function04 = (Function0) ((h9f) K12);
                        u = d.u(yciVar, b2c.l, (r2 & 2) == 0);
                        boolean f10 = oq5Var.f(sdrVar);
                        Object K13 = oq5Var.K();
                        if (f10 || K13 == kjnVar) {
                            K13 = new xp(sdrVar, 8);
                            oq5Var.k0(K13);
                        }
                        hdg.l(ulfVar, function04, androidx.compose.ui.graphics.a.a(u, (Function1) K13), hq5Var6, 0);
                        yci x = d.x(vciVar, null, 3);
                        boolean f11 = oq5Var.f(sdrVar);
                        Object K14 = oq5Var.K();
                        if (f11 || K14 == kjnVar) {
                            K14 = new xp(sdrVar, 9);
                            oq5Var.k0(K14);
                        }
                        yci a2 = androidx.compose.ui.graphics.a.a(x, (Function1) K14);
                        kfh d2 = ug3.d(b2c.b, false);
                        int i11 = oq5Var.P;
                        androidx.compose.runtime.internal.a l3 = oq5Var.l();
                        yci H3 = vnj.H(hq5Var6, a2);
                        oq5Var.d0();
                        if (oq5Var.O) {
                            oq5Var.k(grbVar);
                        } else {
                            oq5Var.n0();
                        }
                        g0g.U(hq5Var6, d2, kb5Var2);
                        g0g.U(hq5Var6, l3, kb5Var3);
                        if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i11))) {
                            ouj.x(i11, oq5Var, i11, kb5Var4);
                        }
                        g0g.U(hq5Var6, H3, kb5Var);
                        wn5Var.invoke(hq5Var6, 0);
                        z2 = true;
                        oq5Var.p(true);
                        oq5Var.p(false);
                        oq5Var.p(z2);
                        return Unit.a;
                    }
                    oq5Var9.Z(-1297184497);
                    nlf nlfVar = (nlf) vlfVar;
                    ulf ulfVar4 = nlfVar.a;
                    boolean f12 = oq5Var9.f(jkfVar);
                    Object K15 = oq5Var9.K();
                    if (f12 || K15 == kjnVar) {
                        i2 = 72;
                        pef pefVar5 = new pef(0, jkfVar, jkf.class, "onMyVibeClick", "onMyVibeClick()V", 0, 12);
                        oq5Var9.k0(pefVar5);
                        K15 = pefVar5;
                    } else {
                        i2 = 72;
                    }
                    Function0 function05 = (Function0) ((h9f) K15);
                    yci e2 = d.e(androidx.compose.foundation.layout.a.q(yciVar, 0.0f, 8, 0.0f, 0.0f, 13), i2);
                    boolean f13 = oq5Var9.f(sdrVar);
                    Object K16 = oq5Var9.K();
                    if (f13 || K16 == kjnVar) {
                        K16 = new xp(sdrVar, 10);
                        oq5Var9.k0(K16);
                    }
                    hdg.l(ulfVar4, function05, androidx.compose.ui.graphics.a.a(e2, (Function1) K16), hq5Var6, 0);
                    jlf jlfVar = nlfVar.b;
                    boolean f14 = oq5Var9.f(jkfVar);
                    Object K17 = oq5Var9.K();
                    if (f14 || K17 == kjnVar) {
                        pef pefVar6 = new pef(0, jkfVar, jkf.class, "onWaveSettingClick", "onWaveSettingClick()V", 0, 14);
                        oq5Var9.k0(pefVar6);
                        K17 = pefVar6;
                    }
                    Function0 function06 = (Function0) ((h9f) K17);
                    boolean f15 = oq5Var9.f(jkfVar);
                    Object K18 = oq5Var9.K();
                    if (f15 || K18 == kjnVar) {
                        pef pefVar7 = new pef(0, jkfVar, jkf.class, "onClearVibeCustomizationClick", "onClearVibeCustomizationClick()V", 0, 15);
                        oq5Var9.k0(pefVar7);
                        K18 = pefVar7;
                    }
                    Function0 function07 = (Function0) ((h9f) K18);
                    boolean f16 = oq5Var9.f(sdrVar);
                    Object K19 = oq5Var9.K();
                    if (f16 || K19 == kjnVar) {
                        K19 = new xp(sdrVar, 11);
                        oq5Var9.k0(K19);
                    }
                    o2g.v(jlfVar, function06, function07, androidx.compose.ui.graphics.a.a(vciVar, (Function1) K19), hq5Var6, 0);
                    oq5Var9.p(false);
                }
                oq5Var = oq5Var9;
                z2 = true;
                oq5Var.p(z2);
                return Unit.a;
            case 5:
                lvf lvfVar = (lvf) obj8;
                bmi bmiVar = (bmi) obj7;
                ynn ynnVar = (ynn) obj6;
                xli xliVar = (xli) obj5;
                int intValue7 = ((Integer) obj2).intValue();
                hq5 hq5Var7 = (hq5) obj3;
                int intValue8 = ((Integer) obj4).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                if ((intValue8 & 48) == 0) {
                    intValue8 |= ((oq5) hq5Var7).d(intValue7) ? 32 : 16;
                }
                if ((intValue8 & 145) == 144) {
                    oq5 oq5Var10 = (oq5) hq5Var7;
                    if (oq5Var10.z()) {
                        oq5Var10.S();
                        return Unit.a;
                    }
                }
                gli gliVar = (gli) lvfVar.c(intValue7);
                if (gliVar == null) {
                    gliVar = (gli) bmiVar.a.get(intValue7);
                }
                hld.o(gliVar, ynnVar, xliVar, hq5Var7, 0);
                return Unit.a;
            case 6:
                final psv psvVar = (psv) obj8;
                geh gehVar = (geh) obj7;
                rxv rxvVar = (rxv) obj5;
                aqi aqiVar3 = (aqi) obj6;
                zsv zsvVar = (zsv) obj2;
                hq5 hq5Var8 = (hq5) obj3;
                int intValue9 = ((Integer) obj4).intValue();
                ((cl0) obj).getClass();
                zsvVar.getClass();
                if (zsvVar.equals(ysv.a)) {
                    oq5 oq5Var11 = (oq5) hq5Var8;
                    oq5Var11.Z(-1168203279);
                    pyc q = neg.q(oq5Var11);
                    boolean h3 = oq5Var11.h(psvVar);
                    Object K20 = oq5Var11.K();
                    if (h3 || K20 == kjnVar) {
                        K20 = new Function1() { // from class: lsv
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj9) {
                                int i12 = i6;
                                ((wof) obj9).getClass();
                                switch (i12) {
                                    case 0:
                                        psv psvVar2 = psvVar;
                                        ftv ftvVar = psvVar2.e;
                                        if (ftvVar.d && !ftvVar.e) {
                                            ftvVar.e = true;
                                            ((lhs) ftvVar.b.getValue()).c();
                                        }
                                        syv O = ((j1w) ((cyv) ((uyv) psvVar2.b.a).b.b).c.a).a.O();
                                        boolean z6 = O.j;
                                        jyr jyrVar = O.e;
                                        jyr jyrVar2 = O.f;
                                        if (z6 && !O.k) {
                                            if (O.i) {
                                                ((lhs) jyrVar.getValue()).c();
                                                ((lhs) jyrVar2.getValue()).g = -1L;
                                            } else {
                                                if (((lhs) jyrVar2.getValue()).g != -1) {
                                                    ((lhs) jyrVar2.getValue()).c();
                                                }
                                                ((lhs) jyrVar.getValue()).g = -1L;
                                            }
                                            if (!O.g) {
                                                v0w v0wVar = (v0w) O.a.b;
                                                if (!v0wVar.B()) {
                                                    v0wVar.l.d();
                                                }
                                                O.g = true;
                                            }
                                            O.k = true;
                                        }
                                        break;
                                    default:
                                        psv psvVar3 = psvVar;
                                        syv O2 = ((j1w) ((cyv) ((uyv) psvVar3.b.a).b.b).c.a).a.O();
                                        if (!O2.i) {
                                            ((lhs) O2.c.getValue()).c();
                                            O2.i = true;
                                        }
                                        ftv ftvVar2 = psvVar3.e;
                                        if (!ftvVar2.d) {
                                            ftvVar2.d = true;
                                            ((lhs) ftvVar2.b.getValue()).d();
                                        }
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var11.k0(K20);
                    }
                    yci e3 = androidx.compose.ui.layout.a.e(vciVar, (Function1) K20);
                    Object K21 = oq5Var11.K();
                    if (K21 == kjnVar) {
                        K21 = new ulv(i5);
                        oq5Var11.k0(K21);
                    }
                    q.invoke(nfp.a(e3, (Function1) K21), oq5Var11, 0);
                    oq5Var11.p(false);
                } else {
                    if (!(zsvVar instanceof xsv)) {
                        throw vz1.i((oq5) hq5Var8, 1901977951, false);
                    }
                    oq5 oq5Var12 = (oq5) hq5Var8;
                    oq5Var12.Z(-1167863674);
                    xsv xsvVar2 = (xsv) zsvVar;
                    boolean h4 = oq5Var12.h(psvVar);
                    Object K22 = oq5Var12.K();
                    if (h4 || K22 == kjnVar) {
                        K22 = new vtu(0, psvVar, psv.class, "onLikeClick", "onLikeClick()V", 0, 10);
                        oq5Var12.k0(K22);
                    }
                    Function0 function08 = (Function0) ((h9f) K22);
                    boolean h5 = oq5Var12.h(psvVar);
                    Object K23 = oq5Var12.K();
                    if (h5 || K23 == kjnVar) {
                        K23 = new vtu(0, psvVar, psv.class, "onImageLoadingStart", "onImageLoadingStart()V", 0, 11);
                        oq5Var12.k0(K23);
                    }
                    Function0 function09 = (Function0) ((h9f) K23);
                    boolean h6 = oq5Var12.h(psvVar);
                    Object K24 = oq5Var12.K();
                    if (h6 || K24 == kjnVar) {
                        K24 = new vtu(0, psvVar, psv.class, "onImageLoaded", "onImageLoaded()V", 0, 12);
                        oq5Var12.k0(K24);
                    }
                    Function0 function010 = (Function0) ((h9f) K24);
                    yci a3 = androidx.compose.ui.platform.a.a(vciVar, "wizard_artist_card_success");
                    a3.getClass();
                    gehVar.getClass();
                    yci c2 = b.c(a3, "coordinates", gehVar);
                    boolean f17 = oq5Var12.f(rxvVar);
                    Object K25 = oq5Var12.K();
                    Object obj9 = K25;
                    if (f17 || K25 == kjnVar) {
                        keh kehVar = new keh(rxvVar, 2);
                        oq5Var12.k0(kehVar);
                        obj9 = kehVar;
                    }
                    Function0 function011 = (Function0) obj9;
                    boolean h7 = oq5Var12.h(psvVar);
                    Object K26 = oq5Var12.K();
                    Object obj10 = K26;
                    if (h7 || K26 == kjnVar) {
                        f5r f5rVar = new f5r(24, psvVar);
                        oq5Var12.k0(f5rVar);
                        obj10 = f5rVar;
                    }
                    yci b4 = com.yandex.music.core.ui.compose.a.b(c2, null, 0L, 0.0f, function011, (Function2) obj10, 7);
                    boolean h8 = oq5Var12.h(psvVar);
                    Object K27 = oq5Var12.K();
                    Object obj11 = K27;
                    if (h8 || K27 == kjnVar) {
                        Function1 function12 = new Function1() { // from class: lsv
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj92) {
                                int i12 = i7;
                                ((wof) obj92).getClass();
                                switch (i12) {
                                    case 0:
                                        psv psvVar2 = psvVar;
                                        ftv ftvVar = psvVar2.e;
                                        if (ftvVar.d && !ftvVar.e) {
                                            ftvVar.e = true;
                                            ((lhs) ftvVar.b.getValue()).c();
                                        }
                                        syv O = ((j1w) ((cyv) ((uyv) psvVar2.b.a).b.b).c.a).a.O();
                                        boolean z6 = O.j;
                                        jyr jyrVar = O.e;
                                        jyr jyrVar2 = O.f;
                                        if (z6 && !O.k) {
                                            if (O.i) {
                                                ((lhs) jyrVar.getValue()).c();
                                                ((lhs) jyrVar2.getValue()).g = -1L;
                                            } else {
                                                if (((lhs) jyrVar2.getValue()).g != -1) {
                                                    ((lhs) jyrVar2.getValue()).c();
                                                }
                                                ((lhs) jyrVar.getValue()).g = -1L;
                                            }
                                            if (!O.g) {
                                                v0w v0wVar = (v0w) O.a.b;
                                                if (!v0wVar.B()) {
                                                    v0wVar.l.d();
                                                }
                                                O.g = true;
                                            }
                                            O.k = true;
                                        }
                                        break;
                                    default:
                                        psv psvVar3 = psvVar;
                                        syv O2 = ((j1w) ((cyv) ((uyv) psvVar3.b.a).b.b).c.a).a.O();
                                        if (!O2.i) {
                                            ((lhs) O2.c.getValue()).c();
                                            O2.i = true;
                                        }
                                        ftv ftvVar2 = psvVar3.e;
                                        if (!ftvVar2.d) {
                                            ftvVar2.d = true;
                                            ((lhs) ftvVar2.b.getValue()).d();
                                        }
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var12.k0(function12);
                        obj11 = function12;
                    }
                    yci e4 = androidx.compose.ui.layout.a.e(b4, (Function1) obj11);
                    boolean h9 = oq5Var12.h(psvVar);
                    Object K28 = oq5Var12.K();
                    if (h9 || K28 == kjnVar) {
                        K28 = new vtu(0, psvVar, psv.class, "onLikeClick", "onLikeClick()V", 0, 13);
                        oq5Var12.k0(K28);
                    }
                    Function0 function012 = (Function0) ((h9f) K28);
                    wsv wsvVar = xsvVar2.b;
                    boolean z6 = xsvVar2.a.f;
                    Object K29 = oq5Var12.K();
                    Object obj12 = K29;
                    if (K29 == kjnVar) {
                        yoc yocVar = new yoc();
                        oq5Var12.k0(yocVar);
                        obj12 = yocVar;
                    }
                    yoc yocVar2 = (yoc) obj12;
                    if (wsvVar instanceof rsv) {
                        oq5Var12.Z(467180757);
                        Unit unit = Unit.a;
                        Object K30 = oq5Var12.K();
                        Object obj13 = K30;
                        if (K30 == kjnVar) {
                            pjt pjtVar = new pjt(yocVar2, continuation, 8);
                            oq5Var12.k0(pjtVar);
                            obj13 = pjtVar;
                        }
                        gld.w(oq5Var12, unit, (Function2) obj13);
                        z3 = false;
                    } else {
                        z3 = false;
                        oq5Var12.Z(454429775);
                    }
                    oq5Var12.p(z3);
                    if (z6) {
                        oq5Var12.Z(467328658);
                        neg.s(oq5Var12);
                        oq5Var12.p(z3);
                        i3 = R.string.actions_menu_unlike;
                    } else {
                        oq5Var12.Z(467395060);
                        neg.s(oq5Var12);
                        oq5Var12.p(z3);
                        i3 = R.string.actions_menu_like;
                    }
                    String M3 = rvf.M(u2x.r(z6, oq5Var12), oq5Var12);
                    neg.s(oq5Var12);
                    String M4 = rvf.M(R.string.menu_element_like, oq5Var12);
                    String M5 = rvf.M(i3, oq5Var12);
                    yci k = androidx.compose.foundation.a.k(androidx.compose.ui.focus.a.a(e4, yocVar2), true, null);
                    boolean f18 = ((((intValue9 & 112) ^ 48) > 32 && oq5Var12.f(xsvVar2)) || (intValue9 & 48) == 32) | oq5Var12.f(M3) | oq5Var12.f(M4) | oq5Var12.f(M5) | oq5Var12.f(function012);
                    Object K31 = oq5Var12.K();
                    if (f18 || K31 == kjnVar) {
                        K31 = new r90(xsvVar2, M3, M4, M5, function012, 12);
                        xsvVar = xsvVar2;
                        oq5Var12.k0(K31);
                    } else {
                        xsvVar = xsvVar2;
                    }
                    f8g.h(xsvVar, function08, function09, function010, nfp.b(k, true, (Function1) K31), oq5Var12, (intValue9 >> 3) & 14);
                    if (((Boolean) aqiVar3.getValue()).booleanValue()) {
                        oq5Var12.Z(-1166856980);
                        Object K32 = oq5Var12.K();
                        Object obj14 = K32;
                        if (K32 == kjnVar) {
                            tiv tivVar = new tiv(aqiVar3, 1);
                            oq5Var12.k0(tivVar);
                            obj14 = tivVar;
                        }
                        v7g.l((Function0) obj14, oq5Var12, 6);
                        z4 = false;
                    } else {
                        z4 = false;
                        oq5Var12.Z(-1174170314);
                    }
                    oq5Var12.p(z4);
                    oq5Var12.p(z4);
                }
                return Unit.a;
            default:
                com.yandex.plus.bdui.content.d dVar = (com.yandex.plus.bdui.content.d) obj7;
                com.yandex.plus.divkit.api.a aVar2 = (com.yandex.plus.divkit.api.a) obj6;
                tf6 tf6Var = (tf6) obj5;
                e eVar = (e) obj;
                String str3 = (String) obj2;
                Map map = (Map) obj3;
                eVar.getClass();
                str3.getClass();
                map.getClass();
                ((n) obj4).getClass();
                h hVar = (h) ((j) obj8).d;
                ViewGroup viewGroup = eVar.a;
                JSONObject jSONObject = aVar2.b;
                String str4 = aVar2.c;
                viewGroup.getClass();
                dVar.getClass();
                str4.getClass();
                com.yandex.plus.log.api.b bVar = (com.yandex.plus.log.api.b) hVar.e;
                com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.c;
                if (bVar.b(aVar3)) {
                    bVar.c(aVar3, "PlusDivContentController.HandlerInvoker", ouj.k('\"', "invokeHandler(); name = \"", str3));
                }
                Context context = viewGroup.getContext();
                context.getClass();
                Activity l4 = com.yandex.plus.home.common.utils.a.l(context);
                if (l4 == null) {
                    com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.e;
                    if (bVar.b(aVar4)) {
                        bVar.c(aVar4, "PlusDivContentController.HandlerInvoker", "invokeHandler(); activity not found!");
                    }
                } else {
                    com.yandex.plus.bdui.content.a aVar5 = dVar.b;
                    com.yandex.plus.bdui.shared.b bVar2 = dVar.c;
                    Map map2 = ((t0) ((i) aVar5)).b;
                    String F = jSONObject != null ? com.yandex.plus.bdui.flex.ui.a.F("successAction", jSONObject) : null;
                    if (F != null) {
                        a aVar6 = (a) map2.get(F);
                        if (aVar6 == null) {
                            hVar.m("Success action \"" + F + "\" not found in layout actions " + map2 + '!', bVar2);
                        } else {
                            aVar = aVar6;
                        }
                    } else {
                        aVar = null;
                    }
                    String F2 = jSONObject != null ? com.yandex.plus.bdui.flex.ui.a.F("errorAction", jSONObject) : null;
                    com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.d dVar2 = (com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.d) ((LinkedHashMap) hVar.d).get(str3);
                    if (dVar2 != null) {
                        if (bVar.b(aVar3)) {
                            bVar.c(aVar3, "PlusDivContentController.HandlerInvoker", "invokeHandler(); invoke handler named \"" + str3 + "\" with payload = " + map);
                        }
                        x97.y(tf6Var, null, null, new inp(dVar2, l4, viewGroup, bVar2.c(new f(str4)), map, hVar, aVar, F2, map2, bVar2, null), 3);
                    } else {
                        hVar.m("handler with name \"" + str3 + "\" not found in configuration!", bVar2);
                    }
                }
                return Unit.a;
        }
    }

    public /* synthetic */ ln1(j jVar, com.yandex.plus.bdui.content.d dVar, com.yandex.plus.divkit.api.a aVar, n nVar, tf6 tf6Var) {
        this.a = 7;
        this.b = jVar;
        this.c = dVar;
        this.d = aVar;
        this.e = tf6Var;
    }

    public /* synthetic */ ln1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
