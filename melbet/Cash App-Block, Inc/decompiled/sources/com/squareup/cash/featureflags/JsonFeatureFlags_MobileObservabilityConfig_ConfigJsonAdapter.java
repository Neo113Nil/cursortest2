package com.squareup.cash.featureflags;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.featureflags.JsonFeatureFlags$MobileObservabilityConfig;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/featureflags/JsonFeatureFlags_MobileObservabilityConfig_ConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/featureflags/JsonFeatureFlags$MobileObservabilityConfig$Config;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonFeatureFlags_MobileObservabilityConfig_ConfigJsonAdapter extends JsonAdapter {
    public volatile Constructor constructorRef;
    public final JsonAdapter intAdapter;
    public final JsonReader.Options options;

    public JsonFeatureFlags_MobileObservabilityConfig_ConfigJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("datadogRumSampleRateAndroid", "datadogTelemetrySampleRateAndroid", "datadogTracerSampleRateAndroid");
        this.intAdapter = moshi.adapter(Integer.TYPE, EmptySet.INSTANCE, "datadogRumSampleRateAndroid");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        Integer num = 0;
        jsonReader.beginObject();
        Integer num2 = num;
        Integer num3 = num2;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                num = (Integer) this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("datadogRumSampleRateAndroid", "datadogRumSampleRateAndroid", jsonReader);
                }
                i &= -2;
            } else if (selectName == 1) {
                num2 = (Integer) this.intAdapter.fromJson(jsonReader);
                if (num2 == null) {
                    throw Util.unexpectedNull("datadogTelemetrySampleRateAndroid", "datadogTelemetrySampleRateAndroid", jsonReader);
                }
                i &= -3;
            } else if (selectName == 2) {
                num3 = (Integer) this.intAdapter.fromJson(jsonReader);
                if (num3 == null) {
                    throw Util.unexpectedNull("datadogTracerSampleRateAndroid", "datadogTracerSampleRateAndroid", jsonReader);
                }
                i &= -5;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -8) {
            return new JsonFeatureFlags$MobileObservabilityConfig.Config(num.intValue(), num2.intValue(), num3.intValue());
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = JsonFeatureFlags$MobileObservabilityConfig.Config.class.getDeclaredConstructor(cls, cls, cls, cls, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        Object newInstance = constructor.newInstance(num, num2, num3, Integer.valueOf(i), null);
        newInstance.getClass();
        return (JsonFeatureFlags$MobileObservabilityConfig.Config) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        JsonFeatureFlags$MobileObservabilityConfig.Config config = (JsonFeatureFlags$MobileObservabilityConfig.Config) obj;
        jsonWriter.getClass();
        if (config == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("datadogRumSampleRateAndroid");
        Integer valueOf = Integer.valueOf(config.datadogRumSampleRateAndroid);
        JsonAdapter jsonAdapter = this.intAdapter;
        jsonAdapter.toJson(jsonWriter, valueOf);
        jsonWriter.name("datadogTelemetrySampleRateAndroid");
        jsonAdapter.toJson(jsonWriter, Integer.valueOf(config.datadogTelemetrySampleRateAndroid));
        jsonWriter.name("datadogTracerSampleRateAndroid");
        jsonAdapter.toJson(jsonWriter, Integer.valueOf(config.datadogTracerSampleRateAndroid));
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(71, "GeneratedJsonAdapter(JsonFeatureFlags.MobileObservabilityConfig.Config)");
    }
}
