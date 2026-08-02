package com.google.android.gms.internal.mlkit_vision_common;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ActionEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public abstract class zzjh {
    public static ActionEvent.DdAction fromJsonObject(JsonObject jsonObject) {
        String asString;
        JsonObject asJsonObject;
        JsonObject asJsonObject2;
        try {
            JsonElement jsonElement = jsonObject.get("position");
            ActionEvent.Position fromJsonObject = (jsonElement == null || (asJsonObject2 = jsonElement.getAsJsonObject()) == null) ? null : zzjq.fromJsonObject(asJsonObject2);
            JsonElement jsonElement2 = jsonObject.get("target");
            ActionEvent.DdActionTarget fromJsonObject2 = (jsonElement2 == null || (asJsonObject = jsonElement2.getAsJsonObject()) == null) ? null : zzji.fromJsonObject(asJsonObject);
            JsonElement jsonElement3 = jsonObject.get("name_source");
            int i = 0;
            if (jsonElement3 != null && (asString = jsonElement3.getAsString()) != null) {
                int[] values = CameraSelector$$ExternalSyntheticOutline0.values(6);
                int length = values.length;
                while (i < length) {
                    int i2 = values[i];
                    if (RumErrorSource$EnumUnboxingLocalUtility.getJsonValue$4(i2).equals(asString)) {
                        i = i2;
                    } else {
                        i++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return new ActionEvent.DdAction(fromJsonObject, fromJsonObject2, i);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type DdAction", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type DdAction", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type DdAction", e3);
            return null;
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewPayCashtagAmount.deepLinkSpecs;
    }
}
