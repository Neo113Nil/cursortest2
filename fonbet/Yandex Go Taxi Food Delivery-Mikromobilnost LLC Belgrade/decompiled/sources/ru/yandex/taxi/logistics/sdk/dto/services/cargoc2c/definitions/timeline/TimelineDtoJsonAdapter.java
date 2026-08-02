package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.timeline;

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

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/HorizontalTimelineItemDto;", "listOfHorizontalTimelineItemDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/BubbleDto;", "nullableBubbleDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TimelineDtoJsonAdapter extends JsonAdapter<TimelineDto> {
    private final JsonAdapter<List<HorizontalTimelineItemDto>> listOfHorizontalTimelineItemDtoAdapter;
    private final JsonAdapter<BubbleDto> nullableBubbleDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("horizontal", "current_item_id", "bubble");

    public TimelineDtoJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, HorizontalTimelineItemDto.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfHorizontalTimelineItemDtoAdapter = moshi.adapter(newParameterizedType, emptySet, "horizontal");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "currentItemId");
        this.nullableBubbleDtoAdapter = moshi.adapter(BubbleDto.class, emptySet, "bubble");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TimelineDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<HorizontalTimelineItemDto> list = null;
        String str = null;
        BubbleDto bubbleDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfHorizontalTimelineItemDtoAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("horizontal", "horizontal", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                bubbleDto = this.nullableBubbleDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (list != null) {
            return new TimelineDto(list, str, bubbleDto);
        }
        throw Util.missingProperty("horizontal", "horizontal", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TimelineDto timelineDto) {
        TimelineDto timelineDto2 = timelineDto;
        if (timelineDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("horizontal");
        this.listOfHorizontalTimelineItemDtoAdapter.toJson(jsonWriter, (JsonWriter) timelineDto2.getHorizontal());
        jsonWriter.name("current_item_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) timelineDto2.getCurrentItemId());
        jsonWriter.name("bubble");
        this.nullableBubbleDtoAdapter.toJson(jsonWriter, (JsonWriter) timelineDto2.getBubble());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(33, "GeneratedJsonAdapter(TimelineDto)");
    }
}
