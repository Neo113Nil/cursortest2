package com.squareup.cash.featureflags;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.featureflags.JsonFeatureFlags$GenerationAttemptMri;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/featureflags/JsonFeatureFlags_GenerationAttemptMri_GenerationAttemptJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/featureflags/JsonFeatureFlags$GenerationAttemptMri$GenerationAttempt;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonFeatureFlags_GenerationAttemptMri_GenerationAttemptJsonAdapter extends JsonAdapter {
    public final JsonAdapter booleanAdapter;
    public final JsonAdapter intAdapter;
    public final JsonReader.Options options;
    public final JsonAdapter stringAdapter;

    public JsonFeatureFlags_GenerationAttemptMri_GenerationAttemptJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("type", "withStrongBox", "withDeviceProperties", "keySize", "timeout");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "type");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "withStrongBox");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "keySize");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        Boolean bool = null;
        Boolean bool2 = null;
        String str = null;
        Integer num = null;
        Integer num2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName != 0) {
                JsonAdapter jsonAdapter = this.booleanAdapter;
                if (selectName == 1) {
                    bool = (Boolean) jsonAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        throw Util.unexpectedNull("withStrongBox", "withStrongBox", jsonReader);
                    }
                } else if (selectName != 2) {
                    JsonAdapter jsonAdapter2 = this.intAdapter;
                    if (selectName == 3) {
                        num = (Integer) jsonAdapter2.fromJson(jsonReader);
                        if (num == null) {
                            throw Util.unexpectedNull("keySize", "keySize", jsonReader);
                        }
                    } else if (selectName == 4 && (num2 = (Integer) jsonAdapter2.fromJson(jsonReader)) == null) {
                        throw Util.unexpectedNull("timeout", "timeout", jsonReader);
                    }
                } else {
                    bool2 = (Boolean) jsonAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("withDeviceProperties", "withDeviceProperties", jsonReader);
                    }
                }
            } else {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("type", "type", jsonReader);
                }
            }
        }
        jsonReader.endObject();
        Boolean bool3 = bool2;
        if (str == null) {
            throw Util.missingProperty("type", "type", jsonReader);
        }
        if (bool == null) {
            throw Util.missingProperty("withStrongBox", "withStrongBox", jsonReader);
        }
        boolean booleanValue = bool.booleanValue();
        if (bool3 == null) {
            throw Util.missingProperty("withDeviceProperties", "withDeviceProperties", jsonReader);
        }
        boolean booleanValue2 = bool3.booleanValue();
        if (num == null) {
            throw Util.missingProperty("keySize", "keySize", jsonReader);
        }
        int intValue = num.intValue();
        if (num2 != null) {
            return new JsonFeatureFlags$GenerationAttemptMri.GenerationAttempt(str, intValue, num2.intValue(), booleanValue, booleanValue2);
        }
        throw Util.missingProperty("timeout", "timeout", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        JsonFeatureFlags$GenerationAttemptMri.GenerationAttempt generationAttempt = (JsonFeatureFlags$GenerationAttemptMri.GenerationAttempt) obj;
        jsonWriter.getClass();
        if (generationAttempt == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("type");
        this.stringAdapter.toJson(jsonWriter, generationAttempt.f1133type);
        jsonWriter.name("withStrongBox");
        Boolean valueOf = Boolean.valueOf(generationAttempt.withStrongBox);
        JsonAdapter jsonAdapter = this.booleanAdapter;
        jsonAdapter.toJson(jsonWriter, valueOf);
        jsonWriter.name("withDeviceProperties");
        jsonAdapter.toJson(jsonWriter, Boolean.valueOf(generationAttempt.withDeviceProperties));
        jsonWriter.name("keySize");
        Integer valueOf2 = Integer.valueOf(generationAttempt.keySize);
        JsonAdapter jsonAdapter2 = this.intAdapter;
        jsonAdapter2.toJson(jsonWriter, valueOf2);
        jsonWriter.name("timeout");
        jsonAdapter2.toJson(jsonWriter, Integer.valueOf(generationAttempt.timeout));
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(77, "GeneratedJsonAdapter(JsonFeatureFlags.GenerationAttemptMri.GenerationAttempt)");
    }
}
