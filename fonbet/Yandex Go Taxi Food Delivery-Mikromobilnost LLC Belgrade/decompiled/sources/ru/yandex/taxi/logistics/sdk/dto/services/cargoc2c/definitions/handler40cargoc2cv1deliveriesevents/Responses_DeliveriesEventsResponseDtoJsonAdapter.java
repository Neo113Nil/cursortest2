package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveriesevents;

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
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.EventDto;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveriesevents/Responses_DeliveriesEventsResponseDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveriesevents/Responses$DeliveriesEventsResponseDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto;", "listOfEventDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Responses_DeliveriesEventsResponseDtoJsonAdapter extends JsonAdapter<Responses$DeliveriesEventsResponseDto> {
    private final JsonAdapter<List<EventDto>> listOfEventDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("revision", "events");
    private final JsonAdapter<String> stringAdapter;

    public Responses_DeliveriesEventsResponseDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "revision");
        this.listOfEventDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, EventDto.class), emptySet, "events");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Responses$DeliveriesEventsResponseDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        List<EventDto> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("revision", "revision", jsonReader);
                }
            } else if (selectName == 1 && (list = this.listOfEventDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("events", "events", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("revision", "revision", jsonReader);
        }
        if (list != null) {
            return new Responses$DeliveriesEventsResponseDto(str, list);
        }
        throw Util.missingProperty("events", "events", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Responses$DeliveriesEventsResponseDto responses$DeliveriesEventsResponseDto) {
        Responses$DeliveriesEventsResponseDto responses$DeliveriesEventsResponseDto2 = responses$DeliveriesEventsResponseDto;
        if (responses$DeliveriesEventsResponseDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("revision");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) responses$DeliveriesEventsResponseDto2.getRevision());
        jsonWriter.name("events");
        this.listOfEventDtoAdapter.toJson(jsonWriter, (JsonWriter) responses$DeliveriesEventsResponseDto2.getEvents());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(59, "GeneratedJsonAdapter(Responses.DeliveriesEventsResponseDto)");
    }
}
