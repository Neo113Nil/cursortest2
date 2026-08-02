package ru.yandex.taxi.maas.impl.ride.metropick;

import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import com.yandex.go.navigation.screen.api.Screen;
import defpackage.bsz;
import defpackage.j200;
import defpackage.m000;
import defpackage.tc;

/* loaded from: classes5.dex */
public final class d extends BaseRootNavigationRouter {
    public final ru.yandex.taxi.maas.impl.ride.common.a D;
    public final tc E;
    public final bsz F;
    public final BaseRootNavigationRouter.a G = new BaseRootNavigationRouter.a(Screen.FEATURE_STUB, BaseRootNavigationRouter.Background.MAP, null, 12);
    public m000 H;

    public d(ru.yandex.taxi.maas.impl.ride.common.a aVar, tc tcVar, bsz bszVar) {
        this.D = aVar;
        this.E = tcVar;
        this.F = bszVar;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        m000 m000Var = ((j200) obj).a;
        this.H = m000Var;
        com.yandex.go.coroutines.b.g(o(), null, null, new MaasToMetroFragmentRouter$launchMetroPicker$1(this, m000Var, null), 3);
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.G;
    }
}
