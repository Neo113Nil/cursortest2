package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/WebPayNowActionDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/WebPayNowActionDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/PaymentItemDto;", "paymentItemDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ButtonItemDto;", "buttonItemDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class WebPayNowActionDtoJsonAdapter extends JsonAdapter<WebPayNowActionDto> {
    private final JsonAdapter<ButtonItemDto> buttonItemDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("payment_url", "payment_item", "payment_button");
    private final JsonAdapter<PaymentItemDto> paymentItemDtoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public WebPayNowActionDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "paymentUrl");
        this.paymentItemDtoAdapter = moshi.adapter(PaymentItemDto.class, emptySet, "paymentItem");
        this.buttonItemDtoAdapter = moshi.adapter(ButtonItemDto.class, emptySet, "paymentButton");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final WebPayNowActionDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        PaymentItemDto paymentItemDto = null;
        ButtonItemDto buttonItemDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("paymentUrl", "payment_url", jsonReader);
                }
            } else if (selectName == 1) {
                paymentItemDto = this.paymentItemDtoAdapter.fromJson(jsonReader);
                if (paymentItemDto == null) {
                    throw Util.unexpectedNull("paymentItem", "payment_item", jsonReader);
                }
            } else if (selectName == 2 && (buttonItemDto = this.buttonItemDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("paymentButton", "payment_button", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("paymentUrl", "payment_url", jsonReader);
        }
        if (paymentItemDto == null) {
            throw Util.missingProperty("paymentItem", "payment_item", jsonReader);
        }
        if (buttonItemDto != null) {
            return new WebPayNowActionDto(str, paymentItemDto, buttonItemDto);
        }
        throw Util.missingProperty("paymentButton", "payment_button", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, WebPayNowActionDto webPayNowActionDto) {
        WebPayNowActionDto webPayNowActionDto2 = webPayNowActionDto;
        if (webPayNowActionDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("payment_url");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) webPayNowActionDto2.getPaymentUrl());
        jsonWriter.name("payment_item");
        this.paymentItemDtoAdapter.toJson(jsonWriter, (JsonWriter) webPayNowActionDto2.getPaymentItem());
        jsonWriter.name("payment_button");
        this.buttonItemDtoAdapter.toJson(jsonWriter, (JsonWriter) webPayNowActionDto2.getPaymentButton());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(WebPayNowActionDto)");
    }
}
