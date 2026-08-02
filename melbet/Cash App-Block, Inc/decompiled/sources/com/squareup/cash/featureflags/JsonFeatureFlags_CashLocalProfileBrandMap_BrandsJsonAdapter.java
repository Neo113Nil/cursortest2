package com.squareup.cash.featureflags;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.featureflags.JsonFeatureFlags$CashLocalProfileBrandMap;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/featureflags/JsonFeatureFlags_CashLocalProfileBrandMap_BrandsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/featureflags/JsonFeatureFlags$CashLocalProfileBrandMap$Brands;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonFeatureFlags_CashLocalProfileBrandMap_BrandsJsonAdapter extends JsonAdapter {
    public volatile Constructor constructorRef;
    public final JsonAdapter mapOfStringStringAdapter;
    public final JsonReader.Options options;

    public JsonFeatureFlags_CashLocalProfileBrandMap_BrandsJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("brands");
        this.mapOfStringStringAdapter = moshi.adapter(Types.newParameterizedType(Map.class, String.class, String.class), EmptySet.INSTANCE, "brands");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        Map map = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                map = (Map) this.mapOfStringStringAdapter.fromJson(jsonReader);
                if (map == null) {
                    throw Util.unexpectedNull("brands", "brands", jsonReader);
                }
                i = -2;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -2) {
            map.getClass();
            return new JsonFeatureFlags$CashLocalProfileBrandMap.Brands(map);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            constructor = JsonFeatureFlags$CashLocalProfileBrandMap.Brands.class.getDeclaredConstructor(Map.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        Object newInstance = constructor.newInstance(map, Integer.valueOf(i), null);
        newInstance.getClass();
        return (JsonFeatureFlags$CashLocalProfileBrandMap.Brands) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        JsonFeatureFlags$CashLocalProfileBrandMap.Brands brands = (JsonFeatureFlags$CashLocalProfileBrandMap.Brands) obj;
        jsonWriter.getClass();
        if (brands == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("brands");
        this.mapOfStringStringAdapter.toJson(jsonWriter, brands.brands);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(70, "GeneratedJsonAdapter(JsonFeatureFlags.CashLocalProfileBrandMap.Brands)");
    }
}
