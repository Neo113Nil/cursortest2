package com.squareup.cash.featureflags;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.featureflags.JsonFeatureFlags$PersonalizedPaymentPersonalizationOptions;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/featureflags/JsonFeatureFlags_PersonalizedPaymentPersonalizationOptions_MenuOptionsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/featureflags/JsonFeatureFlags$PersonalizedPaymentPersonalizationOptions$MenuOptions;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonFeatureFlags_PersonalizedPaymentPersonalizationOptions_MenuOptionsJsonAdapter extends JsonAdapter {
    public final JsonAdapter booleanAdapter;
    public volatile Constructor constructorRef;
    public final JsonReader.Options options;

    public JsonFeatureFlags_PersonalizedPaymentPersonalizationOptions_MenuOptionsJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("stickers", "text");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, EmptySet.INSTANCE, "stickers");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        Boolean bool2 = bool;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                bool = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    throw Util.unexpectedNull("stickers", "stickers", jsonReader);
                }
                i &= -2;
            } else if (selectName == 1) {
                bool2 = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                if (bool2 == null) {
                    throw Util.unexpectedNull("text", "text", jsonReader);
                }
                i &= -3;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -4) {
            return new JsonFeatureFlags$PersonalizedPaymentPersonalizationOptions.MenuOptions(bool.booleanValue(), bool2.booleanValue());
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            Class cls2 = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls3 = Boolean.TYPE;
            constructor = JsonFeatureFlags$PersonalizedPaymentPersonalizationOptions.MenuOptions.class.getDeclaredConstructor(cls3, cls3, cls, cls2);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        Object newInstance = constructor.newInstance(bool, bool2, Integer.valueOf(i), null);
        newInstance.getClass();
        return (JsonFeatureFlags$PersonalizedPaymentPersonalizationOptions.MenuOptions) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        JsonFeatureFlags$PersonalizedPaymentPersonalizationOptions.MenuOptions menuOptions = (JsonFeatureFlags$PersonalizedPaymentPersonalizationOptions.MenuOptions) obj;
        jsonWriter.getClass();
        if (menuOptions == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("stickers");
        Boolean valueOf = Boolean.valueOf(menuOptions.stickers);
        JsonAdapter jsonAdapter = this.booleanAdapter;
        jsonAdapter.toJson(jsonWriter, valueOf);
        jsonWriter.name("text");
        jsonAdapter.toJson(jsonWriter, Boolean.valueOf(menuOptions.text));
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(92, "GeneratedJsonAdapter(JsonFeatureFlags.PersonalizedPaymentPersonalizationOptions.MenuOptions)");
    }
}
