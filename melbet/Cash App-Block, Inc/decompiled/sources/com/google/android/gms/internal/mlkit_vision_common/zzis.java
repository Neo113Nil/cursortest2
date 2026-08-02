package com.google.android.gms.internal.mlkit_vision_common;

import com.datadog.android.rum.model.ActionEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class zzis {
    public static ActionEvent.Application fromJsonObject(JsonObject jsonObject) {
        jsonObject.getClass();
        try {
            String asString = jsonObject.get("id").getAsString();
            JsonElement jsonElement = jsonObject.get("current_locale");
            String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
            asString.getClass();
            return new ActionEvent.Application(asString, asString2);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Application", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Application", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Application", e3);
            return null;
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewOfferDetailsSheetByMerchant.deepLinkSpecs;
    }
}
