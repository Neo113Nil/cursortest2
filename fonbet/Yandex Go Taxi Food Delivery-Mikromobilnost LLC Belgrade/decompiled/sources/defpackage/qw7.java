package defpackage;

import com.yandex.go.taxi.order.api.OrderApi;
import com.yandex.go.taxi.order.factory.a;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.request.OrderStatusParam;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes14.dex */
public final class qw7 implements ow7 {
    public final tse a;
    public final OrderApi b;
    public final c6e c;
    public final a d;
    public final po21 e;
    public final HashMap f = new HashMap();
    public final ConcurrentHashMap g = new ConcurrentHashMap();

    public qw7(tse tseVar, OrderApi orderApi, c6e c6eVar, wnt wntVar, a aVar, po21 po21Var) {
        this.a = tseVar;
        this.b = orderApi;
        this.c = c6eVar;
        this.d = aVar;
        this.e = po21Var;
    }

    public final synchronized nw7 a(String str) {
        return (nw7) this.f.remove(str);
    }

    public final synchronized void b(String str, TaxiOrder taxiOrder, OrderStatusParam.Break r5, nw7 nw7Var) {
        String str2 = taxiOrder.a;
        this.f.put(str2, nw7Var);
        this.g.compute(str2, new pw7(0, new com.yandex.go.taxi.order.cancel.a(this, str, r5, taxiOrder)));
    }
}
