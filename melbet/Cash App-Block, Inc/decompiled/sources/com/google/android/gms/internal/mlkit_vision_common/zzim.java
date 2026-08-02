package com.google.android.gms.internal.mlkit_vision_common;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ActionEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.NoSuchElementException;
import kotlin.collections.EmptyList;

/* loaded from: classes4.dex */
public abstract class zzim {
    public static ActionEvent.ActionEventSession fromJsonObject(JsonObject jsonObject) {
        jsonObject.getClass();
        try {
            String asString = jsonObject.get("id").getAsString();
            String asString2 = jsonObject.get("type").getAsString();
            asString2.getClass();
            for (int i : CameraSelector$$ExternalSyntheticOutline0.values(3)) {
                if (RumErrorSource$EnumUnboxingLocalUtility.getJsonValue(i).equals(asString2)) {
                    JsonElement jsonElement = jsonObject.get("has_replay");
                    Boolean valueOf = jsonElement != null ? Boolean.valueOf(jsonElement.getAsBoolean()) : null;
                    asString.getClass();
                    return new ActionEvent.ActionEventSession(i, valueOf, asString);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type ActionEventSession", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type ActionEventSession", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type ActionEventSession", e3);
            return null;
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewOfferDetails.deepLinkSpecs;
    }
}
