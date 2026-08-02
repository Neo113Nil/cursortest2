package ru.yandex.taxi.logistics.sdk.deliverydashboard.data;

import defpackage.an2;
import defpackage.lf60;
import defpackage.m6x0;
import defpackage.q76;
import defpackage.s490;
import kotlin.Metadata;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.api.clientapi.DashboardContentRequestDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.api.clientapi.DashboardContentResponseDto;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lru/yandex/taxi/logistics/sdk/deliverydashboard/data/DeliveryDashboardApi;", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/api/clientapi/DashboardContentRequestDto;", "body", "Llf60;", "notAuthorizedApiFlag", "Lan2;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/api/clientapi/DashboardContentResponseDto;", "a", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/api/clientapi/DashboardContentRequestDto;Llf60;)Lan2;", "delivery-dashboard"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface DeliveryDashboardApi {
    @s490("/4.0/cargo-c2c/v1/dashboard/content")
    an2<DashboardContentResponseDto> a(@q76 DashboardContentRequestDto body, @m6x0 lf60 notAuthorizedApiFlag);
}
