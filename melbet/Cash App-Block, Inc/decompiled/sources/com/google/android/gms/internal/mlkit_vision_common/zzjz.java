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

/* loaded from: classes7.dex */
public abstract class zzjz {
    public static ErrorEvent.Cause fromJsonObject(JsonObject jsonObject) {
        jsonObject.getClass();
        try {
            String asString = jsonObject.get("message").getAsString();
            JsonElement jsonElement = jsonObject.get("type");
            String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
            JsonElement jsonElement2 = jsonObject.get("stack");
            String asString3 = jsonElement2 != null ? jsonElement2.getAsString() : null;
            String asString4 = jsonObject.get("source").getAsString();
            asString4.getClass();
            for (int i : CameraSelector$$ExternalSyntheticOutline0.values(8)) {
                if (RumErrorSource$EnumUnboxingLocalUtility.getJsonValue$13(i).equals(asString4)) {
                    asString.getClass();
                    return new ErrorEvent.Cause(asString, asString2, asString3, i);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Cause", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Cause", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Cause", e3);
            return null;
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewPhonePlansHome.deepLinkSpecs;
    }
}
