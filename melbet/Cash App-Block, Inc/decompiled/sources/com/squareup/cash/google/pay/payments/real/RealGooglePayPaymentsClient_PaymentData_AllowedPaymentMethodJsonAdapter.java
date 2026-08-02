package com.squareup.cash.google.pay.payments.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.google.pay.payments.real.RealGooglePayPaymentsClient;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/google/pay/payments/real/RealGooglePayPaymentsClient_PaymentData_AllowedPaymentMethodJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/google/pay/payments/real/RealGooglePayPaymentsClient$PaymentData$AllowedPaymentMethod;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RealGooglePayPaymentsClient_PaymentData_AllowedPaymentMethodJsonAdapter extends JsonAdapter {
    public final JsonAdapter cardParametersAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter stringAdapter;
    public final JsonAdapter tokenizationSpecificationAdapter;

    public RealGooglePayPaymentsClient_PaymentData_AllowedPaymentMethodJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("type", "parameters", "tokenizationSpecification");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "type");
        this.cardParametersAdapter = moshi.adapter(RealGooglePayPaymentsClient.PaymentData.AllowedPaymentMethod.CardParameters.class, emptySet, "parameters");
        this.tokenizationSpecificationAdapter = moshi.adapter(RealGooglePayPaymentsClient.PaymentData.AllowedPaymentMethod.TokenizationSpecification.class, emptySet, "tokenizationSpecification");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        String str = null;
        RealGooglePayPaymentsClient.PaymentData.AllowedPaymentMethod.CardParameters cardParameters = null;
        RealGooglePayPaymentsClient.PaymentData.AllowedPaymentMethod.TokenizationSpecification tokenizationSpecification = null;
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
                cardParameters = (RealGooglePayPaymentsClient.PaymentData.AllowedPaymentMethod.CardParameters) this.cardParametersAdapter.fromJson(jsonReader);
                if (cardParameters == null) {
                    throw Util.unexpectedNull("parameters", "parameters", jsonReader);
                }
            } else if (selectName == 2 && (tokenizationSpecification = (RealGooglePayPaymentsClient.PaymentData.AllowedPaymentMethod.TokenizationSpecification) this.tokenizationSpecificationAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("tokenizationSpecification", "tokenizationSpecification", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("type", "type", jsonReader);
        }
        if (cardParameters == null) {
            throw Util.missingProperty("parameters", "parameters", jsonReader);
        }
        if (tokenizationSpecification != null) {
            return new RealGooglePayPaymentsClient.PaymentData.AllowedPaymentMethod(str, cardParameters, tokenizationSpecification);
        }
        throw Util.missingProperty("tokenizationSpecification", "tokenizationSpecification", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        RealGooglePayPaymentsClient.PaymentData.AllowedPaymentMethod allowedPaymentMethod = (RealGooglePayPaymentsClient.PaymentData.AllowedPaymentMethod) obj;
        jsonWriter.getClass();
        if (allowedPaymentMethod == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("type");
        this.stringAdapter.toJson(jsonWriter, allowedPaymentMethod.f1140type);
        jsonWriter.name("parameters");
        this.cardParametersAdapter.toJson(jsonWriter, allowedPaymentMethod.parameters);
        jsonWriter.name("tokenizationSpecification");
        this.tokenizationSpecificationAdapter.toJson(jsonWriter, allowedPaymentMethod.tokenizationSpecification);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(82, "GeneratedJsonAdapter(RealGooglePayPaymentsClient.PaymentData.AllowedPaymentMethod)");
    }
}
