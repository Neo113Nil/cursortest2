package com.squareup.cash.featureflags;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.featureflags.JsonFeatureFlags$BusinessAccountsFeeHoliday;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/featureflags/JsonFeatureFlags_BusinessAccountsFeeHoliday_FeeHolidayDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/featureflags/JsonFeatureFlags$BusinessAccountsFeeHoliday$FeeHolidayData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonFeatureFlags_BusinessAccountsFeeHoliday_FeeHolidayDataJsonAdapter extends JsonAdapter {
    public volatile Constructor constructorRef;
    public final JsonAdapter nullableIntAdapter;
    public final JsonReader.Options options;

    public JsonFeatureFlags_BusinessAccountsFeeHoliday_FeeHolidayDataJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("promotionAmount");
        this.nullableIntAdapter = moshi.adapter(Integer.class, EmptySet.INSTANCE, "promotionAmount");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        Integer num = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                i = -2;
            }
        }
        jsonReader.endObject();
        if (i == -2) {
            return new JsonFeatureFlags$BusinessAccountsFeeHoliday.FeeHolidayData(num);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            constructor = JsonFeatureFlags$BusinessAccountsFeeHoliday.FeeHolidayData.class.getDeclaredConstructor(Integer.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        Object newInstance = constructor.newInstance(num, Integer.valueOf(i), null);
        newInstance.getClass();
        return (JsonFeatureFlags$BusinessAccountsFeeHoliday.FeeHolidayData) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        JsonFeatureFlags$BusinessAccountsFeeHoliday.FeeHolidayData feeHolidayData = (JsonFeatureFlags$BusinessAccountsFeeHoliday.FeeHolidayData) obj;
        jsonWriter.getClass();
        if (feeHolidayData == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("promotionAmount");
        this.nullableIntAdapter.toJson(jsonWriter, feeHolidayData.promotionAmount);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(80, "GeneratedJsonAdapter(JsonFeatureFlags.BusinessAccountsFeeHoliday.FeeHolidayData)");
    }
}
