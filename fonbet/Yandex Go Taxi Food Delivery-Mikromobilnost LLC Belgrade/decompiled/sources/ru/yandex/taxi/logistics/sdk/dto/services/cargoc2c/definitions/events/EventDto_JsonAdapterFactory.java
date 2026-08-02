package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi._MoshiKotlinTypesExtensionsKt;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import defpackage.jl40;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.EventDto;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto_JsonAdapterFactory;", "Lcom/squareup/moshi/JsonAdapter$Factory;", "<init>", "()V", "create", "Lcom/squareup/moshi/JsonAdapter;", "", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "moshi", "Lcom/squareup/moshi/Moshi;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventDto_JsonAdapterFactory implements JsonAdapter.Factory {
    @Override // com.squareup.moshi.JsonAdapter.Factory
    public JsonAdapter<Object> create(Type type, Set<? extends Annotation> annotations, Moshi moshi) {
        if (jl40.l(_MoshiKotlinTypesExtensionsKt.getRawType(type), EventDto.class)) {
            return PolymorphicJsonAdapterFactory.of(EventDto.class, "type").withSubtype(EventDto.Event_AiPostcardFailedDto.class, "ai-postcard-failed").withSubtype(EventDto.Event_AiPostcardGeneratedDto.class, "ai-postcard-generated").withSubtype(EventDto.Event_AiPostcardRequestedDto.class, "ai-postcard-requested").withSubtype(EventDto.Event_AiPostcardSubmittedDto.class, "ai-postcard-submitted").withSubtype(EventDto.Event_OrderCancelFailedDto.class, "order-cancel-failed").withSubtype(EventDto.Event_OrderCancelRequestedDto.class, "order-cancel-requested").withSubtype(EventDto.Event_OrderCancelSucceededDto.class, "order-cancel-succeeded").withSubtype(EventDto.Event_OrderCreateFailedDto.class, "order-create-failed").withSubtype(EventDto.Event_OrderCreateRequestedDto.class, "order-create-requested").withSubtype(EventDto.Event_OrderCreateSucceededDto.class, "order-create-succeeded").withSubtype(EventDto.Event_OrderEditFailedDto.class, "order-edit-failed").withSubtype(EventDto.Event_OrderEditSubmittedDto.class, "order-edit-submitted").withSubtype(EventDto.Event_OrderEditSucceededDto.class, "order-edit-succeeded").withSubtype(EventDto.Event_OrderPayNowFailedDto.class, "order-pay-now-failed").withSubtype(EventDto.Event_OrderPayNowRequestedDto.class, "order-pay-now-requested").withSubtype(EventDto.Event_OrderPayNowSucceededDto.class, "order-pay-now-succeeded").withSubtype(EventDto.Event_RoverActionFailedDto.class, "rover-action-failed").withSubtype(EventDto.Event_RoverActionRequestedDto.class, "rover-action-requested").withSubtype(EventDto.Event_RoverActionSubmittedDto.class, "rover-action-submitted").withSubtype(EventDto.Event_RoverActionSucceededDto.class, "rover-action-succeeded").withDefaultValue(new EventDto.Unknown_EventDto(0)).create(type, EmptySet.a, moshi);
        }
        return null;
    }
}
