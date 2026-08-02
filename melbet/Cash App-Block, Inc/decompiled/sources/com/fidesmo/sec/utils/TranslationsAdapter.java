package com.fidesmo.sec.utils;

import com.fidesmo.sec.core.models.Translation;
import com.fidesmo.sec.core.models.Translations;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class TranslationsAdapter implements JsonSerializer<Translations>, JsonDeserializer<Translations> {
    private static final Type TRANSLATION_LIST_TYPE = new TypeToken<List<Translation>>() { // from class: com.fidesmo.sec.utils.TranslationsAdapter.1
    }.getType();
    private static final Type TRANSLATION_MAP_TYPE = new TypeToken<Map<String, String>>() { // from class: com.fidesmo.sec.utils.TranslationsAdapter.2
    }.getType();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public Translations deserialize(JsonElement jsonElement, Type type2, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement.isJsonObject()) {
            return new Translations((Map<String, String>) jsonDeserializationContext.deserialize(jsonElement, TRANSLATION_MAP_TYPE));
        }
        if (jsonElement.isJsonArray()) {
            return new Translations((List<Translation>) jsonDeserializationContext.deserialize(jsonElement, TRANSLATION_LIST_TYPE));
        }
        if (!jsonElement.isJsonPrimitive() || !jsonElement.getAsJsonPrimitive().isString()) {
            throw new JsonParseException("Translations must be of Array or String type");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Translation("en", jsonElement.getAsString()));
        return new Translations(arrayList);
    }

    @Override // com.google.gson.JsonSerializer
    public JsonElement serialize(Translations translations, Type type2, JsonSerializationContext jsonSerializationContext) {
        return jsonSerializationContext.serialize(translations.getTranslations());
    }
}
