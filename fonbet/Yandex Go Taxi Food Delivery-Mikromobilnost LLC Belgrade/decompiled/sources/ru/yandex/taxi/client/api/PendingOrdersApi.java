package ru.yandex.taxi.client.api;

import defpackage.ata0;
import defpackage.cmt;
import defpackage.n851;
import defpackage.s490;
import kotlin.Metadata;
import ru.yandex.taxi.network.api.annotation.ObserveStrategy;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lru/yandex/taxi/client/api/PendingOrdersApi;", "", "Lcmt;", "Lata0;", "a", "()Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface PendingOrdersApi {
    @n851(strategy = ObserveStrategy.OnlyNoInternet)
    @s490("pending-orders/v1/orders")
    cmt<ata0> a();
}
