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
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.TextDecorationLineThroughDto;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/TextDecorationLineThroughDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/TextDecorationLineThroughDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/TextDecorationLineThroughDto$StyleDto;", "styleDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TextDecorationLineThroughDtoJsonAdapter extends JsonAdapter<TextDecorationLineThroughDto> {
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("style", "color");
    private final JsonAdapter<TextDecorationLineThroughDto.StyleDto> styleDtoAdapter;

    public TextDecorationLineThroughDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.styleDtoAdapter = moshi.adapter(TextDecorationLineThroughDto.StyleDto.class, emptySet, "style");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "color");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TextDecorationLineThroughDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        TextDecorationLineThroughDto.StyleDto styleDto = null;
        String str = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                styleDto = this.styleDtoAdapter.fromJson(jsonReader);
                if (styleDto == null) {
                    throw Util.unexpectedNull("style", "style", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (styleDto != null) {
            return new TextDecorationLineThroughDto(styleDto, str);
        }
        throw Util.missingProperty("style", "style", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TextDecorationLineThroughDto textDecorationLineThroughDto) {
        TextDecorationLineThroughDto textDecorationLineThroughDto2 = textDecorationLineThroughDto;
        if (textDecorationLineThroughDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("style");
        this.styleDtoAdapter.toJson(jsonWriter, (JsonWriter) textDecorationLineThroughDto2.getStyle());
        jsonWriter.name("color");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) textDecorationLineThroughDto2.getColor());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(50, "GeneratedJsonAdapter(TextDecorationLineThroughDto)");
    }
}
