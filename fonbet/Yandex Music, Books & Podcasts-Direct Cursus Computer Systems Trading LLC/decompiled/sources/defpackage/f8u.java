package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class f8u implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ h8u b;
    public final /* synthetic */ tmb c;

    public /* synthetic */ f8u(h8u h8uVar, tmb tmbVar) {
        this.b = h8uVar;
        this.c = tmbVar;
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
                    vci vciVar = vci.a;
                    yci c = d.c(vciVar, 1.0f);
                    Object K = oq5Var.K();
                    kjn kjnVar = gq5.a;
                    if (K == kjnVar) {
                        K = new d4u(15);
                        oq5Var.k0(K);
                    }
                    yci b = nfp.b(c, false, (Function1) K);
                    kfh d = ug3.d(b2c.b, false);
                    int i = oq5Var.P;
                    a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, b);
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
                    h8u h8uVar = this.b;
                    boolean h = oq5Var.h(h8uVar);
                    Object K2 = oq5Var.K();
                    if (h || K2 == kjnVar) {
                        K2 = new r3s(19, h8uVar);
                        oq5Var.k0(K2);
                    }
                    rvf.j((Function1) K2, this.c, b.a.a(vciVar, b2c.f), 0, false, null, oq5Var, 64, 56);
                    oq5Var.p(true);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                num.getClass();
                gut.i(this.b, this.c, hq5Var, rvf.R(65));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ f8u(h8u h8uVar, tmb tmbVar, int i) {
        this.b = h8uVar;
        this.c = tmbVar;
    }
}
