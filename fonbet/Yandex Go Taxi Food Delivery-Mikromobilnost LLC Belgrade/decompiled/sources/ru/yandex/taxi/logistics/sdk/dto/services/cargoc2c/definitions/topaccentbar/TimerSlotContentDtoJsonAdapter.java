package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.topaccentbar;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.slot.SlotDto;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/topaccentbar/TimerSlotContentDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/topaccentbar/TimerSlotContentDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/topaccentbar/TimerDto;", "timerDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slot/SlotDto;", "nullableSlotDtoAdapter", "slotDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TimerSlotContentDtoJsonAdapter extends JsonAdapter<TimerSlotContentDto> {
    private final JsonAdapter<SlotDto> nullableSlotDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("timer", "until", "since");
    private final JsonAdapter<SlotDto> slotDtoAdapter;
    private final JsonAdapter<TimerDto> timerDtoAdapter;

    public TimerSlotContentDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.timerDtoAdapter = moshi.adapter(TimerDto.class, emptySet, "timer");
        this.nullableSlotDtoAdapter = moshi.adapter(SlotDto.class, emptySet, "until");
        this.slotDtoAdapter = moshi.adapter(SlotDto.class, emptySet, "since");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TimerSlotContentDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        TimerDto timerDto = null;
        SlotDto slotDto = null;
        SlotDto slotDto2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                timerDto = this.timerDtoAdapter.fromJson(jsonReader);
                if (timerDto == null) {
                    throw Util.unexpectedNull("timer", "timer", jsonReader);
                }
            } else if (selectName == 1) {
                slotDto = this.nullableSlotDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2 && (slotDto2 = this.slotDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("since", "since", jsonReader);
            }
        }
        jsonReader.endObject();
        if (timerDto == null) {
            throw Util.missingProperty("timer", "timer", jsonReader);
        }
        if (slotDto2 != null) {
            return new TimerSlotContentDto(timerDto, slotDto, slotDto2);
        }
        throw Util.missingProperty("since", "since", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TimerSlotContentDto timerSlotContentDto) {
        TimerSlotContentDto timerSlotContentDto2 = timerSlotContentDto;
        if (timerSlotContentDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("timer");
        this.timerDtoAdapter.toJson(jsonWriter, (JsonWriter) timerSlotContentDto2.getTimer());
        jsonWriter.name("until");
        this.nullableSlotDtoAdapter.toJson(jsonWriter, (JsonWriter) timerSlotContentDto2.getUntil());
        jsonWriter.name("since");
        this.slotDtoAdapter.toJson(jsonWriter, (JsonWriter) timerSlotContentDto2.getSince());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(TimerSlotContentDto)");
    }
}
