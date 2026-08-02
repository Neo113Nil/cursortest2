package defpackage;

import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import com.yandex.go.navigation.screen.api.Screen;

/* loaded from: classes14.dex */
public final class sxm0 extends BaseRootNavigationRouter implements qa00 {
    public final yvf0 D;
    public final BaseRootNavigationRouter.a E = new BaseRootNavigationRouter.a(Screen.SCOOTERS, BaseRootNavigationRouter.Background.MAP, null, 12);

    public sxm0(yvf0 yvf0Var) {
        this.D = yvf0Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        A((m950) this.D.get(), vvn0.b, new p4g0(this, 2));
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.E;
    }
}
