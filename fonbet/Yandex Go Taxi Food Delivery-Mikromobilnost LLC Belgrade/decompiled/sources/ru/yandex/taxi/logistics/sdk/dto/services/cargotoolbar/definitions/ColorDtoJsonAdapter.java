package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "", "nullableDoubleAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ColorDtoJsonAdapter extends JsonAdapter<ColorDto> {
    private final JsonAdapter<Double> nullableDoubleAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("semantic_color", "color_day", "color_night", "alpha_day", "alpha_night");
    private final JsonAdapter<String> stringAdapter;

    public ColorDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "semanticColor");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "colorDay");
        this.nullableDoubleAdapter = moshi.adapter(Double.class, emptySet, "alphaDay");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ColorDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        Double d2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("colorDay", "color_day", jsonReader);
                }
            } else if (selectName == 2) {
                str3 = this.stringAdapter.fromJson(jsonReader);
                if (str3 == null) {
                    throw Util.unexpectedNull("colorNight", "color_night", jsonReader);
                }
            } else if (selectName == 3) {
                d = this.nullableDoubleAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                d2 = this.nullableDoubleAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str2 == null) {
            throw Util.missingProperty("colorDay", "color_day", jsonReader);
        }
        if (str3 != null) {
            return new ColorDto(str, str2, str3, d, d2);
        }
        throw Util.missingProperty("colorNight", "color_night", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ColorDto colorDto) {
        ColorDto colorDto2 = colorDto;
        if (colorDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("semantic_color");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) colorDto2.getSemanticColor());
        jsonWriter.name("color_day");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) colorDto2.getColorDay());
        jsonWriter.name("color_night");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) colorDto2.getColorNight());
        jsonWriter.name("alpha_day");
        this.nullableDoubleAdapter.toJson(jsonWriter, (JsonWriter) colorDto2.getAlphaDay());
        jsonWriter.name("alpha_night");
        this.nullableDoubleAdapter.toJson(jsonWriter, (JsonWriter) colorDto2.getAlphaNight());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(30, "GeneratedJsonAdapter(ColorDto)");
    }
}
