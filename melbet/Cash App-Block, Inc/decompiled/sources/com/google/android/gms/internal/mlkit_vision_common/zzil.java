package com.google.android.gms.internal.mlkit_vision_common;

import com.datadog.android.rum.model.ActionEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonObject;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class zzil {
    public static ActionEvent.ActionEventActionTarget fromJsonObject(JsonObject jsonObject) {
        try {
            String asString = jsonObject.get("name").getAsString();
            asString.getClass();
            ActionEvent.ActionEventActionTarget actionEventActionTarget = new ActionEvent.ActionEventActionTarget();
            actionEventActionTarget.name = asString;
            return actionEventActionTarget;
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type ActionEventActionTarget", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type ActionEventActionTarget", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type ActionEventActionTarget", e3);
            return null;
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewNotificationPreferences.deepLinkSpecs;
    }
}
