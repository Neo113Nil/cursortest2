package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class np0 extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ opv s;
    public final /* synthetic */ o0k t;
    public final /* synthetic */ wn5 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ np0(opv opvVar, o0k o0kVar, wn5 wn5Var, int i) {
        super(2);
        this.r = i;
        this.s = opvVar;
        this.t = o0kVar;
        this.u = wn5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Number) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    yci e = d.e(a.l(sqv.a(d.d(vci.a, 1.0f), this.s), this.t), sp0.a);
                    nho a = lho.a(qx0.a, b2c.l, oq5Var, 54);
                    int i = oq5Var.P;
                    androidx.compose.runtime.internal.a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, e);
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
                    this.u.invoke(qho.a, oq5Var, 6);
                    oq5Var.p(true);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Number) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    qs5 qs5Var = mb6.a;
                    long j = ((d85) oq5Var2.j(sb6.a)).a;
                    etn.l(qs5Var.a(Float.valueOf((!((ma5) oq5Var2.j(pa5.a)).g() ? ((double) c3x.N(j)) < 0.5d : ((double) c3x.N(j)) > 0.5d) ? 0.6f : 0.74f)), ild.C(600325466, new np0(this.s, this.t, this.u, 0), oq5Var2), oq5Var2, 56);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
