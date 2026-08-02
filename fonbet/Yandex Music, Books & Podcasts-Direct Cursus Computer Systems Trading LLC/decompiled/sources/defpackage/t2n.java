package defpackage;

import androidx.compose.material.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.y;
import com.yandex.pulse.metrics.o;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class t2n implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t2n(ukd ukdVar, ukd ukdVar2, Function1 function1, int i) {
        this.a = 21;
        this.c = ukdVar;
        this.b = ukdVar2;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                x2n.h((g3n) this.c, (Function1) this.d, (yci) this.b, (hq5) obj, rvf.R(385));
                return Unit.a;
            case 1:
                ((Integer) obj2).getClass();
                x2n.g((y3n) this.c, (Function0) this.d, (yci) this.b, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 2:
                po6 po6Var = (po6) this.c;
                sdr sdrVar = (sdr) this.d;
                aqi aqiVar = (aqi) this.b;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    vut.r(po6Var.a, (lzs) sdrVar.getValue(), null, null, 0.0f, ((frs) aqiVar.getValue()) == frs.c, oq5Var, 0, 28);
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            case 3:
                po6 po6Var2 = (po6) this.c;
                aqi aqiVar2 = (aqi) this.d;
                aqi aqiVar3 = (aqi) this.b;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    vut.r(po6Var2.a, (lzs) aqiVar2.getValue(), null, null, 0.0f, ((frs) aqiVar3.getValue()) == frs.c, oq5Var2, 0, 28);
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
            case 4:
                con conVar = (con) this.c;
                flv flvVar = (flv) this.d;
                plv plvVar = (plv) this.b;
                hq5 hq5Var3 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    szf.y(flvVar, o5g.z(skd.a), plvVar, conVar.u, oq5Var3, 0);
                } else {
                    oq5Var3.S();
                }
                return Unit.a;
            case 5:
                ((Integer) obj2).getClass();
                ywf.e((nnk) this.c, (Function0) this.d, (yci) this.b, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 6:
                ((Integer) obj2).getClass();
                bzf.f((euu) this.c, (owu) this.d, (yci) this.b, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 7:
                m2p m2pVar = (m2p) this.c;
                cr crVar = (cr) this.d;
                qnq qnqVar = (qnq) this.b;
                hq5 hq5Var4 = (hq5) obj;
                int intValue4 = ((Integer) obj2).intValue();
                oq5 oq5Var4 = (oq5) hq5Var4;
                if (oq5Var4.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    boolean f = oq5Var4.f(m2pVar) | oq5Var4.f(crVar) | oq5Var4.f(qnqVar);
                    Object K = oq5Var4.K();
                    if (f || K == gq5.a) {
                        K = new a2p(new p2p(m2pVar, crVar, qnqVar.d), qnqVar, m2pVar);
                        oq5Var4.k0(K);
                    }
                    v3g.n((a2p) K, null, oq5Var4, 0);
                } else {
                    oq5Var4.S();
                }
                return Unit.a;
            case 8:
                l6p l6pVar = (l6p) this.c;
                fvf fvfVar = (fvf) this.b;
                Function1 function1 = (Function1) this.d;
                hq5 hq5Var5 = (hq5) obj;
                int intValue5 = ((Integer) obj2).intValue();
                oq5 oq5Var5 = (oq5) hq5Var5;
                if (oq5Var5.P(intValue5 & 1, (intValue5 & 3) != 2)) {
                    men a = l6pVar.a();
                    if (Intrinsics.d(a, fdc.k)) {
                        oq5Var5.Z(-2105453607);
                        oq5Var5.p(false);
                    } else if (a instanceof edc) {
                        oq5Var5.Z(-844491832);
                        if (((edc) a).k) {
                            oq5Var5.Z(-844441705);
                            ivf.d(null, oq5Var5, 0);
                        } else {
                            oq5Var5.Z(-847667379);
                        }
                        oq5Var5.p(false);
                        oq5Var5.p(false);
                    } else {
                        if (!(a instanceof gdc)) {
                            throw vz1.i(oq5Var5, -2105455304, false);
                        }
                        oq5Var5.Z(-844255860);
                        gdc gdcVar = (gdc) a;
                        List list = gdcVar.k.a;
                        if (list.isEmpty() || !gdcVar.n) {
                            oq5Var5.Z(-847667379);
                        } else {
                            oq5Var5.Z(-844110594);
                            gcc gccVar = gdcVar.k;
                            n1p n1pVar = gdcVar.l;
                            if (n1pVar == null) {
                                n1pVar = (n1p) CollectionsKt.firstOrNull(gccVar.a);
                            }
                            boolean z = gdcVar.m;
                            boolean f2 = oq5Var5.f(list);
                            Object K2 = oq5Var5.K();
                            if (f2 || K2 == gq5.a) {
                                K2 = new h50(list, 8);
                                oq5Var5.k0(K2);
                            }
                            o2g.k(fvfVar, gccVar, n1pVar, z, function1, nfp.b(vci.a, false, (Function1) K2), oq5Var5, 0);
                        }
                        oq5Var5.p(false);
                        oq5Var5.p(false);
                    }
                } else {
                    oq5Var5.S();
                }
                return Unit.a;
            case 9:
                uwp uwpVar = (uwp) this.c;
                qbp qbpVar = (qbp) this.d;
                ComposeView composeView = (ComposeView) this.b;
                hq5 hq5Var6 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var6 = (oq5) hq5Var6;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        return Unit.a;
                    }
                }
                q7g.k(uwpVar, qbpVar, ild.C(511503106, new ucm(26, composeView), hq5Var6), hq5Var6, 384);
                return Unit.a;
            case 10:
                ((Integer) obj2).getClass();
                q7g.k((uwp) this.c, (qbp) this.d, (wn5) this.b, (hq5) obj, rvf.R(385));
                return Unit.a;
            case 11:
                ((Integer) obj2).getClass();
                t7g.g((wwp) this.c, (Function1) this.d, (yci) this.b, (hq5) obj, rvf.R(385));
                return Unit.a;
            case 12:
                ((Integer) obj2).getClass();
                v7g.f((fyp) this.c, (Function0) this.d, (yci) this.b, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 13:
                String str = (String) this.c;
                jp0 jp0Var = (jp0) this.d;
                wn5 wn5Var = (wn5) this.b;
                hq5 hq5Var7 = (hq5) obj;
                int intValue6 = ((Integer) obj2).intValue();
                oq5 oq5Var7 = (oq5) hq5Var7;
                if (oq5Var7.P(intValue6 & 1, (intValue6 & 3) != 2)) {
                    a.a(ild.C(-1492584851, new j26(wn5Var, 15), oq5Var7), androidx.compose.ui.platform.a.a(vci.a, "modal_bottom_sheet_".concat(str)), (bci) jp0Var.c, false, null, 0, d85.m, 0L, d85.b(d85.b, 0.7f, 0.0f, 0.0f, 0.0f, 14), wct.d, oq5Var7, 907739654, 152);
                } else {
                    oq5Var7.S();
                }
                return Unit.a;
            case 14:
                ((Integer) obj2).getClass();
                bzf.h((njq) this.c, (Function0) this.d, (yci) this.b, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 15:
                ((Integer) obj2).getClass();
                fkq.a((wn5) this.c, (wn5) this.d, (yci) this.b, (hq5) obj, rvf.R(55));
                return Unit.a;
            case 16:
                npq npqVar = (npq) this.c;
                fvf fvfVar2 = npqVar.n;
                hgp hgpVar = (hgp) this.d;
                qnq qnqVar2 = (qnq) this.b;
                hq5 hq5Var8 = (hq5) obj;
                int intValue7 = ((Integer) obj2).intValue();
                oq5 oq5Var8 = (oq5) hq5Var8;
                if (oq5Var8.P(intValue7 & 1, (intValue7 & 3) != 2)) {
                    dyi L = ivf.L(oq5Var8);
                    qxo.c(fvfVar2, "MainLanding", oq5Var8, 0);
                    Unit unit = Unit.a;
                    boolean h = oq5Var8.h(npqVar);
                    Object K3 = oq5Var8.K();
                    Object obj3 = gq5.a;
                    Continuation continuation = null;
                    if (h || K3 == obj3) {
                        K3 = new glp(npqVar, continuation, 8);
                        oq5Var8.k0(K3);
                    }
                    gld.w(oq5Var8, unit, (Function2) K3);
                    re reVar = (re) gld.O((vdr) hgpVar.i, oq5Var8).getValue();
                    fvfVar2.getClass();
                    Object K4 = oq5Var8.K();
                    if (K4 == obj3) {
                        K4 = szf.g0(Boolean.FALSE);
                        oq5Var8.k0(K4);
                    }
                    aqi aqiVar4 = (aqi) K4;
                    Object o0 = szf.o0(reVar, oq5Var8);
                    boolean f3 = oq5Var8.f(o0) | oq5Var8.f(fvfVar2);
                    Object K5 = oq5Var8.K();
                    if (f3 || K5 == obj3) {
                        Object fpqVar = new fpq(o0, fvfVar2, aqiVar4, continuation, 13);
                        oq5Var8.k0(fpqVar);
                        K5 = fpqVar;
                    }
                    gld.w(oq5Var8, o0, (Function2) K5);
                    Boolean bool = (Boolean) aqiVar4.getValue();
                    bool.booleanValue();
                    boolean h2 = oq5Var8.h(npqVar) | oq5Var8.f(aqiVar4);
                    Object K6 = oq5Var8.K();
                    if (h2 || K6 == obj3) {
                        K6 = new v5p(npqVar, aqiVar4, continuation, 25);
                        oq5Var8.k0(K6);
                    }
                    gld.w(oq5Var8, bool, (Function2) K6);
                    pd.b(new qzm[0], false, ild.C(1578011552, new kpq(qnqVar2, hgpVar, npqVar, L, 0), oq5Var8), oq5Var8, 0, 2);
                } else {
                    oq5Var8.S();
                }
                return Unit.a;
            case 17:
                ((Integer) obj2).getClass();
                yvq.a((hvq) this.c, (vvo) this.d, (yci) this.b, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 18:
                p0r p0rVar = (p0r) this.c;
                lzs lzsVar = (lzs) this.d;
                frs frsVar = (frs) this.b;
                hq5 hq5Var9 = (hq5) obj;
                int intValue8 = ((Integer) obj2).intValue();
                oq5 oq5Var9 = (oq5) hq5Var9;
                if (oq5Var9.P(intValue8 & 1, (intValue8 & 3) != 2)) {
                    vut.r(p0rVar.a, lzsVar, null, null, 0.0f, frsVar == frs.c, oq5Var9, 0, 28);
                } else {
                    oq5Var9.S();
                }
                return Unit.a;
            case 19:
                ((Integer) obj2).getClass();
                g0g.s((q53) this.c, (eqp) this.d, (yci) this.b, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 20:
                d85 d85Var = (d85) this.c;
                o0k o0kVar = (o0k) this.d;
                String str2 = (String) this.b;
                hq5 hq5Var10 = (hq5) obj;
                int intValue9 = ((Integer) obj2).intValue();
                oq5 oq5Var10 = (oq5) hq5Var10;
                if (oq5Var10.P(intValue9 & 1, (intValue9 & 3) != 2)) {
                    ges j = nu0.j();
                    oq5Var10.Z(-1776387390);
                    oq5Var10.p(false);
                    xcs.b(str2, androidx.compose.foundation.layout.a.l(vci.a, o0kVar), d85Var.a, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, j, oq5Var10, 0, 3120, 55288);
                } else {
                    oq5Var10.S();
                }
                return Unit.a;
            case 21:
                ((Integer) obj2).getClass();
                s7g.j((ukd) this.c, (ukd) this.b, (Function1) this.d, (hq5) obj, rvf.R(7));
                return Unit.a;
            case 22:
                ((Integer) obj2).getClass();
                ezf.m((nru) this.c, (y) this.d, (pu0) this.b, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 23:
                ((Integer) obj2).getClass();
                dag.i((t53) this.c, (eqp) this.d, (yci) this.b, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 24:
                yci yciVar = (yci) this.b;
                yci yciVar2 = (yci) this.c;
                Function0 function0 = (Function0) this.d;
                wn5 wn5Var2 = jf0.g;
                wn5 wn5Var3 = jf0.j;
                wn5 wn5Var4 = jf0.m;
                hq5 hq5Var11 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var11 = (oq5) hq5Var11;
                    if (oq5Var11.z()) {
                        oq5Var11.S();
                        return Unit.a;
                    }
                }
                yci a2 = androidx.compose.ui.platform.a.a(yciVar, "header_buttons");
                oq5 oq5Var12 = (oq5) hq5Var11;
                Object K7 = oq5Var12.K();
                kjn kjnVar = gq5.a;
                if (K7 == kjnVar) {
                    K7 = new d5s(26);
                    oq5Var12.k0(K7);
                }
                yci b = nfp.b(a2, false, (Function1) K7);
                nho a3 = lho.a(qx0.a, b2c.k, oq5Var12, 0);
                int i = oq5Var12.P;
                androidx.compose.runtime.internal.a l = oq5Var12.l();
                yci H = vnj.H(oq5Var12, b);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var12.d0();
                if (oq5Var12.O) {
                    oq5Var12.k(grbVar);
                } else {
                    oq5Var12.n0();
                }
                kb5 kb5Var = wp5.f;
                g0g.U(oq5Var12, a3, kb5Var);
                kb5 kb5Var2 = wp5.e;
                g0g.U(oq5Var12, l, kb5Var2);
                kb5 kb5Var3 = wp5.g;
                if (oq5Var12.O || !Intrinsics.d(oq5Var12.K(), Integer.valueOf(i))) {
                    ouj.x(i, oq5Var12, i, kb5Var3);
                }
                kb5 kb5Var4 = wp5.d;
                g0g.U(oq5Var12, H, kb5Var4);
                boolean f4 = oq5Var12.f(function0);
                Object K8 = oq5Var12.K();
                if (f4 || K8 == kjnVar) {
                    K8 = new g1j(26, function0);
                    oq5Var12.k0(K8);
                }
                yci s = wyf.s(yciVar2, (Function0) K8);
                iz2 iz2Var = b2c.c;
                kfh d = ug3.d(iz2Var, false);
                int i2 = oq5Var12.P;
                androidx.compose.runtime.internal.a l2 = oq5Var12.l();
                yci H2 = vnj.H(oq5Var12, s);
                oq5Var12.d0();
                if (oq5Var12.O) {
                    oq5Var12.k(grbVar);
                } else {
                    oq5Var12.n0();
                }
                g0g.U(oq5Var12, d, kb5Var);
                g0g.U(oq5Var12, l2, kb5Var2);
                if (oq5Var12.O || !Intrinsics.d(oq5Var12.K(), Integer.valueOf(i2))) {
                    ouj.x(i2, oq5Var12, i2, kb5Var3);
                }
                g0g.U(oq5Var12, H2, kb5Var4);
                wn5Var2.invoke(oq5Var12, 0);
                oq5Var12.p(true);
                kfh d2 = ug3.d(iz2Var, false);
                int i3 = oq5Var12.P;
                androidx.compose.runtime.internal.a l3 = oq5Var12.l();
                yci H3 = vnj.H(oq5Var12, yciVar2);
                oq5Var12.d0();
                if (oq5Var12.O) {
                    oq5Var12.k(grbVar);
                } else {
                    oq5Var12.n0();
                }
                g0g.U(oq5Var12, d2, kb5Var);
                g0g.U(oq5Var12, l3, kb5Var2);
                if (oq5Var12.O || !Intrinsics.d(oq5Var12.K(), Integer.valueOf(i3))) {
                    ouj.x(i3, oq5Var12, i3, kb5Var3);
                }
                g0g.U(oq5Var12, H3, kb5Var4);
                wn5Var3.invoke(oq5Var12, 0);
                oq5Var12.p(true);
                boolean f5 = oq5Var12.f(function0);
                Object K9 = oq5Var12.K();
                if (f5 || K9 == kjnVar) {
                    K9 = new g1j(27, function0);
                    oq5Var12.k0(K9);
                }
                yci s2 = wyf.s(yciVar2, (Function0) K9);
                kfh d3 = ug3.d(iz2Var, false);
                int i4 = oq5Var12.P;
                androidx.compose.runtime.internal.a l4 = oq5Var12.l();
                yci H4 = vnj.H(oq5Var12, s2);
                oq5Var12.d0();
                if (oq5Var12.O) {
                    oq5Var12.k(grbVar);
                } else {
                    oq5Var12.n0();
                }
                g0g.U(oq5Var12, d3, kb5Var);
                g0g.U(oq5Var12, l4, kb5Var2);
                if (oq5Var12.O || !Intrinsics.d(oq5Var12.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var12, i4, kb5Var3);
                }
                g0g.U(oq5Var12, H4, kb5Var4);
                wn5Var4.invoke(oq5Var12, 0);
                oq5Var12.p(true);
                oq5Var12.p(true);
                return Unit.a;
            case 25:
                ((Integer) obj2).getClass();
                szf.v((String) this.c, (jzb) this.d, (yci) this.b, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 26:
                wqn wqnVar = (wqn) this.c;
                x8a x8aVar = (x8a) this.d;
                Function2 function2 = (Function2) this.b;
                lfm lfmVar = (lfm) obj;
                enj enjVar = (enj) obj2;
                long h3 = enj.h(wqnVar.a, enjVar.a);
                wqnVar.a = h3;
                x8aVar.a(lfmVar.b, h3);
                lfmVar.a();
                long j2 = enjVar.a;
                function2.invoke(Integer.valueOf((int) enj.e(j2)), Integer.valueOf((int) enj.f(j2)));
                return Unit.a;
            case 27:
                bci bciVar = (bci) this.c;
                nrs nrsVar = (nrs) this.d;
                aqi aqiVar5 = (aqi) this.b;
                hq5 hq5Var12 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var13 = (oq5) hq5Var12;
                    if (oq5Var13.z()) {
                        oq5Var13.S();
                        return Unit.a;
                    }
                }
                asq.q((srs) aqiVar5.getValue(), bciVar, nrsVar, androidx.compose.ui.platform.a.a(vci.a, "track_bottom_sheet_dialog"), hq5Var12, 3136);
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                xbb xbbVar = (xbb) this.c;
                mqs mqsVar = (mqs) this.d;
                Function0 function02 = (Function0) this.b;
                hq5 hq5Var13 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var14 = (oq5) hq5Var13;
                    if (oq5Var14.z()) {
                        oq5Var14.S();
                        return Unit.a;
                    }
                }
                wdg.o(xbbVar, mqsVar, null, function02, hq5Var13, 8);
                return Unit.a;
            default:
                xbb xbbVar2 = (xbb) this.c;
                swu swuVar = (swu) this.d;
                Function0 function03 = (Function0) this.b;
                hq5 hq5Var14 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var15 = (oq5) hq5Var14;
                    if (oq5Var15.z()) {
                        oq5Var15.S();
                        return Unit.a;
                    }
                }
                wdg.n(xbbVar2, swuVar, null, function03, hq5Var14, 8);
                return Unit.a;
        }
    }

    public /* synthetic */ t2n(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }

    public /* synthetic */ t2n(yci yciVar, yci yciVar2, Function0 function0) {
        this.a = 24;
        this.b = yciVar;
        this.c = yciVar2;
        this.d = function0;
    }

    public /* synthetic */ t2n(l6p l6pVar, fvf fvfVar, Function1 function1) {
        this.a = 8;
        this.c = l6pVar;
        this.b = fvfVar;
        this.d = function1;
    }

    public /* synthetic */ t2n(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }
}
