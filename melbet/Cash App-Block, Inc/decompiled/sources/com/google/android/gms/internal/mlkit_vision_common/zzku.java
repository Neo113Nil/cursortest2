package com.google.android.gms.internal.mlkit_vision_common;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ErrorEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public abstract class zzku {
    public static ErrorEvent.Resource fromJsonObject(JsonObject jsonObject) {
        JsonObject asJsonObject;
        try {
            String asString = jsonObject.get("method").getAsString();
            asString.getClass();
            for (int i : CameraSelector$$ExternalSyntheticOutline0.values(9)) {
                if (RumErrorSource$EnumUnboxingLocalUtility.getJsonValue$15(i).equals(asString)) {
                    long asLong = jsonObject.get("status_code").getAsLong();
                    String asString2 = jsonObject.get("url").getAsString();
                    JsonElement jsonElement = jsonObject.get("provider");
                    ErrorEvent.Provider fromJsonObject = (jsonElement == null || (asJsonObject = jsonElement.getAsJsonObject()) == null) ? null : zzkt.fromJsonObject(asJsonObject);
                    asString2.getClass();
                    return new ErrorEvent.Resource(i, asLong, asString2, fromJsonObject);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Resource", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Resource", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Resource", e3);
            return null;
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewRequestCashtagAmountNote.deepLinkSpecs;
    }
}
