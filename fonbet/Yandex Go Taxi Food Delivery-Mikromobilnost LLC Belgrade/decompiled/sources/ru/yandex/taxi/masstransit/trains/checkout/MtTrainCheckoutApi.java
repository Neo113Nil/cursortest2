package ru.yandex.taxi.masstransit.trains.checkout;

import defpackage.cmt;
import defpackage.pa40;
import defpackage.q76;
import defpackage.qb40;
import defpackage.s490;
import defpackage.sa40;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.yandex.taxi.masstransit.trains.checkout.model.MtTrainCheckoutResponse;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lru/yandex/taxi/masstransit/trains/checkout/MtTrainCheckoutApi;", "", "Lpa40;", "convert", "Lcmt;", "Lsa40;", "a", "(Lpa40;)Lcmt;", "Lqb40;", Constants.KEY_DATA, "Lru/yandex/taxi/masstransit/trains/checkout/model/MtTrainCheckoutResponse;", "b", "(Lqb40;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface MtTrainCheckoutApi {
    @s490("masstransit/aeroexpress/checkout-info")
    cmt<sa40> a(@q76 pa40 convert);

    @s490("masstransit/aeroexpress/checkout")
    cmt<MtTrainCheckoutResponse> b(@q76 qb40 data);
}
