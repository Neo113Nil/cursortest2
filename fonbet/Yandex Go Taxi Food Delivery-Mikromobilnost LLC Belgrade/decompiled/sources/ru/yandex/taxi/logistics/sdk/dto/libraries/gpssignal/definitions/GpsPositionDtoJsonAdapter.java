package ru.yandex.taxi.logistics.sdk.dto.libraries.gpssignal.definitions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/gpssignal/definitions/GpsPositionDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/gpssignal/definitions/GpsPositionDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "doubleAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "nullableDoubleAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GpsPositionDtoJsonAdapter extends JsonAdapter<GpsPositionDto> {
    private final JsonAdapter<Double> doubleAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Double> nullableDoubleAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("lat", "lon", ClidProvider.TIMESTAMP, "accuracy", "altitude", "speed", "direction");

    public GpsPositionDtoJsonAdapter(Moshi moshi) {
        Class cls = Double.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.doubleAdapter = moshi.adapter(cls, emptySet, "lat");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, ClidProvider.TIMESTAMP);
        this.nullableDoubleAdapter = moshi.adapter(Double.class, emptySet, "accuracy");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GpsPositionDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Double d = null;
        Double d2 = null;
        Long l = null;
        Double d3 = null;
        Double d4 = null;
        Double d5 = null;
        Double d6 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    d = this.doubleAdapter.fromJson(jsonReader);
                    if (d == null) {
                        throw Util.unexpectedNull("lat", "lat", jsonReader);
                    }
                    break;
                case 1:
                    d2 = this.doubleAdapter.fromJson(jsonReader);
                    if (d2 == null) {
                        throw Util.unexpectedNull("lon", "lon", jsonReader);
                    }
                    break;
                case 2:
                    l = this.longAdapter.fromJson(jsonReader);
                    if (l == null) {
                        throw Util.unexpectedNull(ClidProvider.TIMESTAMP, ClidProvider.TIMESTAMP, jsonReader);
                    }
                    break;
                case 3:
                    d3 = this.nullableDoubleAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    d4 = this.nullableDoubleAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    d5 = this.nullableDoubleAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    d6 = this.nullableDoubleAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (d == null) {
            throw Util.missingProperty("lat", "lat", jsonReader);
        }
        double doubleValue = d.doubleValue();
        if (d2 == null) {
            throw Util.missingProperty("lon", "lon", jsonReader);
        }
        double doubleValue2 = d2.doubleValue();
        if (l != null) {
            return new GpsPositionDto(doubleValue, doubleValue2, l.longValue(), d3, d4, d5, d6);
        }
        throw Util.missingProperty(ClidProvider.TIMESTAMP, ClidProvider.TIMESTAMP, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GpsPositionDto gpsPositionDto) {
        GpsPositionDto gpsPositionDto2 = gpsPositionDto;
        if (gpsPositionDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("lat");
        this.doubleAdapter.toJson(jsonWriter, (JsonWriter) Double.valueOf(gpsPositionDto2.getLat()));
        jsonWriter.name("lon");
        this.doubleAdapter.toJson(jsonWriter, (JsonWriter) Double.valueOf(gpsPositionDto2.getLon()));
        jsonWriter.name(ClidProvider.TIMESTAMP);
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(gpsPositionDto2.getTimestamp()));
        jsonWriter.name("accuracy");
        this.nullableDoubleAdapter.toJson(jsonWriter, (JsonWriter) gpsPositionDto2.getAccuracy());
        jsonWriter.name("altitude");
        this.nullableDoubleAdapter.toJson(jsonWriter, (JsonWriter) gpsPositionDto2.getAltitude());
        jsonWriter.name("speed");
        this.nullableDoubleAdapter.toJson(jsonWriter, (JsonWriter) gpsPositionDto2.getSpeed());
        jsonWriter.name("direction");
        this.nullableDoubleAdapter.toJson(jsonWriter, (JsonWriter) gpsPositionDto2.getDirection());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(36, "GeneratedJsonAdapter(GpsPositionDto)");
    }
}
