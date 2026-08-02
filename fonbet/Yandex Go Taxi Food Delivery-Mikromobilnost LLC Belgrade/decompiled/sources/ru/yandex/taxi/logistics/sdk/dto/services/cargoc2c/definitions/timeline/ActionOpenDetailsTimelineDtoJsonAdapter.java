package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.timeline;

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

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/ActionOpenDetailsTimelineDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/ActionOpenDetailsTimelineDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/BubbleDto;", "nullableBubbleDtoAdapter", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/VerticalTimelineItemDto;", "listOfVerticalTimelineItemDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineDetailsDoneButtonDto;", "timelineDetailsDoneButtonDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineDetailsShareButtonDto;", "nullableTimelineDetailsShareButtonDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ActionOpenDetailsTimelineDtoJsonAdapter extends JsonAdapter<ActionOpenDetailsTimelineDto> {
    private final JsonAdapter<List<VerticalTimelineItemDto>> listOfVerticalTimelineItemDtoAdapter;
    private final JsonAdapter<BubbleDto> nullableBubbleDtoAdapter;
    private final JsonAdapter<TimelineDetailsShareButtonDto> nullableTimelineDetailsShareButtonDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "bubble", "vertical", "done_button", "share_button");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<TimelineDetailsDoneButtonDto> timelineDetailsDoneButtonDtoAdapter;

    public ActionOpenDetailsTimelineDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableBubbleDtoAdapter = moshi.adapter(BubbleDto.class, emptySet, "bubble");
        this.listOfVerticalTimelineItemDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, VerticalTimelineItemDto.class), emptySet, "vertical");
        this.timelineDetailsDoneButtonDtoAdapter = moshi.adapter(TimelineDetailsDoneButtonDto.class, emptySet, "doneButton");
        this.nullableTimelineDetailsShareButtonDtoAdapter = moshi.adapter(TimelineDetailsShareButtonDto.class, emptySet, "shareButton");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ActionOpenDetailsTimelineDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        BubbleDto bubbleDto = null;
        List<VerticalTimelineItemDto> list = null;
        TimelineDetailsDoneButtonDto timelineDetailsDoneButtonDto = null;
        TimelineDetailsShareButtonDto timelineDetailsShareButtonDto = null;
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
            } else if (selectName == 1) {
                bubbleDto = this.nullableBubbleDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                list = this.listOfVerticalTimelineItemDtoAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("vertical", "vertical", jsonReader);
                }
            } else if (selectName == 3) {
                timelineDetailsDoneButtonDto = this.timelineDetailsDoneButtonDtoAdapter.fromJson(jsonReader);
                if (timelineDetailsDoneButtonDto == null) {
                    throw Util.unexpectedNull("doneButton", "done_button", jsonReader);
                }
            } else if (selectName == 4) {
                timelineDetailsShareButtonDto = this.nullableTimelineDetailsShareButtonDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (list == null) {
            throw Util.missingProperty("vertical", "vertical", jsonReader);
        }
        if (timelineDetailsDoneButtonDto != null) {
            return new ActionOpenDetailsTimelineDto(str, bubbleDto, list, timelineDetailsDoneButtonDto, timelineDetailsShareButtonDto);
        }
        throw Util.missingProperty("doneButton", "done_button", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ActionOpenDetailsTimelineDto actionOpenDetailsTimelineDto) {
        ActionOpenDetailsTimelineDto actionOpenDetailsTimelineDto2 = actionOpenDetailsTimelineDto;
        if (actionOpenDetailsTimelineDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) actionOpenDetailsTimelineDto2.getTitle());
        jsonWriter.name("bubble");
        this.nullableBubbleDtoAdapter.toJson(jsonWriter, (JsonWriter) actionOpenDetailsTimelineDto2.getBubble());
        jsonWriter.name("vertical");
        this.listOfVerticalTimelineItemDtoAdapter.toJson(jsonWriter, (JsonWriter) actionOpenDetailsTimelineDto2.getVertical());
        jsonWriter.name("done_button");
        this.timelineDetailsDoneButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) actionOpenDetailsTimelineDto2.getDoneButton());
        jsonWriter.name("share_button");
        this.nullableTimelineDetailsShareButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) actionOpenDetailsTimelineDto2.getShareButton());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(50, "GeneratedJsonAdapter(ActionOpenDetailsTimelineDto)");
    }
}
