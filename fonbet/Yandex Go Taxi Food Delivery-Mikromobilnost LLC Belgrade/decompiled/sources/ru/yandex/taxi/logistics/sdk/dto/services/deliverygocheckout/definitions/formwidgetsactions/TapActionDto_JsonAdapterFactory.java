package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

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
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.TapActionDto;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto_JsonAdapterFactory;", "Lcom/squareup/moshi/JsonAdapter$Factory;", "<init>", "()V", "create", "Lcom/squareup/moshi/JsonAdapter;", "", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "moshi", "Lcom/squareup/moshi/Moshi;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TapActionDto_JsonAdapterFactory implements JsonAdapter.Factory {
    @Override // com.squareup.moshi.JsonAdapter.Factory
    public JsonAdapter<Object> create(Type type, Set<? extends Annotation> annotations, Moshi moshi) {
        if (jl40.l(_MoshiKotlinTypesExtensionsKt.getRawType(type), TapActionDto.class)) {
            return PolymorphicJsonAdapterFactory.of(TapActionDto.class, "type").withSubtype(TapActionDto.TapAction_AddDestinationDto.class, "add_destination").withSubtype(TapActionDto.TapAction_AddPhotocommentsDto.class, "add_photocomments").withSubtype(TapActionDto.TapAction_AiChatDto.class, "ai_chat").withSubtype(TapActionDto.TapAction_ArBoxesSmartCameraDto.class, "ar_boxes_smart_camera").withSubtype(TapActionDto.TapAction_AsyncDto.class, "async").withSubtype(TapActionDto.TapAction_BannerDto.class, "banner").withSubtype(TapActionDto.TapAction_ChangeClientStateDto.class, "change_client_state").withSubtype(TapActionDto.TapAction_ChangePointsOrderDto.class, "change_points_order").withSubtype(TapActionDto.TapAction_ChangeRouteDetailsDto.class, "change_route_details").withSubtype(TapActionDto.TapAction_ClientStateTransformDto.class, "client_state_transform").withSubtype(TapActionDto.TapAction_CloseDto.class, "close").withSubtype(TapActionDto.TapAction_CloseModalDto.class, "close_modal").withSubtype(TapActionDto.TapAction_CompositeDto.class, "composite").withSubtype(TapActionDto.TapAction_DeeplinkDto.class, Constants.DEEPLINK).withSubtype(TapActionDto.TapAction_DeleteAddressDto.class, "delete_address").withSubtype(TapActionDto.TapAction_DisableCurrentPromocodeActionDto.class, "disable_current_promocode_action").withSubtype(TapActionDto.TapAction_ModalDto.class, "modal").withSubtype(TapActionDto.TapAction_OpenCostCentersDto.class, "open_cost_centers").withSubtype(TapActionDto.TapAction_OpenMapDto.class, "open_map").withSubtype(TapActionDto.TapAction_OpenPlacesSuggestDto.class, "open_places_suggest").withSubtype(TapActionDto.TapAction_OpenPromocodeWindowActionDto.class, "open_promocode_window_action").withSubtype(TapActionDto.TapAction_OpenRouteDetailsDto.class, "open_route_details").withSubtype(TapActionDto.TapAction_OpenWebViewDto.class, "open_web_view").withSubtype(TapActionDto.TapAction_OrderDto.class, "order").withSubtype(TapActionDto.TapAction_PaymentMethodsActionDto.class, "payment_methods_action").withSubtype(TapActionDto.TapAction_ResetDueDto.class, "reset_due").withSubtype(TapActionDto.TapAction_ScrollToWidgetDto.class, "scroll_to_widget").withSubtype(TapActionDto.TapAction_SelectAddressDto.class, "select_address").withSubtype(TapActionDto.TapAction_SelectContactDto.class, "select_contact").withSubtype(TapActionDto.TapAction_SelectDueDto.class, "select_due").withSubtype(TapActionDto.TapAction_ShareDto.class, "share").withSubtype(TapActionDto.TapAction_ShareFormDto.class, "share_form").withDefaultValue(new TapActionDto.Unknown_TapActionDto(0)).create(type, EmptySet.a, moshi);
        }
        return null;
    }
}
