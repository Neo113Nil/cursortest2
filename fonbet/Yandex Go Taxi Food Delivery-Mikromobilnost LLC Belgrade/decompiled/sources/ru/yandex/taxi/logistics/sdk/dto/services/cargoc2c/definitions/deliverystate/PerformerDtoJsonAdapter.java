package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PerformerDtoJsonAdapter extends JsonAdapter<PerformerDto> {
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("name", "short_name", "vehicle_model", "vehicle_number", "rating", "photo_url", "image_tag_default", "phone");
    private final JsonAdapter<String> stringAdapter;

    public PerformerDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "name");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "vehicleModel");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PerformerDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        while (jsonReader.hasNext()) {
            String str9 = str;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("name", "name", jsonReader);
                    }
                    continue;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("shortName", "short_name", jsonReader);
                    }
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    str7 = this.stringAdapter.fromJson(jsonReader);
                    if (str7 == null) {
                        throw Util.unexpectedNull("imageTagDefault", "image_tag_default", jsonReader);
                    }
                    break;
                case 7:
                    str8 = this.stringAdapter.fromJson(jsonReader);
                    if (str8 == null) {
                        throw Util.unexpectedNull("phone", "phone", jsonReader);
                    }
                    break;
            }
            str = str9;
        }
        String str10 = str;
        jsonReader.endObject();
        if (str10 == null) {
            throw Util.missingProperty("name", "name", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("shortName", "short_name", jsonReader);
        }
        if (str7 == null) {
            throw Util.missingProperty("imageTagDefault", "image_tag_default", jsonReader);
        }
        if (str8 != null) {
            return new PerformerDto(str10, str2, str3, str4, str5, str6, str7, str8);
        }
        throw Util.missingProperty("phone", "phone", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PerformerDto performerDto) {
        PerformerDto performerDto2 = performerDto;
        if (performerDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("name");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) performerDto2.getName());
        jsonWriter.name("short_name");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) performerDto2.getShortName());
        jsonWriter.name("vehicle_model");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) performerDto2.getVehicleModel());
        jsonWriter.name("vehicle_number");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) performerDto2.getVehicleNumber());
        jsonWriter.name("rating");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) performerDto2.getRating());
        jsonWriter.name("photo_url");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) performerDto2.getPhotoUrl());
        jsonWriter.name("image_tag_default");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) performerDto2.getImageTagDefault());
        jsonWriter.name("phone");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) performerDto2.getPhone());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(34, "GeneratedJsonAdapter(PerformerDto)");
    }
}
