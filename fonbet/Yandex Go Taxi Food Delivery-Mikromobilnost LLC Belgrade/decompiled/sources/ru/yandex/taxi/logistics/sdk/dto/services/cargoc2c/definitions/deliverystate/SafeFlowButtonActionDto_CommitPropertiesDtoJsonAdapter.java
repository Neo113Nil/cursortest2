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
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.SafeFlowButtonActionDto;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/SafeFlowButtonActionDto_CommitPropertiesDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/SafeFlowButtonActionDto$CommitPropertiesDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/TimestampDto;", "timestampDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SafeFlowButtonActionDto_CommitPropertiesDtoJsonAdapter extends JsonAdapter<SafeFlowButtonActionDto.CommitPropertiesDto> {
    private final JsonReader.Options options = JsonReader.Options.of("delivery_id", "can_create_order_until");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<TimestampDto> timestampDtoAdapter;

    public SafeFlowButtonActionDto_CommitPropertiesDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "deliveryId");
        this.timestampDtoAdapter = moshi.adapter(TimestampDto.class, emptySet, "canCreateOrderUntil");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SafeFlowButtonActionDto.CommitPropertiesDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        TimestampDto timestampDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("deliveryId", "delivery_id", jsonReader);
                }
            } else if (selectName == 1 && (timestampDto = this.timestampDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("canCreateOrderUntil", "can_create_order_until", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("deliveryId", "delivery_id", jsonReader);
        }
        if (timestampDto != null) {
            return new SafeFlowButtonActionDto.CommitPropertiesDto(str, timestampDto);
        }
        throw Util.missingProperty("canCreateOrderUntil", "can_create_order_until", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SafeFlowButtonActionDto.CommitPropertiesDto commitPropertiesDto) {
        SafeFlowButtonActionDto.CommitPropertiesDto commitPropertiesDto2 = commitPropertiesDto;
        if (commitPropertiesDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("delivery_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) commitPropertiesDto2.getDeliveryId());
        jsonWriter.name("can_create_order_until");
        this.timestampDtoAdapter.toJson(jsonWriter, (JsonWriter) commitPropertiesDto2.getCanCreateOrderUntil());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(65, "GeneratedJsonAdapter(SafeFlowButtonActionDto.CommitPropertiesDto)");
    }
}
