package defpackage;

import com.yandex.go.taxi.order.provider.a;
import com.yandex.go.taxi.order.superapp.orders.v;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.superapp.orders.taxi.TaxiOrderFlowTrackingSourceInteractor$updateOrders$$inlined$safeCollectIn$1;

/* loaded from: classes10.dex */
public final class s1y0 implements q701 {
    public final tse a;
    public final a b;
    public final v c;
    public pzt0 d;

    public s1y0(tse tseVar, a aVar, v vVar) {
        this.a = tseVar;
        this.b = aVar;
        this.c = vVar;
    }

    @Override // defpackage.q701
    public final void start() {
        pzt0 pzt0Var = this.d;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.d = tje.N(this.a, null, null, new TaxiOrderFlowTrackingSourceInteractor$updateOrders$$inlined$safeCollectIn$1(e.t(this.b.a()), null, this.c), 3);
    }

    @Override // defpackage.q701
    public final void stop() {
        pzt0 pzt0Var = this.d;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.d = null;
    }
}
