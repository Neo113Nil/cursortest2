package com.squareup.cash.featureflags;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.featureflags.JsonFeatureFlags$MobileDependenciesConfig;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/featureflags/JsonFeatureFlags_MobileDependenciesConfig_ConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/featureflags/JsonFeatureFlags$MobileDependenciesConfig$Config;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonFeatureFlags_MobileDependenciesConfig_ConfigJsonAdapter extends JsonAdapter {
    public volatile Constructor constructorRef;
    public final JsonAdapter fillrConfigAdapter;
    public final JsonReader.Options options;

    public JsonFeatureFlags_MobileDependenciesConfig_ConfigJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("fillr");
        this.fillrConfigAdapter = moshi.adapter(JsonFeatureFlags$MobileDependenciesConfig.FillrConfig.class, EmptySet.INSTANCE, "fillr");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        JsonFeatureFlags$MobileDependenciesConfig.FillrConfig fillrConfig = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                fillrConfig = (JsonFeatureFlags$MobileDependenciesConfig.FillrConfig) this.fillrConfigAdapter.fromJson(jsonReader);
                if (fillrConfig == null) {
                    throw Util.unexpectedNull("fillr", "fillr", jsonReader);
                }
                i = -2;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -2) {
            fillrConfig.getClass();
            return new JsonFeatureFlags$MobileDependenciesConfig.Config(fillrConfig);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            constructor = JsonFeatureFlags$MobileDependenciesConfig.Config.class.getDeclaredConstructor(JsonFeatureFlags$MobileDependenciesConfig.FillrConfig.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        Object newInstance = constructor.newInstance(fillrConfig, Integer.valueOf(i), null);
        newInstance.getClass();
        return (JsonFeatureFlags$MobileDependenciesConfig.Config) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        JsonFeatureFlags$MobileDependenciesConfig.Config config = (JsonFeatureFlags$MobileDependenciesConfig.Config) obj;
        jsonWriter.getClass();
        if (config == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("fillr");
        this.fillrConfigAdapter.toJson(jsonWriter, config.fillr);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(70, "GeneratedJsonAdapter(JsonFeatureFlags.MobileDependenciesConfig.Config)");
    }
}
