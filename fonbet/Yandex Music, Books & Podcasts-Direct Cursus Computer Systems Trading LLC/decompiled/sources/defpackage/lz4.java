package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class lz4 implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ lz4(float f, wn5 wn5Var, otb otbVar, wn5 wn5Var2, wn5 wn5Var3, wn5 wn5Var4) {
        this.a = 3;
        this.b = f;
        this.c = wn5Var;
        this.d = otbVar;
        this.e = wn5Var2;
        this.f = wn5Var3;
        this.g = wn5Var4;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        vci vciVar = vci.a;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        switch (i) {
            case 0:
                jz4 jz4Var = (jz4) obj8;
                aqi aqiVar = (aqi) obj7;
                fvf fvfVar = (fvf) obj6;
                bz4 bz4Var = (bz4) obj5;
                qnq qnqVar = (qnq) obj4;
                o0k o0kVar = (o0k) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                o0kVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).f(o0kVar) ? 4 : 2;
                }
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
                    rz4 rz4Var = (rz4) gld.O(jz4Var.c, oq5Var).getValue();
                    if (rz4Var instanceof qz4) {
                        oq5Var.Z(-434781830);
                        pm0.a(null, ild.C(1480795162, new mz4(this.b, aqiVar, fvfVar, jz4Var, (qz4) rz4Var, bz4Var, qnqVar), oq5Var), oq5Var, 48, 1);
                        oq5Var.p(false);
                    } else if (Intrinsics.d(rz4Var, pz4.a)) {
                        oq5Var.Z(-434142517);
                        c3x.m(0, 2, 0L, oq5Var, d.x(d.c(a.l(vciVar, o0kVar), 1.0f), b2c.f, 2));
                        oq5Var.p(false);
                    } else {
                        if (!Intrinsics.d(rz4Var, oz4.a)) {
                            throw vz1.i(oq5Var, 401613370, false);
                        }
                        oq5Var.Z(-433837353);
                        oq5Var.p(false);
                    }
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            case 1:
                int i2 = 2;
                String str = (String) obj8;
                String str2 = (String) obj7;
                String str3 = (String) obj6;
                hh6 hh6Var = (hh6) obj5;
                List list = (List) obj4;
                oho ohoVar = (oho) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ohoVar.getClass();
                if ((intValue2 & 6) == 0) {
                    if (((oq5) hq5Var2).f(ohoVar)) {
                        i2 = 4;
                    }
                    intValue2 |= i2;
                }
                if ((intValue2 & 19) == 18) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        return Unit.a;
                    }
                }
                leu.h(ohoVar, str, this.b, ild.C(-251548073, new rg6(0, list), hq5Var2), hq5Var2, (intValue2 & 14) | 3072);
                leu.i(R.drawable.ic_my_shelf_background_64, str2, str3, hh6Var, hq5Var2, 0);
                return Unit.a;
            case 2:
                String str4 = (String) obj8;
                String str5 = (String) obj7;
                String str6 = (String) obj6;
                hh6 hh6Var2 = (hh6) obj5;
                String str7 = (String) obj4;
                oho ohoVar2 = (oho) obj;
                int i3 = 2;
                hq5 hq5Var3 = (hq5) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ohoVar2.getClass();
                if ((intValue3 & 6) == 0) {
                    if (((oq5) hq5Var3).f(ohoVar2)) {
                        i3 = 4;
                    }
                    intValue3 |= i3;
                }
                if ((intValue3 & 19) == 18) {
                    oq5 oq5Var3 = (oq5) hq5Var3;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        return Unit.a;
                    }
                }
                leu.h(ohoVar2, str4, this.b, ild.C(-1258615490, new rg6(1, str7), hq5Var3), hq5Var3, (intValue3 & 14) | 3072);
                leu.i(R.drawable.ic_my_shelf_episodes_background_64, str5, str6, hh6Var2, hq5Var3, 0);
                return Unit.a;
            default:
                wn5 wn5Var = (wn5) obj8;
                otb otbVar = (otb) obj7;
                wn5 wn5Var2 = (wn5) obj6;
                wn5 wn5Var3 = (wn5) obj5;
                wn5 wn5Var4 = (wn5) obj4;
                hq5 hq5Var4 = (hq5) obj2;
                ((Integer) obj3).getClass();
                ((am0) obj).getClass();
                float f = this.b;
                yci p = a.p(vciVar, f, 16, f, 4);
                ta5 a = sa5.a(qx0.c, b2c.n, hq5Var4, 0);
                oq5 oq5Var4 = (oq5) hq5Var4;
                int i4 = oq5Var4.P;
                androidx.compose.runtime.internal.a l = oq5Var4.l();
                yci H = vnj.H(hq5Var4, p);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var4.d0();
                if (oq5Var4.O) {
                    oq5Var4.k(grbVar);
                } else {
                    oq5Var4.n0();
                }
                kb5 kb5Var = wp5.f;
                g0g.U(hq5Var4, a, kb5Var);
                kb5 kb5Var2 = wp5.e;
                g0g.U(hq5Var4, l, kb5Var2);
                kb5 kb5Var3 = wp5.g;
                if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var4, i4, kb5Var3);
                }
                kb5 kb5Var4 = wp5.d;
                g0g.U(hq5Var4, H, kb5Var4);
                wn5Var.invoke(otbVar, hq5Var4, 0);
                wn5Var2.invoke(hq5Var4, 0);
                if (1.0f <= 0.0d) {
                    qme.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, 1.0f);
                kfh d = ug3.d(b2c.f, false);
                int i5 = oq5Var4.P;
                androidx.compose.runtime.internal.a l2 = oq5Var4.l();
                yci H2 = vnj.H(hq5Var4, layoutWeightElement);
                oq5Var4.d0();
                if (oq5Var4.O) {
                    oq5Var4.k(grbVar);
                } else {
                    oq5Var4.n0();
                }
                g0g.U(hq5Var4, d, kb5Var);
                g0g.U(hq5Var4, l2, kb5Var2);
                if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var4, i5, kb5Var3);
                }
                g0g.U(hq5Var4, H2, kb5Var4);
                wn5Var4.invoke(otbVar, hq5Var4, 0);
                oq5Var4.p(true);
                wn5Var3.invoke(otbVar, hq5Var4, 0);
                oq5Var4.p(true);
                return Unit.a;
        }
    }

    public /* synthetic */ lz4(Object obj, float f, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.c = obj;
        this.b = f;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }
}
