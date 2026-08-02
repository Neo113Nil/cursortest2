package com.squareup.cash.data.push;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.data.push.CashPushNotification;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/data/push/CashPushNotification_APSJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/data/push/CashPushNotification$APS;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "notifications"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CashPushNotification_APSJsonAdapter extends JsonAdapter {
    public final JsonAdapter nullableStringAdapter;
    public final JsonReader.Options options;

    public CashPushNotification_APSJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("sound", "category");
        this.nullableStringAdapter = moshi.adapter(String.class, EmptySet.INSTANCE, "sound");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName != -1) {
                JsonAdapter jsonAdapter = this.nullableStringAdapter;
                if (selectName == 0) {
                    str = (String) jsonAdapter.fromJson(jsonReader);
                } else if (selectName == 1) {
                    str2 = (String) jsonAdapter.fromJson(jsonReader);
                }
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return new CashPushNotification.APS(str, str2);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        CashPushNotification.APS aps = (CashPushNotification.APS) obj;
        jsonWriter.getClass();
        if (aps == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("sound");
        String str = aps.sound;
        JsonAdapter jsonAdapter = this.nullableStringAdapter;
        jsonAdapter.toJson(jsonWriter, str);
        jsonWriter.name("category");
        jsonAdapter.toJson(jsonWriter, aps.category);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(46, "GeneratedJsonAdapter(CashPushNotification.APS)");
    }
}
