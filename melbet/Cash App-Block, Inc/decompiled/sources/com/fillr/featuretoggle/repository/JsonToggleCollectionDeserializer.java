package com.fillr.featuretoggle.repository;

import com.fillr.featuretoggle.ActivationStrategy;
import com.fillr.featuretoggle.FeatureToggle;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes4.dex */
public class JsonToggleCollectionDeserializer implements JsonDeserializer<ToggleCollection> {
    public static final Type PARAMS_TYPE = new AnonymousClass1().getType();
    public static final Type FEATURE_COLLECTION_TYPE = new AnonymousClass2().getType();

    /* renamed from: com.fillr.featuretoggle.repository.JsonToggleCollectionDeserializer$1, reason: invalid class name */
    public class AnonymousClass1 extends TypeToken<Map<String, String>> {
    }

    /* renamed from: com.fillr.featuretoggle.repository.JsonToggleCollectionDeserializer$2, reason: invalid class name */
    public class AnonymousClass2 extends TypeToken<Collection<FeatureToggle>> {
    }

    @Override // com.google.gson.JsonDeserializer
    public final ToggleCollection deserialize(JsonElement jsonElement, Type type2, JsonDeserializationContext jsonDeserializationContext) {
        if ((!jsonElement.getAsJsonObject().has("version") ? 0 : jsonElement.getAsJsonObject().get("version").getAsInt()) != 0) {
            if (!jsonElement.getAsJsonObject().has("features")) {
                return null;
            }
            ToggleCollection toggleCollection = new ToggleCollection((Collection) jsonDeserializationContext.deserialize(jsonElement.getAsJsonObject().getAsJsonArray("features"), FEATURE_COLLECTION_TYPE));
            if (jsonElement.getAsJsonObject().has("deployment_version")) {
                toggleCollection.deployment_version = jsonElement.getAsJsonObject().get("deployment_version").getAsString();
            }
            return toggleCollection;
        }
        if (!jsonElement.getAsJsonObject().has("features")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        JsonArray asJsonArray = jsonElement.getAsJsonObject().getAsJsonArray("features");
        for (int i = 0; i < asJsonArray.size(); i++) {
            JsonObject asJsonObject = asJsonArray.get(i).getAsJsonObject();
            arrayList.add(new FeatureToggle(asJsonObject.get("name").getAsString(), Arrays.asList(new ActivationStrategy(asJsonObject.get("strategy").getAsString(), (Map) jsonDeserializationContext.deserialize(asJsonObject.get("parameters"), PARAMS_TYPE))), asJsonObject.get("enabled").getAsBoolean()));
        }
        return new ToggleCollection(arrayList);
    }
}
