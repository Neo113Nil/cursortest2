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
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.contentbaseitems.ContentIconItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.contentbaseitems.ContentTextItemDto;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentListItemDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentListItemDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentTextItemDto;", "contentTextItemDtoAdapter", "nullableContentTextItemDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/contentbaseitems/ContentIconItemDto;", "nullableContentIconItemDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/PayloadDto;", "nullablePayloadDtoAdapter", "", "nullableBooleanAdapter", "nullableStringAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ContentListItemDtoJsonAdapter extends JsonAdapter<ContentListItemDto> {
    private final JsonAdapter<ContentTextItemDto> contentTextItemDtoAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<ContentIconItemDto> nullableContentIconItemDtoAdapter;
    private final JsonAdapter<ContentTextItemDto> nullableContentTextItemDtoAdapter;
    private final JsonAdapter<PayloadDto> nullablePayloadDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("id", "title", "subtitle", "trail_text", "trail_subtitle", "lead_icon", "trail_icon", "trail_payload", "general_payload", "shimmering", "metrica_label");
    private final JsonAdapter<String> stringAdapter;

    public ContentListItemDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "id");
        this.contentTextItemDtoAdapter = moshi.adapter(ContentTextItemDto.class, emptySet, "title");
        this.nullableContentTextItemDtoAdapter = moshi.adapter(ContentTextItemDto.class, emptySet, "subtitle");
        this.nullableContentIconItemDtoAdapter = moshi.adapter(ContentIconItemDto.class, emptySet, "leadIcon");
        this.nullablePayloadDtoAdapter = moshi.adapter(PayloadDto.class, emptySet, "trailPayload");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "shimmering");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "metricaLabel");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ContentListItemDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        ContentTextItemDto contentTextItemDto = null;
        ContentTextItemDto contentTextItemDto2 = null;
        ContentTextItemDto contentTextItemDto3 = null;
        ContentTextItemDto contentTextItemDto4 = null;
        ContentIconItemDto contentIconItemDto = null;
        ContentIconItemDto contentIconItemDto2 = null;
        PayloadDto payloadDto = null;
        PayloadDto payloadDto2 = null;
        Boolean bool = null;
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
                    contentTextItemDto3 = this.nullableContentTextItemDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    contentTextItemDto4 = this.nullableContentTextItemDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    contentIconItemDto = this.nullableContentIconItemDtoAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    contentIconItemDto2 = this.nullableContentIconItemDtoAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    payloadDto = this.nullablePayloadDtoAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    payloadDto2 = this.nullablePayloadDtoAdapter.fromJson(jsonReader);
                    break;
                case 9:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 10:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("id", "id", jsonReader);
        }
        if (contentTextItemDto != null) {
            return new ContentListItemDto(str, contentTextItemDto, contentTextItemDto2, contentTextItemDto3, contentTextItemDto4, contentIconItemDto, contentIconItemDto2, payloadDto, payloadDto2, bool, str2);
        }
        throw Util.missingProperty("title", "title", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ContentListItemDto contentListItemDto) {
        ContentListItemDto contentListItemDto2 = contentListItemDto;
        if (contentListItemDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) contentListItemDto2.getId());
        jsonWriter.name("title");
        this.contentTextItemDtoAdapter.toJson(jsonWriter, (JsonWriter) contentListItemDto2.getTitle());
        jsonWriter.name("subtitle");
        this.nullableContentTextItemDtoAdapter.toJson(jsonWriter, (JsonWriter) contentListItemDto2.getSubtitle());
        jsonWriter.name("trail_text");
        this.nullableContentTextItemDtoAdapter.toJson(jsonWriter, (JsonWriter) contentListItemDto2.getTrailText());
        jsonWriter.name("trail_subtitle");
        this.nullableContentTextItemDtoAdapter.toJson(jsonWriter, (JsonWriter) contentListItemDto2.getTrailSubtitle());
        jsonWriter.name("lead_icon");
        this.nullableContentIconItemDtoAdapter.toJson(jsonWriter, (JsonWriter) contentListItemDto2.getLeadIcon());
        jsonWriter.name("trail_icon");
        this.nullableContentIconItemDtoAdapter.toJson(jsonWriter, (JsonWriter) contentListItemDto2.getTrailIcon());
        jsonWriter.name("trail_payload");
        this.nullablePayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) contentListItemDto2.getTrailPayload());
        jsonWriter.name("general_payload");
        this.nullablePayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) contentListItemDto2.getGeneralPayload());
        jsonWriter.name("shimmering");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) contentListItemDto2.getShimmering());
        jsonWriter.name("metrica_label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) contentListItemDto2.getMetricaLabel());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(ContentListItemDto)");
    }
}
