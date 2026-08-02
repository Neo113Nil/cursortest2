package com.squareup.cash.clientrouting.data;

import com.datadog.android.rum.model.ViewEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientrouting.data.FeatureContext;

/* loaded from: classes8.dex */
public abstract class FeatureContextKt {
    public static ViewEvent.Configuration fromJsonObject(JsonObject jsonObject) {
        try {
            Number asNumber = jsonObject.get("session_sample_rate").getAsNumber();
            JsonElement jsonElement = jsonObject.get("session_replay_sample_rate");
            Number asNumber2 = jsonElement != null ? jsonElement.getAsNumber() : null;
            JsonElement jsonElement2 = jsonObject.get("profiling_sample_rate");
            Number asNumber3 = jsonElement2 != null ? jsonElement2.getAsNumber() : null;
            JsonElement jsonElement3 = jsonObject.get("start_session_replay_recording_manually");
            Boolean valueOf = jsonElement3 != null ? Boolean.valueOf(jsonElement3.getAsBoolean()) : null;
            asNumber.getClass();
            return new ViewEvent.Configuration(asNumber, asNumber2, asNumber3, valueOf);
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

    public static final boolean isMoneybot(FeatureContext featureContext) {
        return (featureContext instanceof FeatureContext.MoneybotChatContext) || (featureContext instanceof FeatureContext.MoneybotHomeContext);
    }
}
