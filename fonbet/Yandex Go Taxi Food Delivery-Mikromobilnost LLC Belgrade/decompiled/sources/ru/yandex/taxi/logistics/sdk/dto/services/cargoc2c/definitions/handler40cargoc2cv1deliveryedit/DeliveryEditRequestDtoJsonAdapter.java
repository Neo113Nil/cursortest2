package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveryedit;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.orderedit.OrderEditPayloadDto;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryedit/DeliveryEditRequestDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveryedit/DeliveryEditRequestDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableAnyAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/orderedit/OrderEditPayloadDto;", "orderEditPayloadDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryEditRequestDtoJsonAdapter extends JsonAdapter<DeliveryEditRequestDto> {
    private final JsonAdapter<Object> nullableAnyAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("delivery_id", "edit_options", "edit_payload", "request_id");
    private final JsonAdapter<OrderEditPayloadDto> orderEditPayloadDtoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public DeliveryEditRequestDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "deliveryId");
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, "editOptions");
        this.orderEditPayloadDtoAdapter = moshi.adapter(OrderEditPayloadDto.class, emptySet, "editPayload");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DeliveryEditRequestDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        Object obj = null;
        OrderEditPayloadDto orderEditPayloadDto = null;
        String str2 = null;
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
            } else if (selectName == 1) {
                obj = this.nullableAnyAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                orderEditPayloadDto = this.orderEditPayloadDtoAdapter.fromJson(jsonReader);
                if (orderEditPayloadDto == null) {
                    throw Util.unexpectedNull("editPayload", "edit_payload", jsonReader);
                }
            } else if (selectName == 3 && (str2 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("requestId", "request_id", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("deliveryId", "delivery_id", jsonReader);
        }
        if (orderEditPayloadDto == null) {
            throw Util.missingProperty("editPayload", "edit_payload", jsonReader);
        }
        if (str2 != null) {
            return new DeliveryEditRequestDto(str, obj, orderEditPayloadDto, str2);
        }
        throw Util.missingProperty("requestId", "request_id", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DeliveryEditRequestDto deliveryEditRequestDto) {
        DeliveryEditRequestDto deliveryEditRequestDto2 = deliveryEditRequestDto;
        if (deliveryEditRequestDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("delivery_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) deliveryEditRequestDto2.getDeliveryId());
        jsonWriter.name("edit_options");
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) deliveryEditRequestDto2.getEditOptions());
        jsonWriter.name("edit_payload");
        this.orderEditPayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) deliveryEditRequestDto2.getEditPayload());
        jsonWriter.name("request_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) deliveryEditRequestDto2.getRequestId());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(DeliveryEditRequestDto)");
    }
}
