package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class rl4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ yci c;
    public final /* synthetic */ int d;

    public /* synthetic */ rl4(int i, int i2, yci yciVar, int i3) {
        this.a = 5;
        this.b = i;
        this.d = i2;
        this.c = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                pd.g(rvf.R(this.b | 1), this.d, (hq5) obj, this.c);
                break;
            case 1:
                ((Integer) obj2).getClass();
                men.h(this.b, rvf.R(1), this.d, (hq5) obj, this.c);
                break;
            case 2:
                ((Integer) obj2).getClass();
                leu.k(rvf.R(this.b | 1), this.d, (hq5) obj, this.c);
                break;
            case 3:
                ((Integer) obj2).getClass();
                gh6.f(rvf.R(this.b | 1), this.d, (hq5) obj, this.c);
                break;
            case 4:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                yci m = d.m(this.c, li6.b.a);
                kfh d = ug3.d(b2c.b, false);
                oq5 oq5Var2 = (oq5) hq5Var;
                int i = oq5Var2.P;
                a l = oq5Var2.l();
                yci H = vnj.H(hq5Var, m);
                xp5.T.getClass();
                Function0 function0 = wp5.b;
                oq5Var2.d0();
                if (oq5Var2.O) {
                    oq5Var2.k(function0);
                } else {
                    oq5Var2.n0();
                }
                g0g.U(hq5Var, d, wp5.f);
                g0g.U(hq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i))) {
                    ouj.x(i, oq5Var2, i, kb5Var);
                }
                g0g.U(hq5Var, H, wp5.d);
                int i2 = this.b;
                sdr b = pk0.b(i2 / this.d, weo.S(500, 0, null, 6), null, null, hq5Var, 48, 28);
                float f = 4;
                long H2 = c3x.H(hq5Var);
                long G = c3x.G(hq5Var);
                vci vciVar = vci.a;
                yci c = d.c(vciVar, 1.0f);
                boolean f2 = oq5Var2.f(b);
                Object K = oq5Var2.K();
                if (f2 || K == gq5.a) {
                    K = new la1(b, 19);
                    oq5Var2.k0(K);
                }
                xv.h((Function0) K, f, H2, G, c, 1, hq5Var, 24624);
                xcs.b(String.valueOf(i2), b.a.a(vciVar, b2c.f), c3x.H(hq5Var), 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, ges.b(nu0.i(), 0L, 0L, tqc.p, null, 0L, 0, 0L, null, null, 0, 0, 16777211), hq5Var, 0, 0, 65016);
                oq5Var2.p(true);
                break;
            case 5:
                ((Integer) obj2).getClass();
                ild.h(this.b, this.d, rvf.R(1), (hq5) obj, this.c);
                break;
            case 6:
                ((Integer) obj2).getClass();
                swf.e(rvf.R(this.b | 1), this.d, (hq5) obj, this.c);
                break;
            default:
                ((Integer) obj2).getClass();
                q7g.a(rvf.R(this.b | 1), this.d, (hq5) obj, this.c);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ rl4(int i, yci yciVar, int i2, int i3) {
        this.a = 1;
        this.b = i;
        this.c = yciVar;
        this.d = i3;
    }

    public /* synthetic */ rl4(yci yciVar, int i, int i2, int i3) {
        this.a = i3;
        this.c = yciVar;
        this.b = i;
        this.d = i2;
    }
}
