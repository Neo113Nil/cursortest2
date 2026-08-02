package com.squareup.cash.google.pay.payments.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/google/pay/payments/real/RealGooglePayPaymentsClient_PaymentData_AllowedPaymentMethod_CardParameters_BillingAddressParametersJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/google/pay/payments/real/RealGooglePayPaymentsClient$PaymentData$AllowedPaymentMethod$CardParameters$BillingAddressParameters;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RealGooglePayPaymentsClient_PaymentData_AllowedPaymentMethod_CardParameters_BillingAddressParametersJsonAdapter extends JsonAdapter {
    public volatile Constructor constructorRef;
    public final JsonAdapter nullableBooleanAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter stringAdapter;

    public RealGooglePayPaymentsClient_PaymentData_AllowedPaymentMethod_CardParameters_BillingAddressParametersJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("format", "phoneNumberRequired");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "format");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "phoneNumberRequired");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        String str = null;
        Boolean bool = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("format", "format", jsonReader);
                }
            } else if (selectName == 1) {
                bool = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                i = -3;
            }
        }
        jsonReader.endObject();
        if (i == -3) {
            if (str != null) {
                return new RealGooglePayPaymentsClient.PaymentData.AllowedPaymentMethod.CardParameters.BillingAddressParameters(str, bool);
            }
            throw Util.missingProperty("format", "format", jsonReader);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            constructor = RealGooglePayPaymentsClient.PaymentData.AllowedPaymentMethod.CardParameters.BillingAddressParameters.class.getDeclaredConstructor(String.class, Boolean.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        if (str == null) {
            throw Util.missingProperty("format", "format", jsonReader);
        }
        Object newInstance = constructor.newInstance(str, bool, Integer.valueOf(i), null);
        newInstance.getClass();
        return (RealGooglePayPaymentsClient.PaymentData.AllowedPaymentMethod.CardParameters.BillingAddressParameters) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        RealGooglePayPaymentsClient.PaymentData.AllowedPaymentMethod.CardParameters.BillingAddressParameters billingAddressParameters = (RealGooglePayPaymentsClient.PaymentData.AllowedPaymentMethod.CardParameters.BillingAddressParameters) obj;
        jsonWriter.getClass();
        if (billingAddressParameters == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("format");
        this.stringAdapter.toJson(jsonWriter, billingAddressParameters.f1141format);
        jsonWriter.name("phoneNumberRequired");
        this.nullableBooleanAdapter.toJson(jsonWriter, billingAddressParameters.phoneNumberRequired);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, "GeneratedJsonAdapter(RealGooglePayPaymentsClient.PaymentData.AllowedPaymentMethod.CardParameters.BillingAddressParameters)");
    }
}
