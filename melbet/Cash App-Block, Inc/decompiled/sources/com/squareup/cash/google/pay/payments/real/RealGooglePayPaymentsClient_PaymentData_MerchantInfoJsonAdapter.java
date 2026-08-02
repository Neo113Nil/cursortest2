package com.squareup.cash.google.pay.payments.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.google.pay.payments.real.RealGooglePayPaymentsClient;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/google/pay/payments/real/RealGooglePayPaymentsClient_PaymentData_MerchantInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/google/pay/payments/real/RealGooglePayPaymentsClient$PaymentData$MerchantInfo;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RealGooglePayPaymentsClient_PaymentData_MerchantInfoJsonAdapter extends JsonAdapter {
    public volatile Constructor constructorRef;
    public final JsonAdapter nullableStringAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter stringAdapter;

    public RealGooglePayPaymentsClient_PaymentData_MerchantInfoJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("merchantName", "merchantId");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "merchantName");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "merchantId");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("merchantName", "merchantName", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                i = -3;
            }
        }
        jsonReader.endObject();
        if (i == -3) {
            if (str != null) {
                return new RealGooglePayPaymentsClient.PaymentData.MerchantInfo(str, str2);
            }
            throw Util.missingProperty("merchantName", "merchantName", jsonReader);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            constructor = RealGooglePayPaymentsClient.PaymentData.MerchantInfo.class.getDeclaredConstructor(String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        if (str == null) {
            throw Util.missingProperty("merchantName", "merchantName", jsonReader);
        }
        Object newInstance = constructor.newInstance(str, str2, Integer.valueOf(i), null);
        newInstance.getClass();
        return (RealGooglePayPaymentsClient.PaymentData.MerchantInfo) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        RealGooglePayPaymentsClient.PaymentData.MerchantInfo merchantInfo = (RealGooglePayPaymentsClient.PaymentData.MerchantInfo) obj;
        jsonWriter.getClass();
        if (merchantInfo == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("merchantName");
        this.stringAdapter.toJson(jsonWriter, merchantInfo.merchantName);
        jsonWriter.name("merchantId");
        this.nullableStringAdapter.toJson(jsonWriter, merchantInfo.merchantId);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(74, "GeneratedJsonAdapter(RealGooglePayPaymentsClient.PaymentData.MerchantInfo)");
    }
}
