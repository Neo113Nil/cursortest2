package com.google.android.gms.internal.mlkit_vision_common;

import com.datadog.android.rum.model.ErrorEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;

/* loaded from: classes4.dex */
public abstract class zzkv {
    public static ErrorEvent.Synthetics fromJsonObject(JsonObject jsonObject) {
        try {
            String asString = jsonObject.get("test_id").getAsString();
            String asString2 = jsonObject.get("result_id").getAsString();
            JsonElement jsonElement = jsonObject.get("injected");
            Boolean valueOf = jsonElement != null ? Boolean.valueOf(jsonElement.getAsBoolean()) : null;
            asString.getClass();
            asString2.getClass();
            return new ErrorEvent.Synthetics(asString, asString2, valueOf);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Synthetics", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Synthetics", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Synthetics", e3);
            return null;
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewRequestEmail.deepLinkSpecs;
    }
}
