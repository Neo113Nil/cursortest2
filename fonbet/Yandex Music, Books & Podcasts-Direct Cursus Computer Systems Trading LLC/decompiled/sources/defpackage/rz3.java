package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class rz3 implements ryc {
    public final /* synthetic */ int a;

    public /* synthetic */ rz3(int i) {
        this.a = i;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        osj osjVar;
        String str;
        oq5 oq5Var;
        int i;
        int i2;
        int i3 = this.a;
        kjn kjnVar = gq5.a;
        vci vciVar = vci.a;
        switch (i3) {
            case 0:
                ((Integer) obj).getClass();
                hq5 hq5Var = (hq5) obj3;
                int intValue = ((Integer) obj4).intValue();
                ((Unit) obj2).getClass();
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 129) != 128)) {
                    nho a = lho.a(qx0.a, b2c.l, oq5Var2, 48);
                    int i4 = oq5Var2.P;
                    a l = oq5Var2.l();
                    yci H = vnj.H(oq5Var2, vciVar);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var2.d0();
                    if (oq5Var2.O) {
                        oq5Var2.k(grbVar);
                    } else {
                        oq5Var2.n0();
                    }
                    kb5 kb5Var = wp5.f;
                    g0g.U(oq5Var2, a, kb5Var);
                    kb5 kb5Var2 = wp5.e;
                    g0g.U(oq5Var2, l, kb5Var2);
                    kb5 kb5Var3 = wp5.g;
                    if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                        ouj.x(i4, oq5Var2, i4, kb5Var3);
                    }
                    kb5 kb5Var4 = wp5.d;
                    g0g.U(oq5Var2, H, kb5Var4);
                    if (1.0f <= 0.0d) {
                        qme.a("invalid weight; must be greater than zero");
                    }
                    ivf.k(0, 0, oq5Var2, androidx.compose.foundation.layout.a.d(xp3.u(new LayoutWeightElement(true, 1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f), ugo.a), 1.0f), true);
                    if (1.3f <= 0.0d) {
                        qme.a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, 1.3f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.3f);
                    ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
                    int i5 = oq5Var2.P;
                    a l2 = oq5Var2.l();
                    yci H2 = vnj.H(oq5Var2, layoutWeightElement);
                    oq5Var2.d0();
                    if (oq5Var2.O) {
                        oq5Var2.k(grbVar);
                    } else {
                        oq5Var2.n0();
                    }
                    g0g.U(oq5Var2, a2, kb5Var);
                    g0g.U(oq5Var2, l2, kb5Var2);
                    if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i5))) {
                        ouj.x(i5, oq5Var2, i5, kb5Var3);
                    }
                    g0g.U(oq5Var2, H2, kb5Var4);
                    float f = 68;
                    float f2 = 16;
                    float f3 = 8;
                    ivf.k(48, 0, oq5Var2, androidx.compose.foundation.layout.a.p(d.d(d.e(vciVar, f), 1.0f), f2, f3, f2, f3), true);
                    ivf.k(48, 0, oq5Var2, androidx.compose.foundation.layout.a.p(d.d(d.e(vciVar, f), 1.0f), f2, f3, f2, f3), true);
                    oq5Var2.p(true);
                    oq5Var2.p(true);
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
            case 1:
                sai saiVar = (sai) obj2;
                hq5 hq5Var2 = (hq5) obj3;
                int d = eta.d((Integer) obj4, (ua5) obj, saiVar);
                if ((d & 48) == 0) {
                    d |= ((oq5) hq5Var2).f(saiVar) ? 32 : 16;
                }
                if ((d & 145) == 144) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        return Unit.a;
                    }
                }
                boolean z = (d & 112) == 32;
                oq5 oq5Var4 = (oq5) hq5Var2;
                Object K = oq5Var4.K();
                if (z || K == kjnVar) {
                    K = new co5(saiVar, 0);
                    oq5Var4.k0(K);
                }
                sk3.b((Function0) K, oq5Var4, 0);
                return Unit.a;
            case 2:
                ((Integer) obj).getClass();
                String str2 = (String) obj2;
                hq5 hq5Var3 = (hq5) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                str2.getClass();
                if ((intValue2 & 48) == 0) {
                    intValue2 |= ((oq5) hq5Var3).f(str2) ? 32 : 16;
                }
                if ((intValue2 & 145) == 144) {
                    oq5 oq5Var5 = (oq5) hq5Var3;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        return Unit.a;
                    }
                }
                ocg.e(str2, new htq(etq.b), d.c(vciVar, 1.0f), null, hq5Var3, ((intValue2 >> 3) & 14) | 384, 8);
                return Unit.a;
            case 3:
                ((Integer) obj2).intValue();
                hq5 hq5Var4 = (hq5) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                if ((intValue3 & 129) == 128) {
                    oq5 oq5Var6 = (oq5) hq5Var4;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        return Unit.a;
                    }
                }
                zo1.a(0, 3, hq5Var4, null, false);
                return Unit.a;
            case 4:
                op1 op1Var = (op1) obj2;
                hq5 hq5Var5 = (hq5) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                ((oho) obj).getClass();
                op1Var.getClass();
                if ((intValue4 & 48) == 0) {
                    intValue4 |= (intValue4 & 64) == 0 ? ((oq5) hq5Var5).f(op1Var) : ((oq5) hq5Var5).h(op1Var) ? 32 : 16;
                }
                if ((intValue4 & 145) == 144) {
                    oq5 oq5Var7 = (oq5) hq5Var5;
                    if (oq5Var7.z()) {
                        oq5Var7.S();
                        return Unit.a;
                    }
                }
                np1 np1Var = op1Var.a;
                saf.b(np1Var.b, np1Var.a, hq5Var5, 0);
                return Unit.a;
            case 5:
                int intValue5 = ((Integer) obj2).intValue();
                hq5 hq5Var6 = (hq5) obj3;
                int intValue6 = ((Integer) obj4).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                if ((intValue6 & 48) == 0) {
                    intValue6 |= ((oq5) hq5Var6).d(intValue5) ? 32 : 16;
                }
                oq5 oq5Var8 = (oq5) hq5Var6;
                if (oq5Var8.P(intValue6 & 1, (intValue6 & 145) != 144)) {
                    dcc.b(intValue5 == 0 ? 60 : 100, 0.0f, oq5Var8, 0);
                } else {
                    oq5Var8.S();
                }
                return Unit.a;
            case 6:
                am amVar = (am) obj;
                int intValue7 = ((Integer) obj4).intValue();
                amVar.getClass();
                ((qnq) obj2).getClass();
                x97.a(amVar, null, (hq5) obj3, intValue7 & 14);
                return Unit.a;
            case 7:
                ahe aheVar = (ahe) obj2;
                hq5 hq5Var7 = (hq5) obj3;
                int intValue8 = ((Integer) obj4).intValue();
                ((oho) obj).getClass();
                aheVar.getClass();
                if ((intValue8 & 48) == 0) {
                    intValue8 |= ((oq5) hq5Var7).f(aheVar) ? 32 : 16;
                }
                oq5 oq5Var9 = (oq5) hq5Var7;
                if (oq5Var9.P(intValue8 & 1, (intValue8 & 145) != 144)) {
                    String str3 = aheVar.c;
                    if (str3 == null) {
                        oq5Var9.Z(1773371880);
                    } else {
                        oq5Var9.Z(1773371881);
                        ltg.e(qo6.d, str3, androidx.compose.ui.platform.a.a(xp3.u(d.m(vciVar, 32), ugo.a), "in_style_block_chips_cover"), null, null, null, null, null, oq5Var9, 6, 248);
                    }
                    oq5Var9.p(false);
                    u1g.l(oq5Var9, d.r(vciVar, 8));
                    xv7.j(aheVar.b, androidx.compose.ui.platform.a.a(neg.k(), "in_style_block_chips_name"), 0L, 0L, 0L, 0, 0L, 2, false, 1, 0, null, null, oq5Var9, 0, 3120, 120828);
                } else {
                    oq5Var9.S();
                }
                return Unit.a;
            case 8:
                hq5 hq5Var8 = (hq5) obj3;
                int intValue9 = ((Integer) obj4).intValue();
                ((zkn) obj).getClass();
                ((zr1) obj2).getClass();
                if ((intValue9 & 129) == 128) {
                    oq5 oq5Var10 = (oq5) hq5Var8;
                    if (oq5Var10.z()) {
                        oq5Var10.S();
                        return Unit.a;
                    }
                }
                qhi.a(d.c(vciVar, 1.0f), hq5Var8, 6);
                return Unit.a;
            case 9:
                zkn zknVar = (zkn) obj;
                hq5 hq5Var9 = (hq5) obj3;
                int intValue10 = ((Integer) obj4).intValue();
                zknVar.getClass();
                ((as1) obj2).getClass();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= ((oq5) hq5Var9).f(zknVar) ? 4 : 2;
                }
                if ((intValue10 & 131) == 130) {
                    oq5 oq5Var11 = (oq5) hq5Var9;
                    if (oq5Var11.z()) {
                        oq5Var11.S();
                        return Unit.a;
                    }
                }
                irf.r(zknVar.b, null, d.c(vciVar, 1.0f), null, null, 0.0f, null, hq5Var9, 432, 120);
                return Unit.a;
            case 10:
                hq5 hq5Var10 = (hq5) obj3;
                int intValue11 = ((Integer) obj4).intValue();
                ((zkn) obj).getClass();
                ((yr1) obj2).getClass();
                if ((intValue11 & 129) == 128) {
                    oq5 oq5Var12 = (oq5) hq5Var10;
                    if (oq5Var12.z()) {
                        oq5Var12.S();
                        return Unit.a;
                    }
                }
                qhi.a(d.c(vciVar, 1.0f), hq5Var10, 6);
                return Unit.a;
            case 11:
                ((Integer) obj2).getClass();
                hq5 hq5Var11 = (hq5) obj3;
                int intValue12 = ((Integer) obj4).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                if ((intValue12 & 129) == 128) {
                    oq5 oq5Var13 = (oq5) hq5Var11;
                    if (oq5Var13.z()) {
                        oq5Var13.S();
                        return Unit.a;
                    }
                }
                vut.k(54, 0, hq5Var11, androidx.compose.ui.platform.a.a(vciVar, "music_history_track_cover_placeholder"), true);
                return Unit.a;
            case 12:
                osj osjVar2 = (osj) obj2;
                hq5 hq5Var12 = (hq5) obj3;
                int intValue13 = ((Integer) obj4).intValue();
                ((nrf) obj).getClass();
                osjVar2.getClass();
                ta5 a3 = sa5.a(qx0.c, b2c.n, hq5Var12, 0);
                oq5 oq5Var14 = (oq5) hq5Var12;
                int i6 = oq5Var14.P;
                a l3 = oq5Var14.l();
                yci H3 = vnj.H(hq5Var12, vciVar);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var14.d0();
                if (oq5Var14.O) {
                    oq5Var14.k(grbVar2);
                } else {
                    oq5Var14.n0();
                }
                g0g.U(hq5Var12, a3, wp5.f);
                g0g.U(hq5Var12, l3, wp5.e);
                kb5 kb5Var5 = wp5.g;
                if (oq5Var14.O || !Intrinsics.d(oq5Var14.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var14, i6, kb5Var5);
                }
                g0g.U(hq5Var12, H3, wp5.d);
                vvd f4 = osjVar2.f();
                if (f4 == null) {
                    oq5Var14.Z(59232646);
                    oq5Var14.p(false);
                    osjVar = osjVar2;
                } else {
                    oq5Var14.Z(59232647);
                    boolean z2 = (((intValue13 & 112) ^ 48) > 32 && oq5Var14.f(osjVar2)) || (intValue13 & 48) == 32;
                    Object K2 = oq5Var14.K();
                    if (z2 || K2 == kjnVar) {
                        K2 = new e65(0, osjVar2, osj.class, "onPlaylistClick", "onPlaylistClick()V", 0, 3);
                        osjVar = osjVar2;
                        oq5Var14.k0(K2);
                    } else {
                        osjVar = osjVar2;
                    }
                    y1g.i(f4, (Function0) ((h9f) K2), null, hq5Var12, 0);
                    oq5Var14.p(false);
                }
                y1g.h(osjVar, null, hq5Var12, (intValue13 >> 3) & 14);
                oq5Var14.p(true);
                return Unit.a;
            case 13:
                int intValue14 = ((Integer) obj2).intValue();
                hq5 hq5Var13 = (hq5) obj3;
                int intValue15 = ((Integer) obj4).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                if ((intValue15 & 48) == 0) {
                    intValue15 |= ((oq5) hq5Var13).d(intValue14) ? 32 : 16;
                }
                oq5 oq5Var15 = (oq5) hq5Var13;
                if (oq5Var15.P(intValue15 & 1, (intValue15 & 145) != 144)) {
                    dcc.b(intValue14 == 0 ? 60 : 100, 0.0f, oq5Var15, 0);
                } else {
                    oq5Var15.S();
                }
                return Unit.a;
            case 14:
                int intValue16 = ((Integer) obj2).intValue();
                hq5 hq5Var14 = (hq5) obj3;
                int intValue17 = ((Integer) obj4).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                if ((intValue17 & 48) == 0) {
                    intValue17 |= ((oq5) hq5Var14).d(intValue16) ? 32 : 16;
                }
                oq5 oq5Var16 = (oq5) hq5Var14;
                if (oq5Var16.P(intValue17 & 1, (intValue17 & 145) != 144)) {
                    dcc.b(intValue16 == 0 ? 60 : 100, 0.0f, oq5Var16, 0);
                } else {
                    oq5Var16.S();
                }
                return Unit.a;
            case 15:
                qor qorVar = (qor) obj2;
                ((Integer) obj4).getClass();
                ((cl0) obj).getClass();
                qorVar.getClass();
                rzf.e(qorVar.a, qorVar.b, qorVar.c, null, (hq5) obj3, 0);
                return Unit.a;
            case 16:
                v0s v0sVar = (v0s) obj2;
                hq5 hq5Var15 = (hq5) obj3;
                int intValue18 = ((Integer) obj4).intValue();
                ((oho) obj).getClass();
                v0sVar.getClass();
                vki vkiVar = v0sVar.b;
                if ((intValue18 & 48) == 0) {
                    intValue18 |= ((oq5) hq5Var15).f(v0sVar) ? 32 : 16;
                }
                if ((intValue18 & 145) == 144) {
                    oq5 oq5Var17 = (oq5) hq5Var15;
                    if (oq5Var17.z()) {
                        oq5Var17.S();
                        return Unit.a;
                    }
                }
                float f5 = s2s.a;
                if (vkiVar instanceof tki) {
                    oq5Var = (oq5) hq5Var15;
                    i = R.string.listening_history_day_tab_today;
                    i2 = 709143249;
                } else if (vkiVar instanceof uki) {
                    oq5Var = (oq5) hq5Var15;
                    i = R.string.listening_history_day_tab_yesterday;
                    i2 = 709147029;
                } else {
                    if (!(vkiVar instanceof rki)) {
                        if (!(vkiVar instanceof ski)) {
                            throw vz1.i((oq5) hq5Var15, 709141235, false);
                        }
                        oq5 oq5Var18 = (oq5) hq5Var15;
                        oq5Var18.Z(709155830);
                        oq5Var18.p(false);
                        str = ((ski) vkiVar).a;
                        xcs.b(str, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, hq5Var15, 0, 0, 131070);
                        return Unit.a;
                    }
                    oq5Var = (oq5) hq5Var15;
                    i = R.string.listening_history_day_tab_day_before_yesterday;
                    i2 = 709151232;
                }
                str = vz1.n(oq5Var, i2, i, oq5Var, false);
                xcs.b(str, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, hq5Var15, 0, 0, 131070);
                return Unit.a;
            case 17:
                glu gluVar = (glu) obj2;
                hq5 hq5Var16 = (hq5) obj3;
                int intValue19 = ((Integer) obj4).intValue();
                ((oho) obj).getClass();
                gluVar.getClass();
                if ((intValue19 & 48) == 0) {
                    intValue19 |= (intValue19 & 64) == 0 ? ((oq5) hq5Var16).f(gluVar) : ((oq5) hq5Var16).h(gluVar) ? 32 : 16;
                }
                if ((intValue19 & 145) == 144) {
                    oq5 oq5Var19 = (oq5) hq5Var16;
                    if (oq5Var19.z()) {
                        oq5Var19.S();
                        return Unit.a;
                    }
                }
                xv7.j(gluVar.b.b, neg.k(), 0L, 0L, 0L, 0, 0L, 2, false, 1, 0, null, null, hq5Var16, 0, 3120, 120828);
                return Unit.a;
            case 18:
                hq5 hq5Var17 = (hq5) obj3;
                int intValue20 = ((Integer) obj4).intValue();
                ((zkn) obj).getClass();
                ((zr1) obj2).getClass();
                if ((intValue20 & 129) == 128) {
                    oq5 oq5Var20 = (oq5) hq5Var17;
                    if (oq5Var20.z()) {
                        oq5Var20.S();
                        return Unit.a;
                    }
                }
                q7g.b(d.c(vciVar, 1.0f), hq5Var17, 6);
                return Unit.a;
            case 19:
                as1 as1Var = (as1) obj2;
                hq5 hq5Var18 = (hq5) obj3;
                int intValue21 = ((Integer) obj4).intValue();
                ((zkn) obj).getClass();
                as1Var.getClass();
                if ((intValue21 & 48) == 0) {
                    intValue21 |= (intValue21 & 64) == 0 ? ((oq5) hq5Var18).f(as1Var) : ((oq5) hq5Var18).h(as1Var) ? 32 : 16;
                }
                if ((intValue21 & 145) == 144) {
                    oq5 oq5Var21 = (oq5) hq5Var18;
                    if (oq5Var21.z()) {
                        oq5Var21.S();
                        return Unit.a;
                    }
                }
                irf.r(as1Var.a, null, d.c(vciVar, 1.0f), null, null, 0.0f, null, hq5Var18, 432, 120);
                return Unit.a;
            case 20:
                hq5 hq5Var19 = (hq5) obj3;
                int intValue22 = ((Integer) obj4).intValue();
                ((zkn) obj).getClass();
                ((yr1) obj2).getClass();
                if ((intValue22 & 129) == 128) {
                    oq5 oq5Var22 = (oq5) hq5Var19;
                    if (oq5Var22.z()) {
                        oq5Var22.S();
                        return Unit.a;
                    }
                }
                q7g.b(d.c(vciVar, 1.0f), hq5Var19, 6);
                return Unit.a;
            case 21:
                onu onuVar = (onu) obj2;
                hq5 hq5Var20 = (hq5) obj3;
                int intValue23 = ((Integer) obj4).intValue();
                ((dh3) obj).getClass();
                onuVar.getClass();
                if ((intValue23 & 48) == 0) {
                    intValue23 |= ((oq5) hq5Var20).d(onuVar.ordinal()) ? 32 : 16;
                }
                if ((intValue23 & 145) == 144) {
                    oq5 oq5Var23 = (oq5) hq5Var20;
                    if (oq5Var23.z()) {
                        oq5Var23.S();
                        return Unit.a;
                    }
                }
                szf.x(null, onuVar, null, hq5Var20, intValue23 & 112, 5);
                return Unit.a;
            case 22:
                oav oavVar = (oav) obj2;
                hq5 hq5Var21 = (hq5) obj3;
                int intValue24 = ((Integer) obj4).intValue();
                ((oho) obj).getClass();
                oavVar.getClass();
                if ((intValue24 & 48) == 0) {
                    intValue24 |= ((oq5) hq5Var21).f(oavVar) ? 32 : 16;
                }
                oq5 oq5Var24 = (oq5) hq5Var21;
                if (oq5Var24.P(intValue24 & 1, (intValue24 & 145) != 144)) {
                    xv7.j(oavVar.b, neg.k(), 0L, 0L, 0L, 0, 0L, 2, false, 1, 0, null, null, oq5Var24, 0, 3120, 120828);
                } else {
                    oq5Var24.S();
                }
                return Unit.a;
            case 23:
                g0w g0wVar = (g0w) obj2;
                hq5 hq5Var22 = (hq5) obj3;
                int intValue25 = ((Integer) obj4).intValue();
                ((cl0) obj).getClass();
                if (g0wVar != null) {
                    oq5 oq5Var25 = (oq5) hq5Var22;
                    oq5Var25.Z(-1708918515);
                    hdg.G(g0wVar, oq5Var25, (intValue25 >> 3) & 14);
                    oq5Var25.p(false);
                } else {
                    oq5 oq5Var26 = (oq5) hq5Var22;
                    oq5Var26.Z(-1708809054);
                    hdg.H(0, oq5Var26);
                    oq5Var26.p(false);
                }
                return Unit.a;
            case 24:
                ((Integer) obj).getClass();
                hq5 hq5Var23 = (hq5) obj3;
                int intValue26 = ((Integer) obj4).intValue();
                ((Unit) obj2).getClass();
                if ((intValue26 & 129) == 128) {
                    oq5 oq5Var27 = (oq5) hq5Var23;
                    if (oq5Var27.z()) {
                        oq5Var27.S();
                        return Unit.a;
                    }
                }
                neg.q(hq5Var23).invoke(vciVar, hq5Var23, 6);
                return Unit.a;
            case 25:
                String str4 = (String) obj2;
                hq5 hq5Var24 = (hq5) obj3;
                int intValue27 = ((Integer) obj4).intValue();
                ((cl0) obj).getClass();
                str4.getClass();
                xcs.b(str4, null, ((dq0) ((oq5) hq5Var24).j(eq0.a)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, neg.t(hq5Var24).f.a, hq5Var24, (intValue27 >> 3) & 14, 0, 65018);
                return Unit.a;
            case 26:
                ((Integer) obj2).intValue();
                hq5 hq5Var25 = (hq5) obj3;
                int intValue28 = ((Integer) obj4).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                if ((intValue28 & 129) == 128) {
                    oq5 oq5Var28 = (oq5) hq5Var25;
                    if (oq5Var28.z()) {
                        oq5Var28.S();
                        return Unit.a;
                    }
                }
                zwf.p(v1w.a, -1, null, null, hq5Var25, 54, 12);
                return Unit.a;
            case 27:
                ((Integer) obj2).intValue();
                hq5 hq5Var26 = (hq5) obj3;
                int intValue29 = ((Integer) obj4).intValue();
                ((androidx.compose.foundation.lazy.a) obj).getClass();
                if ((intValue29 & 129) == 128) {
                    oq5 oq5Var29 = (oq5) hq5Var26;
                    if (oq5Var29.z()) {
                        oq5Var29.S();
                        return Unit.a;
                    }
                }
                zwf.p(v1w.a, -1, null, null, hq5Var26, 54, 12);
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((Boolean) obj).getClass();
                yci yciVar = (yci) obj2;
                hq5 hq5Var27 = (hq5) obj3;
                int intValue30 = ((Integer) obj4).intValue();
                yciVar.getClass();
                if ((intValue30 & 48) == 0) {
                    intValue30 |= ((oq5) hq5Var27).f(yciVar) ? 32 : 16;
                }
                if ((intValue30 & 145) == 144) {
                    oq5 oq5Var30 = (oq5) hq5Var27;
                    if (oq5Var30.z()) {
                        oq5Var30.S();
                        return Unit.a;
                    }
                }
                neg.q(hq5Var27).invoke(yciVar, hq5Var27, Integer.valueOf((intValue30 >> 3) & 14));
                return Unit.a;
            default:
                ((Boolean) obj).getClass();
                yci yciVar2 = (yci) obj2;
                hq5 hq5Var28 = (hq5) obj3;
                int intValue31 = ((Integer) obj4).intValue();
                yciVar2.getClass();
                if ((intValue31 & 48) == 0) {
                    intValue31 |= ((oq5) hq5Var28).f(yciVar2) ? 32 : 16;
                }
                if ((intValue31 & 145) == 144) {
                    oq5 oq5Var31 = (oq5) hq5Var28;
                    if (oq5Var31.z()) {
                        oq5Var31.S();
                        return Unit.a;
                    }
                }
                ((d3w) ((oq5) hq5Var28).j(e3w.a)).k.invoke(neg.t(hq5Var28).g.a, yciVar2, hq5Var28, Integer.valueOf(intValue31 & 112));
                return Unit.a;
        }
    }
}
