package defpackage;

import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;

/* loaded from: classes14.dex */
public final class wz70 extends BaseRootNavigationRouter {
    public final my0 D;
    public final cwq0 E = new cwq0();
    public final BaseRootNavigationRouter.a F = new BaseRootNavigationRouter.a(null, BaseRootNavigationRouter.Background.MAP, null, 13);

    public wz70(my0 my0Var) {
        this.D = my0Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        uz70 uz70Var = (uz70) obj;
        vz70 vz70Var = uz70Var.b;
        m950 m950Var = (m950) this.D.get();
        String str = uz70Var.a;
        String str2 = uz70Var.b.a;
        this.E.getClass();
        A(m950Var, new cfn(cwq0.a(str2), str), new dl1(26, this));
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.F;
    }
}
