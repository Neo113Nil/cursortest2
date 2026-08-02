package com.google.android.gms.internal.mlkit_vision_common;

import com.datadog.android.rum.model.ErrorEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonObject;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;

/* loaded from: classes4.dex */
public abstract class zzkq {
    public static ErrorEvent.Freeze fromJsonObject(JsonObject jsonObject) {
        try {
            return new ErrorEvent.Freeze(jsonObject.get("duration").getAsLong());
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Freeze", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Freeze", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Freeze", e3);
            return null;
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewRecipientChooserAmount.deepLinkSpecs;
    }
}
