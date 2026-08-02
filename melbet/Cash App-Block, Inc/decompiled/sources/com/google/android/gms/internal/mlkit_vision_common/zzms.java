package com.google.android.gms.internal.mlkit_vision_common;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.datadog.android.rum.model.ErrorEvent$Status$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.LongTaskEvent;
import com.google.android.gms.internal.mlkit_common.zzsr;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public abstract class zzms {
    public static zzsr zza;

    public static LongTaskEvent.Profiling fromJsonObject(JsonObject jsonObject) {
        int i;
        String asString;
        String asString2;
        try {
            JsonElement jsonElement = jsonObject.get("status");
            int i2 = 0;
            if (jsonElement != null && (asString2 = jsonElement.getAsString()) != null) {
                int[] values = CameraSelector$$ExternalSyntheticOutline0.values(4);
                int length = values.length;
                for (int i3 = 0; i3 < length; i3++) {
                    i = values[i3];
                    if (!ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$10(i).equals(asString2)) {
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            i = 0;
            JsonElement jsonElement2 = jsonObject.get("error_reason");
            if (jsonElement2 != null && (asString = jsonElement2.getAsString()) != null) {
                int[] values2 = CameraSelector$$ExternalSyntheticOutline0.values(4);
                int length2 = values2.length;
                while (i2 < length2) {
                    int i4 = values2[i2];
                    if (ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$6(i4).equals(asString)) {
                        i2 = i4;
                    } else {
                        i2++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return new LongTaskEvent.Profiling(i, i2);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Profiling", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Profiling", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Profiling", e3);
            return null;
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewShopDynamicScreenSearch.deepLinkSpecs;
    }
}
