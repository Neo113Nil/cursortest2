package com.google.android.gms.internal.mlkit_vision_face;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.datadog.android.rum.model.ErrorEvent$Status$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ResourceEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonObject;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public abstract class zzdu {
    public static ResourceEvent.Container fromJsonObject(JsonObject jsonObject) {
        try {
            JsonObject asJsonObject = jsonObject.get("view").getAsJsonObject();
            asJsonObject.getClass();
            ResourceEvent.ContainerView fromJsonObject = zzdv.fromJsonObject(asJsonObject);
            String asString = jsonObject.get("source").getAsString();
            asString.getClass();
            for (int i : CameraSelector$$ExternalSyntheticOutline0.values(8)) {
                if (ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$20(i).equals(asString)) {
                    return new ResourceEvent.Container(fromJsonObject, i);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Container", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Container", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Container", e3);
            return null;
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewSupportChatNewUnreadMessage.deepLinkSpecs;
    }
}
