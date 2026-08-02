package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import com.yandex.music.core.ui.compose.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class xu0 implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ xu0(boolean z) {
        this.a = 27;
        this.b = z;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        tgo tgoVar;
        int i = this.a;
        jxk jxkVar = jxk.a;
        ixk ixkVar = ixk.a;
        hxk hxkVar = hxk.a;
        gxk gxkVar = gxk.a;
        exk exkVar = exk.a;
        dxk dxkVar = dxk.a;
        fxk fxkVar = fxk.a;
        vci vciVar = vci.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                Function2 function2 = (Function2) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                function2.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).h(function2) ? 4 : 2;
                }
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
                    pd.b(new qzm[0], this.b, function2, oq5Var, (intValue << 6) & 896, 0);
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            case 1:
                Function2 function22 = (Function2) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                function22.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((oq5) hq5Var2).h(function22) ? 4 : 2;
                }
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 19) != 18)) {
                    pd.b(new qzm[0], this.b, function22, oq5Var2, (intValue2 << 6) & 896, 0);
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
            case 2:
                hq5 hq5Var3 = (hq5) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(intValue3 & 1, (intValue3 & 17) != 16)) {
                    gae.b(a0g.E(z ? R.drawable.ic_pause_32 : R.drawable.ic_play_32, 0, oq5Var3), null, a.a(vciVar, z ? "playback_button_pause" : "playback_button_play"), 0L, oq5Var3, 48, 8);
                } else {
                    oq5Var3.S();
                }
                return Unit.a;
            case 3:
                dh3 dh3Var = (dh3) obj;
                hq5 hq5Var4 = (hq5) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                dh3Var.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((oq5) hq5Var4).f(dh3Var) ? 4 : 2;
                }
                oq5 oq5Var4 = (oq5) hq5Var4;
                if (oq5Var4.P(intValue4 & 1, (intValue4 & 19) != 18)) {
                    ivf.k(0, 0, oq5Var4, dh3Var.b(xp3.u(vciVar, irf.R(qo6.a, oq5Var4))), z);
                } else {
                    oq5Var4.S();
                }
                return Unit.a;
            case 4:
                hq5 hq5Var5 = (hq5) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                oq5 oq5Var5 = (oq5) hq5Var5;
                if (oq5Var5.P(intValue5 & 1, (intValue5 & 17) != 16)) {
                    gae.b(a0g.E(z ? R.drawable.ic_pause_small_24 : R.drawable.ic_play_small_24, 0, oq5Var5), rvf.M(z ? R.string.pause : R.string.listen, oq5Var5), b.c(a.a(d.m(vciVar, 24), "search_best_result_playback_button"), "best_result_is_playing", Boolean.valueOf(z)), 0L, oq5Var5, 0, 8);
                } else {
                    oq5Var5.S();
                }
                return Unit.a;
            case 5:
                pw5 pw5Var = (pw5) obj;
                hq5 hq5Var6 = (hq5) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                pw5Var.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((oq5) hq5Var6).f(pw5Var) ? 4 : 2;
                }
                if ((intValue6 & 19) == 18) {
                    oq5 oq5Var6 = (oq5) hq5Var6;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        return Unit.a;
                    }
                }
                if (z) {
                    oq5 oq5Var7 = (oq5) hq5Var6;
                    oq5Var7.Z(-330755693);
                    u2x.h(pw5Var.a, pw5Var.b, pw5Var.c, pw5Var.g, pw5Var.m, pw5Var.o, oq5Var7, 0);
                    oq5Var7.p(false);
                } else {
                    oq5 oq5Var8 = (oq5) hq5Var6;
                    oq5Var8.Z(-330398852);
                    u2x.i(pw5Var.g, pw5Var.h, pw5Var.i, pw5Var.k, pw5Var.l, oq5Var8, 0);
                    oq5Var8.p(false);
                }
                return Unit.a;
            case 6:
                pw5 pw5Var2 = (pw5) obj;
                hq5 hq5Var7 = (hq5) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                pw5Var2.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((oq5) hq5Var7).f(pw5Var2) ? 4 : 2;
                }
                if ((intValue7 & 19) == 18) {
                    oq5 oq5Var9 = (oq5) hq5Var7;
                    if (oq5Var9.z()) {
                        oq5Var9.S();
                        return Unit.a;
                    }
                }
                if (z) {
                    oq5 oq5Var10 = (oq5) hq5Var7;
                    oq5Var10.Z(-1464762188);
                    oq5Var10.p(false);
                    u2x.h(pw5Var2.a, pw5Var2.b, pw5Var2.c, pw5Var2.g, pw5Var2.m, pw5Var2.o, oq5Var10, 0);
                    return Unit.a;
                }
                oq5 oq5Var11 = (oq5) hq5Var7;
                oq5Var11.Z(-1455445355);
                u2x.i(pw5Var2.g, pw5Var2.h, pw5Var2.i, pw5Var2.k, pw5Var2.l, oq5Var11, 0);
                oq5Var11.p(false);
                return Unit.a;
            case 7:
                i31 i31Var = (i31) obj;
                hq5 hq5Var8 = (hq5) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                i31Var.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((oq5) hq5Var8).f(i31Var) ? 4 : 2;
                }
                if ((intValue8 & 19) == 18) {
                    oq5 oq5Var12 = (oq5) hq5Var8;
                    if (oq5Var12.z()) {
                        oq5Var12.S();
                        return Unit.a;
                    }
                }
                ksw.q(this.b, i31Var.a, i31Var.b, i31Var.c, i31Var.g, i31Var.h, i31Var.i, i31Var.k, i31Var.l, i31Var.n, hq5Var8, 0);
                return Unit.a;
            case 8:
                hq5 hq5Var9 = (hq5) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((uvd) obj).getClass();
                if ((intValue9 & 17) == 16) {
                    oq5 oq5Var13 = (oq5) hq5Var9;
                    if (oq5Var13.z()) {
                        oq5Var13.S();
                        return Unit.a;
                    }
                }
                jf0.r(384, hq5Var9, d.d(vciVar, 1.0f), z);
                return Unit.a;
            case 9:
                hq5 hq5Var10 = (hq5) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                if ((intValue10 & 17) == 16) {
                    oq5 oq5Var14 = (oq5) hq5Var10;
                    if (oq5Var14.z()) {
                        oq5Var14.S();
                        return Unit.a;
                    }
                }
                yci m = d.m(vciVar, fj6.c);
                agr agrVar = eq0.a;
                oq5 oq5Var15 = (oq5) hq5Var10;
                a0g.e(this.b, null, m, ((dq0) oq5Var15.j(agrVar)).a.a, ((dq0) oq5Var15.j(agrVar)).a.c, b0g.c, hq5Var10, 384, 2);
                return Unit.a;
            case 10:
                yci yciVar = (yci) obj;
                hq5 hq5Var11 = (hq5) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                yciVar.getClass();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((oq5) hq5Var11).f(yciVar) ? 4 : 2;
                }
                oq5 oq5Var16 = (oq5) hq5Var11;
                if (oq5Var16.P(intValue11 & 1, (intValue11 & 19) != 18)) {
                    ivf.k((intValue11 << 3) & 112, 0, oq5Var16, yciVar, z);
                } else {
                    oq5Var16.S();
                }
                return Unit.a;
            case 11:
                hq5 hq5Var12 = (hq5) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((Unit) obj).getClass();
                oq5 oq5Var17 = (oq5) hq5Var12;
                if (oq5Var17.P(intValue12 & 1, (intValue12 & 17) != 16)) {
                    qgg.b(this.b, zpd.f, null, oq5Var17, 48, 4);
                } else {
                    oq5Var17.S();
                }
                return Unit.a;
            case 12:
                hq5 hq5Var13 = (hq5) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((g8i) obj).getClass();
                oq5 oq5Var18 = (oq5) hq5Var13;
                if (oq5Var18.P(intValue13 & 1, (intValue13 & 17) != 16)) {
                    gdg.i(0, 2, oq5Var18, null, z);
                } else {
                    oq5Var18.S();
                }
                return Unit.a;
            case 13:
                oho ohoVar = (oho) obj;
                hq5 hq5Var14 = (hq5) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ohoVar.getClass();
                if ((intValue14 & 6) == 0) {
                    intValue14 |= ((oq5) hq5Var14).f(ohoVar) ? 4 : 2;
                }
                oq5 oq5Var19 = (oq5) hq5Var14;
                if (oq5Var19.P(intValue14 & 1, (intValue14 & 19) != 18)) {
                    yci m2 = d.m(vciVar, 88);
                    kfh d = ug3.d(b2c.f, false);
                    int i2 = oq5Var19.P;
                    androidx.compose.runtime.internal.a l = oq5Var19.l();
                    yci H = vnj.H(oq5Var19, m2);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var19.d0();
                    if (oq5Var19.O) {
                        oq5Var19.k(grbVar);
                    } else {
                        oq5Var19.n0();
                    }
                    kb5 kb5Var = wp5.f;
                    g0g.U(oq5Var19, d, kb5Var);
                    kb5 kb5Var2 = wp5.e;
                    g0g.U(oq5Var19, l, kb5Var2);
                    kb5 kb5Var3 = wp5.g;
                    if (oq5Var19.O || !Intrinsics.d(oq5Var19.K(), Integer.valueOf(i2))) {
                        ouj.x(i2, oq5Var19, i2, kb5Var3);
                    }
                    kb5 kb5Var4 = wp5.d;
                    g0g.U(oq5Var19, H, kb5Var4);
                    yci u = xp3.u(d.m(vciVar, 68), o5g.F(oq5Var19));
                    boolean z2 = this.b;
                    ivf.k(0, 0, oq5Var19, u, z2);
                    oq5Var19.p(true);
                    yci a = ohoVar.a(1.0f, vciVar, true);
                    ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var19, 0);
                    int i3 = oq5Var19.P;
                    androidx.compose.runtime.internal.a l2 = oq5Var19.l();
                    yci H2 = vnj.H(oq5Var19, a);
                    oq5Var19.d0();
                    if (oq5Var19.O) {
                        oq5Var19.k(grbVar);
                    } else {
                        oq5Var19.n0();
                    }
                    g0g.U(oq5Var19, a2, kb5Var);
                    g0g.U(oq5Var19, l2, kb5Var2);
                    if (oq5Var19.O || !Intrinsics.d(oq5Var19.K(), Integer.valueOf(i3))) {
                        ouj.x(i3, oq5Var19, i3, kb5Var3);
                    }
                    g0g.U(oq5Var19, H2, kb5Var4);
                    ivf.l(z2, d.r(vciVar, 180), nu0.c(), oq5Var19, 48, 0);
                    u1g.l(oq5Var19, d.e(vciVar, 4));
                    ivf.l(z2, d.r(vciVar, 100), nu0.j(), oq5Var19, 48, 0);
                    oq5Var19.p(true);
                } else {
                    oq5Var19.S();
                }
                return Unit.a;
            case 14:
                hq5 hq5Var15 = (hq5) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                if ((intValue15 & 17) == 16) {
                    oq5 oq5Var20 = (oq5) hq5Var15;
                    if (oq5Var20.z()) {
                        oq5Var20.S();
                        return Unit.a;
                    }
                }
                ivf.k(0, 0, hq5Var15, xp3.u(d.c(vciVar, 1.0f), o5g.F(hq5Var15)), z);
                return Unit.a;
            case 15:
                hq5 hq5Var16 = (hq5) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                if ((intValue16 & 17) == 16) {
                    oq5 oq5Var21 = (oq5) hq5Var16;
                    if (oq5Var21.z()) {
                        oq5Var21.S();
                        return Unit.a;
                    }
                }
                ivf.k(0, 0, hq5Var16, xp3.u(d.c(vciVar, 1.0f), ugo.a), z);
                return Unit.a;
            case 16:
                hq5 hq5Var17 = (hq5) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((ua5) obj).getClass();
                if ((intValue17 & 17) == 16) {
                    oq5 oq5Var22 = (oq5) hq5Var17;
                    if (oq5Var22.z()) {
                        oq5Var22.S();
                        return Unit.a;
                    }
                }
                yci d2 = d.d(vciVar, 1.0f);
                ta5 a3 = sa5.a(qx0.c, b2c.o, hq5Var17, 48);
                oq5 oq5Var23 = (oq5) hq5Var17;
                int i4 = oq5Var23.P;
                androidx.compose.runtime.internal.a l3 = oq5Var23.l();
                yci H3 = vnj.H(hq5Var17, d2);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var23.d0();
                if (oq5Var23.O) {
                    oq5Var23.k(grbVar2);
                } else {
                    oq5Var23.n0();
                }
                g0g.U(hq5Var17, a3, wp5.f);
                g0g.U(hq5Var17, l3, wp5.e);
                kb5 kb5Var5 = wp5.g;
                if (oq5Var23.O || !Intrinsics.d(oq5Var23.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var23, i4, kb5Var5);
                }
                g0g.U(hq5Var17, H3, wp5.d);
                float f = upd.a;
                h6g h6gVar = nu0.a;
                h6g h6gVar2 = h6g.c;
                ivf.l(this.b, d.r(vciVar, 64), nu0.j(), hq5Var17, 48, 0);
                oq5Var23.p(true);
                return Unit.a;
            case 17:
                hq5 hq5Var18 = (hq5) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                if ((intValue18 & 17) == 16) {
                    oq5 oq5Var24 = (oq5) hq5Var18;
                    if (oq5Var24.z()) {
                        oq5Var24.S();
                        return Unit.a;
                    }
                }
                gae.b(a0g.E(z ? R.drawable.ic_pause_32 : R.drawable.ic_play_32, 0, hq5Var18), null, a.a(vciVar, z ? "playback_button_pause" : "playback_button_play"), 0L, hq5Var18, 48, 8);
                return Unit.a;
            case 18:
                nxk nxkVar = (nxk) obj;
                hq5 hq5Var19 = (hq5) obj2;
                ((Integer) obj3).intValue();
                nxkVar.getClass();
                if (Intrinsics.d(nxkVar, fxkVar)) {
                    oq5 oq5Var25 = (oq5) hq5Var19;
                    oq5Var25.Z(-1956388339);
                    if (z) {
                        oq5Var25.Z(-1956319240);
                        ywf.h(0, oq5Var25);
                        oq5Var25.p(false);
                    } else {
                        oq5Var25.Z(-1956196356);
                        cxb.b(0, oq5Var25);
                        oq5Var25.p(false);
                    }
                    oq5Var25.p(false);
                } else {
                    if (!Intrinsics.d(nxkVar, dxkVar) && !Intrinsics.d(nxkVar, exkVar) && !Intrinsics.d(nxkVar, gxkVar) && !Intrinsics.d(nxkVar, hxkVar) && !Intrinsics.d(nxkVar, ixkVar) && !Intrinsics.d(nxkVar, jxkVar) && !Intrinsics.d(nxkVar, kxk.a) && !Intrinsics.d(nxkVar, lxk.a) && !Intrinsics.d(nxkVar, mxk.a)) {
                        throw vz1.i((oq5) hq5Var19, -1864226641, false);
                    }
                    oq5 oq5Var26 = (oq5) hq5Var19;
                    oq5Var26.Z(-1864195954);
                    cxb.b(0, oq5Var26);
                    oq5Var26.p(false);
                }
                return Unit.a;
            case 19:
                nxk nxkVar2 = (nxk) obj;
                hq5 hq5Var20 = (hq5) obj2;
                ((Integer) obj3).intValue();
                nxkVar2.getClass();
                if (Intrinsics.d(nxkVar2, fxkVar)) {
                    oq5 oq5Var27 = (oq5) hq5Var20;
                    oq5Var27.Z(1871058221);
                    if (z) {
                        oq5Var27.Z(1871127320);
                        ywf.h(0, oq5Var27);
                        oq5Var27.p(false);
                    } else {
                        oq5Var27.Z(1871250204);
                        cxb.b(0, oq5Var27);
                        oq5Var27.p(false);
                    }
                    oq5Var27.p(false);
                } else {
                    if (!Intrinsics.d(nxkVar2, dxkVar) && !Intrinsics.d(nxkVar2, exkVar) && !Intrinsics.d(nxkVar2, gxkVar) && !Intrinsics.d(nxkVar2, hxkVar) && !Intrinsics.d(nxkVar2, ixkVar) && !Intrinsics.d(nxkVar2, jxkVar) && !Intrinsics.d(nxkVar2, kxk.a) && !Intrinsics.d(nxkVar2, lxk.a) && !Intrinsics.d(nxkVar2, mxk.a)) {
                        throw vz1.i((oq5) hq5Var20, 337449359, false);
                    }
                    oq5 oq5Var28 = (oq5) hq5Var20;
                    oq5Var28.Z(337480046);
                    cxb.b(0, oq5Var28);
                    oq5Var28.p(false);
                }
                return Unit.a;
            case 20:
                dh3 dh3Var2 = (dh3) obj;
                hq5 hq5Var21 = (hq5) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                dh3Var2.getClass();
                if ((intValue19 & 6) == 0) {
                    intValue19 |= ((oq5) hq5Var21).f(dh3Var2) ? 4 : 2;
                }
                oq5 oq5Var29 = (oq5) hq5Var21;
                if (oq5Var29.P(intValue19 & 1, (intValue19 & 19) != 18)) {
                    ivf.l(this.b, dh3Var2.a(d.r(vciVar, 190), b2c.h), null, oq5Var29, 0, 4);
                } else {
                    oq5Var29.S();
                }
                return Unit.a;
            case 21:
                hq5 hq5Var22 = (hq5) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                oq5 oq5Var30 = (oq5) hq5Var22;
                if (oq5Var30.P(intValue20 & 1, (intValue20 & 17) != 16)) {
                    yci u2 = d.u(vciVar, b2c.k, true);
                    ta5 a4 = sa5.a(qx0.c, b2c.n, oq5Var30, 0);
                    int i5 = oq5Var30.P;
                    androidx.compose.runtime.internal.a l4 = oq5Var30.l();
                    yci H4 = vnj.H(oq5Var30, u2);
                    xp5.T.getClass();
                    grb grbVar3 = wp5.b;
                    oq5Var30.d0();
                    if (oq5Var30.O) {
                        oq5Var30.k(grbVar3);
                    } else {
                        oq5Var30.n0();
                    }
                    g0g.U(oq5Var30, a4, wp5.f);
                    g0g.U(oq5Var30, l4, wp5.e);
                    kb5 kb5Var6 = wp5.g;
                    if (oq5Var30.O || !Intrinsics.d(oq5Var30.K(), Integer.valueOf(i5))) {
                        ouj.x(i5, oq5Var30, i5, kb5Var6);
                    }
                    g0g.U(oq5Var30, H4, wp5.d);
                    yci r = d.r(vciVar, 160);
                    boolean z3 = this.b;
                    ivf.l(z3, r, null, oq5Var30, 48, 4);
                    u1g.l(oq5Var30, d.e(vciVar, 8));
                    ivf.l(z3, d.r(vciVar, 100), null, oq5Var30, 48, 4);
                    oq5Var30.p(true);
                } else {
                    oq5Var30.S();
                }
                return Unit.a;
            case 22:
                hq5 hq5Var23 = (hq5) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                oq5 oq5Var31 = (oq5) hq5Var23;
                if (oq5Var31.P(intValue21 & 1, (intValue21 & 17) != 16)) {
                    ivf.k(0, 0, oq5Var31, xp3.u(d.b(d.r(vciVar, 126), 1.0f), ugo.a), z);
                } else {
                    oq5Var31.S();
                }
                return Unit.a;
            case 23:
                dh3 dh3Var3 = (dh3) obj;
                hq5 hq5Var24 = (hq5) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                dh3Var3.getClass();
                if ((intValue22 & 6) == 0) {
                    intValue22 |= ((oq5) hq5Var24).f(dh3Var3) ? 4 : 2;
                }
                oq5 oq5Var32 = (oq5) hq5Var24;
                if (oq5Var32.P(intValue22 & 1, (intValue22 & 19) != 18)) {
                    ivf.k(0, 0, oq5Var32, dh3Var3.a(xp3.u(d.b(androidx.compose.foundation.layout.a.d(vciVar, 1.0f), 1.0f), ugo.a), b2c.g), z);
                } else {
                    oq5Var32.S();
                }
                return Unit.a;
            case 24:
                mfh mfhVar = (mfh) obj;
                ffh ffhVar = (ffh) obj2;
                mfhVar.getClass();
                ffhVar.getClass();
                ksk M = ffhVar.M(((ga6) obj3).a);
                int i6 = M.b;
                return mfh.m0(mfhVar, M.a, i6, new b4k(z ? i6 / 4 : 0, 2, M));
            case 25:
                String str = (String) obj;
                hq5 hq5Var25 = (hq5) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                if ((intValue23 & 6) == 0) {
                    intValue23 |= ((oq5) hq5Var25).f(str) ? 4 : 2;
                }
                oq5 oq5Var33 = (oq5) hq5Var25;
                if (oq5Var33.P(intValue23 & 1, (intValue23 & 19) != 18)) {
                    wdg.i(intValue23 & 14, oq5Var33, null, str, z);
                } else {
                    oq5Var33.S();
                }
                return Unit.a;
            case 26:
                zkn zknVar = (zkn) obj;
                hq5 hq5Var26 = (hq5) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                zknVar.getClass();
                if ((intValue24 & 6) == 0) {
                    intValue24 |= ((oq5) hq5Var26).f(zknVar) ? 4 : 2;
                }
                oq5 oq5Var34 = (oq5) hq5Var26;
                if (oq5Var34.P(intValue24 & 1, (intValue24 & 19) != 18)) {
                    bs1 k = zknVar.b.k();
                    if (k instanceof as1) {
                        oq5Var34.Z(-1791740657);
                        irf.r(((as1) k).a, null, vci.a, zknVar.d, zknVar.e, 0.0f, null, oq5Var34, 432, 96);
                        oq5Var34.p(false);
                    } else {
                        if (!Intrinsics.d(k, xr1.a) && !(k instanceof zr1) && !(k instanceof yr1)) {
                            throw vz1.i(oq5Var34, 773482639, false);
                        }
                        oq5Var34.Z(-1791285019);
                        wdg.k(0, 1, oq5Var34, null, z);
                        oq5Var34.p(false);
                    }
                } else {
                    oq5Var34.S();
                }
                return Unit.a;
            default:
                c cVar = (c) obj;
                hq5 hq5Var27 = (hq5) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                cVar.getClass();
                if ((intValue25 & 6) == 0) {
                    intValue25 |= ((oq5) hq5Var27).f(cVar) ? 4 : 2;
                }
                if ((intValue25 & 19) == 18) {
                    oq5 oq5Var35 = (oq5) hq5Var27;
                    if (oq5Var35.z()) {
                        oq5Var35.S();
                        return Unit.a;
                    }
                }
                float f2 = l86.a;
                float max = Math.max(f2, szf.Z(hq5Var27));
                vci vciVar2 = vci.a;
                yci e = d.e(vciVar2, max);
                nho a5 = lho.a(qx0.a, b2c.l, hq5Var27, 48);
                oq5 oq5Var36 = (oq5) hq5Var27;
                int i7 = oq5Var36.P;
                androidx.compose.runtime.internal.a l5 = oq5Var36.l();
                yci H5 = vnj.H(hq5Var27, e);
                xp5.T.getClass();
                grb grbVar4 = wp5.b;
                oq5Var36.d0();
                if (oq5Var36.O) {
                    oq5Var36.k(grbVar4);
                } else {
                    oq5Var36.n0();
                }
                g0g.U(hq5Var27, a5, wp5.f);
                g0g.U(hq5Var27, l5, wp5.e);
                kb5 kb5Var7 = wp5.g;
                if (oq5Var36.O || !Intrinsics.d(oq5Var36.K(), Integer.valueOf(i7))) {
                    ouj.x(i7, oq5Var36, i7, kb5Var7);
                }
                g0g.U(hq5Var27, H5, wp5.d);
                if (Float.compare(cVar.d(), ows.a) >= 0) {
                    oq5Var36.Z(77652453);
                    yci m3 = d.m(androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, 0.0f, l86.b, 0.0f, 11), f2);
                    if (z) {
                        oq5Var36.Z(-828771933);
                        tgoVar = o5g.E(hq5Var27);
                        oq5Var36.p(false);
                    } else {
                        oq5Var36.Z(-828771141);
                        oq5Var36.p(false);
                        tgoVar = ugo.a;
                    }
                    pm0.c(xp3.u(m3, tgoVar), hq5Var27, 0);
                } else {
                    oq5Var36.Z(72076018);
                }
                oq5Var36.p(false);
                if (1.0f <= 0.0d) {
                    qme.a("invalid weight; must be greater than zero");
                }
                szf.r(new LayoutWeightElement(true, 1.0f), hq5Var27, 0);
                oq5Var36.p(true);
                return Unit.a;
        }
    }

    public /* synthetic */ xu0(int i, boolean z) {
        this.a = i;
        this.b = z;
    }
}
