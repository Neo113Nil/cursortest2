package defpackage;

import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.taxi.order.change.common.domain.d;
import com.yandex.go.taxi.order.y;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.a;

/* loaded from: classes14.dex */
public final class wpw extends BaseRootNavigationRouter {
    public final i6r D;
    public final d E;
    public final y F;
    public final BaseRootNavigationRouter.a G = new BaseRootNavigationRouter.a(Screen.ORDER_INTERMEDIATE_POINTS, BaseRootNavigationRouter.Background.MAP, BaseRootNavigationRouter.AnimationType.SLIDE, 8);
    public final i3y H = a.a(new vpw(this, 0));

    public wpw(i6r i6rVar, yvf0 yvf0Var, d dVar, rpw rpwVar, y yVar) {
        this.D = i6rVar;
        this.E = dVar;
        this.F = yVar;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        ((pit) ((c0g) this.D).z.mi.get()).a((npw) this.H.getValue());
        this.E.a();
        this.F.g();
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        pit pitVar = (pit) ((c0g) this.D).z.mi.get();
        npw npwVar = (npw) this.H.getValue();
        AtomicReference atomicReference = pitVar.g.a;
        while (!atomicReference.compareAndSet(npwVar, null) && atomicReference.get() == npwVar) {
        }
        d dVar = this.E;
        com.yandex.go.taxi.order.change.common.data.d dVar2 = dVar.a;
        dVar2.i.clear();
        dVar2.g.b();
        dVar.b.d.b();
        this.F.h();
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        throw null;
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.G;
    }
}
