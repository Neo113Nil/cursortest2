package com.google.android.gms.internal.mlkit_vision_common;

import com.datadog.android.rum.model.LongTaskEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class zzln {
    public static LongTaskEvent.Dd fromJsonObject(JsonObject jsonObject) {
        JsonObject asJsonObject;
        JsonObject asJsonObject2;
        JsonObject asJsonObject3;
        jsonObject.getClass();
        try {
            long asLong = jsonObject.get("format_version").getAsLong();
            JsonElement jsonElement = jsonObject.get("session");
            LongTaskEvent.DdSession fromJsonObject = (jsonElement == null || (asJsonObject3 = jsonElement.getAsJsonObject()) == null) ? null : zzlo.fromJsonObject(asJsonObject3);
            JsonElement jsonElement2 = jsonObject.get(BreadcrumbHelper.Category.CONFIGURATION);
            LongTaskEvent.Configuration fromJsonObject2 = (jsonElement2 == null || (asJsonObject2 = jsonElement2.getAsJsonObject()) == null) ? null : zzli.fromJsonObject(asJsonObject2);
            JsonElement jsonElement3 = jsonObject.get("browser_sdk_version");
            String asString = jsonElement3 != null ? jsonElement3.getAsString() : null;
            JsonElement jsonElement4 = jsonObject.get("sdk_name");
            String asString2 = jsonElement4 != null ? jsonElement4.getAsString() : null;
            JsonElement jsonElement5 = jsonObject.get("discarded");
            Boolean valueOf = jsonElement5 != null ? Boolean.valueOf(jsonElement5.getAsBoolean()) : null;
            JsonElement jsonElement6 = jsonObject.get("profiling");
            LongTaskEvent.Profiling fromJsonObject3 = (jsonElement6 == null || (asJsonObject = jsonElement6.getAsJsonObject()) == null) ? null : zzms.fromJsonObject(asJsonObject);
            if (asLong == 2) {
                return new LongTaskEvent.Dd(fromJsonObject, fromJsonObject2, asString, asString2, valueOf, fromJsonObject3);
            }
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Dd", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Dd", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Dd", e3);
            return null;
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewSendBitcoin.deepLinkSpecs;
    }
}
