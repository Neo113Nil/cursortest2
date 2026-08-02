package defpackage;

import com.yandex.go.order.external.eats.ClosedOrderStorage$Order;
import com.yandex.go.utils.storage.json.a;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class z5c {
    public final a a;

    public z5c(eex eexVar) {
        am2 am2Var = new am2("mlutp", "closed_orders.json", EmptyList.a);
        KSerializer serializer = ClosedOrderStorage$Order.Companion.serializer();
        eexVar.getClass();
        this.a = eexVar.a(am2Var, new p53(serializer, 0));
    }
}
