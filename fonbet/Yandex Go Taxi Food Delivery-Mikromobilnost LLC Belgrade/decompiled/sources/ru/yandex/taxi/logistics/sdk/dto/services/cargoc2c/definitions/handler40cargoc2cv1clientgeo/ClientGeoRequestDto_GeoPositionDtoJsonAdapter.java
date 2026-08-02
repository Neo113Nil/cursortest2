package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1clientgeo;

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
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1clientgeo.ClientGeoRequestDto;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1clientgeo/ClientGeoRequestDto_GeoPositionDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1clientgeo/ClientGeoRequestDto$GeoPositionDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "doubleAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ClientGeoRequestDto_GeoPositionDtoJsonAdapter extends JsonAdapter<ClientGeoRequestDto.GeoPositionDto> {
    private final JsonAdapter<Double> doubleAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("accuracy", "lat", "lon", ClidProvider.TIMESTAMP);
    private final JsonAdapter<String> stringAdapter;

    public ClientGeoRequestDto_GeoPositionDtoJsonAdapter(Moshi moshi) {
        Class cls = Double.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.doubleAdapter = moshi.adapter(cls, emptySet, "accuracy");
        this.stringAdapter = moshi.adapter(String.class, emptySet, ClidProvider.TIMESTAMP);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ClientGeoRequestDto.GeoPositionDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Double d = null;
        Double d2 = null;
        Double d3 = null;
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                d = this.doubleAdapter.fromJson(jsonReader);
                if (d == null) {
                    throw Util.unexpectedNull("accuracy", "accuracy", jsonReader);
                }
            } else if (selectName == 1) {
                d2 = this.doubleAdapter.fromJson(jsonReader);
                if (d2 == null) {
                    throw Util.unexpectedNull("lat", "lat", jsonReader);
                }
            } else if (selectName == 2) {
                d3 = this.doubleAdapter.fromJson(jsonReader);
                if (d3 == null) {
                    throw Util.unexpectedNull("lon", "lon", jsonReader);
                }
            } else if (selectName == 3 && (str = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull(ClidProvider.TIMESTAMP, ClidProvider.TIMESTAMP, jsonReader);
            }
        }
        jsonReader.endObject();
        if (d == null) {
            throw Util.missingProperty("accuracy", "accuracy", jsonReader);
        }
        double doubleValue = d.doubleValue();
        if (d2 == null) {
            throw Util.missingProperty("lat", "lat", jsonReader);
        }
        double doubleValue2 = d2.doubleValue();
        if (d3 == null) {
            throw Util.missingProperty("lon", "lon", jsonReader);
        }
        double doubleValue3 = d3.doubleValue();
        if (str != null) {
            return new ClientGeoRequestDto.GeoPositionDto(doubleValue, doubleValue2, doubleValue3, str);
        }
        throw Util.missingProperty(ClidProvider.TIMESTAMP, ClidProvider.TIMESTAMP, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ClientGeoRequestDto.GeoPositionDto geoPositionDto) {
        ClientGeoRequestDto.GeoPositionDto geoPositionDto2 = geoPositionDto;
        if (geoPositionDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("accuracy");
        this.doubleAdapter.toJson(jsonWriter, (JsonWriter) Double.valueOf(geoPositionDto2.getAccuracy()));
        jsonWriter.name("lat");
        this.doubleAdapter.toJson(jsonWriter, (JsonWriter) Double.valueOf(geoPositionDto2.getLat()));
        jsonWriter.name("lon");
        this.doubleAdapter.toJson(jsonWriter, (JsonWriter) Double.valueOf(geoPositionDto2.getLon()));
        jsonWriter.name(ClidProvider.TIMESTAMP);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) geoPositionDto2.getTimestamp());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(56, "GeneratedJsonAdapter(ClientGeoRequestDto.GeoPositionDto)");
    }
}
