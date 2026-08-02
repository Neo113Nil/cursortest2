package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.contentbaseitems.ContentTextItemDto;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\f¨\u0006\u001b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentTextWidgetItemDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentTextWidgetItemDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;", "contentTextItemDtoAdapter", "nullableContentTextItemDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentTextAlignmentDto;", "nullableContentTextAlignmentDtoAdapter", "", "nullableIntAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/InsetsDto;", "nullableInsetsDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto;", "nullablePayloadDtoAdapter", "nullableStringAdapter", "", "nullableBooleanAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ContentTextWidgetItemDtoJsonAdapter extends JsonAdapter<ContentTextWidgetItemDto> {
    private final JsonAdapter<ContentTextItemDto> contentTextItemDtoAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<ContentTextAlignmentDto> nullableContentTextAlignmentDtoAdapter;
    private final JsonAdapter<ContentTextItemDto> nullableContentTextItemDtoAdapter;
    private final JsonAdapter<InsetsDto> nullableInsetsDtoAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<PayloadDto> nullablePayloadDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("id", "title", "subtitle", "title_alignment", "subtitle_alignment", "min_height", "external_insets", "internal_insets", "action", "metrica_label", "is_loading");
    private final JsonAdapter<String> stringAdapter;

    public ContentTextWidgetItemDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.contentTextItemDtoAdapter = moshi.adapter(ContentTextItemDto.class, emptySet, "title");
        this.nullableContentTextItemDtoAdapter = moshi.adapter(ContentTextItemDto.class, emptySet, "subtitle");
        this.nullableContentTextAlignmentDtoAdapter = moshi.adapter(ContentTextAlignmentDto.class, emptySet, "titleAlignment");
        this.nullableIntAdapter = moshi.adapter(Integer.class, emptySet, "minHeight");
        this.nullableInsetsDtoAdapter = moshi.adapter(InsetsDto.class, emptySet, "externalInsets");
        this.nullablePayloadDtoAdapter = moshi.adapter(PayloadDto.class, emptySet, "action");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "isLoading");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ContentTextWidgetItemDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        ContentTextItemDto contentTextItemDto = null;
        ContentTextItemDto contentTextItemDto2 = null;
        ContentTextAlignmentDto contentTextAlignmentDto = null;
        ContentTextAlignmentDto contentTextAlignmentDto2 = null;
        Integer num = null;
        InsetsDto insetsDto = null;
        InsetsDto insetsDto2 = null;
        PayloadDto payloadDto = null;
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
                    contentTextAlignmentDto = this.nullableContentTextAlignmentDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    contentTextAlignmentDto2 = this.nullableContentTextAlignmentDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    num = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    insetsDto = this.nullableInsetsDtoAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    insetsDto2 = this.nullableInsetsDtoAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    payloadDto = this.nullablePayloadDtoAdapter.fromJson(jsonReader);
                    break;
                case 9:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 10:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("id", "id", jsonReader);
        }
        if (contentTextItemDto != null) {
            return new ContentTextWidgetItemDto(str, contentTextItemDto, contentTextItemDto2, contentTextAlignmentDto, contentTextAlignmentDto2, num, insetsDto, insetsDto2, payloadDto, str2, bool);
        }
        throw Util.missingProperty("title", "title", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ContentTextWidgetItemDto contentTextWidgetItemDto) {
        ContentTextWidgetItemDto contentTextWidgetItemDto2 = contentTextWidgetItemDto;
        if (contentTextWidgetItemDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) contentTextWidgetItemDto2.getId());
        jsonWriter.name("title");
        this.contentTextItemDtoAdapter.toJson(jsonWriter, (JsonWriter) contentTextWidgetItemDto2.getTitle());
        jsonWriter.name("subtitle");
        this.nullableContentTextItemDtoAdapter.toJson(jsonWriter, (JsonWriter) contentTextWidgetItemDto2.getSubtitle());
        jsonWriter.name("title_alignment");
        this.nullableContentTextAlignmentDtoAdapter.toJson(jsonWriter, (JsonWriter) contentTextWidgetItemDto2.getTitleAlignment());
        jsonWriter.name("subtitle_alignment");
        this.nullableContentTextAlignmentDtoAdapter.toJson(jsonWriter, (JsonWriter) contentTextWidgetItemDto2.getSubtitleAlignment());
        jsonWriter.name("min_height");
        this.nullableIntAdapter.toJson(jsonWriter, (JsonWriter) contentTextWidgetItemDto2.getMinHeight());
        jsonWriter.name("external_insets");
        this.nullableInsetsDtoAdapter.toJson(jsonWriter, (JsonWriter) contentTextWidgetItemDto2.getExternalInsets());
        jsonWriter.name("internal_insets");
        this.nullableInsetsDtoAdapter.toJson(jsonWriter, (JsonWriter) contentTextWidgetItemDto2.getInternalInsets());
        jsonWriter.name("action");
        this.nullablePayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) contentTextWidgetItemDto2.getAction());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) contentTextWidgetItemDto2.getMetricaLabel());
        jsonWriter.name("is_loading");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) contentTextWidgetItemDto2.isLoading());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(46, "GeneratedJsonAdapter(ContentTextWidgetItemDto)");
    }
}
