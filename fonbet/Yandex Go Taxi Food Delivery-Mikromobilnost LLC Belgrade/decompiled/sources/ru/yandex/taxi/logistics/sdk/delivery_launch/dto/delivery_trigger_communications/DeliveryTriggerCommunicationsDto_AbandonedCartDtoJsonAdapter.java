package ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_trigger_communications;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_trigger_communications.DeliveryTriggerCommunicationsDto;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/DeliveryTriggerCommunicationsDto_AbandonedCartDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/DeliveryTriggerCommunicationsDto$AbandonedCartDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/LocalNotificationDto;", "nullableListOfLocalNotificationDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryTriggerCommunicationsDto_AbandonedCartDtoJsonAdapter extends JsonAdapter<DeliveryTriggerCommunicationsDto.AbandonedCartDto> {
    private final JsonAdapter<List<LocalNotificationDto>> nullableListOfLocalNotificationDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("local_notifications");

    public DeliveryTriggerCommunicationsDto_AbandonedCartDtoJsonAdapter(Moshi moshi) {
        this.nullableListOfLocalNotificationDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, LocalNotificationDto.class), EmptySet.a, "localNotifications");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DeliveryTriggerCommunicationsDto.AbandonedCartDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<LocalNotificationDto> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.nullableListOfLocalNotificationDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new DeliveryTriggerCommunicationsDto.AbandonedCartDto(list);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DeliveryTriggerCommunicationsDto.AbandonedCartDto abandonedCartDto) {
        DeliveryTriggerCommunicationsDto.AbandonedCartDto abandonedCartDto2 = abandonedCartDto;
        if (abandonedCartDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("local_notifications");
        this.nullableListOfLocalNotificationDtoAdapter.toJson(jsonWriter, (JsonWriter) abandonedCartDto2.getLocalNotifications());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(71, "GeneratedJsonAdapter(DeliveryTriggerCommunicationsDto.AbandonedCartDto)");
    }
}
