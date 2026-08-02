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
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.contentbaseitems.ContentIconItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.contentbaseitems.ContentTextItemDto;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentDetailsItemDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentDetailsItemDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;", "contentTextItemDtoAdapter", "nullableContentTextItemDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentIconItemDto;", "nullableContentIconItemDtoAdapter", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/DetailsSectionDto;", "listOfDetailsSectionDtoAdapter", "nullableStringAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ContentDetailsItemDtoJsonAdapter extends JsonAdapter<ContentDetailsItemDto> {
    private final JsonAdapter<ContentTextItemDto> contentTextItemDtoAdapter;
    private final JsonAdapter<List<DetailsSectionDto>> listOfDetailsSectionDtoAdapter;
    private final JsonAdapter<ContentIconItemDto> nullableContentIconItemDtoAdapter;
    private final JsonAdapter<ContentTextItemDto> nullableContentTextItemDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("id", "title", "subtitle", "lead_icon", "sections", "metrica_label");
    private final JsonAdapter<String> stringAdapter;

    public ContentDetailsItemDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.contentTextItemDtoAdapter = moshi.adapter(ContentTextItemDto.class, emptySet, "title");
        this.nullableContentTextItemDtoAdapter = moshi.adapter(ContentTextItemDto.class, emptySet, "subtitle");
        this.nullableContentIconItemDtoAdapter = moshi.adapter(ContentIconItemDto.class, emptySet, "leadIcon");
        this.listOfDetailsSectionDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, DetailsSectionDto.class), emptySet, "sections");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ContentDetailsItemDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        ContentTextItemDto contentTextItemDto = null;
        ContentTextItemDto contentTextItemDto2 = null;
        ContentIconItemDto contentIconItemDto = null;
        List<DetailsSectionDto> list = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("id", "id", jsonReader);
                    }
                    break;
                case 1:
                    contentTextItemDto = this.contentTextItemDtoAdapter.fromJson(jsonReader);
                    if (contentTextItemDto == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    break;
                case 2:
                    contentTextItemDto2 = this.nullableContentTextItemDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    contentIconItemDto = this.nullableContentIconItemDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    list = this.listOfDetailsSectionDtoAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("sections", "sections", jsonReader);
                    }
                    break;
                case 5:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("id", "id", jsonReader);
        }
        if (contentTextItemDto == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (list != null) {
            return new ContentDetailsItemDto(str, contentTextItemDto, contentTextItemDto2, contentIconItemDto, list, str2);
        }
        throw Util.missingProperty("sections", "sections", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ContentDetailsItemDto contentDetailsItemDto) {
        ContentDetailsItemDto contentDetailsItemDto2 = contentDetailsItemDto;
        if (contentDetailsItemDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) contentDetailsItemDto2.getId());
        jsonWriter.name("title");
        this.contentTextItemDtoAdapter.toJson(jsonWriter, (JsonWriter) contentDetailsItemDto2.getTitle());
        jsonWriter.name("subtitle");
        this.nullableContentTextItemDtoAdapter.toJson(jsonWriter, (JsonWriter) contentDetailsItemDto2.getSubtitle());
        jsonWriter.name("lead_icon");
        this.nullableContentIconItemDtoAdapter.toJson(jsonWriter, (JsonWriter) contentDetailsItemDto2.getLeadIcon());
        jsonWriter.name("sections");
        this.listOfDetailsSectionDtoAdapter.toJson(jsonWriter, (JsonWriter) contentDetailsItemDto2.getSections());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) contentDetailsItemDto2.getMetricaLabel());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(ContentDetailsItemDto)");
    }
}
