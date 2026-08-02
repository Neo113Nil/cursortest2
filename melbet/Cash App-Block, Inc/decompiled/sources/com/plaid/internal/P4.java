package com.plaid.internal;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class P4 {
    public static String a(String str) {
        String jsonElement;
        String jsonElement2;
        str.getClass();
        JsonElement parseString = JsonParser.parseString(str);
        if (parseString.isJsonArray()) {
            JsonArray asJsonArray = parseString.getAsJsonArray();
            asJsonArray.getClass();
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                JsonElement next = it.next();
                if (next.isJsonObject()) {
                    JsonObject asJsonObject = next.getAsJsonObject();
                    asJsonObject.getClass();
                    if (asJsonObject.has("meta")) {
                        JsonElement remove = asJsonObject.remove("meta");
                        if (remove.isJsonObject()) {
                            Set<String> keySet = remove.getAsJsonObject().keySet();
                            keySet.getClass();
                            jsonElement2 = CollectionsKt.joinToString$default(keySet, null, null, null, 0, null, null, 63);
                        } else {
                            jsonElement2 = remove.toString();
                            jsonElement2.getClass();
                        }
                        asJsonObject.addProperty("meta", jsonElement2);
                    }
                    if (asJsonObject.has("balance")) {
                        JsonElement remove2 = asJsonObject.remove("balance");
                        if (remove2.isJsonObject()) {
                            Set<String> keySet2 = remove2.getAsJsonObject().keySet();
                            keySet2.getClass();
                            jsonElement = CollectionsKt.joinToString$default(keySet2, null, null, null, 0, null, null, 63);
                        } else {
                            jsonElement = remove2.toString();
                            jsonElement.getClass();
                        }
                        asJsonObject.addProperty("balance", jsonElement);
                    }
                }
            }
        } else if (parseString.isJsonObject()) {
            JsonObject asJsonObject2 = parseString.getAsJsonObject();
            asJsonObject2.getClass();
            a(asJsonObject2, "meta");
            a(asJsonObject2, "balance");
        }
        String jsonElement3 = parseString.toString();
        jsonElement3.getClass();
        return jsonElement3;
    }

    public static void a(JsonObject jsonObject, String str) {
        String jsonElement;
        if (jsonObject.has(str)) {
            JsonElement remove = jsonObject.remove(str);
            if (remove.isJsonObject()) {
                Set<String> keySet = remove.getAsJsonObject().keySet();
                keySet.getClass();
                jsonElement = CollectionsKt.joinToString$default(keySet, null, null, null, 0, null, null, 63);
            } else {
                jsonElement = remove.toString();
                jsonElement.getClass();
            }
            jsonObject.addProperty(str, jsonElement);
        }
    }
}
