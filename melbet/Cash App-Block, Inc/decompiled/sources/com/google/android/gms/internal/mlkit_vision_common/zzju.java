package com.google.android.gms.internal.mlkit_vision_common;

import com.datadog.android.rum.model.ActionEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonObject;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class zzju {
    public static ActionEvent.Viewport fromJsonObject(JsonObject jsonObject) {
        try {
            Number asNumber = jsonObject.get("width").getAsNumber();
            Number asNumber2 = jsonObject.get("height").getAsNumber();
            asNumber.getClass();
            asNumber2.getClass();
            return new ActionEvent.Viewport(asNumber, asNumber2);
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

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewPaymentPersonalizationSend.deepLinkSpecs;
    }
}
