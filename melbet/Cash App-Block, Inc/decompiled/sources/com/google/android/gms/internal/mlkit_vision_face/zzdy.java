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
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class zzdy {
    public static ResourceEvent.DdSession fromJsonObject(JsonObject jsonObject) {
        ResourceEvent.Plan plan;
        String asString;
        String asString2;
        try {
            JsonElement jsonElement = jsonObject.get("plan");
            int i = 0;
            if (jsonElement != null && (asString2 = jsonElement.getAsString()) != null) {
                ResourceEvent.Plan[] values = ResourceEvent.Plan.values();
                int length = values.length;
                for (int i2 = 0; i2 < length; i2++) {
                    plan = values[i2];
                    if (!Intrinsics.areEqual(plan.jsonValue.toString(), asString2)) {
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            plan = null;
            JsonElement jsonElement2 = jsonObject.get("session_precondition");
            if (jsonElement2 != null && (asString = jsonElement2.getAsString()) != null) {
                int[] values2 = CameraSelector$$ExternalSyntheticOutline0.values(7);
                int length2 = values2.length;
                while (i < length2) {
                    int i3 = values2[i];
                    if (ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$22(i3).equals(asString)) {
                        i = i3;
                    } else {
                        i++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return new ResourceEvent.DdSession(plan, i);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type DdSession", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type DdSession", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type DdSession", e3);
            return null;
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewSupportNode.deepLinkSpecs;
    }
}
