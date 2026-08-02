package com.squareup.cash.featureflags;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.featureflags.JsonFeatureFlags$MintHypeDrop;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/featureflags/JsonFeatureFlags_MintHypeDrop_HypeDropDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/featureflags/JsonFeatureFlags$MintHypeDrop$HypeDropData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonFeatureFlags_MintHypeDrop_HypeDropDataJsonAdapter extends JsonAdapter {
    public volatile Constructor constructorRef;
    public final JsonAdapter nullableBooleanAdapter;
    public final JsonAdapter nullableLongAdapter;
    public final JsonAdapter nullableStringAdapter;
    public final JsonReader.Options options;

    public JsonFeatureFlags_MintHypeDrop_HypeDropDataJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("launchDate", "launchAtMillis", "startDate", "symbol", "token", "notifiedEnabled", "notifyText", "notifyLink", "oneTimeClick");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "launchDate");
        this.nullableLongAdapter = moshi.adapter(Long.class, emptySet, "launchAtMillis");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "notifiedEnabled");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        int i = -1;
        String str = null;
        Long l = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Boolean bool = null;
        String str5 = null;
        String str6 = null;
        Boolean bool2 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -2;
                    break;
                case 1:
                    l = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    i &= -3;
                    break;
                case 2:
                    str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -5;
                    break;
                case 3:
                    str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -9;
                    break;
                case 4:
                    str4 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    i &= -33;
                    break;
                case 6:
                    str5 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -65;
                    break;
                case 7:
                    str6 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -129;
                    break;
                case 8:
                    bool2 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    i &= -257;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -512) {
            Boolean bool3 = bool2;
            String str7 = str6;
            String str8 = str5;
            Boolean bool4 = bool;
            String str9 = str4;
            String str10 = str3;
            return new JsonFeatureFlags$MintHypeDrop.HypeDropData(str, l, str2, str10, str9, bool4, str8, str7, bool3);
        }
        Boolean bool5 = bool2;
        String str11 = str6;
        String str12 = str5;
        Boolean bool6 = bool;
        String str13 = str4;
        String str14 = str3;
        String str15 = str2;
        Long l2 = l;
        String str16 = str;
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            constructor = JsonFeatureFlags$MintHypeDrop.HypeDropData.class.getDeclaredConstructor(String.class, Long.class, String.class, String.class, String.class, Boolean.class, String.class, String.class, Boolean.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        Object newInstance = constructor.newInstance(str16, l2, str15, str14, str13, bool6, str12, str11, bool5, Integer.valueOf(i), null);
        newInstance.getClass();
        return (JsonFeatureFlags$MintHypeDrop.HypeDropData) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        JsonFeatureFlags$MintHypeDrop.HypeDropData hypeDropData = (JsonFeatureFlags$MintHypeDrop.HypeDropData) obj;
        jsonWriter.getClass();
        if (hypeDropData == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("launchDate");
        String str = hypeDropData.launchDate;
        JsonAdapter jsonAdapter = this.nullableStringAdapter;
        jsonAdapter.toJson(jsonWriter, str);
        jsonWriter.name("launchAtMillis");
        this.nullableLongAdapter.toJson(jsonWriter, hypeDropData.launchAtMillis);
        jsonWriter.name("startDate");
        jsonAdapter.toJson(jsonWriter, hypeDropData.startDate);
        jsonWriter.name("symbol");
        jsonAdapter.toJson(jsonWriter, hypeDropData.symbol);
        jsonWriter.name("token");
        jsonAdapter.toJson(jsonWriter, hypeDropData.token);
        jsonWriter.name("notifiedEnabled");
        Boolean bool = hypeDropData.notifiedEnabled;
        JsonAdapter jsonAdapter2 = this.nullableBooleanAdapter;
        jsonAdapter2.toJson(jsonWriter, bool);
        jsonWriter.name("notifyText");
        jsonAdapter.toJson(jsonWriter, hypeDropData.notifyText);
        jsonWriter.name("notifyLink");
        jsonAdapter.toJson(jsonWriter, hypeDropData.notifyLink);
        jsonWriter.name("oneTimeClick");
        jsonAdapter2.toJson(jsonWriter, hypeDropData.oneTimeClick);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(64, "GeneratedJsonAdapter(JsonFeatureFlags.MintHypeDrop.HypeDropData)");
    }
}
