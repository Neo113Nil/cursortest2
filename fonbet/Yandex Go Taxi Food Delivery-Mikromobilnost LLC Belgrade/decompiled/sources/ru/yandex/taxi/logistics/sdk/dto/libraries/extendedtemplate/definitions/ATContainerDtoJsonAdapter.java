package ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions;

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
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.ATContainerDto;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATContainerDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATContainerDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATContainerDto$GroupAttributesDto;", "groupAttributesDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/ATContainerDto$ItemsDto;", "listOfItemsDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ATContainerDtoJsonAdapter extends JsonAdapter<ATContainerDto> {
    private final JsonAdapter<ATContainerDto.GroupAttributesDto> groupAttributesDtoAdapter;
    private final JsonAdapter<List<ATContainerDto.ItemsDto>> listOfItemsDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("group_attributes", "items");

    public ATContainerDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.groupAttributesDtoAdapter = moshi.adapter(ATContainerDto.GroupAttributesDto.class, emptySet, "groupAttributes");
        this.listOfItemsDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, ATContainerDto.ItemsDto.class), emptySet, "items");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ATContainerDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ATContainerDto.GroupAttributesDto groupAttributesDto = null;
        List<ATContainerDto.ItemsDto> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                groupAttributesDto = this.groupAttributesDtoAdapter.fromJson(jsonReader);
                if (groupAttributesDto == null) {
                    throw Util.unexpectedNull("groupAttributes", "group_attributes", jsonReader);
                }
            } else if (selectName == 1 && (list = this.listOfItemsDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("items", "items", jsonReader);
            }
        }
        jsonReader.endObject();
        if (groupAttributesDto == null) {
            throw Util.missingProperty("groupAttributes", "group_attributes", jsonReader);
        }
        if (list != null) {
            return new ATContainerDto(groupAttributesDto, list);
        }
        throw Util.missingProperty("items", "items", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ATContainerDto aTContainerDto) {
        ATContainerDto aTContainerDto2 = aTContainerDto;
        if (aTContainerDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("group_attributes");
        this.groupAttributesDtoAdapter.toJson(jsonWriter, (JsonWriter) aTContainerDto2.getGroupAttributes());
        jsonWriter.name("items");
        this.listOfItemsDtoAdapter.toJson(jsonWriter, (JsonWriter) aTContainerDto2.getItems());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(36, "GeneratedJsonAdapter(ATContainerDto)");
    }
}
