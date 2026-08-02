package defpackage;

import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import com.yandex.go.navigation.screen.api.Screen;

/* loaded from: classes10.dex */
public final class z841 extends BaseRootNavigationRouter {
    public final egx0 D;
    public final BaseRootNavigationRouter.a E = new BaseRootNavigationRouter.a(Screen.WALLET, BaseRootNavigationRouter.Background.NONE, BaseRootNavigationRouter.AnimationType.STAR_WARS, 8);

    public z841(egx0 egx0Var) {
        this.D = egx0Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        A((m950) this.D.get(), (zy11) obj, new p4g0(this, 20));
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.E;
    }
}
