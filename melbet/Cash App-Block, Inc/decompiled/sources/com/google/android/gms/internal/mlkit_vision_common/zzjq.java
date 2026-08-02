package com.google.android.gms.internal.mlkit_vision_common;

import com.datadog.android.rum.model.ActionEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonObject;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class zzjq {
    public static ActionEvent.Position fromJsonObject(JsonObject jsonObject) {
        try {
            return new ActionEvent.Position(jsonObject.get("x").getAsLong(), jsonObject.get("y").getAsLong());
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Position", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Position", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Position", e3);
            return null;
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewPaymentDetails.deepLinkSpecs;
    }
}
