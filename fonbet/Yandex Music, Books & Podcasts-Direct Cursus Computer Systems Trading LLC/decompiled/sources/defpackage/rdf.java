package defpackage;

import androidx.compose.foundation.layout.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class rdf implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ j53 b;
    public final /* synthetic */ yci c;

    public /* synthetic */ rdf(j53 j53Var, yci yciVar, int i) {
        this.b = j53Var;
        this.c = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var = (hq5) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                int intValue = num.intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    yci q = a.q(this.c, 0.0f, 16, 0.0f, 0.0f, 13);
                    ta5 a = sa5.a(qx0.c, b2c.n, oq5Var, 0);
                    int i = oq5Var.P;
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
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i))) {
                        ouj.x(i, oq5Var, i, kb5Var);
                    }
                    g0g.U(oq5Var, H, wp5.d);
                    a0g.w(null, oq5Var, 0);
                    a0g.t(0, 0, 3, oq5Var, null);
                    if (this.b.a) {
                        oq5Var.Z(1872897171);
                        a0g.t(2, 48, 1, oq5Var, null);
                    } else {
                        oq5Var.Z(1868928985);
                    }
                    oq5Var.p(false);
                    oq5Var.p(true);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                num.getClass();
                pd.q(this.b, this.c, hq5Var, rvf.R(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ rdf(yci yciVar, j53 j53Var) {
        this.c = yciVar;
        this.b = j53Var;
    }
}
