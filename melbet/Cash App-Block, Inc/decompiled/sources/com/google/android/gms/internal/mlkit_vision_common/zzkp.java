package com.google.android.gms.internal.mlkit_vision_common;

import com.datadog.android.rum.model.ErrorEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;

/* loaded from: classes4.dex */
public abstract class zzkp {
    public static ErrorEvent.ErrorEventView fromJsonObject(JsonObject jsonObject) {
        jsonObject.getClass();
        try {
            String asString = jsonObject.get("id").getAsString();
            JsonElement jsonElement = jsonObject.get("referrer");
            String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
            String asString3 = jsonObject.get("url").getAsString();
            JsonElement jsonElement2 = jsonObject.get("name");
            String asString4 = jsonElement2 != null ? jsonElement2.getAsString() : null;
            JsonElement jsonElement3 = jsonObject.get("in_foreground");
            Boolean valueOf = jsonElement3 != null ? Boolean.valueOf(jsonElement3.getAsBoolean()) : null;
            asString.getClass();
            asString3.getClass();
            return new ErrorEvent.ErrorEventView(valueOf, asString, asString2, asString3, asString4);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type ErrorEventView", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type ErrorEventView", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type ErrorEventView", e3);
            return null;
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewRandomReimbursement.deepLinkSpecs;
    }
}
