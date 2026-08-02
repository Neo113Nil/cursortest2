package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.timeline;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.ColorDto;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/VerticalTimelineItemDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/VerticalTimelineItemDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineItemStatusDto;", "timelineItemStatusDtoAdapter", "stringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/ColorDto;", "nullableColorDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VerticalTimelineItemDtoJsonAdapter extends JsonAdapter<VerticalTimelineItemDto> {
    private final JsonAdapter<ColorDto> nullableColorDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("lead_title", "lead_subtitle", ACSPConstants.STATUS, "icon_tag", "title", "title_color", "subtitle", "subtitle_color");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<TimelineItemStatusDto> timelineItemStatusDtoAdapter;

    public VerticalTimelineItemDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "leadTitle");
        this.timelineItemStatusDtoAdapter = moshi.adapter(TimelineItemStatusDto.class, emptySet, ACSPConstants.STATUS);
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableColorDtoAdapter = moshi.adapter(ColorDto.class, emptySet, "titleColor");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final VerticalTimelineItemDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        TimelineItemStatusDto timelineItemStatusDto = null;
        String str3 = null;
        String str4 = null;
        ColorDto colorDto = null;
        String str5 = null;
        ColorDto colorDto2 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    timelineItemStatusDto = this.timelineItemStatusDtoAdapter.fromJson(jsonReader);
                    if (timelineItemStatusDto == null) {
                        throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                    }
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str4 = this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    break;
                case 5:
                    colorDto = this.nullableColorDtoAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    colorDto2 = this.nullableColorDtoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (timelineItemStatusDto == null) {
            throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
        }
        if (str4 != null) {
            return new VerticalTimelineItemDto(str, str2, timelineItemStatusDto, str3, str4, colorDto, str5, colorDto2);
        }
        throw Util.missingProperty("title", "title", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, VerticalTimelineItemDto verticalTimelineItemDto) {
        VerticalTimelineItemDto verticalTimelineItemDto2 = verticalTimelineItemDto;
        if (verticalTimelineItemDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("lead_title");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) verticalTimelineItemDto2.getLeadTitle());
        jsonWriter.name("lead_subtitle");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) verticalTimelineItemDto2.getLeadSubtitle());
        jsonWriter.name(ACSPConstants.STATUS);
        this.timelineItemStatusDtoAdapter.toJson(jsonWriter, (JsonWriter) verticalTimelineItemDto2.getStatus());
        jsonWriter.name("icon_tag");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) verticalTimelineItemDto2.getIconTag());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) verticalTimelineItemDto2.getTitle());
        jsonWriter.name("title_color");
        this.nullableColorDtoAdapter.toJson(jsonWriter, (JsonWriter) verticalTimelineItemDto2.getTitleColor());
        jsonWriter.name("subtitle");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) verticalTimelineItemDto2.getSubtitle());
        jsonWriter.name("subtitle_color");
        this.nullableColorDtoAdapter.toJson(jsonWriter, (JsonWriter) verticalTimelineItemDto2.getSubtitleColor());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(VerticalTimelineItemDto)");
    }
}
