package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class s93 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ y93 b;
    public final /* synthetic */ tmb c;

    public /* synthetic */ s93(y93 y93Var, tmb tmbVar) {
        this.b = y93Var;
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
                    vm C = ghh.C(zs4.g(oq5Var), ogp.A(oq5Var));
                    vci vciVar = vci.a;
                    yci c = d.c(a.l(vciVar, C), 1.0f);
                    kfh d = ug3.d(b2c.b, false);
                    int i = oq5Var.P;
                    androidx.compose.runtime.internal.a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, c);
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
                    yci x = d.x(bfg.Q(d.c(vciVar, 1.0f), bfg.C(oq5Var), false, 14), b2c.f, 2);
                    y93 y93Var = this.b;
                    boolean h = oq5Var.h(y93Var);
                    Object K = oq5Var.K();
                    kjn kjnVar = gq5.a;
                    if (h || K == kjnVar) {
                        K = new v5(13, y93Var);
                        oq5Var.k0(K);
                    }
                    rvf.j((Function1) K, this.c, x, 0, true, null, oq5Var, 24640, 40);
                    boolean h2 = oq5Var.h(y93Var);
                    Object K2 = oq5Var.K();
                    if (h2 || K2 == kjnVar) {
                        t93 t93Var = new t93(0, y93Var, y93.class, "onBackClick", "onBackClick()V", 0, 4);
                        oq5Var.k0(t93Var);
                        K2 = t93Var;
                    }
                    h9f h9fVar = (h9f) K2;
                    boolean h3 = oq5Var.h(y93Var);
                    Object K3 = oq5Var.K();
                    if (h3 || K3 == kjnVar) {
                        t93 t93Var2 = new t93(0, y93Var, y93.class, "onSearchClick", "onSearchClick()V", 0, 5);
                        oq5Var.k0(t93Var2);
                        K3 = t93Var2;
                    }
                    h9f h9fVar2 = (h9f) K3;
                    boolean h4 = oq5Var.h(y93Var);
                    Object K4 = oq5Var.K();
                    if (h4 || K4 == kjnVar) {
                        t93 t93Var3 = new t93(0, y93Var, y93.class, "onOverflowClick", "onOverflowClick()V", 0, 6);
                        oq5Var.k0(t93Var3);
                        K4 = t93Var3;
                    }
                    t7g.h(gut.p1(vciVar), (Function0) h9fVar, (Function0) h9fVar2, (Function0) ((h9f) K4), oq5Var, 0, 0);
                    oq5Var.p(true);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                n7w.b(this.b, this.c, (hq5) obj, rvf.R(65));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ s93(y93 y93Var, tmb tmbVar, int i) {
        this.b = y93Var;
        this.c = tmbVar;
    }
}
