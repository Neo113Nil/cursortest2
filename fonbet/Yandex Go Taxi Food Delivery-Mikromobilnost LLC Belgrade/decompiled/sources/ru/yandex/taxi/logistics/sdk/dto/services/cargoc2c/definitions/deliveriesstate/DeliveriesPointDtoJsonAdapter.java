package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliveriesstate;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PointPinDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PointTypeDto;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveriesstate/DeliveriesPointDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveriesstate/DeliveriesPointDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PointTypeDto;", "pointTypeDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "", "listOfDoubleAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/PointPinDto;", "nullablePointPinDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DeliveriesPointDtoJsonAdapter extends JsonAdapter<DeliveriesPointDto> {
    private final JsonAdapter<List<Double>> listOfDoubleAdapter;
    private final JsonAdapter<PointPinDto> nullablePointPinDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("type", "coordinates", "pin");
    private final JsonAdapter<PointTypeDto> pointTypeDtoAdapter;

    public DeliveriesPointDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.pointTypeDtoAdapter = moshi.adapter(PointTypeDto.class, emptySet, "type");
        this.listOfDoubleAdapter = moshi.adapter(Types.newParameterizedType(List.class, Double.class), emptySet, "coordinates");
        this.nullablePointPinDtoAdapter = moshi.adapter(PointPinDto.class, emptySet, "pin");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DeliveriesPointDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        PointTypeDto pointTypeDto = null;
        List<Double> list = null;
        PointPinDto pointPinDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                pointTypeDto = this.pointTypeDtoAdapter.fromJson(jsonReader);
                if (pointTypeDto == null) {
                    throw Util.unexpectedNull("type", "type", jsonReader);
                }
            } else if (selectName == 1) {
                list = this.listOfDoubleAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("coordinates", "coordinates", jsonReader);
                }
            } else if (selectName == 2) {
                pointPinDto = this.nullablePointPinDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (pointTypeDto == null) {
            throw Util.missingProperty("type", "type", jsonReader);
        }
        if (list != null) {
            return new DeliveriesPointDto(pointTypeDto, list, pointPinDto);
        }
        throw Util.missingProperty("coordinates", "coordinates", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DeliveriesPointDto deliveriesPointDto) {
        DeliveriesPointDto deliveriesPointDto2 = deliveriesPointDto;
        if (deliveriesPointDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("type");
        this.pointTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveriesPointDto2.getType());
        jsonWriter.name("coordinates");
        this.listOfDoubleAdapter.toJson(jsonWriter, (JsonWriter) deliveriesPointDto2.getCoordinates());
        jsonWriter.name("pin");
        this.nullablePointPinDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveriesPointDto2.getPin());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(DeliveriesPointDto)");
    }
}
