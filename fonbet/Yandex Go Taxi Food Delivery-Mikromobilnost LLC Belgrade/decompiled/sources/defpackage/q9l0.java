package defpackage;

import com.yandex.go.pickup_from_photo.api.PickupFromPhotoPayload$Origin;
import com.yandex.go.taxi.summary.map.focus.data.c;
import com.yandex.go.where_you_are.impl.presentation.WhereYouAreModalView;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.routeselector.a;
import ru.yandex.taxi.routeselector.analytics.RouteSelectorOpenReason;
import ru.yandex.taxi.routeselector.view.RouteSelectorModalView;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes6.dex */
public final class q9l0 implements RouteSelectorModalView.a {
    public final /* synthetic */ a a;
    public final /* synthetic */ y9l0 b;
    public final /* synthetic */ SourcePicker c;
    public final /* synthetic */ ModalViewOrigin w;
    public final /* synthetic */ RouteSelectorOpenReason x;

    public q9l0(a aVar, y9l0 y9l0Var, SourcePicker sourcePicker, ModalViewOrigin modalViewOrigin, RouteSelectorOpenReason routeSelectorOpenReason) {
        this.a = aVar;
        this.b = y9l0Var;
        this.c = sourcePicker;
        this.w = modalViewOrigin;
        this.x = routeSelectorOpenReason;
    }

    @Override // ru.yandex.taxi.routeselector.view.RouteSelectorModalView.a
    public final void K() {
        a aVar = this.a;
        c cVar = (c) aVar.L;
        cVar.getClass();
        cVar.d = new AtomicBoolean(true);
        aVar.r(new z0l0(10));
    }

    @Override // ru.yandex.taxi.routeselector.view.RouteSelectorModalView.a
    public final void dismiss() {
        this.a.r(new z0l0(11));
    }

    @Override // ru.yandex.taxi.routeselector.view.RouteSelectorModalView.a
    public final void o3(PointType pointType, qa0 qa0Var) {
        com.yandex.go.where_you_are.impl.router.a aVar;
        bgc bgcVar = new bgc(12);
        a aVar2 = this.a;
        aVar2.Q.a();
        aVar2.A((m950) aVar2.P.get(), new oal0(this.c, pointType), new r9l0(qa0Var, this.b, aVar2, this.w, bgcVar));
        aVar2.E.c();
        ry41 ry41Var = (ry41) aVar2.I;
        if (!ry41Var.f() || (aVar = ry41Var.b) == null) {
            return;
        }
        aVar.a();
        aVar.b.a().m(WhereYouAreModalView.class);
    }

    @Override // ru.yandex.taxi.routeselector.view.RouteSelectorModalView.a
    public final void openPickupFromPhoto() {
        a.P(this.a, this.w, PickupFromPhotoPayload$Origin.CLARIFY);
    }

    @Override // ru.yandex.taxi.routeselector.view.RouteSelectorModalView.a
    public final void showAddressAdjustment() {
        a aVar = this.a;
        aVar.Q.e.cancel();
        aVar.M.a().c(RouteSelectorModalView.class, true, null);
        int i = n9l0.a[this.b.a.ordinal()];
        xp0 xp0Var = i != 1 ? i != 2 ? tp0.b : up0.b : vp0.b;
        byb bybVar = aVar.T;
        xp0Var.toString();
        bybVar.getClass();
        aVar.A((m950) aVar.S.get(), new mp0(xp0Var, bc1.g), new p9l0(aVar, this.b, this.w, this.x, this));
    }
}
