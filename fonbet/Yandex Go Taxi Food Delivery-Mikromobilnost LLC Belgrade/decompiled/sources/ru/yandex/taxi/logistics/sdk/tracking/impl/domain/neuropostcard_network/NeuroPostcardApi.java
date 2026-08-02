package ru.yandex.taxi.logistics.sdk.tracking.impl.domain.neuropostcard_network;

import defpackage.an2;
import defpackage.q76;
import defpackage.s490;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.Responses$EmptyResponseDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.Responses$OperationIdResponseDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliverypostcard.PostcardGenerateRequestDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliverypostcard.PostcardSetTextRequestDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliverypostcard.PostcardSubmitRequestDto;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH'¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lru/yandex/taxi/logistics/sdk/tracking/impl/domain/neuropostcard_network/NeuroPostcardApi;", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverypostcard/PostcardGenerateRequestDto;", "body", "Lan2;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/Responses$OperationIdResponseDto;", "c", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverypostcard/PostcardGenerateRequestDto;)Lan2;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverypostcard/PostcardSetTextRequestDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/Responses$EmptyResponseDto;", "a", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverypostcard/PostcardSetTextRequestDto;)Lan2;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverypostcard/PostcardSubmitRequestDto;", "b", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverypostcard/PostcardSubmitRequestDto;)Lan2;", MetaDataField.SCREEN_FIELD}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface NeuroPostcardApi {
    @s490("/4.0/cargo-c2c/v1/delivery/postcard/set-text")
    an2<Responses$EmptyResponseDto> a(@q76 PostcardSetTextRequestDto body);

    @s490("/4.0/cargo-c2c/v1/delivery/postcard/submit")
    an2<Responses$EmptyResponseDto> b(@q76 PostcardSubmitRequestDto body);

    @s490("/4.0/cargo-c2c/v1/delivery/postcard/generate")
    an2<Responses$OperationIdResponseDto> c(@q76 PostcardGenerateRequestDto body);
}
