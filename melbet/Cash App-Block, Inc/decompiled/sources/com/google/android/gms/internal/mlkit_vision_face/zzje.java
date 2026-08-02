package com.google.android.gms.internal.mlkit_vision_face;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.datadog.android.rum.model.ErrorEvent$Status$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ResourceEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public abstract class zzje {
    public static ResourceEvent.Provider fromJsonObject(JsonObject jsonObject) {
        String asString;
        try {
            JsonElement jsonElement = jsonObject.get("domain");
            String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
            JsonElement jsonElement2 = jsonObject.get("name");
            String asString3 = jsonElement2 != null ? jsonElement2.getAsString() : null;
            JsonElement jsonElement3 = jsonObject.get("type");
            int i = 0;
            if (jsonElement3 != null && (asString = jsonElement3.getAsString()) != null) {
                int[] values = CameraSelector$$ExternalSyntheticOutline0.values(14);
                int length = values.length;
                while (i < length) {
                    int i2 = values[i];
                    if (ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$17(i2).equals(asString)) {
                        i = i2;
                    } else {
                        i++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return new ResourceEvent.Provider(asString2, asString3, i);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Provider", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Provider", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Provider", e3);
            return null;
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewTaxesWebAppRoot.deepLinkSpecs;
    }
}
