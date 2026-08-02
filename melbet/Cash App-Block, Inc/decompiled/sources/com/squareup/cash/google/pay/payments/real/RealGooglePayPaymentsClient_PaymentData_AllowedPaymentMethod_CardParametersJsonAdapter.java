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
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/google/pay/payments/real/RealGooglePayPaymentsClient_PaymentData_AllowedPaymentMethod_CardParametersJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/google/pay/payments/real/RealGooglePayPaymentsClient$PaymentData$AllowedPaymentMethod$CardParameters;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RealGooglePayPaymentsClient_PaymentData_AllowedPaymentMethod_CardParametersJsonAdapter extends JsonAdapter {
    public volatile Constructor constructorRef;
    public final JsonAdapter listOfStringAdapter;
    public final JsonAdapter nullableBillingAddressParametersAdapter;
    public final JsonAdapter nullableBooleanAdapter;
    public final JsonReader.Options options;

    public RealGooglePayPaymentsClient_PaymentData_AllowedPaymentMethod_CardParametersJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("allowedAuthMethods", "allowedCardNetworks", "allowCreditCards", "allowPrepaidCards", "billingAddressRequired", "billingAddressParameters");
        Util.ParameterizedTypeImpl newParameterizedType = Types.newParameterizedType(List.class, String.class);
        EmptySet emptySet = EmptySet.INSTANCE;
        this.listOfStringAdapter = moshi.adapter(newParameterizedType, emptySet, "allowedAuthMethods");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "allowCreditCards");
        this.nullableBillingAddressParametersAdapter = moshi.adapter(RealGooglePayPaymentsClient.PaymentData.AllowedPaymentMethod.CardParameters.BillingAddressParameters.class, emptySet, "billingAddressParameters");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        int i = -1;
        List list = null;
        List list2 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        RealGooglePayPaymentsClient.PaymentData.AllowedPaymentMethod.CardParameters.BillingAddressParameters billingAddressParameters = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    list = (List) this.listOfStringAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("allowedAuthMethods", "allowedAuthMethods", jsonReader);
                    }
                    break;
                case 1:
                    list2 = (List) this.listOfStringAdapter.fromJson(jsonReader);
                    if (list2 == null) {
                        throw Util.unexpectedNull("allowedCardNetworks", "allowedCardNetworks", jsonReader);
                    }
                    break;
                case 2:
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    i &= -5;
                    break;
                case 3:
                    bool2 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    i &= -9;
                    break;
                case 4:
                    bool3 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    billingAddressParameters = (RealGooglePayPaymentsClient.PaymentData.AllowedPaymentMethod.CardParameters.BillingAddressParameters) this.nullableBillingAddressParametersAdapter.fromJson(jsonReader);
                    i &= -33;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -61) {
            RealGooglePayPaymentsClient.PaymentData.AllowedPaymentMethod.CardParameters.BillingAddressParameters billingAddressParameters2 = billingAddressParameters;
            Boolean bool4 = bool3;
            Boolean bool5 = bool2;
            Boolean bool6 = bool;
            List list3 = list2;
            List list4 = list;
            if (list4 == null) {
                throw Util.missingProperty("allowedAuthMethods", "allowedAuthMethods", jsonReader);
            }
            if (list3 != null) {
                return new RealGooglePayPaymentsClient.PaymentData.AllowedPaymentMethod.CardParameters(list4, list3, bool6, bool5, bool4, billingAddressParameters2);
            }
            throw Util.missingProperty("allowedCardNetworks", "allowedCardNetworks", jsonReader);
        }
        RealGooglePayPaymentsClient.PaymentData.AllowedPaymentMethod.CardParameters.BillingAddressParameters billingAddressParameters3 = billingAddressParameters;
        Boolean bool7 = bool3;
        Boolean bool8 = bool2;
        Boolean bool9 = bool;
        List list5 = list2;
        List list6 = list;
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            constructor = RealGooglePayPaymentsClient.PaymentData.AllowedPaymentMethod.CardParameters.class.getDeclaredConstructor(List.class, List.class, Boolean.class, Boolean.class, Boolean.class, RealGooglePayPaymentsClient.PaymentData.AllowedPaymentMethod.CardParameters.BillingAddressParameters.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        Constructor constructor2 = constructor;
        if (list6 == null) {
            throw Util.missingProperty("allowedAuthMethods", "allowedAuthMethods", jsonReader);
        }
        if (list5 == null) {
            throw Util.missingProperty("allowedCardNetworks", "allowedCardNetworks", jsonReader);
        }
        Object newInstance = constructor2.newInstance(list6, list5, bool9, bool8, bool7, billingAddressParameters3, Integer.valueOf(i), null);
        newInstance.getClass();
        return (RealGooglePayPaymentsClient.PaymentData.AllowedPaymentMethod.CardParameters) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        RealGooglePayPaymentsClient.PaymentData.AllowedPaymentMethod.CardParameters cardParameters = (RealGooglePayPaymentsClient.PaymentData.AllowedPaymentMethod.CardParameters) obj;
        jsonWriter.getClass();
        if (cardParameters == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("allowedAuthMethods");
        List list = cardParameters.allowedAuthMethods;
        JsonAdapter jsonAdapter = this.listOfStringAdapter;
        jsonAdapter.toJson(jsonWriter, list);
        jsonWriter.name("allowedCardNetworks");
        jsonAdapter.toJson(jsonWriter, cardParameters.allowedCardNetworks);
        jsonWriter.name("allowCreditCards");
        Boolean bool = cardParameters.allowCreditCards;
        JsonAdapter jsonAdapter2 = this.nullableBooleanAdapter;
        jsonAdapter2.toJson(jsonWriter, bool);
        jsonWriter.name("allowPrepaidCards");
        jsonAdapter2.toJson(jsonWriter, cardParameters.allowPrepaidCards);
        jsonWriter.name("billingAddressRequired");
        jsonAdapter2.toJson(jsonWriter, cardParameters.billingAddressRequired);
        jsonWriter.name("billingAddressParameters");
        this.nullableBillingAddressParametersAdapter.toJson(jsonWriter, cardParameters.billingAddressParameters);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(97, "GeneratedJsonAdapter(RealGooglePayPaymentsClient.PaymentData.AllowedPaymentMethod.CardParameters)");
    }
}
