package ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions;

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
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATUnitDto;", "listOfATUnitDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto$TruncationModeDto;", "nullableTruncationModeDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AttributedTextDtoJsonAdapter extends JsonAdapter<AttributedTextDto> {
    private final JsonAdapter<List<ATUnitDto>> listOfATUnitDtoAdapter;
    private final JsonAdapter<AttributedTextDto.TruncationModeDto> nullableTruncationModeDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("items", "truncation_mode");

    public AttributedTextDtoJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, ATUnitDto.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfATUnitDtoAdapter = moshi.adapter(newParameterizedType, emptySet, "items");
        this.nullableTruncationModeDtoAdapter = moshi.adapter(AttributedTextDto.TruncationModeDto.class, emptySet, "truncationMode");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AttributedTextDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<ATUnitDto> list = null;
        AttributedTextDto.TruncationModeDto truncationModeDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfATUnitDtoAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("items", "items", jsonReader);
                }
            } else if (selectName == 1) {
                truncationModeDto = this.nullableTruncationModeDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (list != null) {
            return new AttributedTextDto(list, truncationModeDto);
        }
        throw Util.missingProperty("items", "items", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AttributedTextDto attributedTextDto) {
        AttributedTextDto attributedTextDto2 = attributedTextDto;
        if (attributedTextDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("items");
        this.listOfATUnitDtoAdapter.toJson(jsonWriter, (JsonWriter) attributedTextDto2.getItems());
        jsonWriter.name("truncation_mode");
        this.nullableTruncationModeDtoAdapter.toJson(jsonWriter, (JsonWriter) attributedTextDto2.getTruncationMode());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(39, "GeneratedJsonAdapter(AttributedTextDto)");
    }
}
