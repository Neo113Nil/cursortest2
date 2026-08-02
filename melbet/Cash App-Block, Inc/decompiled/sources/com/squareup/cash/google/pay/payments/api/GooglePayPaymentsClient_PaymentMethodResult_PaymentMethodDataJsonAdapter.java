package com.squareup.cash.google.pay.payments.api;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.google.pay.payments.api.GooglePayPaymentsClient;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/google/pay/payments/api/GooglePayPaymentsClient_PaymentMethodResult_PaymentMethodDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/google/pay/payments/api/GooglePayPaymentsClient$PaymentMethodResult$PaymentMethodData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GooglePayPaymentsClient_PaymentMethodResult_PaymentMethodDataJsonAdapter extends JsonAdapter {
    public final JsonAdapter cardInfoAdapter;
    public final JsonAdapter nullableStringAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter stringAdapter;
    public final JsonAdapter tokenizationDataAdapter;

    public GooglePayPaymentsClient_PaymentMethodResult_PaymentMethodDataJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("type", "description", "info", "tokenizationData");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "type");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "description");
        this.cardInfoAdapter = moshi.adapter(GooglePayPaymentsClient.PaymentMethodResult.PaymentMethodData.CardInfo.class, emptySet, "info");
        this.tokenizationDataAdapter = moshi.adapter(GooglePayPaymentsClient.PaymentMethodResult.PaymentMethodData.TokenizationData.class, emptySet, "tokenizationData");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        GooglePayPaymentsClient.PaymentMethodResult.PaymentMethodData.CardInfo cardInfo = null;
        GooglePayPaymentsClient.PaymentMethodResult.PaymentMethodData.TokenizationData tokenizationData = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("type", "type", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                cardInfo = (GooglePayPaymentsClient.PaymentMethodResult.PaymentMethodData.CardInfo) this.cardInfoAdapter.fromJson(jsonReader);
                if (cardInfo == null) {
                    throw Util.unexpectedNull("info", "info", jsonReader);
                }
            } else if (selectName == 3 && (tokenizationData = (GooglePayPaymentsClient.PaymentMethodResult.PaymentMethodData.TokenizationData) this.tokenizationDataAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("tokenizationData", "tokenizationData", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("type", "type", jsonReader);
        }
        if (cardInfo == null) {
            throw Util.missingProperty("info", "info", jsonReader);
        }
        if (tokenizationData != null) {
            return new GooglePayPaymentsClient.PaymentMethodResult.PaymentMethodData(str, str2, cardInfo, tokenizationData);
        }
        throw Util.missingProperty("tokenizationData", "tokenizationData", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        GooglePayPaymentsClient.PaymentMethodResult.PaymentMethodData paymentMethodData = (GooglePayPaymentsClient.PaymentMethodResult.PaymentMethodData) obj;
        jsonWriter.getClass();
        if (paymentMethodData == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("type");
        this.stringAdapter.toJson(jsonWriter, paymentMethodData.f1138type);
        jsonWriter.name("description");
        this.nullableStringAdapter.toJson(jsonWriter, paymentMethodData.description);
        jsonWriter.name("info");
        this.cardInfoAdapter.toJson(jsonWriter, paymentMethodData.info);
        jsonWriter.name("tokenizationData");
        this.tokenizationDataAdapter.toJson(jsonWriter, paymentMethodData.tokenizationData);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(83, "GeneratedJsonAdapter(GooglePayPaymentsClient.PaymentMethodResult.PaymentMethodData)");
    }
}
