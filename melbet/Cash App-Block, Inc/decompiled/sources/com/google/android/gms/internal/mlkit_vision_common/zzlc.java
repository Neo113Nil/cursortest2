package com.google.android.gms.internal.mlkit_vision_common;

import com.datadog.android.rum.model.LongTaskEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.EmptyList;

/* loaded from: classes4.dex */
public abstract class zzlc {
    public static LongTaskEvent.Account fromJsonObject(JsonObject jsonObject) {
        try {
            String asString = jsonObject.get("id").getAsString();
            JsonElement jsonElement = jsonObject.get("name");
            String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                if (!ArraysKt___ArraysKt.contains(LongTaskEvent.Account.RESERVED_PROPERTIES, entry.getKey())) {
                    String key = entry.getKey();
                    key.getClass();
                    linkedHashMap.put(key, entry.getValue());
                }
            }
            asString.getClass();
            return new LongTaskEvent.Account(asString, asString2, linkedHashMap);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Account", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Account", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Account", e3);
            return null;
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewSavingsGeneralFolder.deepLinkSpecs;
    }
}
