package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class rsk implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ wn5 b;
    public final /* synthetic */ wn5 c;

    public /* synthetic */ rsk(wn5 wn5Var, wn5 wn5Var2) {
        this.b = wn5Var;
        this.c = wn5Var2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        wn5 wn5Var = this.c;
        wn5 wn5Var2 = this.b;
        hq5 hq5Var = (hq5) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                avf.f(wn5Var2, wn5Var, hq5Var, rvf.R(55));
                break;
            default:
                if ((num.intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                vci vciVar = vci.a;
                yci d = d.d(vciVar, 1.0f);
                ta5 a = sa5.a(qx0.c, b2c.n, hq5Var, 0);
                oq5 oq5Var2 = (oq5) hq5Var;
                int i2 = oq5Var2.P;
                a l = oq5Var2.l();
                yci H = vnj.H(hq5Var, d);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var2.d0();
                if (oq5Var2.O) {
                    oq5Var2.k(grbVar);
                } else {
                    oq5Var2.n0();
                }
                g0g.U(hq5Var, a, wp5.f);
                g0g.U(hq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i2))) {
                    ouj.x(i2, oq5Var2, i2, kb5Var);
                }
                g0g.U(hq5Var, H, wp5.d);
                h6g h6gVar = nu0.a;
                h6g h6gVar2 = h6g.c;
                xcs.a(nu0.j(), ild.C(-1918545400, new y61(wn5Var2, 24), hq5Var), hq5Var, 48);
                u1g.l(hq5Var, d.e(vciVar, mu0.a));
                xcs.a(nu0.i(), ild.C(1569671551, new y61(wn5Var, 25), hq5Var), hq5Var, 48);
                oq5Var2.p(true);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ rsk(wn5 wn5Var, wn5 wn5Var2, int i) {
        this.b = wn5Var;
        this.c = wn5Var2;
    }
}
