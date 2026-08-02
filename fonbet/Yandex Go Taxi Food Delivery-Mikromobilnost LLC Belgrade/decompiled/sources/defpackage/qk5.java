package defpackage;

import com.yandex.go.beginners.domain.interactor.b;
import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import com.yandex.go.preload.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class qk5 extends BaseRootNavigationRouter implements qa00 {
    public final e D;
    public final ra00 E;
    public final k941 F;
    public final yvf0 G;
    public final yvf0 H;
    public final yvf0 I;
    public final yvf0 J;
    public final yvf0 K;
    public final kxl0 L;
    public final b M;
    public final BaseRootNavigationRouter.a N = new BaseRootNavigationRouter.a(null, null, null, 15);

    public qk5(e eVar, ra00 ra00Var, k941 k941Var, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, kxl0 kxl0Var, b bVar) {
        this.D = eVar;
        this.E = ra00Var;
        this.F = k941Var;
        this.G = yvf0Var;
        this.H = yvf0Var2;
        this.I = yvf0Var3;
        this.J = yvf0Var4;
        this.K = yvf0Var5;
        this.L = kxl0Var;
        this.M = bVar;
    }

    public static final void Q(qk5 qk5Var, qk1 qk1Var) {
        Object value;
        Object obj;
        r0 r0Var = qk5Var.D.c.b;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, ape0.a((ape0) value, 6)));
        m950 m950Var = (m950) qk5Var.H.get();
        if (qk1Var instanceof ok1) {
            obj = new aaz(((ok1) qk1Var).a, true);
        } else {
            if (!(qk1Var instanceof pk1)) {
                w511.b();
                return;
            }
            obj = baz.a;
        }
        qk5Var.A(m950Var, obj, new nk5(qk5Var, 0));
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        z((m950) this.G.get(), new pk5(this));
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.N;
    }
}
