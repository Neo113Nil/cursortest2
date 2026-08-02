package defpackage;

import com.yandex.go.taxi.order.details.v1.elements.cancel.a;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$CancelElement;
import com.yandex.go.taxi.order.models.api.response.e2;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class y4j implements q8j {
    public final a a;
    public final gci0 b;

    public y4j(a aVar) {
        this.a = aVar;
        this.b = aVar.c;
    }

    @Override // defpackage.q8j
    public final Object a(TaxiOrder taxiOrder, Continuation continuation) {
        List list;
        List list2;
        e2 e2Var = OrderDetailsCardResponse.Companion;
        OrderDetailsCardResponse orderDetailsCardResponse = taxiOrder.V().n0;
        if (orderDetailsCardResponse == null || (list2 = orderDetailsCardResponse.a) == null) {
            list = EmptyList.a;
        } else {
            list = new ArrayList();
            for (Object obj : list2) {
                if (obj instanceof OrderDetailsCardResponse$CardElement$CancelElement) {
                    list.add(obj);
                }
            }
        }
        OrderDetailsCardResponse$CardElement$CancelElement orderDetailsCardResponse$CardElement$CancelElement = (OrderDetailsCardResponse$CardElement$CancelElement) kotlin.collections.a.R(list);
        return orderDetailsCardResponse$CardElement$CancelElement != null ? this.a.a(taxiOrder, orderDetailsCardResponse$CardElement$CancelElement, continuation) : zy11.a;
    }
}
