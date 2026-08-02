package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class yzo implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ g06 b;

    public /* synthetic */ yzo(g06 g06Var) {
        this.b = g06Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    vci vciVar = vci.a;
                    yci m = d.m(vciVar, 80);
                    kfh d = ug3.d(b2c.f, false);
                    int i = oq5Var.P;
                    a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, m);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, d, wp5.f);
                    g0g.U(oq5Var, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i))) {
                        ouj.x(i, oq5Var, i, kb5Var);
                    }
                    g0g.U(oq5Var, H, wp5.d);
                    g06 g06Var = this.b;
                    pw5 pw5Var = (pw5) g06Var.a;
                    qwp.l(pw5Var.d, pw5Var.e, pw5Var.f, ((dq0) oq5Var.j(eq0.a)).c.b, ksw.D(xp3.u(vciVar, klx.c), (String) g06Var.d, null), 6, false, 0.12f, 0.04f, !((ma5) oq5Var.j(pa5.a)).g(), oq5Var, 113442816, 64);
                    oq5Var.p(true);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                g0g.a(this.b, (hq5) obj, rvf.R(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ yzo(g06 g06Var, int i) {
        this.b = g06Var;
    }
}
