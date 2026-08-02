package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.order.l;

/* loaded from: classes14.dex */
public final class z18 implements j580 {
    public final l a;
    public final h3y b;
    public final h3y c;

    public z18(l lVar, h3y h3yVar, h3y h3yVar2) {
        this.a = lVar;
        this.b = h3yVar;
        this.c = h3yVar2;
    }

    @Override // defpackage.j580
    public final void a(TaxiOrder taxiOrder, boolean z) {
        OrderStatusInfo V = taxiOrder.V();
        if (V.i == DriveState.CANCELLED && V.F == OrderStatusInfo.CancelledBy.USER) {
            taxiOrder.O(false);
            OrderStatusInfo V2 = taxiOrder.V();
            if (alb1.g(taxiOrder.h.b, V2.k, V2.u)) {
                OrderStatusInfo V3 = taxiOrder.V();
                if (alb1.g(taxiOrder.h.b, V3.k, V3.u) && !taxiOrder.l.g && !this.a.b(false)) {
                    ((y180) this.b.get()).h(taxiOrder);
                    synchronized (taxiOrder) {
                        taxiOrder.l = taxiOrder.l.L();
                    }
                }
            }
            ((ysg) this.c.get()).g(taxiOrder);
        }
    }
}
