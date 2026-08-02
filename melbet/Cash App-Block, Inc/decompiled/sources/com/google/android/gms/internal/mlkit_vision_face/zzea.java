package com.google.android.gms.internal.mlkit_vision_face;

import com.datadog.android.rum.model.ResourceEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;

/* loaded from: classes4.dex */
public abstract class zzea {
    public static ResourceEvent.Display fromJsonObject(JsonObject jsonObject) {
        JsonObject asJsonObject;
        try {
            JsonElement jsonElement = jsonObject.get("viewport");
            return new ResourceEvent.Display((jsonElement == null || (asJsonObject = jsonElement.getAsJsonObject()) == null) ? null : zzjm.fromJsonObject(asJsonObject));
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Display", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Display", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Display", e3);
            return null;
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewSupportPhoneVerification.deepLinkSpecs;
    }
}
