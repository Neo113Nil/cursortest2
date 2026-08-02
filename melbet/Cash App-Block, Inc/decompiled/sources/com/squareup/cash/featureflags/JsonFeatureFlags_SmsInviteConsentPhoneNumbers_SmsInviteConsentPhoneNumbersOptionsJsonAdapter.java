package com.squareup.cash.featureflags;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.featureflags.JsonFeatureFlags$SmsInviteConsentPhoneNumbers;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/featureflags/JsonFeatureFlags_SmsInviteConsentPhoneNumbers_SmsInviteConsentPhoneNumbersOptionsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/featureflags/JsonFeatureFlags$SmsInviteConsentPhoneNumbers$SmsInviteConsentPhoneNumbersOptions;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonFeatureFlags_SmsInviteConsentPhoneNumbers_SmsInviteConsentPhoneNumbersOptionsJsonAdapter extends JsonAdapter {
    public volatile Constructor constructorRef;
    public final JsonAdapter listOfStringAdapter;
    public final JsonReader.Options options;

    public JsonFeatureFlags_SmsInviteConsentPhoneNumbers_SmsInviteConsentPhoneNumbersOptionsJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("FL", "OK", "WA");
        this.listOfStringAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), EmptySet.INSTANCE, "FL");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        List list = null;
        List list2 = null;
        List list3 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = (List) this.listOfStringAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("FL", "FL", jsonReader);
                }
                i &= -2;
            } else if (selectName == 1) {
                list2 = (List) this.listOfStringAdapter.fromJson(jsonReader);
                if (list2 == null) {
                    throw Util.unexpectedNull("OK", "OK", jsonReader);
                }
                i &= -3;
            } else if (selectName == 2) {
                list3 = (List) this.listOfStringAdapter.fromJson(jsonReader);
                if (list3 == null) {
                    throw Util.unexpectedNull("WA", "WA", jsonReader);
                }
                i &= -5;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -8) {
            list.getClass();
            list2.getClass();
            list3.getClass();
            return new JsonFeatureFlags$SmsInviteConsentPhoneNumbers.SmsInviteConsentPhoneNumbersOptions(list, list2, list3);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            constructor = JsonFeatureFlags$SmsInviteConsentPhoneNumbers.SmsInviteConsentPhoneNumbersOptions.class.getDeclaredConstructor(List.class, List.class, List.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        Object newInstance = constructor.newInstance(list, list2, list3, Integer.valueOf(i), null);
        newInstance.getClass();
        return (JsonFeatureFlags$SmsInviteConsentPhoneNumbers.SmsInviteConsentPhoneNumbersOptions) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        JsonFeatureFlags$SmsInviteConsentPhoneNumbers.SmsInviteConsentPhoneNumbersOptions smsInviteConsentPhoneNumbersOptions = (JsonFeatureFlags$SmsInviteConsentPhoneNumbers.SmsInviteConsentPhoneNumbersOptions) obj;
        jsonWriter.getClass();
        if (smsInviteConsentPhoneNumbersOptions == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("FL");
        List list = smsInviteConsentPhoneNumbersOptions.FL;
        JsonAdapter jsonAdapter = this.listOfStringAdapter;
        jsonAdapter.toJson(jsonWriter, list);
        jsonWriter.name("OK");
        jsonAdapter.toJson(jsonWriter, smsInviteConsentPhoneNumbersOptions.OK);
        jsonWriter.name("WA");
        jsonAdapter.toJson(jsonWriter, smsInviteConsentPhoneNumbersOptions.WA);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(103, "GeneratedJsonAdapter(JsonFeatureFlags.SmsInviteConsentPhoneNumbers.SmsInviteConsentPhoneNumbersOptions)");
    }
}
