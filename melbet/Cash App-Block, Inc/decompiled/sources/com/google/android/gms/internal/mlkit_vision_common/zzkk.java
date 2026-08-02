package com.google.android.gms.internal.mlkit_vision_common;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ErrorEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.NoSuchElementException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class zzkk {
    public static ErrorEvent.DdSession fromJsonObject(JsonObject jsonObject) {
        ErrorEvent.Plan plan;
        String asString;
        String asString2;
        try {
            JsonElement jsonElement = jsonObject.get("plan");
            int i = 0;
            if (jsonElement != null && (asString2 = jsonElement.getAsString()) != null) {
                ErrorEvent.Plan[] values = ErrorEvent.Plan.values();
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
                    if (RumErrorSource$EnumUnboxingLocalUtility.getJsonValue$17(i3).equals(asString)) {
                        i = i3;
                    } else {
                        i++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return new ErrorEvent.DdSession(plan, i);
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

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewProfileWithParams.deepLinkSpecs;
    }
}
