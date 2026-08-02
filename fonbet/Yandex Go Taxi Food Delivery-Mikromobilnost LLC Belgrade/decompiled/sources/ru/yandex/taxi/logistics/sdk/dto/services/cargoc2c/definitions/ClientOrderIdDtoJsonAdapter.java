package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/ClientOrderIdDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/ClientOrderIdDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/OrderProviderIdDto;", "orderProviderIdDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ClientOrderIdDtoJsonAdapter extends JsonAdapter<ClientOrderIdDto> {
    private final JsonReader.Options options = JsonReader.Options.of("phone_pd_id", "order_id", "order_provider_id");
    private final JsonAdapter<OrderProviderIdDto> orderProviderIdDtoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public ClientOrderIdDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "phonePdId");
        this.orderProviderIdDtoAdapter = moshi.adapter(OrderProviderIdDto.class, emptySet, "orderProviderId");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ClientOrderIdDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        OrderProviderIdDto orderProviderIdDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("phonePdId", "phone_pd_id", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull(FinishFlowStatus.ORDER_ID_FIELD_NAME, "order_id", jsonReader);
                }
            } else if (selectName == 2 && (orderProviderIdDto = this.orderProviderIdDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("orderProviderId", "order_provider_id", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("phonePdId", "phone_pd_id", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty(FinishFlowStatus.ORDER_ID_FIELD_NAME, "order_id", jsonReader);
        }
        if (orderProviderIdDto != null) {
            return new ClientOrderIdDto(str, str2, orderProviderIdDto);
        }
        throw Util.missingProperty("orderProviderId", "order_provider_id", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ClientOrderIdDto clientOrderIdDto) {
        ClientOrderIdDto clientOrderIdDto2 = clientOrderIdDto;
        if (clientOrderIdDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("phone_pd_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) clientOrderIdDto2.getPhonePdId());
        jsonWriter.name("order_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) clientOrderIdDto2.getOrderId());
        jsonWriter.name("order_provider_id");
        this.orderProviderIdDtoAdapter.toJson(jsonWriter, (JsonWriter) clientOrderIdDto2.getOrderProviderId());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(ClientOrderIdDto)");
    }
}
