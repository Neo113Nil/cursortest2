package ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data;

import defpackage.q76;
import defpackage.s490;
import defpackage.z8u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.Responses$OperationIdResponseDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveryfeedback.DeliveryFeedbackRequestDto;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lru/yandex/taxi/logistics/sdk/tracking/domain/impl/data/FeedbackApi;", "", "", "idempotencyToken", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryfeedback/DeliveryFeedbackRequestDto;", "request", "Lretrofit2/Response;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/Responses$OperationIdResponseDto;", "a", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryfeedback/DeliveryFeedbackRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface FeedbackApi {
    @s490("/4.0/cargo-c2c/v1/delivery/feedback")
    Object a(@z8u("X-Idempotency-Token") String str, @q76 DeliveryFeedbackRequestDto deliveryFeedbackRequestDto, Continuation<? super Response<Responses$OperationIdResponseDto>> continuation);
}
