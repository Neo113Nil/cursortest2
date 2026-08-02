package ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_trigger_communications;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.ny61;
import defpackage.uw51;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_trigger_communications.DeliveryTriggerCommunicationsDto;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR(\u0010\u0011\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/DeliveryTriggerCommunicationsDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/DeliveryTriggerCommunicationsDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableBooleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_trigger_communications/DeliveryTriggerCommunicationsDto$AbandonedCartDto;", "nullableAbandonedCartDtoAdapter", "", "", "nullableMapOfStringStringAdapter", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryTriggerCommunicationsDtoJsonAdapter extends JsonAdapter<DeliveryTriggerCommunicationsDto> {
    private final JsonAdapter<DeliveryTriggerCommunicationsDto.AbandonedCartDto> nullableAbandonedCartDtoAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(BackendConfig.Restrictions.ENABLED, "abandoned_cart", "l10n");

    public DeliveryTriggerCommunicationsDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, BackendConfig.Restrictions.ENABLED);
        this.nullableAbandonedCartDtoAdapter = moshi.adapter(DeliveryTriggerCommunicationsDto.AbandonedCartDto.class, emptySet, "abandonedCart");
        this.nullableMapOfStringStringAdapter = moshi.adapter(Types.newParameterizedType(Map.class, String.class, String.class), emptySet, "l10n");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DeliveryTriggerCommunicationsDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        DeliveryTriggerCommunicationsDto.AbandonedCartDto abandonedCartDto = null;
        Map<String, String> map = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                bool = this.nullableBooleanAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                abandonedCartDto = this.nullableAbandonedCartDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                map = this.nullableMapOfStringStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new DeliveryTriggerCommunicationsDto(bool, abandonedCartDto, map);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DeliveryTriggerCommunicationsDto deliveryTriggerCommunicationsDto) {
        DeliveryTriggerCommunicationsDto deliveryTriggerCommunicationsDto2 = deliveryTriggerCommunicationsDto;
        if (deliveryTriggerCommunicationsDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(BackendConfig.Restrictions.ENABLED);
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) deliveryTriggerCommunicationsDto2.getEnabled());
        jsonWriter.name("abandoned_cart");
        this.nullableAbandonedCartDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryTriggerCommunicationsDto2.getAbandonedCart());
        jsonWriter.name("l10n");
        this.nullableMapOfStringStringAdapter.toJson(jsonWriter, (JsonWriter) deliveryTriggerCommunicationsDto2.getL10n());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(54, "GeneratedJsonAdapter(DeliveryTriggerCommunicationsDto)");
    }
}
