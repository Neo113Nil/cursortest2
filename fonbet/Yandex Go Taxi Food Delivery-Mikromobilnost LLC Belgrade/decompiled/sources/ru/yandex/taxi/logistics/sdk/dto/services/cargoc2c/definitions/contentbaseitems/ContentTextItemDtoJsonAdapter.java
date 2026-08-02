package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.contentbaseitems;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemTypographyDto;", "contentTextItemTypographyDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentFontWeightDto;", "nullableContentFontWeightDtoAdapter", "", "intAdapter", "", "nullableBooleanAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ContentTextItemDtoJsonAdapter extends JsonAdapter<ContentTextItemDto> {
    private final JsonAdapter<ContentTextItemTypographyDto> contentTextItemTypographyDtoAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<ContentFontWeightDto> nullableContentFontWeightDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("text", "typography", "weight", "color", "max_lines", "ignore_rtl");
    private final JsonAdapter<String> stringAdapter;

    public ContentTextItemDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "text");
        this.contentTextItemTypographyDtoAdapter = moshi.adapter(ContentTextItemTypographyDto.class, emptySet, "typography");
        this.nullableContentFontWeightDtoAdapter = moshi.adapter(ContentFontWeightDto.class, emptySet, "weight");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "maxLines");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "ignoreRtl");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ContentTextItemDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        String str = null;
        ContentTextItemTypographyDto contentTextItemTypographyDto = null;
        ContentFontWeightDto contentFontWeightDto = null;
        String str2 = null;
        Boolean bool = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("text", "text", jsonReader);
                    }
                    break;
                case 1:
                    contentTextItemTypographyDto = this.contentTextItemTypographyDtoAdapter.fromJson(jsonReader);
                    if (contentTextItemTypographyDto == null) {
                        throw Util.unexpectedNull("typography", "typography", jsonReader);
                    }
                    break;
                case 2:
                    contentFontWeightDto = this.nullableContentFontWeightDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("color", "color", jsonReader);
                    }
                    break;
                case 4:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("maxLines", "max_lines", jsonReader);
                    }
                    break;
                case 5:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("text", "text", jsonReader);
        }
        if (contentTextItemTypographyDto == null) {
            throw Util.missingProperty("typography", "typography", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("color", "color", jsonReader);
        }
        if (num != null) {
            return new ContentTextItemDto(str, contentTextItemTypographyDto, contentFontWeightDto, str2, num.intValue(), bool);
        }
        throw Util.missingProperty("maxLines", "max_lines", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ContentTextItemDto contentTextItemDto) {
        ContentTextItemDto contentTextItemDto2 = contentTextItemDto;
        if (contentTextItemDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) contentTextItemDto2.getText());
        jsonWriter.name("typography");
        this.contentTextItemTypographyDtoAdapter.toJson(jsonWriter, (JsonWriter) contentTextItemDto2.getTypography());
        jsonWriter.name("weight");
        this.nullableContentFontWeightDtoAdapter.toJson(jsonWriter, (JsonWriter) contentTextItemDto2.getWeight());
        jsonWriter.name("color");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) contentTextItemDto2.getColor());
        jsonWriter.name("max_lines");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(contentTextItemDto2.getMaxLines()));
        jsonWriter.name("ignore_rtl");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) contentTextItemDto2.getIgnoreRtl());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(ContentTextItemDto)");
    }
}
