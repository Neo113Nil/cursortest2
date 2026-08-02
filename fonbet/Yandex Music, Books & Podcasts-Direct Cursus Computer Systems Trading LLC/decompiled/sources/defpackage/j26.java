package defpackage;

import android.view.View;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.a;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class j26 implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn5 b;

    public /* synthetic */ j26(wn5 wn5Var, int i) {
        this.a = i;
        this.b = wn5Var;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        kjn kjnVar = gq5.a;
        vci vciVar = vci.a;
        wn5 wn5Var = this.b;
        switch (i) {
            case 0:
                o0k o0kVar = (o0k) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                o0kVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).f(o0kVar) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                wn5Var.invoke(o0kVar, hq5Var, Integer.valueOf(intValue & 14));
                return Unit.a;
            case 1:
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                if ((intValue2 & 17) == 16) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        return Unit.a;
                    }
                }
                wn5Var.invoke(hq5Var2, 6);
                return Unit.a;
            case 2:
                o0k o0kVar2 = (o0k) obj;
                hq5 hq5Var3 = (hq5) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                o0kVar2.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((oq5) hq5Var3).f(o0kVar2) ? 4 : 2;
                }
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(intValue3 & 1, (intValue3 & 19) != 18)) {
                    wn5Var.invoke(o0kVar2, oq5Var3, Integer.valueOf(intValue3 & 14));
                } else {
                    oq5Var3.S();
                }
                return Unit.a;
            case 3:
                c cVar = (c) obj;
                hq5 hq5Var4 = (hq5) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                cVar.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((oq5) hq5Var4).f(cVar) ? 4 : 2;
                }
                if ((intValue4 & 19) == 18) {
                    oq5 oq5Var4 = (oq5) hq5Var4;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        return Unit.a;
                    }
                }
                yci a = a.a(bfg.x(vciVar, bfg.C(hq5Var4), false, 14), "header_buttons");
                oq5 oq5Var5 = (oq5) hq5Var4;
                Object K = oq5Var5.K();
                if (K == kjnVar) {
                    K = new rua(26);
                    oq5Var5.k0(K);
                }
                yci b = nfp.b(a, false, (Function1) K);
                boolean z = (intValue4 & 14) == 4;
                Object K2 = oq5Var5.K();
                if (z || K2 == kjnVar) {
                    K2 = new n5b(1, cVar);
                    oq5Var5.k0(K2);
                }
                kfh kfhVar = (kfh) K2;
                int i2 = oq5Var5.P;
                androidx.compose.runtime.internal.a l = oq5Var5.l();
                yci H = vnj.H(oq5Var5, b);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var5.d0();
                if (oq5Var5.O) {
                    oq5Var5.k(grbVar);
                } else {
                    oq5Var5.n0();
                }
                g0g.U(oq5Var5, kfhVar, wp5.f);
                g0g.U(oq5Var5, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var5.O || !Intrinsics.d(oq5Var5.K(), Integer.valueOf(i2))) {
                    ouj.x(i2, oq5Var5, i2, kb5Var);
                }
                g0g.U(oq5Var5, H, wp5.d);
                eta.l(0, wn5Var, oq5Var5, true);
                return Unit.a;
            case 4:
                zkn zknVar = (zkn) obj;
                hq5 hq5Var5 = (hq5) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                zknVar.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((oq5) hq5Var5).f(zknVar) ? 4 : 2;
                }
                if ((intValue5 & 19) == 18) {
                    oq5 oq5Var6 = (oq5) hq5Var5;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        return Unit.a;
                    }
                }
                bs1 k = zknVar.b.k();
                if (k instanceof as1) {
                    oq5 oq5Var7 = (oq5) hq5Var5;
                    oq5Var7.Z(-65141523);
                    irf.r(((as1) k).a, null, null, zknVar.d, zknVar.e, 0.0f, null, oq5Var7, 48, 100);
                    oq5Var7.p(false);
                } else if ((k instanceof xr1) || (k instanceof zr1)) {
                    oq5 oq5Var8 = (oq5) hq5Var5;
                    oq5Var8.Z(-64776963);
                    swf.e(0, 1, oq5Var8, null);
                    oq5Var8.p(false);
                } else {
                    if (!(k instanceof yr1)) {
                        throw vz1.i((oq5) hq5Var5, 552084736, false);
                    }
                    oq5 oq5Var9 = (oq5) hq5Var5;
                    oq5Var9.Z(-64664278);
                    wn5Var.invoke(oq5Var9, 0);
                    oq5Var9.p(false);
                }
                return Unit.a;
            case 5:
                ua5 ua5Var = (ua5) obj;
                hq5 hq5Var6 = (hq5) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ua5Var.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((oq5) hq5Var6).f(ua5Var) ? 4 : 2;
                }
                if ((intValue6 & 19) == 18) {
                    oq5 oq5Var10 = (oq5) hq5Var6;
                    if (oq5Var10.z()) {
                        oq5Var10.S();
                        return Unit.a;
                    }
                }
                wn5Var.invoke(ua5Var, hq5Var6, Integer.valueOf(intValue6 & 14));
                return Unit.a;
            case 6:
                hq5 hq5Var7 = (hq5) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                if ((intValue7 & 17) == 16) {
                    oq5 oq5Var11 = (oq5) hq5Var7;
                    if (oq5Var11.z()) {
                        oq5Var11.S();
                        return Unit.a;
                    }
                }
                h6g h6gVar = nu0.a;
                h6g h6gVar2 = h6g.c;
                xcs.a(nu0.j(), ild.C(-1165669607, new y61(wn5Var, 21), hq5Var7), hq5Var7, 48);
                return Unit.a;
            case 7:
                dh3 dh3Var = (dh3) obj;
                hq5 hq5Var8 = (hq5) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                dh3Var.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((oq5) hq5Var8).f(dh3Var) ? 4 : 2;
                }
                if ((intValue8 & 19) == 18) {
                    oq5 oq5Var12 = (oq5) hq5Var8;
                    if (oq5Var12.z()) {
                        oq5Var12.S();
                        return Unit.a;
                    }
                }
                wn5Var.invoke(dh3Var, hq5Var8, Integer.valueOf(intValue8 & 14));
                return Unit.a;
            case 8:
                dh3 dh3Var2 = (dh3) obj;
                hq5 hq5Var9 = (hq5) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                dh3Var2.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((oq5) hq5Var9).f(dh3Var2) ? 4 : 2;
                }
                if ((intValue9 & 19) == 18) {
                    oq5 oq5Var13 = (oq5) hq5Var9;
                    if (oq5Var13.z()) {
                        oq5Var13.S();
                        return Unit.a;
                    }
                }
                wn5Var.invoke(dh3Var2, hq5Var9, Integer.valueOf(intValue9 & 14));
                return Unit.a;
            case 9:
                dh3 dh3Var3 = (dh3) obj;
                hq5 hq5Var10 = (hq5) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                dh3Var3.getClass();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= ((oq5) hq5Var10).f(dh3Var3) ? 4 : 2;
                }
                if ((intValue10 & 19) == 18) {
                    oq5 oq5Var14 = (oq5) hq5Var10;
                    if (oq5Var14.z()) {
                        oq5Var14.S();
                        return Unit.a;
                    }
                }
                wn5Var.invoke(dh3Var3, hq5Var10, Integer.valueOf(intValue10 & 14));
                return Unit.a;
            case 10:
                dh3 dh3Var4 = (dh3) obj;
                hq5 hq5Var11 = (hq5) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                dh3Var4.getClass();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((oq5) hq5Var11).f(dh3Var4) ? 4 : 2;
                }
                if ((intValue11 & 19) == 18) {
                    oq5 oq5Var15 = (oq5) hq5Var11;
                    if (oq5Var15.z()) {
                        oq5Var15.S();
                        return Unit.a;
                    }
                }
                wn5Var.invoke(dh3Var4, hq5Var11, Integer.valueOf(intValue11 & 14));
                return Unit.a;
            case 11:
                hq5 hq5Var12 = (hq5) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                if ((intValue12 & 17) == 16) {
                    oq5 oq5Var16 = (oq5) hq5Var12;
                    if (oq5Var16.z()) {
                        oq5Var16.S();
                        return Unit.a;
                    }
                }
                h6g h6gVar3 = nu0.a;
                h6g h6gVar4 = h6g.c;
                xcs.a(nu0.j(), ild.C(-372408793, new y61(wn5Var, 20), hq5Var12), hq5Var12, 48);
                return Unit.a;
            case 12:
                hq5 hq5Var13 = (hq5) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                if ((intValue13 & 17) == 16) {
                    oq5 oq5Var17 = (oq5) hq5Var13;
                    if (oq5Var17.z()) {
                        oq5Var17.S();
                        return Unit.a;
                    }
                }
                yci o = androidx.compose.foundation.layout.a.o(vciVar, 0.0f, mu0.b, 1);
                kfh d = ug3.d(b2c.b, false);
                oq5 oq5Var18 = (oq5) hq5Var13;
                int i3 = oq5Var18.P;
                androidx.compose.runtime.internal.a l2 = oq5Var18.l();
                yci H2 = vnj.H(hq5Var13, o);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var18.d0();
                if (oq5Var18.O) {
                    oq5Var18.k(grbVar2);
                } else {
                    oq5Var18.n0();
                }
                g0g.U(hq5Var13, d, wp5.f);
                g0g.U(hq5Var13, l2, wp5.e);
                kb5 kb5Var2 = wp5.g;
                if (oq5Var18.O || !Intrinsics.d(oq5Var18.K(), Integer.valueOf(i3))) {
                    ouj.x(i3, oq5Var18, i3, kb5Var2);
                }
                g0g.U(hq5Var13, H2, wp5.d);
                wn5Var.invoke(b.a, hq5Var13, 6);
                oq5Var18.p(true);
                return Unit.a;
            case 13:
                dh3 dh3Var5 = (dh3) obj;
                hq5 hq5Var14 = (hq5) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                dh3Var5.getClass();
                if ((intValue14 & 6) == 0) {
                    intValue14 |= ((oq5) hq5Var14).f(dh3Var5) ? 4 : 2;
                }
                if ((intValue14 & 19) == 18) {
                    oq5 oq5Var19 = (oq5) hq5Var14;
                    if (oq5Var19.z()) {
                        oq5Var19.S();
                        return Unit.a;
                    }
                }
                wn5Var.invoke(dh3Var5, hq5Var14, Integer.valueOf(intValue14 & 14));
                return Unit.a;
            case 14:
                hq5 hq5Var15 = (hq5) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                oq5 oq5Var20 = (oq5) hq5Var15;
                if (oq5Var20.P(intValue15 & 1, (intValue15 & 17) != 16)) {
                    wn5Var.invoke(oq5Var20, 0);
                } else {
                    oq5Var20.S();
                }
                return Unit.a;
            case 15:
                hq5 hq5Var16 = (hq5) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((ua5) obj).getClass();
                oq5 oq5Var21 = (oq5) hq5Var16;
                if (oq5Var21.P(intValue16 & 1, (intValue16 & 17) != 16)) {
                    ixf.a(wn5Var, oq5Var21, 0);
                } else {
                    oq5Var21.S();
                }
                return Unit.a;
            case 16:
                o0k o0kVar3 = (o0k) obj;
                hq5 hq5Var17 = (hq5) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                o0kVar3.getClass();
                if ((intValue17 & 6) == 0) {
                    intValue17 |= ((oq5) hq5Var17).f(o0kVar3) ? 4 : 2;
                }
                if ((intValue17 & 19) == 18) {
                    oq5 oq5Var22 = (oq5) hq5Var17;
                    if (oq5Var22.z()) {
                        oq5Var22.S();
                        return Unit.a;
                    }
                }
                wn5Var.invoke(o0kVar3, hq5Var17, Integer.valueOf(intValue17 & 14));
                return Unit.a;
            default:
                hq5 hq5Var18 = (hq5) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((ua5) obj).getClass();
                if ((intValue18 & 17) == 16) {
                    oq5 oq5Var23 = (oq5) hq5Var18;
                    if (oq5Var23.z()) {
                        oq5Var23.S();
                        return Unit.a;
                    }
                }
                yci d2 = d.d(vciVar, 1.0f);
                ta5 a2 = sa5.a(qx0.c, b2c.n, hq5Var18, 0);
                oq5 oq5Var24 = (oq5) hq5Var18;
                int i4 = oq5Var24.P;
                androidx.compose.runtime.internal.a l3 = oq5Var24.l();
                yci H3 = vnj.H(hq5Var18, d2);
                xp5.T.getClass();
                grb grbVar3 = wp5.b;
                oq5Var24.d0();
                if (oq5Var24.O) {
                    oq5Var24.k(grbVar3);
                } else {
                    oq5Var24.n0();
                }
                kb5 kb5Var3 = wp5.f;
                g0g.U(hq5Var18, a2, kb5Var3);
                kb5 kb5Var4 = wp5.e;
                g0g.U(hq5Var18, l3, kb5Var4);
                kb5 kb5Var5 = wp5.g;
                if (oq5Var24.O || !Intrinsics.d(oq5Var24.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var24, i4, kb5Var5);
                }
                kb5 kb5Var6 = wp5.d;
                g0g.U(hq5Var18, H3, kb5Var6);
                u1g.l(hq5Var18, d.e(vciVar, 8));
                float f = 32;
                yci b2 = androidx.compose.foundation.a.b(vciVar, ((i95) ((oq5) hq5Var18).j(j95.a)).n, ugo.c(f, f));
                WeakHashMap weakHashMap = rqv.w;
                yci a3 = sqv.a(b2, new n5g(z7l.h(hq5Var18).g, 32));
                kfh d3 = ug3.d(b2c.b, false);
                int i5 = oq5Var24.P;
                androidx.compose.runtime.internal.a l4 = oq5Var24.l();
                yci H4 = vnj.H(hq5Var18, a3);
                oq5Var24.d0();
                if (oq5Var24.O) {
                    oq5Var24.k(grbVar3);
                } else {
                    oq5Var24.n0();
                }
                g0g.U(hq5Var18, d3, kb5Var3);
                g0g.U(hq5Var18, l4, kb5Var4);
                if (oq5Var24.O || !Intrinsics.d(oq5Var24.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var24, i5, kb5Var5);
                }
                g0g.U(hq5Var18, H4, kb5Var6);
                View view = (View) oq5Var24.j(AndroidCompositionLocals_androidKt.f);
                boolean z2 = ((com.yandex.passport.common.ui.compose.theme.b) oq5Var24.j(com.yandex.passport.common.ui.compose.theme.d.d)).a;
                boolean h = oq5Var24.h(view) | oq5Var24.g(z2);
                Object K3 = oq5Var24.K();
                if (h || K3 == kjnVar) {
                    K3 = new ps(view, z2, 11);
                    oq5Var24.k0(K3);
                }
                gld.D((Function0) K3, hq5Var18);
                wn5Var.invoke(hq5Var18, 0);
                oq5Var24.p(true);
                oq5Var24.p(true);
                return Unit.a;
        }
    }
}
