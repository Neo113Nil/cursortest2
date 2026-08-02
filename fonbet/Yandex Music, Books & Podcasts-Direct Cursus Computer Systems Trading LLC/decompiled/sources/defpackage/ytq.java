package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class ytq implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ytq(o0k o0kVar, wn5 wn5Var, float f, wn5 wn5Var2, Function2 function2) {
        this.c = o0kVar;
        this.d = wn5Var;
        this.b = f;
        this.e = wn5Var2;
        this.f = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                kuq.a((Function1) this.c, (gq4) this.d, (fq4) this.e, (aqi) this.f, this.b, (hq5) obj, rvf.R(3073));
                break;
            default:
                o0k o0kVar = (o0k) this.c;
                wn5 wn5Var = (wn5) this.d;
                wn5 wn5Var2 = (wn5) this.e;
                Function2 function2 = (Function2) this.f;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                hz2 hz2Var = b2c.l;
                vci vciVar = vci.a;
                yci l = a.l(vciVar, o0kVar);
                nho a = lho.a(qx0.a, hz2Var, hq5Var, 48);
                oq5 oq5Var2 = (oq5) hq5Var;
                int i = oq5Var2.P;
                androidx.compose.runtime.internal.a l2 = oq5Var2.l();
                yci H = vnj.H(hq5Var, l);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var2.d0();
                if (oq5Var2.O) {
                    oq5Var2.k(grbVar);
                } else {
                    oq5Var2.n0();
                }
                kb5 kb5Var = wp5.f;
                g0g.U(hq5Var, a, kb5Var);
                kb5 kb5Var2 = wp5.e;
                g0g.U(hq5Var, l2, kb5Var2);
                kb5 kb5Var3 = wp5.g;
                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i))) {
                    ouj.x(i, oq5Var2, i, kb5Var3);
                }
                kb5 kb5Var4 = wp5.d;
                g0g.U(hq5Var, H, kb5Var4);
                wn5Var.invoke(hq5Var, 0);
                if (1.0f <= 0.0d) {
                    qme.a("invalid weight; must be greater than zero");
                }
                yci q = a.q(new LayoutWeightElement(true, 1.0f), this.b, 0.0f, 0.0f, 0.0f, 14);
                kfh d = ug3.d(b2c.b, false);
                int i2 = oq5Var2.P;
                androidx.compose.runtime.internal.a l3 = oq5Var2.l();
                yci H2 = vnj.H(hq5Var, q);
                oq5Var2.d0();
                if (oq5Var2.O) {
                    oq5Var2.k(grbVar);
                } else {
                    oq5Var2.n0();
                }
                g0g.U(hq5Var, d, kb5Var);
                g0g.U(hq5Var, l3, kb5Var2);
                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i2))) {
                    ouj.x(i2, oq5Var2, i2, kb5Var3);
                }
                g0g.U(hq5Var, H2, kb5Var4);
                wn5Var2.invoke(hq5Var, 0);
                oq5Var2.p(true);
                kfh d2 = ug3.d(b2c.g, false);
                int i3 = oq5Var2.P;
                androidx.compose.runtime.internal.a l4 = oq5Var2.l();
                yci H3 = vnj.H(hq5Var, vciVar);
                oq5Var2.d0();
                if (oq5Var2.O) {
                    oq5Var2.k(grbVar);
                } else {
                    oq5Var2.n0();
                }
                g0g.U(hq5Var, d2, kb5Var);
                g0g.U(hq5Var, l4, kb5Var2);
                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i3))) {
                    ouj.x(i3, oq5Var2, i3, kb5Var3);
                }
                g0g.U(hq5Var, H3, kb5Var4);
                zwf.i(((dq0) ((oq5) hq5Var).j(eq0.a)).a.c, ild.C(-1267571313, new im0(function2, 11), hq5Var), hq5Var, 48);
                oq5Var2.p(true);
                oq5Var2.p(true);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ytq(Function1 function1, gq4 gq4Var, fq4 fq4Var, aqi aqiVar, float f, int i) {
        this.c = function1;
        this.d = gq4Var;
        this.e = fq4Var;
        this.f = aqiVar;
        this.b = f;
    }
}
