package defpackage;

import com.yandex.go.taxi.order.domain.interactors.i;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.provider.a;

/* loaded from: classes14.dex */
public final class u8u0 implements i580 {
    public final pit a;
    public final a b;
    public final i c;

    public u8u0(pit pitVar, a aVar, i iVar) {
        this.a = pitVar;
        this.b = aVar;
        this.c = iVar;
    }

    @Override // defpackage.i580
    public final void a(TaxiOrder taxiOrder, boolean z) {
        o2y0 n = this.b.n(taxiOrder.a);
        if (n == null || n.b().l.w() == null) {
            return;
        }
        qyy0.c(new tpt0(4, this, n));
    }
}
