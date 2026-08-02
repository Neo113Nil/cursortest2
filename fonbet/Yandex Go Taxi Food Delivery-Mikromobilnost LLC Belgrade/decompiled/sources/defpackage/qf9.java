package defpackage;

import com.yandex.go.taxi.order.api.change.destination.RouteChangeType;
import com.yandex.go.taxi.order.change.common.domain.d;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Source;
import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;

/* loaded from: classes14.dex */
public final class qf9 implements of9 {
    public final d a;

    public qf9(d dVar) {
        this.a = dVar;
    }

    public final void a(o2y0 o2y0Var, OrderChangesDto.PendingChangeDto pendingChangeDto, RouteChangeType routeChangeType) {
        ChangeOrderState$Source changeOrderState$Source;
        if (pendingChangeDto.b != OrderChangesDto.Status.PENDING) {
            return;
        }
        int i = pf9.a[routeChangeType.ordinal()];
        if (i == 1) {
            changeOrderState$Source = ChangeOrderState$Source.DESTINATION_POINT;
        } else if (i == 2) {
            changeOrderState$Source = ChangeOrderState$Source.ROUTE_POINT;
        } else if (i == 3) {
            changeOrderState$Source = ChangeOrderState$Source.ROUTE_POINT;
        } else if (i == 4) {
            changeOrderState$Source = ChangeOrderState$Source.ROUTE_POINT;
        } else {
            if (i != 5) {
                w511.b();
                return;
            }
            changeOrderState$Source = ChangeOrderState$Source.ROUTE_POINT;
        }
        this.a.a.h(new tb9(o2y0Var.b().a, pendingChangeDto.a, changeOrderState$Source));
    }
}
