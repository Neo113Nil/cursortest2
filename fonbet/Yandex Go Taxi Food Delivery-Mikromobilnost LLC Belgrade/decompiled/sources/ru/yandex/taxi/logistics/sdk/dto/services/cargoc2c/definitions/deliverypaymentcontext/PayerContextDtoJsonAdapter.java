package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverypaymentcontext;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.OrderProviderIdDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.RoleDto;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverypaymentcontext/PayerContextDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverypaymentcontext/PayerContextDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/OrderProviderIdDto;", "orderProviderIdDtoAdapter", "nullableStringAdapter", "", "nullableAnyAdapter", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/RoleDto;", "listOfRoleDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PayerContextDtoJsonAdapter extends JsonAdapter<PayerContextDto> {
    private final JsonAdapter<List<RoleDto>> listOfRoleDtoAdapter;
    private final JsonAdapter<Object> nullableAnyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("phone_pd_id", "order_id", "order_provider_id", "payment_type", "payment_method_id", "payer_pa_auth_context", "web_payment_url", "web_payment_psp_url", "cheque_order_uuid", "roles", "cargo_ref_id");
    private final JsonAdapter<OrderProviderIdDto> orderProviderIdDtoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public PayerContextDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "phonePdId");
        this.orderProviderIdDtoAdapter = moshi.adapter(OrderProviderIdDto.class, emptySet, "orderProviderId");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "paymentType");
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, "payerPaAuthContext");
        this.listOfRoleDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, RoleDto.class), emptySet, "roles");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PayerContextDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        OrderProviderIdDto orderProviderIdDto = null;
        String str3 = null;
        String str4 = null;
        Object obj = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        List<RoleDto> list = null;
        String str8 = null;
        while (true) {
            String str9 = str;
            String str10 = str2;
            OrderProviderIdDto orderProviderIdDto2 = orderProviderIdDto;
            String str11 = str3;
            if (!jsonReader.hasNext()) {
                String str12 = str4;
                jsonReader.endObject();
                if (str9 == null) {
                    throw Util.missingProperty("phonePdId", "phone_pd_id", jsonReader);
                }
                if (str10 == null) {
                    throw Util.missingProperty(FinishFlowStatus.ORDER_ID_FIELD_NAME, "order_id", jsonReader);
                }
                if (orderProviderIdDto2 == null) {
                    throw Util.missingProperty("orderProviderId", "order_provider_id", jsonReader);
                }
                if (list != null) {
                    return new PayerContextDto(str9, str10, orderProviderIdDto2, str11, str12, obj, str5, str6, str7, list, str8);
                }
                throw Util.missingProperty("roles", "roles", jsonReader);
            }
            String str13 = str4;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str4 = str13;
                    str = str9;
                    str2 = str10;
                    orderProviderIdDto = orderProviderIdDto2;
                    str3 = str11;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("phonePdId", "phone_pd_id", jsonReader);
                    }
                    str4 = str13;
                    str2 = str10;
                    orderProviderIdDto = orderProviderIdDto2;
                    str3 = str11;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull(FinishFlowStatus.ORDER_ID_FIELD_NAME, "order_id", jsonReader);
                    }
                    str4 = str13;
                    str = str9;
                    orderProviderIdDto = orderProviderIdDto2;
                    str3 = str11;
                case 2:
                    OrderProviderIdDto fromJson = this.orderProviderIdDtoAdapter.fromJson(jsonReader);
                    if (fromJson == null) {
                        throw Util.unexpectedNull("orderProviderId", "order_provider_id", jsonReader);
                    }
                    orderProviderIdDto = fromJson;
                    str4 = str13;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    str4 = str13;
                    str = str9;
                    str2 = str10;
                    orderProviderIdDto = orderProviderIdDto2;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    str = str9;
                    str2 = str10;
                    orderProviderIdDto = orderProviderIdDto2;
                    str3 = str11;
                case 5:
                    obj = this.nullableAnyAdapter.fromJson(jsonReader);
                    str4 = str13;
                    str = str9;
                    str2 = str10;
                    orderProviderIdDto = orderProviderIdDto2;
                    str3 = str11;
                case 6:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    str4 = str13;
                    str = str9;
                    str2 = str10;
                    orderProviderIdDto = orderProviderIdDto2;
                    str3 = str11;
                case 7:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    str4 = str13;
                    str = str9;
                    str2 = str10;
                    orderProviderIdDto = orderProviderIdDto2;
                    str3 = str11;
                case 8:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader);
                    str4 = str13;
                    str = str9;
                    str2 = str10;
                    orderProviderIdDto = orderProviderIdDto2;
                    str3 = str11;
                case 9:
                    list = this.listOfRoleDtoAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("roles", "roles", jsonReader);
                    }
                    str4 = str13;
                    str = str9;
                    str2 = str10;
                    orderProviderIdDto = orderProviderIdDto2;
                    str3 = str11;
                case 10:
                    str8 = this.nullableStringAdapter.fromJson(jsonReader);
                    str4 = str13;
                    str = str9;
                    str2 = str10;
                    orderProviderIdDto = orderProviderIdDto2;
                    str3 = str11;
                default:
                    str4 = str13;
                    str = str9;
                    str2 = str10;
                    orderProviderIdDto = orderProviderIdDto2;
                    str3 = str11;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PayerContextDto payerContextDto) {
        PayerContextDto payerContextDto2 = payerContextDto;
        if (payerContextDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("phone_pd_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) payerContextDto2.getPhonePdId());
        jsonWriter.name("order_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) payerContextDto2.getOrderId());
        jsonWriter.name("order_provider_id");
        this.orderProviderIdDtoAdapter.toJson(jsonWriter, (JsonWriter) payerContextDto2.getOrderProviderId());
        jsonWriter.name("payment_type");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) payerContextDto2.getPaymentType());
        jsonWriter.name("payment_method_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) payerContextDto2.getPaymentMethodId());
        jsonWriter.name("payer_pa_auth_context");
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) payerContextDto2.getPayerPaAuthContext());
        jsonWriter.name("web_payment_url");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) payerContextDto2.getWebPaymentUrl());
        jsonWriter.name("web_payment_psp_url");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) payerContextDto2.getWebPaymentPspUrl());
        jsonWriter.name("cheque_order_uuid");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) payerContextDto2.getChequeOrderUuid());
        jsonWriter.name("roles");
        this.listOfRoleDtoAdapter.toJson(jsonWriter, (JsonWriter) payerContextDto2.getRoles());
        jsonWriter.name("cargo_ref_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) payerContextDto2.getCargoRefId());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(37, "GeneratedJsonAdapter(PayerContextDto)");
    }
}
