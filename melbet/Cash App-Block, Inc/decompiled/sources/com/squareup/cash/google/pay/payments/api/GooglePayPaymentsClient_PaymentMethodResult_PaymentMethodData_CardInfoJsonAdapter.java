package com.squareup.cash.google.pay.payments.api;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.google.pay.payments.api.GooglePayPaymentsClient;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/google/pay/payments/api/GooglePayPaymentsClient_PaymentMethodResult_PaymentMethodData_CardInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/google/pay/payments/api/GooglePayPaymentsClient$PaymentMethodResult$PaymentMethodData$CardInfo;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GooglePayPaymentsClient_PaymentMethodResult_PaymentMethodData_CardInfoJsonAdapter extends JsonAdapter {
    public volatile Constructor constructorRef;
    public final JsonAdapter nullableBillingAddressAdapter;
    public final JsonAdapter nullableStringAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter stringAdapter;

    public GooglePayPaymentsClient_PaymentMethodResult_PaymentMethodData_CardInfoJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("billingAddress", "cardDetails", "cardNetwork", "cardType");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableBillingAddressAdapter = moshi.adapter(GooglePayPaymentsClient.PaymentMethodResult.PaymentMethodData.CardInfo.BillingAddress.class, emptySet, "billingAddress");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "cardDetails");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "cardType");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        GooglePayPaymentsClient.PaymentMethodResult.PaymentMethodData.CardInfo.BillingAddress billingAddress = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                billingAddress = (GooglePayPaymentsClient.PaymentMethodResult.PaymentMethodData.CardInfo.BillingAddress) this.nullableBillingAddressAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("cardDetails", "cardDetails", jsonReader);
                }
            } else if (selectName == 2) {
                str2 = (String) this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("cardNetwork", "cardNetwork", jsonReader);
                }
            } else if (selectName == 3) {
                str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                i = -9;
            }
        }
        jsonReader.endObject();
        if (i == -9) {
            if (str == null) {
                throw Util.missingProperty("cardDetails", "cardDetails", jsonReader);
            }
            if (str2 != null) {
                return new GooglePayPaymentsClient.PaymentMethodResult.PaymentMethodData.CardInfo(billingAddress, str, str2, str3);
            }
            throw Util.missingProperty("cardNetwork", "cardNetwork", jsonReader);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            constructor = GooglePayPaymentsClient.PaymentMethodResult.PaymentMethodData.CardInfo.class.getDeclaredConstructor(GooglePayPaymentsClient.PaymentMethodResult.PaymentMethodData.CardInfo.BillingAddress.class, String.class, String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        if (str == null) {
            throw Util.missingProperty("cardDetails", "cardDetails", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("cardNetwork", "cardNetwork", jsonReader);
        }
        Object newInstance = constructor.newInstance(billingAddress, str, str2, str3, Integer.valueOf(i), null);
        newInstance.getClass();
        return (GooglePayPaymentsClient.PaymentMethodResult.PaymentMethodData.CardInfo) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        GooglePayPaymentsClient.PaymentMethodResult.PaymentMethodData.CardInfo cardInfo = (GooglePayPaymentsClient.PaymentMethodResult.PaymentMethodData.CardInfo) obj;
        jsonWriter.getClass();
        if (cardInfo == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("billingAddress");
        this.nullableBillingAddressAdapter.toJson(jsonWriter, cardInfo.billingAddress);
        jsonWriter.name("cardDetails");
        String str = cardInfo.cardDetails;
        JsonAdapter jsonAdapter = this.stringAdapter;
        jsonAdapter.toJson(jsonWriter, str);
        jsonWriter.name("cardNetwork");
        jsonAdapter.toJson(jsonWriter, cardInfo.cardNetwork);
        jsonWriter.name("cardType");
        this.nullableStringAdapter.toJson(jsonWriter, cardInfo.cardType);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(92, "GeneratedJsonAdapter(GooglePayPaymentsClient.PaymentMethodResult.PaymentMethodData.CardInfo)");
    }
}
