package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions;

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
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ActionDto;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto_JsonAdapterFactory;", "Lcom/squareup/moshi/JsonAdapter$Factory;", "<init>", "()V", "create", "Lcom/squareup/moshi/JsonAdapter;", "", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "moshi", "Lcom/squareup/moshi/Moshi;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ActionDto_JsonAdapterFactory implements JsonAdapter.Factory {
    @Override // com.squareup.moshi.JsonAdapter.Factory
    public JsonAdapter<Object> create(Type type, Set<? extends Annotation> annotations, Moshi moshi) {
        if (jl40.l(_MoshiKotlinTypesExtensionsKt.getRawType(type), ActionDto.class)) {
            return PolymorphicJsonAdapterFactory.of(ActionDto.class, "type").withSubtype(ActionDto.Action_CloseActionDto.class, "close-action").withSubtype(ActionDto.Action_CustomActionDto.class, "custom-action").withSubtype(ActionDto.Action_DeeplinkActionDto.class, "deeplink-action").withSubtype(ActionDto.Action_EmptyActionDto.class, "empty-action").withSubtype(ActionDto.Action_OpenOrderFormActionDto.class, "open-order-form-action").withSubtype(ActionDto.Action_OpenTrackingCardDto.class, "open_tracking_card").withSubtype(ActionDto.Action_ShowModalViewActionDto.class, "show-modal-view-action").withSubtype(ActionDto.Action_StoryActionDto.class, "story-action").withSubtype(ActionDto.Action_SummaryRedirectActionDto.class, "summary-redirect-action").withSubtype(ActionDto.Action_SwitchProfileActionDto.class, "switch-profile-action").withSubtype(ActionDto.Action_WebViewActionDto.class, "web-view-action").withDefaultValue(new ActionDto.Unknown_ActionDto(0)).create(type, EmptySet.a, moshi);
        }
        return null;
    }
}
