package com.google.android.gms.internal.mlkit_vision_common;

import com.datadog.android.rum.model.ErrorEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;

/* loaded from: classes4.dex */
public abstract class zzjy {
    public static ErrorEvent.BinaryImage fromJsonObject(JsonObject jsonObject) {
        jsonObject.getClass();
        try {
            String asString = jsonObject.get("uuid").getAsString();
            String asString2 = jsonObject.get("name").getAsString();
            boolean asBoolean = jsonObject.get("is_system").getAsBoolean();
            JsonElement jsonElement = jsonObject.get("load_address");
            String asString3 = jsonElement != null ? jsonElement.getAsString() : null;
            JsonElement jsonElement2 = jsonObject.get("max_address");
            String asString4 = jsonElement2 != null ? jsonElement2.getAsString() : null;
            JsonElement jsonElement3 = jsonObject.get("arch");
            String asString5 = jsonElement3 != null ? jsonElement3.getAsString() : null;
            asString.getClass();
            asString2.getClass();
            return new ErrorEvent.BinaryImage(asString, asString2, asString3, asString4, asString5, asBoolean);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type BinaryImage", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type BinaryImage", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type BinaryImage", e3);
            return null;
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewPermissionRequest.deepLinkSpecs;
    }
}
