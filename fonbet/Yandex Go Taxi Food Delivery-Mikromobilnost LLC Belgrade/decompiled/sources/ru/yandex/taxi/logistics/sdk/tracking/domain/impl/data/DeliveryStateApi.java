package ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data;

import defpackage.an2;
import defpackage.q76;
import defpackage.s490;
import kotlin.Metadata;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliverystate.DeliveryStateRequestDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliverystate.Responses$DeliveryStateResponseDto;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lru/yandex/taxi/logistics/sdk/tracking/domain/impl/data/DeliveryStateApi;", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverystate/DeliveryStateRequestDto;", "requestBody", "Lan2;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverystate/Responses$DeliveryStateResponseDto;", "a", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverystate/DeliveryStateRequestDto;)Lan2;", "domain"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface DeliveryStateApi {
    @s490("/4.0/cargo-c2c/v1/delivery/state")
    an2<Responses$DeliveryStateResponseDto> a(@q76 DeliveryStateRequestDto requestBody);
}
