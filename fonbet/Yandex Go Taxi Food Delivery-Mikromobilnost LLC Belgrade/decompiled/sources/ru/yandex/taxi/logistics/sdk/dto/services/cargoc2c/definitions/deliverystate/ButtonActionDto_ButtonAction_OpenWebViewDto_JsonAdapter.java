package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import kotlin.Metadata;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.ButtonActionDto;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/ButtonActionDto_ButtonAction_OpenWebViewDto_JsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/ButtonActionDto$ButtonAction_OpenWebViewDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/OpenWebViewButtonActionDto;", "delegateAdapter", "Lcom/squareup/moshi/JsonAdapter;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ButtonActionDto_ButtonAction_OpenWebViewDto_JsonAdapter extends JsonAdapter<ButtonActionDto.ButtonAction_OpenWebViewDto> {
    private final JsonAdapter<OpenWebViewButtonActionDto> delegateAdapter;

    public ButtonActionDto_ButtonAction_OpenWebViewDto_JsonAdapter(Moshi moshi) {
        this.delegateAdapter = moshi.adapter(OpenWebViewButtonActionDto.class);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ButtonActionDto.ButtonAction_OpenWebViewDto fromJson(JsonReader jsonReader) {
        OpenWebViewButtonActionDto fromJson = this.delegateAdapter.fromJson(jsonReader);
        fromJson.getClass();
        return new ButtonActionDto.ButtonAction_OpenWebViewDto("open-web-view", fromJson);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ButtonActionDto.ButtonAction_OpenWebViewDto buttonAction_OpenWebViewDto) {
        ButtonActionDto.ButtonAction_OpenWebViewDto buttonAction_OpenWebViewDto2 = buttonAction_OpenWebViewDto;
        if (buttonAction_OpenWebViewDto2 == null) {
            return;
        }
        this.delegateAdapter.toJson(jsonWriter, (JsonWriter) buttonAction_OpenWebViewDto2.b);
    }
}
