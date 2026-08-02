package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import kotlin.Metadata;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.DigitsInputTypeDto;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DigitsInputTypeDto_DigitsInputType_CostDto_JsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DigitsInputTypeDto$DigitsInputType_CostDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CostDigitsInputTypeDto;", "delegateAdapter", "Lcom/squareup/moshi/JsonAdapter;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DigitsInputTypeDto_DigitsInputType_CostDto_JsonAdapter extends JsonAdapter<DigitsInputTypeDto.DigitsInputType_CostDto> {
    private final JsonAdapter<CostDigitsInputTypeDto> delegateAdapter;

    public DigitsInputTypeDto_DigitsInputType_CostDto_JsonAdapter(Moshi moshi) {
        this.delegateAdapter = moshi.adapter(CostDigitsInputTypeDto.class);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DigitsInputTypeDto.DigitsInputType_CostDto fromJson(JsonReader jsonReader) {
        CostDigitsInputTypeDto fromJson = this.delegateAdapter.fromJson(jsonReader);
        fromJson.getClass();
        return new DigitsInputTypeDto.DigitsInputType_CostDto("cost", fromJson);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DigitsInputTypeDto.DigitsInputType_CostDto digitsInputType_CostDto) {
        DigitsInputTypeDto.DigitsInputType_CostDto digitsInputType_CostDto2 = digitsInputType_CostDto;
        if (digitsInputType_CostDto2 == null) {
            return;
        }
        this.delegateAdapter.toJson(jsonWriter, (JsonWriter) digitsInputType_CostDto2.b);
    }
}
