package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/PayNowActionDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/PayNowActionDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "", "listOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/PaymentItemDto;", "paymentItemDtoAdapter", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ButtonItemDto;", "buttonItemDtoAdapter", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PayNowActionDtoJsonAdapter extends JsonAdapter<PayNowActionDto> {
    private final JsonAdapter<ButtonItemDto> buttonItemDtoAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("available_payment_types", "payment_item", "payment_chosen_button", "about_to_choose_button");
    private final JsonAdapter<PaymentItemDto> paymentItemDtoAdapter;

    public PayNowActionDtoJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, String.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfStringAdapter = moshi.adapter(newParameterizedType, emptySet, "availablePaymentTypes");
        this.paymentItemDtoAdapter = moshi.adapter(PaymentItemDto.class, emptySet, "paymentItem");
        this.buttonItemDtoAdapter = moshi.adapter(ButtonItemDto.class, emptySet, "paymentChosenButton");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PayNowActionDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<String> list = null;
        PaymentItemDto paymentItemDto = null;
        ButtonItemDto buttonItemDto = null;
        ButtonItemDto buttonItemDto2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfStringAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("availablePaymentTypes", "available_payment_types", jsonReader);
                }
            } else if (selectName == 1) {
                paymentItemDto = this.paymentItemDtoAdapter.fromJson(jsonReader);
                if (paymentItemDto == null) {
                    throw Util.unexpectedNull("paymentItem", "payment_item", jsonReader);
                }
            } else if (selectName == 2) {
                buttonItemDto = this.buttonItemDtoAdapter.fromJson(jsonReader);
                if (buttonItemDto == null) {
                    throw Util.unexpectedNull("paymentChosenButton", "payment_chosen_button", jsonReader);
                }
            } else if (selectName == 3 && (buttonItemDto2 = this.buttonItemDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("aboutToChooseButton", "about_to_choose_button", jsonReader);
            }
        }
        jsonReader.endObject();
        if (list == null) {
            throw Util.missingProperty("availablePaymentTypes", "available_payment_types", jsonReader);
        }
        if (paymentItemDto == null) {
            throw Util.missingProperty("paymentItem", "payment_item", jsonReader);
        }
        if (buttonItemDto == null) {
            throw Util.missingProperty("paymentChosenButton", "payment_chosen_button", jsonReader);
        }
        if (buttonItemDto2 != null) {
            return new PayNowActionDto(list, paymentItemDto, buttonItemDto, buttonItemDto2);
        }
        throw Util.missingProperty("aboutToChooseButton", "about_to_choose_button", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PayNowActionDto payNowActionDto) {
        PayNowActionDto payNowActionDto2 = payNowActionDto;
        if (payNowActionDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("available_payment_types");
        this.listOfStringAdapter.toJson(jsonWriter, (JsonWriter) payNowActionDto2.getAvailablePaymentTypes());
        jsonWriter.name("payment_item");
        this.paymentItemDtoAdapter.toJson(jsonWriter, (JsonWriter) payNowActionDto2.getPaymentItem());
        jsonWriter.name("payment_chosen_button");
        this.buttonItemDtoAdapter.toJson(jsonWriter, (JsonWriter) payNowActionDto2.getPaymentChosenButton());
        jsonWriter.name("about_to_choose_button");
        this.buttonItemDtoAdapter.toJson(jsonWriter, (JsonWriter) payNowActionDto2.getAboutToChooseButton());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(37, "GeneratedJsonAdapter(PayNowActionDto)");
    }
}
