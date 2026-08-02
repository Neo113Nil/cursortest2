package com.google.android.gms.internal.mlkit_vision_face;

import com.datadog.android.rum.model.ResourceEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonObject;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientroutes.RealClientRouteFormatter;

/* loaded from: classes4.dex */
public abstract class zzjm {
    public static String format(RealClientRouteFormatter realClientRouteFormatter, ClientRoute clientRoute) {
        clientRoute.getClass();
        String format2 = realClientRouteFormatter.format(clientRoute.getSpec(), clientRoute.getParameters(), clientRoute.getAccountIdentifier());
        format2.getClass();
        return format2;
    }

    public static ResourceEvent.Viewport fromJsonObject(JsonObject jsonObject) {
        try {
            Number asNumber = jsonObject.get("width").getAsNumber();
            Number asNumber2 = jsonObject.get("height").getAsNumber();
            asNumber.getClass();
            asNumber2.getClass();
            return new ResourceEvent.Viewport(asNumber, asNumber2);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Viewport", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Viewport", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Viewport", e3);
            return null;
        }
    }
}
