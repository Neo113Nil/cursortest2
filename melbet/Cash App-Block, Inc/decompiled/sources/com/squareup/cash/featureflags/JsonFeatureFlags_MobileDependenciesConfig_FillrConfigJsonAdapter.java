package com.squareup.cash.featureflags;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.featureflags.JsonFeatureFlags$MobileDependenciesConfig;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/featureflags/JsonFeatureFlags_MobileDependenciesConfig_FillrConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/featureflags/JsonFeatureFlags$MobileDependenciesConfig$FillrConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonFeatureFlags_MobileDependenciesConfig_FillrConfigJsonAdapter extends JsonAdapter {
    public final JsonAdapter booleanAdapter;
    public volatile Constructor constructorRef;
    public final JsonAdapter listOfStringAdapter;
    public final JsonReader.Options options;

    public JsonFeatureFlags_MobileDependenciesConfig_FillrConfigJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("enabled", "merchantDenyList");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "enabled");
        this.listOfStringAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), emptySet, "merchantDenyList");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        List list = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                bool = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    throw Util.unexpectedNull("enabled", "enabled", jsonReader);
                }
                i &= -2;
            } else if (selectName == 1) {
                list = (List) this.listOfStringAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("merchantDenyList", "merchantDenyList", jsonReader);
                }
                i &= -3;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -4) {
            boolean booleanValue = bool.booleanValue();
            list.getClass();
            return new JsonFeatureFlags$MobileDependenciesConfig.FillrConfig(booleanValue, list);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            constructor = JsonFeatureFlags$MobileDependenciesConfig.FillrConfig.class.getDeclaredConstructor(Boolean.TYPE, List.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        Object newInstance = constructor.newInstance(bool, list, Integer.valueOf(i), null);
        newInstance.getClass();
        return (JsonFeatureFlags$MobileDependenciesConfig.FillrConfig) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        JsonFeatureFlags$MobileDependenciesConfig.FillrConfig fillrConfig = (JsonFeatureFlags$MobileDependenciesConfig.FillrConfig) obj;
        jsonWriter.getClass();
        if (fillrConfig == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("enabled");
        this.booleanAdapter.toJson(jsonWriter, Boolean.valueOf(fillrConfig.enabled));
        jsonWriter.name("merchantDenyList");
        this.listOfStringAdapter.toJson(jsonWriter, fillrConfig.merchantDenyList);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(75, "GeneratedJsonAdapter(JsonFeatureFlags.MobileDependenciesConfig.FillrConfig)");
    }
}
