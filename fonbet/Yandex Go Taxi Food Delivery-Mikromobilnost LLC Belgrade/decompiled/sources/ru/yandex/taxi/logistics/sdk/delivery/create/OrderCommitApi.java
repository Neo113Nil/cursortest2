package ru.yandex.taxi.logistics.sdk.delivery.create;

import defpackage.an2;
import defpackage.q76;
import defpackage.s490;
import kotlin.Metadata;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.api.form.V2CommitRequestDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.api.form.V2CommitResponseDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.Responses$OperationIdResponseDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliverycommit.DeliveryCommitRequestDto;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery/create/OrderCommitApi;", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverycommit/DeliveryCommitRequestDto;", "body", "Lan2;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/Responses$OperationIdResponseDto;", "b", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverycommit/DeliveryCommitRequestDto;)Lan2;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/api/form/V2CommitRequestDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/api/form/V2CommitResponseDto;", "a", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/api/form/V2CommitRequestDto;)Lan2;", "sdk-delivery-impl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface OrderCommitApi {
    @s490("/4.0/cargo-c2c/v2/delivery/commit")
    an2<V2CommitResponseDto> a(@q76 V2CommitRequestDto body);

    @s490("/4.0/cargo-c2c/v1/delivery/commit")
    an2<Responses$OperationIdResponseDto> b(@q76 DeliveryCommitRequestDto body);
}
