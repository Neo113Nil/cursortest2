package com.google.android.gms.internal.mlkit_vision_common;

import com.datadog.android.rum.model.ActionEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class zzji {
    public static ActionEvent.DdActionTarget fromJsonObject(JsonObject jsonObject) {
        try {
            JsonElement jsonElement = jsonObject.get("selector");
            String asString = jsonElement != null ? jsonElement.getAsString() : null;
            JsonElement jsonElement2 = jsonObject.get("width");
            Long valueOf = jsonElement2 != null ? Long.valueOf(jsonElement2.getAsLong()) : null;
            JsonElement jsonElement3 = jsonObject.get("height");
            return new ActionEvent.DdActionTarget(valueOf, asString, jsonElement3 != null ? Long.valueOf(jsonElement3.getAsLong()) : null);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type DdActionTarget", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type DdActionTarget", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type DdActionTarget", e3);
            return null;
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewPayCashtagAmountNote.deepLinkSpecs;
    }
}
