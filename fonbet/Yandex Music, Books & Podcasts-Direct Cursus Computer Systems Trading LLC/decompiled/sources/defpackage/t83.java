package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import com.yandex.media.ynison.service.f;
import com.yandex.messenger.websdk.api.Cancelable;
import com.yandex.music.screen.landing.api.header.ui.view.BottomsheetCollapsingTopBar;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class t83 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ t83(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        cvl cvlVar;
        cvl cvlVar2;
        int i = this.a;
        vci vciVar = vci.a;
        Integer num = null;
        boolean z = false;
        r7 = false;
        boolean z2 = false;
        z = false;
        switch (i) {
            case 0:
                ((Integer) obj).getClass();
                gdj gdjVar = (gdj) obj2;
                gdjVar.getClass();
                break;
            case 1:
                int i2 = BottomsheetCollapsingTopBar.q;
                ((String) obj2).getClass();
                break;
            case 2:
                ((Integer) obj2).getClass();
                ot0.g(rvf.R(1), (hq5) obj);
                break;
            case 3:
                l54 l54Var = (l54) obj2;
                ((goo) obj).getClass();
                l54Var.getClass();
                break;
            case 4:
                m54 m54Var = (m54) obj2;
                ((goo) obj).getClass();
                m54Var.getClass();
                break;
            case 5:
                ((whm) obj).getClass();
                ((whm) obj2).getClass();
                break;
            case 6:
                Cancelable cancelable = (Cancelable) obj2;
                ((fi4) obj).getClass();
                cancelable.getClass();
                cancelable.cancel();
                break;
            case 7:
                ((Integer) obj2).getClass();
                ild.m(rvf.R(1), (hq5) obj);
                break;
            case 8:
                ((Integer) obj).getClass();
                qab qabVar = (qab) obj2;
                qabVar.getClass();
                if (qabVar instanceof oab) {
                    break;
                } else if (qabVar instanceof pab) {
                    break;
                } else {
                    b6e.s();
                    break;
                }
            case 9:
                ((Integer) obj).getClass();
                ev4 ev4Var = (ev4) obj2;
                ev4Var.getClass();
                break;
            case 10:
                rrl rrlVar = (rrl) obj;
                rrl rrlVar2 = (rrl) obj2;
                if (Intrinsics.d(rrlVar, rrlVar2)) {
                    Integer valueOf = (rrlVar == null || (cvlVar2 = rrlVar.a) == null) ? null : Integer.valueOf(cvlVar2.g);
                    if (rrlVar2 != null && (cvlVar = rrlVar2.a) != null) {
                        num = Integer.valueOf(cvlVar.g);
                    }
                    if (Intrinsics.d(valueOf, num)) {
                        z = true;
                    }
                }
                break;
            case 11:
                ((Integer) obj).getClass();
                dwl dwlVar = (dwl) obj2;
                dwlVar.getClass();
                break;
            case 12:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    float e = zs4.e(oq5Var);
                    vci vciVar2 = vci.a;
                    yci q = a.q(vciVar2, 16, 0.0f, 8, e, 2);
                    ta5 a = sa5.a(qx0.c, b2c.n, oq5Var, 0);
                    int i3 = oq5Var.P;
                    androidx.compose.runtime.internal.a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, q);
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
                    weo.k(0, oq5Var);
                    u1g.l(oq5Var, d.e(vciVar2, 12));
                    weo.j(false, false, oq5Var, 54, 0);
                    oq5Var.Z(-478603753);
                    for (int i4 = 0; i4 < 4; i4++) {
                        weo.j(false, false, oq5Var, 0, 3);
                    }
                    oq5Var.p(false);
                    oq5Var.p(true);
                } else {
                    oq5Var.S();
                }
                break;
            case 13:
                ((Integer) obj2).getClass();
                weo.k(rvf.R(1), (hq5) obj);
                break;
            case 14:
                int intValue2 = ((Integer) obj).intValue();
                aau aauVar = (aau) obj2;
                if (aauVar != null && (r3 = aauVar.a.a) != null) {
                    break;
                } else {
                    break;
                }
                break;
            case 15:
                int intValue3 = ((Integer) obj).intValue();
                aau aauVar2 = (aau) obj2;
                if (aauVar2 != null && (r3 = aauVar2.a.a) != null) {
                    break;
                } else {
                    break;
                }
                break;
            case 16:
                String str = (String) obj;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                str.getClass();
                element.getClass();
                if (str.length() == 0) {
                    break;
                } else {
                    break;
                }
            case 17:
                f fVar = (f) obj;
                f fVar2 = (f) obj2;
                fVar.getClass();
                fVar2.getClass();
                if (fVar == fVar2 || (Intrinsics.d(fVar.t(), fVar2.t()) && fVar.u() == fVar2.u())) {
                    z2 = true;
                }
                break;
            case 18:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                j66.b(0, hq5Var2);
            case 19:
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var3;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                    }
                }
                break;
            case 20:
                hq5 hq5Var4 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var4 = (oq5) hq5Var4;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        break;
                    }
                }
                ngg.f(0, hq5Var4);
            case 21:
                hq5 hq5Var5 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var5 = (oq5) hq5Var5;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        break;
                    }
                }
                arm armVar = arm.a;
                oq5 oq5Var6 = (oq5) hq5Var5;
                Object K = oq5Var6.K();
                if (K == gq5.a) {
                    K = new ym4(19);
                    oq5Var6.k0(K);
                }
                fgq.b(armVar, (Function0) K, null, oq5Var6, 48, 4);
            case 22:
                hq5 hq5Var6 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var7 = (oq5) hq5Var6;
                    if (oq5Var7.z()) {
                        oq5Var7.S();
                        break;
                    }
                }
                u1g.l(hq5Var6, d.r(vciVar, 36));
            case 23:
                hq5 hq5Var7 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var8 = (oq5) hq5Var7;
                    if (oq5Var8.z()) {
                        oq5Var8.S();
                        break;
                    }
                }
                ta5 a2 = sa5.a(qx0.c, b2c.n, hq5Var7, 0);
                oq5 oq5Var9 = (oq5) hq5Var7;
                int i5 = oq5Var9.P;
                androidx.compose.runtime.internal.a l2 = oq5Var9.l();
                yci H2 = vnj.H(hq5Var7, vciVar);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var9.d0();
                if (oq5Var9.O) {
                    oq5Var9.k(grbVar2);
                } else {
                    oq5Var9.n0();
                }
                g0g.U(hq5Var7, a2, wp5.f);
                g0g.U(hq5Var7, l2, wp5.e);
                kb5 kb5Var2 = wp5.g;
                if (oq5Var9.O || !Intrinsics.d(oq5Var9.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var9, i5, kb5Var2);
                }
                g0g.U(hq5Var7, H2, wp5.d);
                ksw.d(6, 2, hq5Var7, null, true);
                ksw.e(6, hq5Var7, null, true);
                oq5Var9.p(true);
                break;
            case 24:
                hq5 hq5Var8 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var10 = (oq5) hq5Var8;
                    if (oq5Var10.z()) {
                        oq5Var10.S();
                        break;
                    }
                }
                u1g.l(hq5Var8, d.r(vciVar, 8));
            case 25:
                hq5 hq5Var9 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var11 = (oq5) hq5Var9;
                    if (oq5Var11.z()) {
                        oq5Var11.S();
                        break;
                    }
                }
                avf.f(ltg.e, ltg.f, hq5Var9, 54);
            case 26:
                hq5 hq5Var10 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var12 = (oq5) hq5Var10;
                    if (oq5Var12.z()) {
                        oq5Var12.S();
                        break;
                    }
                }
                avf.f(ltg.g, ltg.h, hq5Var10, 54);
            case 27:
                hq5 hq5Var11 = (hq5) obj;
                int intValue4 = ((Integer) obj2).intValue();
                oq5 oq5Var13 = (oq5) hq5Var11;
                if (oq5Var13.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    for (int i6 = 0; i6 < 3; i6++) {
                        u2x.g(d.d(vciVar, 1.0f), oq5Var13, 54);
                    }
                } else {
                    oq5Var13.S();
                }
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                hq5 hq5Var12 = (hq5) obj;
                int intValue5 = ((Integer) obj2).intValue();
                oq5 oq5Var14 = (oq5) hq5Var12;
                if (oq5Var14.P(intValue5 & 1, (intValue5 & 3) != 2)) {
                    qld.a(new h41(null), null, oq5Var14, 0, 2);
                } else {
                    oq5Var14.S();
                }
                break;
            default:
                hq5 hq5Var13 = (hq5) obj;
                int intValue6 = ((Integer) obj2).intValue();
                oq5 oq5Var15 = (oq5) hq5Var13;
                if (oq5Var15.P(intValue6 & 1, (intValue6 & 3) != 2)) {
                    qld.a(new h41(s41.a), null, oq5Var15, 0, 2);
                } else {
                    oq5Var15.S();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ t83(int i, int i2) {
        this.a = i2;
    }
}
