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
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/google/pay/payments/real/RealGooglePayPaymentsClient_PaymentData_AllowedPaymentMethod_TokenizationSpecificationJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/google/pay/payments/real/RealGooglePayPaymentsClient$PaymentData$AllowedPaymentMethod$TokenizationSpecification;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RealGooglePayPaymentsClient_PaymentData_AllowedPaymentMethod_TokenizationSpecificationJsonAdapter extends JsonAdapter {
    public final JsonAdapter mapOfStringStringAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter stringAdapter;

    public RealGooglePayPaymentsClient_PaymentData_AllowedPaymentMethod_TokenizationSpecificationJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("type", "parameters");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "type");
        this.mapOfStringStringAdapter = moshi.adapter(Types.newParameterizedType(Map.class, String.class, String.class), emptySet, "parameters");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        String str = null;
        Map map = null;
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
            } else if (selectName == 1 && (map = (Map) this.mapOfStringStringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("parameters", "parameters", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("type", "type", jsonReader);
        }
        if (map != null) {
            return new RealGooglePayPaymentsClient.PaymentData.AllowedPaymentMethod.TokenizationSpecification(str, map);
        }
        throw Util.missingProperty("parameters", "parameters", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        RealGooglePayPaymentsClient.PaymentData.AllowedPaymentMethod.TokenizationSpecification tokenizationSpecification = (RealGooglePayPaymentsClient.PaymentData.AllowedPaymentMethod.TokenizationSpecification) obj;
        jsonWriter.getClass();
        if (tokenizationSpecification == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("type");
        this.stringAdapter.toJson(jsonWriter, tokenizationSpecification.f1142type);
        jsonWriter.name("parameters");
        this.mapOfStringStringAdapter.toJson(jsonWriter, tokenizationSpecification.parameters);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(108, "GeneratedJsonAdapter(RealGooglePayPaymentsClient.PaymentData.AllowedPaymentMethod.TokenizationSpecification)");
    }
}
