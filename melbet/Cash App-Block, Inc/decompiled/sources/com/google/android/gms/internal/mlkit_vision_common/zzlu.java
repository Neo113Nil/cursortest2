package com.google.android.gms.internal.mlkit_vision_common;

import com.datadog.android.rum.model.LongTaskEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class zzlu {
    public static LongTaskEvent.Os fromJsonObject(JsonObject jsonObject) {
        try {
            String asString = jsonObject.get("name").getAsString();
            String asString2 = jsonObject.get("version").getAsString();
            JsonElement jsonElement = jsonObject.get("build");
            String asString3 = jsonElement != null ? jsonElement.getAsString() : null;
            String asString4 = jsonObject.get("version_major").getAsString();
            asString.getClass();
            asString2.getClass();
            asString4.getClass();
            return new LongTaskEvent.Os(asString, asString2, asString3, asString4);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Os", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Os", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Os", e3);
            return null;
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewShopDynamicScreen.deepLinkSpecs;
    }
}
