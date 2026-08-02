package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class gl3 extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ o0k s;
    public final /* synthetic */ pyc t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gl3(int i, pyc pycVar, o0k o0kVar) {
        super(2);
        this.r = i;
        this.s = o0kVar;
        this.t = pycVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Number) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    yci l = a.l(d.a(vci.a, bl3.b, bl3.c), this.s);
                    nho a = lho.a(qx0.e, b2c.l, oq5Var, 54);
                    int i = oq5Var.P;
                    androidx.compose.runtime.internal.a l2 = oq5Var.l();
                    yci H = vnj.H(oq5Var, l);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, a, wp5.f);
                    g0g.U(oq5Var, l2, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i))) {
                        ouj.x(i, oq5Var, i, kb5Var);
                    }
                    g0g.U(oq5Var, H, wp5.d);
                    this.t.invoke(qho.a, oq5Var, 6);
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
                    xcs.a(((udt) oq5Var2.j(wdt.b)).k, ild.C(-630330208, new gl3(0, this.t, this.s), oq5Var2), oq5Var2, 48);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
