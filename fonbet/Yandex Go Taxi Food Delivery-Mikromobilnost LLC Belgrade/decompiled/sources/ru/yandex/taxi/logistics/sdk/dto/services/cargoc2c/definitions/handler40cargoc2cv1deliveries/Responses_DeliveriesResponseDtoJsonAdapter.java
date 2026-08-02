package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveries;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveries.Responses$DeliveriesResponseDto;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveries/Responses_DeliveriesResponseDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveries/Responses$DeliveriesResponseDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveries/Responses$DeliveriesResponseDto$DeliveriesDto;", "listOfDeliveriesDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "listOfStringAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Responses_DeliveriesResponseDtoJsonAdapter extends JsonAdapter<Responses$DeliveriesResponseDto> {
    private final JsonAdapter<List<Responses$DeliveriesResponseDto.DeliveriesDto>> listOfDeliveriesDtoAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("deliveries", "shipments");

    public Responses_DeliveriesResponseDtoJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, Responses$DeliveriesResponseDto.DeliveriesDto.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfDeliveriesDtoAdapter = moshi.adapter(newParameterizedType, emptySet, "deliveries");
        this.listOfStringAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), emptySet, "shipments");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Responses$DeliveriesResponseDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<Responses$DeliveriesResponseDto.DeliveriesDto> list = null;
        List<String> list2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfDeliveriesDtoAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("deliveries", "deliveries", jsonReader);
                }
            } else if (selectName == 1 && (list2 = this.listOfStringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("shipments", "shipments", jsonReader);
            }
        }
        jsonReader.endObject();
        if (list == null) {
            throw Util.missingProperty("deliveries", "deliveries", jsonReader);
        }
        if (list2 != null) {
            return new Responses$DeliveriesResponseDto(list, list2);
        }
        throw Util.missingProperty("shipments", "shipments", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Responses$DeliveriesResponseDto responses$DeliveriesResponseDto) {
        Responses$DeliveriesResponseDto responses$DeliveriesResponseDto2 = responses$DeliveriesResponseDto;
        if (responses$DeliveriesResponseDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("deliveries");
        this.listOfDeliveriesDtoAdapter.toJson(jsonWriter, (JsonWriter) responses$DeliveriesResponseDto2.getDeliveries());
        jsonWriter.name("shipments");
        this.listOfStringAdapter.toJson(jsonWriter, (JsonWriter) responses$DeliveriesResponseDto2.getShipments());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(53, "GeneratedJsonAdapter(Responses.DeliveriesResponseDto)");
    }
}
