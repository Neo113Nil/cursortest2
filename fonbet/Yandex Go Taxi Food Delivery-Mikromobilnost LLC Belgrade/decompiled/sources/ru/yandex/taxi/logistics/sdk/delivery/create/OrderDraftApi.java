package ru.yandex.taxi.logistics.sdk.delivery.create;

import defpackage.an2;
import defpackage.q76;
import defpackage.s490;
import kotlin.Metadata;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.api.form.V2DraftRequestDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.api.form.V2DraftResponseDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliverydraft.DeliveryDraftRequestDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliverydraft.Responses$DeliveryDraftResponseDto;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery/create/OrderDraftApi;", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverydraft/DeliveryDraftRequestDto;", "body", "Lan2;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverydraft/Responses$DeliveryDraftResponseDto;", "a", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverydraft/DeliveryDraftRequestDto;)Lan2;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/api/form/V2DraftRequestDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/api/form/V2DraftResponseDto;", "b", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/api/form/V2DraftRequestDto;)Lan2;", "sdk-delivery-impl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface OrderDraftApi {
    @s490("/4.0/cargo-c2c/v1/delivery/draft")
    an2<Responses$DeliveryDraftResponseDto> a(@q76 DeliveryDraftRequestDto body);

    @s490("/4.0/cargo-c2c/v2/delivery/draft")
    an2<V2DraftResponseDto> b(@q76 V2DraftRequestDto body);
}
