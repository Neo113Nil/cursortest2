package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.orderedit;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/LpEditDestinationInfoDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/LpEditDestinationInfoDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/LpEditDeliveryIntervalDto;", "nullableLpEditDeliveryIntervalDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LpEditDestinationInfoDtoJsonAdapter extends JsonAdapter<LpEditDestinationInfoDto> {
    private final JsonAdapter<LpEditDeliveryIntervalDto> nullableLpEditDeliveryIntervalDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("delivery_interval");

    public LpEditDestinationInfoDtoJsonAdapter(Moshi moshi) {
        this.nullableLpEditDeliveryIntervalDtoAdapter = moshi.adapter(LpEditDeliveryIntervalDto.class, EmptySet.a, "deliveryInterval");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final LpEditDestinationInfoDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        LpEditDeliveryIntervalDto lpEditDeliveryIntervalDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                lpEditDeliveryIntervalDto = this.nullableLpEditDeliveryIntervalDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new LpEditDestinationInfoDto(lpEditDeliveryIntervalDto);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, LpEditDestinationInfoDto lpEditDestinationInfoDto) {
        LpEditDestinationInfoDto lpEditDestinationInfoDto2 = lpEditDestinationInfoDto;
        if (lpEditDestinationInfoDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("delivery_interval");
        this.nullableLpEditDeliveryIntervalDtoAdapter.toJson(jsonWriter, (JsonWriter) lpEditDestinationInfoDto2.getDeliveryInterval());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(46, "GeneratedJsonAdapter(LpEditDestinationInfoDto)");
    }
}
