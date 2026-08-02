package com.squareup.cash.data.push;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.data.push.CashPushNotification;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.Instrument;
import com.squareup.protos.franklin.common.appmessaging.AppMessageAction;
import com.squareup.protos.franklin.common.appmessaging.AppMessagePayload;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/data/push/CashPushNotificationJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/data/push/CashPushNotification;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "notifications"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CashPushNotificationJsonAdapter extends JsonAdapter {
    public volatile Constructor constructorRef;
    public final JsonAdapter nullableAPSAdapter;
    public final JsonAdapter nullableAppMessageActionAdapter;
    public final JsonAdapter nullableAppMessagePayloadAdapter;
    public final JsonAdapter nullableClearAppDataConfigAdapter;
    public final JsonAdapter nullableCustomerAdapter;
    public final JsonAdapter nullableInstrumentAdapter;
    public final JsonAdapter nullableMoneyAdapter;
    public final JsonAdapter nullableStringAdapter;
    public final JsonAdapter nullableTriggerEntitySyncAdapter;
    public final JsonReader.Options options;

    public CashPushNotificationJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("aps", "pt", "op", "url", "at", "c", "ak", "other-customer", "mt", "title", "body", "instrument", "payment-amount", "verification-instrument-token", "play-integrity-challenge-token", "app-message-action", "app-message-payload", "clear-app-data-config", "tes", "eri", "notification-category", "image-url");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableAPSAdapter = moshi.adapter(CashPushNotification.APS.class, emptySet, "aps");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "paymentToken");
        this.nullableCustomerAdapter = moshi.adapter(CashPushNotification.Customer.class, emptySet, "otherCustomer");
        this.nullableInstrumentAdapter = moshi.adapter(Instrument.class, emptySet, "instrument");
        this.nullableMoneyAdapter = moshi.adapter(Money.class, emptySet, "paymentAmount");
        this.nullableAppMessageActionAdapter = moshi.adapter(AppMessageAction.class, emptySet, "appMessageAction");
        this.nullableAppMessagePayloadAdapter = moshi.adapter(AppMessagePayload.class, emptySet, "appMessagePayload");
        this.nullableClearAppDataConfigAdapter = moshi.adapter(CashPushNotification.ClearAppDataConfig.class, emptySet, "clearAppDataConfig");
        this.nullableTriggerEntitySyncAdapter = moshi.adapter(CashPushNotification.TriggerEntitySync.class, emptySet, "triggerEntitySync");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        int i;
        jsonReader.getClass();
        jsonReader.beginObject();
        int i2 = -1;
        CashPushNotification.APS aps = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        CashPushNotification.Customer customer = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        Instrument instrument = null;
        Money money = null;
        String str10 = null;
        String str11 = null;
        AppMessageAction appMessageAction = null;
        AppMessagePayload appMessagePayload = null;
        CashPushNotification.ClearAppDataConfig clearAppDataConfig = null;
        CashPushNotification.TriggerEntitySync triggerEntitySync = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    continue;
                case 0:
                    aps = (CashPushNotification.APS) this.nullableAPSAdapter.fromJson(jsonReader);
                    i2 &= -2;
                    continue;
                case 1:
                    str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -3;
                    continue;
                case 2:
                    str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -5;
                    continue;
                case 3:
                    str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -9;
                    continue;
                case 4:
                    str4 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -17;
                    continue;
                case 5:
                    str5 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -33;
                    continue;
                case 6:
                    str6 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -65;
                    continue;
                case 7:
                    customer = (CashPushNotification.Customer) this.nullableCustomerAdapter.fromJson(jsonReader);
                    i2 &= -129;
                    continue;
                case 8:
                    str7 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -257;
                    continue;
                case 9:
                    str8 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -513;
                    continue;
                case 10:
                    str9 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -1025;
                    continue;
                case 11:
                    instrument = (Instrument) this.nullableInstrumentAdapter.fromJson(jsonReader);
                    i2 &= -2049;
                    continue;
                case 12:
                    money = (Money) this.nullableMoneyAdapter.fromJson(jsonReader);
                    i2 &= -4097;
                    continue;
                case 13:
                    str10 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -8193;
                    continue;
                case 14:
                    str11 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -16385;
                    continue;
                case 15:
                    appMessageAction = (AppMessageAction) this.nullableAppMessageActionAdapter.fromJson(jsonReader);
                    i = -32769;
                    break;
                case 16:
                    appMessagePayload = (AppMessagePayload) this.nullableAppMessagePayloadAdapter.fromJson(jsonReader);
                    i = -65537;
                    break;
                case 17:
                    clearAppDataConfig = (CashPushNotification.ClearAppDataConfig) this.nullableClearAppDataConfigAdapter.fromJson(jsonReader);
                    i = -131073;
                    break;
                case 18:
                    triggerEntitySync = (CashPushNotification.TriggerEntitySync) this.nullableTriggerEntitySyncAdapter.fromJson(jsonReader);
                    i = -262145;
                    break;
                case 19:
                    str12 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i = -524289;
                    break;
                case 20:
                    str13 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i = -1048577;
                    break;
                case 21:
                    str14 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i = -2097153;
                    break;
            }
            i2 &= i;
        }
        jsonReader.endObject();
        if (i2 == -4194304) {
            String str15 = str7;
            CashPushNotification.Customer customer2 = customer;
            String str16 = str6;
            String str17 = str5;
            String str18 = str4;
            String str19 = str3;
            return new CashPushNotification(aps, str, str2, str19, str18, str17, str16, customer2, str15, str8, str9, instrument, money, str10, str11, appMessageAction, appMessagePayload, clearAppDataConfig, triggerEntitySync, str12, str13, str14);
        }
        String str20 = str7;
        CashPushNotification.Customer customer3 = customer;
        String str21 = str6;
        String str22 = str5;
        String str23 = str4;
        String str24 = str3;
        String str25 = str2;
        String str26 = str;
        CashPushNotification.APS aps2 = aps;
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CashPushNotification.class.getDeclaredConstructor(CashPushNotification.APS.class, String.class, String.class, String.class, String.class, String.class, String.class, CashPushNotification.Customer.class, String.class, String.class, String.class, Instrument.class, Money.class, String.class, String.class, AppMessageAction.class, AppMessagePayload.class, CashPushNotification.ClearAppDataConfig.class, CashPushNotification.TriggerEntitySync.class, String.class, String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        Object newInstance = constructor.newInstance(aps2, str26, str25, str24, str23, str22, str21, customer3, str20, str8, str9, instrument, money, str10, str11, appMessageAction, appMessagePayload, clearAppDataConfig, triggerEntitySync, str12, str13, str14, Integer.valueOf(i2), null);
        newInstance.getClass();
        return (CashPushNotification) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        CashPushNotification cashPushNotification = (CashPushNotification) obj;
        jsonWriter.getClass();
        if (cashPushNotification == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("aps");
        this.nullableAPSAdapter.toJson(jsonWriter, cashPushNotification.aps);
        jsonWriter.name("pt");
        String str = cashPushNotification.paymentToken;
        JsonAdapter jsonAdapter = this.nullableStringAdapter;
        jsonAdapter.toJson(jsonWriter, str);
        jsonWriter.name("op");
        jsonAdapter.toJson(jsonWriter, cashPushNotification.op);
        jsonWriter.name("url");
        jsonAdapter.toJson(jsonWriter, cashPushNotification.url);
        jsonWriter.name("at");
        jsonAdapter.toJson(jsonWriter, cashPushNotification.appToken);
        jsonWriter.name("c");
        jsonAdapter.toJson(jsonWriter, cashPushNotification.customerToken);
        jsonWriter.name("ak");
        jsonAdapter.toJson(jsonWriter, cashPushNotification.analyticsKey);
        jsonWriter.name("other-customer");
        this.nullableCustomerAdapter.toJson(jsonWriter, cashPushNotification.otherCustomer);
        jsonWriter.name("mt");
        jsonAdapter.toJson(jsonWriter, cashPushNotification.messageToken);
        jsonWriter.name("title");
        jsonAdapter.toJson(jsonWriter, cashPushNotification.title);
        jsonWriter.name("body");
        jsonAdapter.toJson(jsonWriter, cashPushNotification.body);
        jsonWriter.name("instrument");
        this.nullableInstrumentAdapter.toJson(jsonWriter, cashPushNotification.instrument);
        jsonWriter.name("payment-amount");
        this.nullableMoneyAdapter.toJson(jsonWriter, cashPushNotification.paymentAmount);
        jsonWriter.name("verification-instrument-token");
        jsonAdapter.toJson(jsonWriter, cashPushNotification.verificationInstrumentToken);
        jsonWriter.name("play-integrity-challenge-token");
        jsonAdapter.toJson(jsonWriter, cashPushNotification.playIntegrityChallengeToken);
        jsonWriter.name("app-message-action");
        this.nullableAppMessageActionAdapter.toJson(jsonWriter, cashPushNotification.appMessageAction);
        jsonWriter.name("app-message-payload");
        this.nullableAppMessagePayloadAdapter.toJson(jsonWriter, cashPushNotification.appMessagePayload);
        jsonWriter.name("clear-app-data-config");
        this.nullableClearAppDataConfigAdapter.toJson(jsonWriter, cashPushNotification.clearAppDataConfig);
        jsonWriter.name("tes");
        this.nullableTriggerEntitySyncAdapter.toJson(jsonWriter, cashPushNotification.triggerEntitySync);
        jsonWriter.name("eri");
        jsonAdapter.toJson(jsonWriter, cashPushNotification.engagementReportingId);
        jsonWriter.name("notification-category");
        jsonAdapter.toJson(jsonWriter, cashPushNotification.notificationCategory);
        jsonWriter.name("image-url");
        jsonAdapter.toJson(jsonWriter, cashPushNotification.imageUrl);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(42, "GeneratedJsonAdapter(CashPushNotification)");
    }
}
