package com.google.android.gms.internal.mlkit_vision_common;

import com.datadog.android.rum.model.ErrorEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class zzkw {
    public static ErrorEvent.Thread fromJsonObject(JsonObject jsonObject) {
        jsonObject.getClass();
        try {
            String asString = jsonObject.get("name").getAsString();
            boolean asBoolean = jsonObject.get("crashed").getAsBoolean();
            String asString2 = jsonObject.get("stack").getAsString();
            JsonElement jsonElement = jsonObject.get("state");
            String asString3 = jsonElement != null ? jsonElement.getAsString() : null;
            asString.getClass();
            asString2.getClass();
            return new ErrorEvent.Thread(asString, asBoolean, asString2, asString3);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Thread", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Thread", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Thread", e3);
            return null;
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewRequestPhysicalCashCard.deepLinkSpecs;
    }
}
