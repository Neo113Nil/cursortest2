package ru.yandex.taxi.net.taxi;

import com.yandex.go.taxi.order.models.api.response.OrderCommitResponse;
import com.yandex.go.taxi.order.net.taxi.dto.request.TaxiRouteParam;
import com.yandex.go.taxi.order.net.taxi.dto.response.TaxiRouteResponse;
import defpackage.a0j0;
import defpackage.cmt;
import defpackage.n851;
import defpackage.pu70;
import defpackage.q76;
import defpackage.ro70;
import defpackage.s490;
import defpackage.zy11;
import kotlin.Metadata;
import kotlinx.serialization.json.b;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\b\b\u0001\u0010\r\u001a\u00020\u0011H'¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lru/yandex/taxi/net/taxi/TaxiApi;", "", "Lkotlinx/serialization/json/b;", "param", "Lcmt;", "Lpu70;", "d", "(Lkotlinx/serialization/json/b;)Lcmt;", "Lro70;", "Lcom/yandex/go/taxi/order/models/api/response/OrderCommitResponse;", "a", "(Lro70;)Lcmt;", "Lcom/yandex/go/taxi/order/net/taxi/dto/request/TaxiRouteParam;", "p", "Lcom/yandex/go/taxi/order/net/taxi/dto/response/TaxiRouteResponse;", "b", "(Lcom/yandex/go/taxi/order/net/taxi/dto/request/TaxiRouteParam;)Lcmt;", "La0j0;", "Lzy11;", "c", "(La0j0;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface TaxiApi {
    @n851
    @s490("ordercommit")
    cmt<OrderCommitResponse> a(@q76 ro70 param);

    @s490("taxiroute")
    cmt<TaxiRouteResponse> b(@q76 TaxiRouteParam p);

    @s490("reorder")
    cmt<zy11> c(@q76 a0j0 p);

    @n851
    @s490("orderdraft")
    cmt<pu70> d(@q76 b param);
}
