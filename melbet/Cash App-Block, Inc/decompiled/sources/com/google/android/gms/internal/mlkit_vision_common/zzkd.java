package com.google.android.gms.internal.mlkit_vision_common;

import com.datadog.android.rum.model.ErrorEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;

/* loaded from: classes4.dex */
public abstract class zzkd {
    public static ErrorEvent.Configuration fromJsonObject(JsonObject jsonObject) {
        try {
            Number asNumber = jsonObject.get("session_sample_rate").getAsNumber();
            JsonElement jsonElement = jsonObject.get("session_replay_sample_rate");
            Number asNumber2 = jsonElement != null ? jsonElement.getAsNumber() : null;
            JsonElement jsonElement2 = jsonObject.get("profiling_sample_rate");
            Number asNumber3 = jsonElement2 != null ? jsonElement2.getAsNumber() : null;
            asNumber.getClass();
            return new ErrorEvent.Configuration(asNumber, asNumber2, asNumber3);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Configuration", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Configuration", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Configuration", e3);
            return null;
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewPrepurchaseCashCardApplet.deepLinkSpecs;
    }
}
