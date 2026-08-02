package com.squareup.cash.google.pay.payments.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.google.pay.payments.real.RealGooglePayPaymentsClient;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/google/pay/payments/real/RealGooglePayPaymentsClient_PaymentDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/google/pay/payments/real/RealGooglePayPaymentsClient$PaymentData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RealGooglePayPaymentsClient_PaymentDataJsonAdapter extends JsonAdapter {
    public final JsonAdapter booleanAdapter;
    public final JsonAdapter intAdapter;
    public final JsonAdapter listOfAllowedPaymentMethodAdapter;
    public final JsonAdapter merchantInfoAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter transactionInfoAdapter;

    public RealGooglePayPaymentsClient_PaymentDataJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("apiVersion", "apiVersionMinor", "allowedPaymentMethods", "emailRequired", "merchantInfo", "transactionInfo");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "apiVersion");
        this.listOfAllowedPaymentMethodAdapter = moshi.adapter(Types.newParameterizedType(List.class, RealGooglePayPaymentsClient.PaymentData.AllowedPaymentMethod.class), emptySet, "allowedPaymentMethods");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "emailRequired");
        this.merchantInfoAdapter = moshi.adapter(RealGooglePayPaymentsClient.PaymentData.MerchantInfo.class, emptySet, "merchantInfo");
        this.transactionInfoAdapter = moshi.adapter(RealGooglePayPaymentsClient.PaymentData.TransactionInfo.class, emptySet, "transactionInfo");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        Integer num = null;
        Integer num2 = null;
        Boolean bool = null;
        List list = null;
        RealGooglePayPaymentsClient.PaymentData.MerchantInfo merchantInfo = null;
        RealGooglePayPaymentsClient.PaymentData.TransactionInfo transactionInfo = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            JsonAdapter jsonAdapter = this.intAdapter;
            switch (selectName) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    num = (Integer) jsonAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("apiVersion", "apiVersion", jsonReader);
                    }
                    break;
                case 1:
                    num2 = (Integer) jsonAdapter.fromJson(jsonReader);
                    if (num2 == null) {
                        throw Util.unexpectedNull("apiVersionMinor", "apiVersionMinor", jsonReader);
                    }
                    break;
                case 2:
                    list = (List) this.listOfAllowedPaymentMethodAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("allowedPaymentMethods", "allowedPaymentMethods", jsonReader);
                    }
                    break;
                case 3:
                    bool = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        throw Util.unexpectedNull("emailRequired", "emailRequired", jsonReader);
                    }
                    break;
                case 4:
                    merchantInfo = (RealGooglePayPaymentsClient.PaymentData.MerchantInfo) this.merchantInfoAdapter.fromJson(jsonReader);
                    if (merchantInfo == null) {
                        throw Util.unexpectedNull("merchantInfo", "merchantInfo", jsonReader);
                    }
                    break;
                case 5:
                    transactionInfo = (RealGooglePayPaymentsClient.PaymentData.TransactionInfo) this.transactionInfoAdapter.fromJson(jsonReader);
                    if (transactionInfo == null) {
                        throw Util.unexpectedNull("transactionInfo", "transactionInfo", jsonReader);
                    }
                    break;
            }
        }
        jsonReader.endObject();
        Boolean bool2 = bool;
        if (num == null) {
            throw Util.missingProperty("apiVersion", "apiVersion", jsonReader);
        }
        int intValue = num.intValue();
        if (num2 == null) {
            throw Util.missingProperty("apiVersionMinor", "apiVersionMinor", jsonReader);
        }
        int intValue2 = num2.intValue();
        if (list == null) {
            throw Util.missingProperty("allowedPaymentMethods", "allowedPaymentMethods", jsonReader);
        }
        if (bool2 == null) {
            throw Util.missingProperty("emailRequired", "emailRequired", jsonReader);
        }
        boolean booleanValue = bool2.booleanValue();
        if (merchantInfo == null) {
            throw Util.missingProperty("merchantInfo", "merchantInfo", jsonReader);
        }
        if (transactionInfo != null) {
            return new RealGooglePayPaymentsClient.PaymentData(intValue, intValue2, list, booleanValue, merchantInfo, transactionInfo);
        }
        throw Util.missingProperty("transactionInfo", "transactionInfo", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        RealGooglePayPaymentsClient.PaymentData paymentData = (RealGooglePayPaymentsClient.PaymentData) obj;
        jsonWriter.getClass();
        if (paymentData == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("apiVersion");
        Integer valueOf = Integer.valueOf(paymentData.getApiVersion());
        JsonAdapter jsonAdapter = this.intAdapter;
        jsonAdapter.toJson(jsonWriter, valueOf);
        jsonWriter.name("apiVersionMinor");
        jsonAdapter.toJson(jsonWriter, Integer.valueOf(paymentData.getApiVersionMinor()));
        jsonWriter.name("allowedPaymentMethods");
        this.listOfAllowedPaymentMethodAdapter.toJson(jsonWriter, paymentData.getAllowedPaymentMethods());
        jsonWriter.name("emailRequired");
        this.booleanAdapter.toJson(jsonWriter, Boolean.valueOf(paymentData.getEmailRequired()));
        jsonWriter.name("merchantInfo");
        this.merchantInfoAdapter.toJson(jsonWriter, paymentData.getMerchantInfo());
        jsonWriter.name("transactionInfo");
        this.transactionInfoAdapter.toJson(jsonWriter, paymentData.getTransactionInfo());
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(61, "GeneratedJsonAdapter(RealGooglePayPaymentsClient.PaymentData)");
    }
}
