package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class wy implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ fz b;
    public final /* synthetic */ tmb c;

    public /* synthetic */ wy(fz fzVar, tmb tmbVar) {
        this.b = fzVar;
        this.c = tmbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    float e = zs4.e(oq5Var);
                    vci vciVar = vci.a;
                    yci c = d.c(a.q(vciVar, 0.0f, 0.0f, 0.0f, e, 7), 1.0f);
                    kfh d = ug3.d(b2c.b, false);
                    int i = oq5Var.P;
                    androidx.compose.runtime.internal.a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, c);
                    xp5.T.getClass();
                    Function0 function0 = wp5.b;
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(function0);
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
                    yci l2 = a.l(d.x(d.c(vciVar, 1.0f), b2c.f, 2), ogp.A(oq5Var));
                    fz fzVar = this.b;
                    boolean h = oq5Var.h(fzVar);
                    Object K = oq5Var.K();
                    Object obj3 = gq5.a;
                    if (h || K == obj3) {
                        K = new yy(fzVar, 0);
                        oq5Var.k0(K);
                    }
                    rvf.j((Function1) K, this.c, l2, 0, true, null, oq5Var, 24640, 40);
                    boolean h2 = oq5Var.h(fzVar);
                    Object K2 = oq5Var.K();
                    if (h2 || K2 == obj3) {
                        Object c3Var = new c3(0, fzVar, fz.class, "onBackClick", "onBackClick()V", 0, 25);
                        oq5Var.k0(c3Var);
                        K2 = c3Var;
                    }
                    h9f h9fVar = (h9f) K2;
                    boolean h3 = oq5Var.h(fzVar);
                    Object K3 = oq5Var.K();
                    if (h3 || K3 == obj3) {
                        Object c3Var2 = new c3(0, fzVar, fz.class, "onSearchClick", "onSearchClick()V", 0, 26);
                        oq5Var.k0(c3Var2);
                        K3 = c3Var2;
                    }
                    h9f h9fVar2 = (h9f) K3;
                    boolean h4 = oq5Var.h(fzVar);
                    Object K4 = oq5Var.K();
                    if (h4 || K4 == obj3) {
                        Object c3Var3 = new c3(0, fzVar, fz.class, "onOverflowClick", "onOverflowClick()V", 0, 27);
                        oq5Var.k0(c3Var3);
                        K4 = c3Var3;
                    }
                    t7g.h(gut.p1(vciVar), (Function0) h9fVar, (Function0) h9fVar2, (Function0) ((h9f) K4), oq5Var, 0, 0);
                    oq5Var.p(true);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                i4w.a(this.b, this.c, (hq5) obj, rvf.R(65));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ wy(fz fzVar, tmb tmbVar, int i) {
        this.b = fzVar;
        this.c = tmbVar;
    }
}
