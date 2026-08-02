package ru.yandex.taxi.masstransit.geopayment.checkout.network;

import defpackage.cmt;
import defpackage.flb;
import defpackage.q76;
import defpackage.s490;
import kotlin.Metadata;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CheckoutResponse;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lru/yandex/taxi/masstransit/geopayment/checkout/network/MtCheckoutApi;", "", "Lflb;", "checkoutParam", "Lcmt;", "Lru/yandex/taxi/masstransit/geopayment/checkout/network/model/CheckoutResponse;", "a", "(Lflb;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface MtCheckoutApi {
    @s490("masstransit/payment/checkout")
    cmt<CheckoutResponse> a(@q76 flb checkoutParam);
}
