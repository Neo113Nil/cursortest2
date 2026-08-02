package com.google.android.gms.internal.mlkit_vision_common;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.datadog.android.rum.model.ErrorEvent$Status$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.LongTaskEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public abstract class zzlp {
    public static LongTaskEvent.Device fromJsonObject(JsonObject jsonObject) {
        int i;
        ArrayList arrayList;
        JsonArray asJsonArray;
        String asString;
        try {
            JsonElement jsonElement = jsonObject.get("type");
            if (jsonElement != null && (asString = jsonElement.getAsString()) != null) {
                for (int i2 : CameraSelector$$ExternalSyntheticOutline0.values(7)) {
                    if (ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$3(i2).equals(asString)) {
                        i = i2;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            i = 0;
            JsonElement jsonElement2 = jsonObject.get("name");
            String asString2 = jsonElement2 != null ? jsonElement2.getAsString() : null;
            JsonElement jsonElement3 = jsonObject.get("model");
            String asString3 = jsonElement3 != null ? jsonElement3.getAsString() : null;
            JsonElement jsonElement4 = jsonObject.get("brand");
            String asString4 = jsonElement4 != null ? jsonElement4.getAsString() : null;
            JsonElement jsonElement5 = jsonObject.get("architecture");
            String asString5 = jsonElement5 != null ? jsonElement5.getAsString() : null;
            JsonElement jsonElement6 = jsonObject.get("locale");
            String asString6 = jsonElement6 != null ? jsonElement6.getAsString() : null;
            JsonElement jsonElement7 = jsonObject.get("locales");
            if (jsonElement7 == null || (asJsonArray = jsonElement7.getAsJsonArray()) == null) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList(asJsonArray.size());
                Iterator<JsonElement> it = asJsonArray.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next().getAsString());
                }
                arrayList = arrayList2;
            }
            JsonElement jsonElement8 = jsonObject.get("time_zone");
            String asString7 = jsonElement8 != null ? jsonElement8.getAsString() : null;
            JsonElement jsonElement9 = jsonObject.get("battery_level");
            Number asNumber = jsonElement9 != null ? jsonElement9.getAsNumber() : null;
            JsonElement jsonElement10 = jsonObject.get("power_saving_mode");
            Boolean valueOf = jsonElement10 != null ? Boolean.valueOf(jsonElement10.getAsBoolean()) : null;
            JsonElement jsonElement11 = jsonObject.get("brightness_level");
            return new LongTaskEvent.Device(i, asString2, asString3, asString4, asString5, asString6, arrayList, asString7, asNumber, valueOf, jsonElement11 != null ? jsonElement11.getAsNumber() : null);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Device", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Device", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Device", e3);
            return null;
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewShiftsClockIn.deepLinkSpecs;
    }
}
