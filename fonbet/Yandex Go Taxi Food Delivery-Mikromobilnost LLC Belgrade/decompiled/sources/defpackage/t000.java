package defpackage;

import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import com.yandex.go.navigation.screen.api.Screen;

/* loaded from: classes5.dex */
public final class t000 extends BaseRootNavigationRouter implements q000 {
    public final yvf0 D;
    public final xcz E;
    public final BaseRootNavigationRouter.a F = new BaseRootNavigationRouter.a(Screen.TAXI_MAIN, BaseRootNavigationRouter.Background.MAP, null, 12);

    public t000(yvf0 yvf0Var, xcz xczVar) {
        this.D = yvf0Var;
        this.E = xczVar;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        m000 m000Var = ((p000) obj).a;
        int i = r000.a[m000Var.a.ordinal()];
        if (i == 1) {
            A((m950) this.D.get(), new j000(m000Var.d), new wui(this, 20));
        } else if (i != 2 && i != 3 && i != 4) {
            w511.b();
        } else {
            A((m950) this.E.get(), new e200(m000Var), new s000(this));
        }
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.F;
    }
}
