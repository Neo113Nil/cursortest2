package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handlersdefinitions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import kotlin.Metadata;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionOpenFormDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handlersdefinitions.CancelInfoActionDto;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/CancelInfoActionDto_CancelInfoAction_OpenFormDto_JsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/CancelInfoActionDto$CancelInfoAction_OpenFormDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenFormDto;", "delegateAdapter", "Lcom/squareup/moshi/JsonAdapter;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CancelInfoActionDto_CancelInfoAction_OpenFormDto_JsonAdapter extends JsonAdapter<CancelInfoActionDto.CancelInfoAction_OpenFormDto> {
    private final JsonAdapter<ActionOpenFormDto> delegateAdapter;

    public CancelInfoActionDto_CancelInfoAction_OpenFormDto_JsonAdapter(Moshi moshi) {
        this.delegateAdapter = moshi.adapter(ActionOpenFormDto.class);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CancelInfoActionDto.CancelInfoAction_OpenFormDto fromJson(JsonReader jsonReader) {
        ActionOpenFormDto fromJson = this.delegateAdapter.fromJson(jsonReader);
        fromJson.getClass();
        return new CancelInfoActionDto.CancelInfoAction_OpenFormDto("open_form", fromJson);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CancelInfoActionDto.CancelInfoAction_OpenFormDto cancelInfoAction_OpenFormDto) {
        CancelInfoActionDto.CancelInfoAction_OpenFormDto cancelInfoAction_OpenFormDto2 = cancelInfoAction_OpenFormDto;
        if (cancelInfoAction_OpenFormDto2 == null) {
            return;
        }
        this.delegateAdapter.toJson(jsonWriter, (JsonWriter) cancelInfoAction_OpenFormDto2.b);
    }
}
