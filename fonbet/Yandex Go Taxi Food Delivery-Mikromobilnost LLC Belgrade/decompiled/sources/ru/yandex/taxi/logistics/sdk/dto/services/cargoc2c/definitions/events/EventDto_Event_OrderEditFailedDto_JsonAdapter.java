package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import kotlin.Metadata;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.EventDto;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001e\u0010\t\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto_Event_OrderEditFailedDto_JsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto$Event_OrderEditFailedDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderEditDialogEventDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/OrderEditFailedDto;", "delegateAdapter", "Lcom/squareup/moshi/JsonAdapter;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventDto_Event_OrderEditFailedDto_JsonAdapter extends JsonAdapter<EventDto.Event_OrderEditFailedDto> {
    private final JsonAdapter<OrderEditDialogEventDto> delegateAdapter;

    public EventDto_Event_OrderEditFailedDto_JsonAdapter(Moshi moshi) {
        this.delegateAdapter = moshi.adapter(OrderEditDialogEventDto.class);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final EventDto.Event_OrderEditFailedDto fromJson(JsonReader jsonReader) {
        OrderEditDialogEventDto fromJson = this.delegateAdapter.fromJson(jsonReader);
        fromJson.getClass();
        return new EventDto.Event_OrderEditFailedDto("order-edit-failed", fromJson);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, EventDto.Event_OrderEditFailedDto event_OrderEditFailedDto) {
        EventDto.Event_OrderEditFailedDto event_OrderEditFailedDto2 = event_OrderEditFailedDto;
        if (event_OrderEditFailedDto2 == null) {
            return;
        }
        this.delegateAdapter.toJson(jsonWriter, (JsonWriter) event_OrderEditFailedDto2.b);
    }
}
