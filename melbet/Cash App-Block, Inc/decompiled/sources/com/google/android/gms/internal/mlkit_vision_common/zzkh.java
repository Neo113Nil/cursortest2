package com.google.android.gms.internal.mlkit_vision_common;

import com.datadog.android.rum.model.ErrorEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class zzkh {
    public static ErrorEvent.Context fromJsonObject(JsonObject jsonObject) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                String key = entry.getKey();
                key.getClass();
                linkedHashMap.put(key, entry.getValue());
            }
            return new ErrorEvent.Context(linkedHashMap);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Context", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Context", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Context", e3);
            return null;
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewProfilePersonal.deepLinkSpecs;
    }
}
