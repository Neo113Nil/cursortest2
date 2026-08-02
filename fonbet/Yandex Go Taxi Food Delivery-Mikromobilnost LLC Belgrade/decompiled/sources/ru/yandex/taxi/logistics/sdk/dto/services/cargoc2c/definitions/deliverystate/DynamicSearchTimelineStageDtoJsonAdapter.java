package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineStageDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineStageDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchTimelineIconDto;", "nullableDynamicSearchTimelineIconDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DynamicSearchTimelineStageDtoJsonAdapter extends JsonAdapter<DynamicSearchTimelineStageDto> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<DynamicSearchTimelineIconDto> nullableDynamicSearchTimelineIconDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("display_duration", "dynamic_description", "icon");

    public DynamicSearchTimelineStageDtoJsonAdapter(Moshi moshi) {
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.intAdapter = moshi.adapter(cls, emptySet, "displayDuration");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "dynamicDescription");
        this.nullableDynamicSearchTimelineIconDtoAdapter = moshi.adapter(DynamicSearchTimelineIconDto.class, emptySet, "icon");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DynamicSearchTimelineStageDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        String str = null;
        DynamicSearchTimelineIconDto dynamicSearchTimelineIconDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("displayDuration", "display_duration", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                dynamicSearchTimelineIconDto = this.nullableDynamicSearchTimelineIconDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (num != null) {
            return new DynamicSearchTimelineStageDto(num.intValue(), str, dynamicSearchTimelineIconDto);
        }
        throw Util.missingProperty("displayDuration", "display_duration", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DynamicSearchTimelineStageDto dynamicSearchTimelineStageDto) {
        DynamicSearchTimelineStageDto dynamicSearchTimelineStageDto2 = dynamicSearchTimelineStageDto;
        if (dynamicSearchTimelineStageDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("display_duration");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(dynamicSearchTimelineStageDto2.getDisplayDuration()));
        jsonWriter.name("dynamic_description");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) dynamicSearchTimelineStageDto2.getDynamicDescription());
        jsonWriter.name("icon");
        this.nullableDynamicSearchTimelineIconDtoAdapter.toJson(jsonWriter, (JsonWriter) dynamicSearchTimelineStageDto2.getIcon());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(51, "GeneratedJsonAdapter(DynamicSearchTimelineStageDto)");
    }
}
