package ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.ATImagePropertyDto;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATImagePropertyDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATImagePropertyDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableIntAdapter", "", "nullableDoubleAdapter", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATImagePropertyDto$VerticalAlignmentDto;", "nullableVerticalAlignmentDtoAdapter", "nullableStringAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ATImagePropertyDtoJsonAdapter extends JsonAdapter<ATImagePropertyDto> {
    private final JsonAdapter<Double> nullableDoubleAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<ATImagePropertyDto.VerticalAlignmentDto> nullableVerticalAlignmentDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("image_tag", "width", "height", "baseline_offset", "vertical_alignment", "color", "meta_color");
    private final JsonAdapter<String> stringAdapter;

    public ATImagePropertyDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "imageTag");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "width");
        this.nullableDoubleAdapter = moshi.adapter(Double.class, emptySet, "baselineOffset");
        this.nullableVerticalAlignmentDtoAdapter = moshi.adapter(ATImagePropertyDto.VerticalAlignmentDto.class, emptySet, "verticalAlignment");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "color");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ATImagePropertyDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        Integer num = null;
        Integer num2 = null;
        Double d = null;
        ATImagePropertyDto.VerticalAlignmentDto verticalAlignmentDto = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("imageTag", "image_tag", jsonReader);
                    }
                    break;
                case 1:
                    num = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    num2 = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    d = this.nullableDoubleAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    verticalAlignmentDto = this.nullableVerticalAlignmentDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (str != null) {
            return new ATImagePropertyDto(str, num, num2, d, verticalAlignmentDto, str2, str3);
        }
        throw Util.missingProperty("imageTag", "image_tag", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ATImagePropertyDto aTImagePropertyDto) {
        ATImagePropertyDto aTImagePropertyDto2 = aTImagePropertyDto;
        if (aTImagePropertyDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("image_tag");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) aTImagePropertyDto2.getImageTag());
        jsonWriter.name("width");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) aTImagePropertyDto2.getWidth());
        jsonWriter.name("height");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) aTImagePropertyDto2.getHeight());
        jsonWriter.name("baseline_offset");
        this.nullableDoubleAdapter.toJson(jsonWriter, (JsonWriter) aTImagePropertyDto2.getBaselineOffset());
        jsonWriter.name("vertical_alignment");
        this.nullableVerticalAlignmentDtoAdapter.toJson(jsonWriter, (JsonWriter) aTImagePropertyDto2.getVerticalAlignment());
        jsonWriter.name("color");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) aTImagePropertyDto2.getColor());
        jsonWriter.name("meta_color");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) aTImagePropertyDto2.getMetaColor());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(ATImagePropertyDto)");
    }
}
