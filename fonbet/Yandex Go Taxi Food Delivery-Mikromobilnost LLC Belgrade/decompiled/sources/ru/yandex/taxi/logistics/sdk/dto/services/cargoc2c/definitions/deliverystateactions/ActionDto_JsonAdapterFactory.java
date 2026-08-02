package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.adjust.sdk.Constants;
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
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionDto;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionDto_JsonAdapterFactory;", "Lcom/squareup/moshi/JsonAdapter$Factory;", "<init>", "()V", "create", "Lcom/squareup/moshi/JsonAdapter;", "", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "moshi", "Lcom/squareup/moshi/Moshi;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ActionDto_JsonAdapterFactory implements JsonAdapter.Factory {
    @Override // com.squareup.moshi.JsonAdapter.Factory
    public JsonAdapter<Object> create(Type type, Set<? extends Annotation> annotations, Moshi moshi) {
        if (jl40.l(_MoshiKotlinTypesExtensionsKt.getRawType(type), ActionDto.class)) {
            return PolymorphicJsonAdapterFactory.of(ActionDto.class, "type").withSubtype(ActionDto.Action_CancelDto.class, "cancel").withSubtype(ActionDto.Action_CancelFeedbackDto.class, "cancel_feedback").withSubtype(ActionDto.Action_CancelV2Dto.class, "cancel_v2").withSubtype(ActionDto.Action_ChangeDateTimeDto.class, "change_date_time").withSubtype(ActionDto.Action_DeeplinkDto.class, Constants.DEEPLINK).withSubtype(ActionDto.Action_DialogDto.class, "dialog").withSubtype(ActionDto.Action_DynamicCancelDto.class, "dynamic_cancel").withSubtype(ActionDto.Action_EditOrderDto.class, "edit_order").withSubtype(ActionDto.Action_ExtendDeliveryExpirationDateDto.class, "extend_delivery_expiration_date").withSubtype(ActionDto.Action_FeedbackDto.class, "feedback").withSubtype(ActionDto.Action_OpenChatDto.class, "open_chat").withSubtype(ActionDto.Action_OpenFormDto.class, "open_form").withSubtype(ActionDto.Action_OpenTrackingCardDto.class, "open_tracking_card").withSubtype(ActionDto.Action_OpenUniversalLinkDto.class, "open_universal_link").withSubtype(ActionDto.Action_OpenYandexMessengerSupportChatDto.class, "open_yandex_messenger_support_chat").withSubtype(ActionDto.Action_OrderMoreDto.class, "order_more").withSubtype(ActionDto.Action_PayNowDto.class, "pay_now").withSubtype(ActionDto.Action_PayNowInWebDto.class, "pay_now_in_web").withSubtype(ActionDto.Action_PerformerCallDto.class, "performer_call").withSubtype(ActionDto.Action_RoverDto.class, "rover").withSubtype(ActionDto.Action_ShareDto.class, "share").withSubtype(ActionDto.Action_ShareLocationDto.class, "share_location").withSubtype(ActionDto.Action_ShowContentOrderHistoryDto.class, "show_content_order_history").withSubtype(ActionDto.Action_ShowSupportWebDto.class, "show_support_web").withSubtype(ActionDto.Action_TipsDto.class, "tips").withSubtype(ActionDto.Action_WebTipsDto.class, "web_tips").withDefaultValue(new ActionDto.Unknown_ActionDto(0)).create(type, EmptySet.a, moshi);
        }
        return null;
    }
}
