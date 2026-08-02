package com.squareup.cash.google.pay.payments.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.appsflyer.AppsFlyerProperties;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.google.pay.payments.real.RealGooglePayPaymentsClient;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/google/pay/payments/real/RealGooglePayPaymentsClient_PaymentData_TransactionInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/google/pay/payments/real/RealGooglePayPaymentsClient$PaymentData$TransactionInfo;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RealGooglePayPaymentsClient_PaymentData_TransactionInfoJsonAdapter extends JsonAdapter {
    public final JsonReader.Options options;
    public final JsonAdapter stringAdapter;

    public RealGooglePayPaymentsClient_PaymentData_TransactionInfoJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("totalPriceStatus", "totalPrice", AppsFlyerProperties.CURRENCY_CODE, "countryCode");
        this.stringAdapter = moshi.adapter(String.class, EmptySet.INSTANCE, "totalPriceStatus");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName != -1) {
                JsonAdapter jsonAdapter = this.stringAdapter;
                if (selectName == 0) {
                    str = (String) jsonAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("totalPriceStatus", "totalPriceStatus", jsonReader);
                    }
                } else if (selectName == 1) {
                    str2 = (String) jsonAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("totalPrice", "totalPrice", jsonReader);
                    }
                } else if (selectName == 2) {
                    str3 = (String) jsonAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull(AppsFlyerProperties.CURRENCY_CODE, AppsFlyerProperties.CURRENCY_CODE, jsonReader);
                    }
                } else if (selectName == 3 && (str4 = (String) jsonAdapter.fromJson(jsonReader)) == null) {
                    throw Util.unexpectedNull("countryCode", "countryCode", jsonReader);
                }
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("totalPriceStatus", "totalPriceStatus", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("totalPrice", "totalPrice", jsonReader);
        }
        if (str3 == null) {
            throw Util.missingProperty(AppsFlyerProperties.CURRENCY_CODE, AppsFlyerProperties.CURRENCY_CODE, jsonReader);
        }
        if (str4 != null) {
            return new RealGooglePayPaymentsClient.PaymentData.TransactionInfo(str, str2, str3, str4);
        }
        throw Util.missingProperty("countryCode", "countryCode", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        RealGooglePayPaymentsClient.PaymentData.TransactionInfo transactionInfo = (RealGooglePayPaymentsClient.PaymentData.TransactionInfo) obj;
        jsonWriter.getClass();
        if (transactionInfo == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("totalPriceStatus");
        String str = transactionInfo.totalPriceStatus;
        JsonAdapter jsonAdapter = this.stringAdapter;
        jsonAdapter.toJson(jsonWriter, str);
        jsonWriter.name("totalPrice");
        jsonAdapter.toJson(jsonWriter, transactionInfo.totalPrice);
        jsonWriter.name(AppsFlyerProperties.CURRENCY_CODE);
        jsonAdapter.toJson(jsonWriter, transactionInfo.currencyCode);
        jsonWriter.name("countryCode");
        jsonAdapter.toJson(jsonWriter, transactionInfo.countryCode);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(77, "GeneratedJsonAdapter(RealGooglePayPaymentsClient.PaymentData.TransactionInfo)");
    }
}
