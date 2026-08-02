package com.squareup.cash.google.pay.payments.api;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.google.pay.payments.api.GooglePayPaymentsClient;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/google/pay/payments/api/GooglePayPaymentsClient_PaymentMethodResult_PaymentMethodData_CardInfo_BillingAddressJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/google/pay/payments/api/GooglePayPaymentsClient$PaymentMethodResult$PaymentMethodData$CardInfo$BillingAddress;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GooglePayPaymentsClient_PaymentMethodResult_PaymentMethodData_CardInfo_BillingAddressJsonAdapter extends JsonAdapter {
    public final JsonAdapter nullableStringAdapter;
    public final JsonReader.Options options;

    public GooglePayPaymentsClient_PaymentMethodResult_PaymentMethodData_CardInfo_BillingAddressJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("name", "address1", "address2", "address3", "locality", "administrativeArea", "postalCode", "countryCode", "phoneNumber", "sortingCode", "languageCode");
        this.nullableStringAdapter = moshi.adapter(String.class, EmptySet.INSTANCE, "name");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            JsonAdapter jsonAdapter = this.nullableStringAdapter;
            switch (selectName) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = (String) jsonAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    str2 = (String) jsonAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    str3 = (String) jsonAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str4 = (String) jsonAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str5 = (String) jsonAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str6 = (String) jsonAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    str7 = (String) jsonAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    str8 = (String) jsonAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    str9 = (String) jsonAdapter.fromJson(jsonReader);
                    break;
                case 9:
                    str10 = (String) jsonAdapter.fromJson(jsonReader);
                    break;
                case 10:
                    str11 = (String) jsonAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        return new GooglePayPaymentsClient.PaymentMethodResult.PaymentMethodData.CardInfo.BillingAddress(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        GooglePayPaymentsClient.PaymentMethodResult.PaymentMethodData.CardInfo.BillingAddress billingAddress = (GooglePayPaymentsClient.PaymentMethodResult.PaymentMethodData.CardInfo.BillingAddress) obj;
        jsonWriter.getClass();
        if (billingAddress == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("name");
        String str = billingAddress.name;
        JsonAdapter jsonAdapter = this.nullableStringAdapter;
        jsonAdapter.toJson(jsonWriter, str);
        jsonWriter.name("address1");
        jsonAdapter.toJson(jsonWriter, billingAddress.address1);
        jsonWriter.name("address2");
        jsonAdapter.toJson(jsonWriter, billingAddress.address2);
        jsonWriter.name("address3");
        jsonAdapter.toJson(jsonWriter, billingAddress.address3);
        jsonWriter.name("locality");
        jsonAdapter.toJson(jsonWriter, billingAddress.locality);
        jsonWriter.name("administrativeArea");
        jsonAdapter.toJson(jsonWriter, billingAddress.administrativeArea);
        jsonWriter.name("postalCode");
        jsonAdapter.toJson(jsonWriter, billingAddress.postalCode);
        jsonWriter.name("countryCode");
        jsonAdapter.toJson(jsonWriter, billingAddress.countryCode);
        jsonWriter.name("phoneNumber");
        jsonAdapter.toJson(jsonWriter, billingAddress.phoneNumber);
        jsonWriter.name("sortingCode");
        jsonAdapter.toJson(jsonWriter, billingAddress.sortingCode);
        jsonWriter.name("languageCode");
        jsonAdapter.toJson(jsonWriter, billingAddress.languageCode);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(107, "GeneratedJsonAdapter(GooglePayPaymentsClient.PaymentMethodResult.PaymentMethodData.CardInfo.BillingAddress)");
    }
}
