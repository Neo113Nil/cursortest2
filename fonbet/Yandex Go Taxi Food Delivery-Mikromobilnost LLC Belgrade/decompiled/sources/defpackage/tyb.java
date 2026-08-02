package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.preorder.source.domain.u;
import ru.yandex.taxi.routeselector.view.RouteSelectorModalView;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes6.dex */
public final class tyb implements RouteSelectorModalView.a {
    public final /* synthetic */ myb a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ uyb c;
    public final /* synthetic */ ModalViewOrigin w;

    public tyb(myb mybVar, AtomicBoolean atomicBoolean, uyb uybVar, ModalViewOrigin modalViewOrigin) {
        this.a = mybVar;
        this.b = atomicBoolean;
        this.c = uybVar;
        this.w = modalViewOrigin;
    }

    @Override // ru.yandex.taxi.routeselector.view.RouteSelectorModalView.a
    public final void K() {
        this.b.set(true);
        uyb uybVar = this.c;
        uybVar.a.a().c(RouteSelectorModalView.class, true, null);
        u uVar = uybVar.f;
        uVar.p.d();
        uVar.g.e(new tb(13, uVar, null));
        this.a.K();
    }

    @Override // ru.yandex.taxi.routeselector.view.RouteSelectorModalView.a
    public final void dismiss() {
        this.b.set(true);
        uyb uybVar = this.c;
        uybVar.a.a().c(RouteSelectorModalView.class, true, null);
        uybVar.f.a(this.w);
        this.a.dismiss();
    }

    @Override // ru.yandex.taxi.routeselector.view.RouteSelectorModalView.a
    public final void o3(PointType pointType, qa0 qa0Var) {
        this.a.o3(pointType, qa0Var);
    }
}
