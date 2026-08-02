package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details;

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
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details.DetailsSectionItemAccordionDto;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemAccordionDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemAccordionDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionItemAccordionDto$ItemsDto;", "listOfItemsDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DetailsSectionItemAccordionDtoJsonAdapter extends JsonAdapter<DetailsSectionItemAccordionDto> {
    private final JsonAdapter<List<DetailsSectionItemAccordionDto.ItemsDto>> listOfItemsDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "items");
    private final JsonAdapter<String> stringAdapter;

    public DetailsSectionItemAccordionDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.listOfItemsDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, DetailsSectionItemAccordionDto.ItemsDto.class), emptySet, "items");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DetailsSectionItemAccordionDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        List<DetailsSectionItemAccordionDto.ItemsDto> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 1 && (list = this.listOfItemsDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("items", "items", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (list != null) {
            return new DetailsSectionItemAccordionDto(str, list);
        }
        throw Util.missingProperty("items", "items", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DetailsSectionItemAccordionDto detailsSectionItemAccordionDto) {
        DetailsSectionItemAccordionDto detailsSectionItemAccordionDto2 = detailsSectionItemAccordionDto;
        if (detailsSectionItemAccordionDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) detailsSectionItemAccordionDto2.getTitle());
        jsonWriter.name("items");
        this.listOfItemsDtoAdapter.toJson(jsonWriter, (JsonWriter) detailsSectionItemAccordionDto2.getItems());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(52, "GeneratedJsonAdapter(DetailsSectionItemAccordionDto)");
    }
}
