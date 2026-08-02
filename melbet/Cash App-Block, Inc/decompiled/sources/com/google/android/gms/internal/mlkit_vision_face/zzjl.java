package com.google.android.gms.internal.mlkit_vision_face;

import com.datadog.android.rum.model.ResourceEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.EmptyList;

/* loaded from: classes4.dex */
public abstract class zzjl {
    public static ResourceEvent.Usr fromJsonObject(JsonObject jsonObject) {
        try {
            JsonElement jsonElement = jsonObject.get("id");
            String asString = jsonElement != null ? jsonElement.getAsString() : null;
            JsonElement jsonElement2 = jsonObject.get("name");
            String asString2 = jsonElement2 != null ? jsonElement2.getAsString() : null;
            JsonElement jsonElement3 = jsonObject.get("email");
            String asString3 = jsonElement3 != null ? jsonElement3.getAsString() : null;
            JsonElement jsonElement4 = jsonObject.get("anonymous_id");
            String asString4 = jsonElement4 != null ? jsonElement4.getAsString() : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                if (!ArraysKt___ArraysKt.contains(ResourceEvent.Usr.RESERVED_PROPERTIES, entry.getKey())) {
                    String key = entry.getKey();
                    key.getClass();
                    linkedHashMap.put(key, entry.getValue());
                }
            }
            return new ResourceEvent.Usr(asString, asString2, asString3, asString4, linkedHashMap);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Usr", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Usr", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Usr", e3);
            return null;
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewWithdrawWithParams.deepLinkSpecs;
    }
}
