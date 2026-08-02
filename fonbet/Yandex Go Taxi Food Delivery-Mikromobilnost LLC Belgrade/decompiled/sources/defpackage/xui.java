package defpackage;

import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import ru.yandex.taxi.logistics.sdk.voiceforwarding.impl.c;

/* loaded from: classes12.dex */
public final class xui extends BaseRootNavigationRouter implements yui {
    public final yvf0 D;
    public final BaseRootNavigationRouter.a E = new BaseRootNavigationRouter.a(null, BaseRootNavigationRouter.Background.MAP, null, 13);

    public xui(yvf0 yvf0Var) {
        this.D = yvf0Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        rui ruiVar = (rui) obj;
        qoh qohVar = ((c) bvf0.u().B0.get()).d;
        if (qohVar != null) {
            qohVar.a(null);
        }
        A((m950) this.D.get(), ruiVar, new wui(this, 0));
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.E;
    }
}
