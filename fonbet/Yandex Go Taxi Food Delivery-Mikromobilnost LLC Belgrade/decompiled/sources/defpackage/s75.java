package defpackage;

import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.places.impl.navigation.common.base.a;

/* loaded from: classes13.dex */
public final class s75 extends BaseRootNavigationRouter {
    public final BaseRootNavigationRouter.a D;
    public final /* synthetic */ dm80 E;
    public final /* synthetic */ a F;

    public s75(t75 t75Var, dm80 dm80Var, a aVar) {
        this.E = dm80Var;
        this.F = aVar;
        this.D = new BaseRootNavigationRouter.a(Screen.ORGANISATIONS_MAP, dm80Var instanceof zl80 ? BaseRootNavigationRouter.Background.NONE : BaseRootNavigationRouter.Background.MAP, null, 12);
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        A(this.F, this.E, new r75(0, this));
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.D;
    }
}
