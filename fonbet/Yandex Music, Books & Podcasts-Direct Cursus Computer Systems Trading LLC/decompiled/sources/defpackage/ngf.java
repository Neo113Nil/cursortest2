package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class ngf implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o0k b;
    public final /* synthetic */ wn5 c;

    public /* synthetic */ ngf(wn5 wn5Var, o0k o0kVar) {
        this.a = 0;
        this.c = wn5Var;
        this.b = o0kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        vci vciVar = vci.a;
        wn5 wn5Var = this.c;
        o0k o0kVar = this.b;
        int i2 = 3;
        hq5 hq5Var = (hq5) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    wn5Var.invoke(o0kVar, oq5Var, 0);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                if ((intValue & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                yci l = a.l(vciVar, o0kVar);
                kfh d = ug3.d(b2c.f, false);
                oq5 oq5Var3 = (oq5) hq5Var;
                int i3 = oq5Var3.P;
                androidx.compose.runtime.internal.a l2 = oq5Var3.l();
                yci H = vnj.H(hq5Var, l);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var3.d0();
                if (oq5Var3.O) {
                    oq5Var3.k(grbVar);
                } else {
                    oq5Var3.n0();
                }
                g0g.U(hq5Var, d, wp5.f);
                g0g.U(hq5Var, l2, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i3))) {
                    ouj.x(i3, oq5Var3, i3, kb5Var);
                }
                g0g.U(hq5Var, H, wp5.d);
                wn5Var.invoke(b.a, hq5Var, 6);
                oq5Var3.p(true);
                break;
            case 2:
                if ((intValue & 3) == 2) {
                    oq5 oq5Var4 = (oq5) hq5Var;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        break;
                    }
                }
                h6g h6gVar = nu0.a;
                h6g h6gVar2 = h6g.c;
                xcs.a(nu0.j(), ild.C(1164750758, new ngf(o0kVar, wn5Var, i2), hq5Var), hq5Var, 48);
            default:
                if ((intValue & 3) == 2) {
                    oq5 oq5Var5 = (oq5) hq5Var;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        break;
                    }
                }
                yci l3 = a.l(vciVar, o0kVar);
                nho a = lho.a(qx0.a, b2c.l, hq5Var, 54);
                oq5 oq5Var6 = (oq5) hq5Var;
                int i4 = oq5Var6.P;
                androidx.compose.runtime.internal.a l4 = oq5Var6.l();
                yci H2 = vnj.H(hq5Var, l3);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var6.d0();
                if (oq5Var6.O) {
                    oq5Var6.k(grbVar2);
                } else {
                    oq5Var6.n0();
                }
                g0g.U(hq5Var, a, wp5.f);
                g0g.U(hq5Var, l4, wp5.e);
                kb5 kb5Var2 = wp5.g;
                if (oq5Var6.O || !Intrinsics.d(oq5Var6.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var6, i4, kb5Var2);
                }
                g0g.U(hq5Var, H2, wp5.d);
                wn5Var.invoke(qho.a, hq5Var, 6);
                oq5Var6.p(true);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ngf(o0k o0kVar, wn5 wn5Var, int i) {
        this.a = i;
        this.b = o0kVar;
        this.c = wn5Var;
    }
}
