package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;

/* loaded from: classes8.dex */
public final class x780 {
    public static boolean a(TaxiOrder taxiOrder) {
        return (w780.a[taxiOrder.h.getB().ordinal()] != 1 || taxiOrder.E() || taxiOrder.V().F == OrderStatusInfo.CancelledBy.TIMEOUT) ? false : true;
    }
}
