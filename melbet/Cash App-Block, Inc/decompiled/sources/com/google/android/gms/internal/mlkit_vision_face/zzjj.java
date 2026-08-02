package com.google.android.gms.internal.mlkit_vision_face;

import com.datadog.android.rum.model.ResourceEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonObject;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;

/* loaded from: classes4.dex */
public abstract class zzjj {
    public static ResourceEvent.Ssl fromJsonObject(JsonObject jsonObject) {
        try {
            return new ResourceEvent.Ssl(jsonObject.get("duration").getAsLong(), jsonObject.get("start").getAsLong());
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Ssl", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Ssl", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Ssl", e3);
            return null;
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewUnifiedThreadedCustomerActivity.deepLinkSpecs;
    }
}
