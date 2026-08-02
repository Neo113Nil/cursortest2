package ru.yandex.taxi.intercity;

import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import defpackage.a3v;
import defpackage.bc;
import defpackage.ciw;
import defpackage.gtq0;
import defpackage.l9w;
import defpackage.mgu;
import defpackage.tje;
import defpackage.tse;
import defpackage.w3i;
import defpackage.zow;

/* loaded from: classes5.dex */
public final class b extends BaseRootNavigationRouter {
    public final w3i D;
    public final l9w E;
    public final ru.yandex.taxi.intercity.domain.a F;
    public final a3v G;
    public final ciw H;
    public bc I;
    public final BaseRootNavigationRouter.a J = new BaseRootNavigationRouter.a(null, BaseRootNavigationRouter.Background.MAP, null, 13);

    public b(w3i w3iVar, l9w l9wVar, ru.yandex.taxi.intercity.domain.a aVar, a3v a3vVar, ciw ciwVar) {
        this.D = w3iVar;
        this.E = l9wVar;
        this.F = aVar;
        this.G = a3vVar;
        this.H = ciwVar;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        this.G.b8(this);
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        this.G.a0(this);
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.I = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new IntercityRouterImpl$onLaunch$1((zow) obj, this, null), 3);
        tse o = o();
        IntercityRouterImpl$onLaunch$2 intercityRouterImpl$onLaunch$2 = new IntercityRouterImpl$onLaunch$2(0, this, b.class, "goBack", "goBack(Lkotlin/jvm/functions/Function1;)V", 0);
        ciw ciwVar = this.H;
        ciwVar.b.set(intercityRouterImpl$onLaunch$2);
        gtq0.t(o, new mgu(14, ciwVar, intercityRouterImpl$onLaunch$2));
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.J;
    }
}
