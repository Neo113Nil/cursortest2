package ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import kotlin.Metadata;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.ATUnitDto;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATUnitDto_ATUnit_ImageDto_JsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATUnitDto$ATUnit_ImageDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATImagePropertyDto;", "delegateAdapter", "Lcom/squareup/moshi/JsonAdapter;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ATUnitDto_ATUnit_ImageDto_JsonAdapter extends JsonAdapter<ATUnitDto.ATUnit_ImageDto> {
    private final JsonAdapter<ATImagePropertyDto> delegateAdapter;

    public ATUnitDto_ATUnit_ImageDto_JsonAdapter(Moshi moshi) {
        this.delegateAdapter = moshi.adapter(ATImagePropertyDto.class);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ATUnitDto.ATUnit_ImageDto fromJson(JsonReader jsonReader) {
        ATImagePropertyDto fromJson = this.delegateAdapter.fromJson(jsonReader);
        fromJson.getClass();
        return new ATUnitDto.ATUnit_ImageDto("image", fromJson);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ATUnitDto.ATUnit_ImageDto aTUnit_ImageDto) {
        ATUnitDto.ATUnit_ImageDto aTUnit_ImageDto2 = aTUnit_ImageDto;
        if (aTUnit_ImageDto2 == null) {
            return;
        }
        this.delegateAdapter.toJson(jsonWriter, (JsonWriter) aTUnit_ImageDto2.b);
    }
}
