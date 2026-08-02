package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class o1h implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mn0 b;

    public /* synthetic */ o1h(mn0 mn0Var, int i) {
        this.a = i;
        this.b = mn0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                yci o = a.o(d.d(vci.a, 1.0f), 24, 0.0f, 2);
                ta5 a = sa5.a(qx0.c, b2c.n, hq5Var, 0);
                oq5 oq5Var2 = (oq5) hq5Var;
                int i = oq5Var2.P;
                androidx.compose.runtime.internal.a l = oq5Var2.l();
                yci H = vnj.H(hq5Var, o);
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
                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i))) {
                    ouj.x(i, oq5Var2, i, kb5Var);
                }
                g0g.U(hq5Var, H, wp5.d);
                pcg.i(null, ild.C(1291334728, new o1h(this.b, 1), hq5Var), hq5Var, 48);
                oq5Var2.p(true);
                break;
            case 1:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                xv7.i(this.b, null, ((dq0) ((oq5) hq5Var2).j(eq0.a)).b.a, 0L, 0L, 0, 0L, 0, false, 0, 0, null, null, nu0.j(), null, null, hq5Var2, 0, 0, 917498);
            default:
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var4 = (oq5) hq5Var3;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        break;
                    }
                }
                xcs.c(this.b, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, null, hq5Var3, 0, 0, 262142);
        }
        return Unit.a;
    }
}
