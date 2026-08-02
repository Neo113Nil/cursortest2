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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/google/pay/payments/api/GooglePayPaymentsClient_PaymentMethodResultJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/google/pay/payments/api/GooglePayPaymentsClient$PaymentMethodResult;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GooglePayPaymentsClient_PaymentMethodResultJsonAdapter extends JsonAdapter {
    public final JsonAdapter nullableStringAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter paymentMethodDataAdapter;

    public GooglePayPaymentsClient_PaymentMethodResultJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("email", "paymentMethodData");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "email");
        this.paymentMethodDataAdapter = moshi.adapter(GooglePayPaymentsClient.PaymentMethodResult.PaymentMethodData.class, emptySet, "paymentMethodData");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        String str = null;
        GooglePayPaymentsClient.PaymentMethodResult.PaymentMethodData paymentMethodData = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 1 && (paymentMethodData = (GooglePayPaymentsClient.PaymentMethodResult.PaymentMethodData) this.paymentMethodDataAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("paymentMethodData", "paymentMethodData", jsonReader);
            }
        }
        jsonReader.endObject();
        if (paymentMethodData != null) {
            return new GooglePayPaymentsClient.PaymentMethodResult(str, paymentMethodData);
        }
        throw Util.missingProperty("paymentMethodData", "paymentMethodData", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        GooglePayPaymentsClient.PaymentMethodResult paymentMethodResult = (GooglePayPaymentsClient.PaymentMethodResult) obj;
        jsonWriter.getClass();
        if (paymentMethodResult == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("email");
        this.nullableStringAdapter.toJson(jsonWriter, paymentMethodResult.getEmail());
        jsonWriter.name("paymentMethodData");
        this.paymentMethodDataAdapter.toJson(jsonWriter, paymentMethodResult.getPaymentMethodData());
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(65, "GeneratedJsonAdapter(GooglePayPaymentsClient.PaymentMethodResult)");
    }
}
