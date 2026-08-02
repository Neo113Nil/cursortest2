package com.squareup.cash.featureflags;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.featureflags.JsonFeatureFlags$ContextualOnboardingVideoAssets;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/featureflags/JsonFeatureFlags_ContextualOnboardingVideoAssets_ConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/featureflags/JsonFeatureFlags$ContextualOnboardingVideoAssets$Config;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonFeatureFlags_ContextualOnboardingVideoAssets_ConfigJsonAdapter extends JsonAdapter {
    public final JsonAdapter booleanAdapter;
    public volatile Constructor constructorRef;
    public final JsonReader.Options options;
    public final JsonAdapter stringAdapter;

    public JsonFeatureFlags_ContextualOnboardingVideoAssets_ConfigJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("enabled", "placeholderImageUrl", "videoUrl");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "enabled");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "placeholderImageUrl");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
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
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("placeholderImageUrl", "placeholderImageUrl", jsonReader);
                }
                i &= -3;
            } else if (selectName == 2) {
                str2 = (String) this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("videoUrl", "videoUrl", jsonReader);
                }
                i &= -5;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -8) {
            boolean booleanValue = bool.booleanValue();
            str.getClass();
            str2.getClass();
            return new JsonFeatureFlags$ContextualOnboardingVideoAssets.Config(str, str2, booleanValue);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            constructor = JsonFeatureFlags$ContextualOnboardingVideoAssets.Config.class.getDeclaredConstructor(Boolean.TYPE, String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        Object newInstance = constructor.newInstance(bool, str, str2, Integer.valueOf(i), null);
        newInstance.getClass();
        return (JsonFeatureFlags$ContextualOnboardingVideoAssets.Config) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        JsonFeatureFlags$ContextualOnboardingVideoAssets.Config config = (JsonFeatureFlags$ContextualOnboardingVideoAssets.Config) obj;
        jsonWriter.getClass();
        if (config == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("enabled");
        this.booleanAdapter.toJson(jsonWriter, Boolean.valueOf(config.enabled));
        jsonWriter.name("placeholderImageUrl");
        String str = config.placeholderImageUrl;
        JsonAdapter jsonAdapter = this.stringAdapter;
        jsonAdapter.toJson(jsonWriter, str);
        jsonWriter.name("videoUrl");
        jsonAdapter.toJson(jsonWriter, config.videoUrl);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(77, "GeneratedJsonAdapter(JsonFeatureFlags.ContextualOnboardingVideoAssets.Config)");
    }
}
