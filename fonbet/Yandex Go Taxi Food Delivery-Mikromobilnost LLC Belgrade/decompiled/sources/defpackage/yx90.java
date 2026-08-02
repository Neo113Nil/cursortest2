package defpackage;

import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.PaymentChange;
import com.yandex.go.taxi.order.provider.a;
import java.util.HashSet;
import java.util.List;
import ru.yandex.taxi.order.l;

/* loaded from: classes14.dex */
public final class yx90 implements i580 {
    public final ysg a;
    public final y180 b;
    public final zuj0 c;
    public final l d;
    public final a e;
    public final pit f;
    public final lgb g;
    public final HashSet h = new HashSet();
    public final a3y0 i = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "PaymentChangesOrderResponseInteractor");

    public yx90(ysg ysgVar, y180 y180Var, zuj0 zuj0Var, l lVar, a aVar, pit pitVar, lgb lgbVar) {
        this.a = ysgVar;
        this.b = y180Var;
        this.c = zuj0Var;
        this.d = lVar;
        this.e = aVar;
        this.f = pitVar;
        this.g = lgbVar;
    }

    @Override // defpackage.i580
    public final void a(TaxiOrder taxiOrder, boolean z) {
        int size;
        o2y0 n = this.e.n(taxiOrder.a);
        if (n == null) {
            return;
        }
        List list = taxiOrder.V().J;
        if (!list.isEmpty() && (size = list.size()) > taxiOrder.l.v) {
            PaymentChange paymentChange = (PaymentChange) kotlin.collections.a.b0(list);
            PaymentChange.Reason reason = paymentChange != null ? paymentChange.c : null;
            if (reason == null) {
                a3y0.d(this.i, "update", new IllegalStateException("Missing payment change reason"), null, 4);
            } else {
                if ("INITIATED_BY_USER".equals(reason.a) || taxiOrder.G()) {
                    return;
                }
                qyy0.c(new nbb(size, taxiOrder, this, reason, n));
            }
        }
    }
}
