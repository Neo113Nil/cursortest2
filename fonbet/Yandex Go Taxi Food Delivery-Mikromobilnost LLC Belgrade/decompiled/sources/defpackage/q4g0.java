package defpackage;

import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import ru.yandex.taxi.settings.model.PushSettingsOpenReason;

/* loaded from: classes13.dex */
public final class q4g0 extends BaseRootNavigationRouter {
    public final yvf0 D;
    public final BaseRootNavigationRouter.a E = new BaseRootNavigationRouter.a(null, null, null, 15);

    public q4g0(yvf0 yvf0Var) {
        this.D = yvf0Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        A((m950) this.D.get(), (PushSettingsOpenReason) obj, new p4g0(this, 0));
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.E;
    }
}
