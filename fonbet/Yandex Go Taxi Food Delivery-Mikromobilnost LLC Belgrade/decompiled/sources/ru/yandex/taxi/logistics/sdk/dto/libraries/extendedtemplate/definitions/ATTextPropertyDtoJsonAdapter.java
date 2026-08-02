package ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions;

import androidx.core.provider.FontsContractCompat$Columns;
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
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.ATTextPropertyDto;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\"\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\"\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\f¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATTextPropertyDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATTextPropertyDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableIntAdapter", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATTextPropertyDto$FontWeightDto;", "nullableFontWeightDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATTextPropertyDto$FontStyleDto;", "nullableFontStyleDtoAdapter", "nullableStringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATTextPropertyDto$MetaStyleDto;", "nullableMetaStyleDtoAdapter", "", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATTextPropertyDto$TextDecorationDto;", "nullableListOfTextDecorationDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AnyTextDecorationDto;", "nullableListOfAnyTextDecorationDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATTextPropertyDto$DisplayDto;", "nullableDisplayDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ATTextPropertyDtoJsonAdapter extends JsonAdapter<ATTextPropertyDto> {
    private final JsonAdapter<ATTextPropertyDto.DisplayDto> nullableDisplayDtoAdapter;
    private final JsonAdapter<ATTextPropertyDto.FontStyleDto> nullableFontStyleDtoAdapter;
    private final JsonAdapter<ATTextPropertyDto.FontWeightDto> nullableFontWeightDtoAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<AnyTextDecorationDto>> nullableListOfAnyTextDecorationDtoAdapter;
    private final JsonAdapter<List<ATTextPropertyDto.TextDecorationDto>> nullableListOfTextDecorationDtoAdapter;
    private final JsonAdapter<ATTextPropertyDto.MetaStyleDto> nullableMetaStyleDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("text", "font_size", FontsContractCompat$Columns.WEIGHT, "font_style", "color", "meta_color", "meta_style", "text_decoration", "detailed_text_decoration", "display");
    private final JsonAdapter<String> stringAdapter;

    public ATTextPropertyDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "text");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "fontSize");
        this.nullableFontWeightDtoAdapter = moshi.adapter(ATTextPropertyDto.FontWeightDto.class, emptySet, "fontWeight");
        this.nullableFontStyleDtoAdapter = moshi.adapter(ATTextPropertyDto.FontStyleDto.class, emptySet, "fontStyle");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "color");
        this.nullableMetaStyleDtoAdapter = moshi.adapter(ATTextPropertyDto.MetaStyleDto.class, emptySet, "metaStyle");
        this.nullableListOfTextDecorationDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, ATTextPropertyDto.TextDecorationDto.class), emptySet, "textDecoration");
        this.nullableListOfAnyTextDecorationDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, AnyTextDecorationDto.class), emptySet, "detailedTextDecoration");
        this.nullableDisplayDtoAdapter = moshi.adapter(ATTextPropertyDto.DisplayDto.class, emptySet, "display");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ATTextPropertyDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        Integer num = null;
        ATTextPropertyDto.FontWeightDto fontWeightDto = null;
        ATTextPropertyDto.FontStyleDto fontStyleDto = null;
        String str2 = null;
        String str3 = null;
        ATTextPropertyDto.MetaStyleDto metaStyleDto = null;
        List<ATTextPropertyDto.TextDecorationDto> list = null;
        List<AnyTextDecorationDto> list2 = null;
        ATTextPropertyDto.DisplayDto displayDto = null;
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
                    num = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    fontWeightDto = this.nullableFontWeightDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    fontStyleDto = this.nullableFontStyleDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    metaStyleDto = this.nullableMetaStyleDtoAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    list = this.nullableListOfTextDecorationDtoAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    list2 = this.nullableListOfAnyTextDecorationDtoAdapter.fromJson(jsonReader);
                    break;
                case 9:
                    displayDto = this.nullableDisplayDtoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (str != null) {
            return new ATTextPropertyDto(str, num, fontWeightDto, fontStyleDto, str2, str3, metaStyleDto, list, list2, displayDto);
        }
        throw Util.missingProperty("text", "text", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ATTextPropertyDto aTTextPropertyDto) {
        ATTextPropertyDto aTTextPropertyDto2 = aTTextPropertyDto;
        if (aTTextPropertyDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) aTTextPropertyDto2.getText());
        jsonWriter.name("font_size");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) aTTextPropertyDto2.getFontSize());
        jsonWriter.name(FontsContractCompat$Columns.WEIGHT);
        this.nullableFontWeightDtoAdapter.toJson(jsonWriter, (JsonWriter) aTTextPropertyDto2.getFontWeight());
        jsonWriter.name("font_style");
        this.nullableFontStyleDtoAdapter.toJson(jsonWriter, (JsonWriter) aTTextPropertyDto2.getFontStyle());
        jsonWriter.name("color");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) aTTextPropertyDto2.getColor());
        jsonWriter.name("meta_color");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) aTTextPropertyDto2.getMetaColor());
        jsonWriter.name("meta_style");
        this.nullableMetaStyleDtoAdapter.toJson(jsonWriter, (JsonWriter) aTTextPropertyDto2.getMetaStyle());
        jsonWriter.name("text_decoration");
        this.nullableListOfTextDecorationDtoAdapter.toJson(jsonWriter, (JsonWriter) aTTextPropertyDto2.getTextDecoration());
        jsonWriter.name("detailed_text_decoration");
        this.nullableListOfAnyTextDecorationDtoAdapter.toJson(jsonWriter, (JsonWriter) aTTextPropertyDto2.getDetailedTextDecoration());
        jsonWriter.name("display");
        this.nullableDisplayDtoAdapter.toJson(jsonWriter, (JsonWriter) aTTextPropertyDto2.getDisplay());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(ATTextPropertyDto)");
    }
}
