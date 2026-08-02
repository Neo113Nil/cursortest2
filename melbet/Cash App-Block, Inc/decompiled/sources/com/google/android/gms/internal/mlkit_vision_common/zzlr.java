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
public abstract class zzlr {
    public static LongTaskEvent.LongTask fromJsonObject(JsonObject jsonObject) {
        int i;
        ArrayList arrayList;
        JsonArray asJsonArray;
        String asString;
        jsonObject.getClass();
        try {
            JsonElement jsonElement = jsonObject.get("id");
            String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
            JsonElement jsonElement2 = jsonObject.get("start_time");
            Number asNumber = jsonElement2 != null ? jsonElement2.getAsNumber() : null;
            JsonElement jsonElement3 = jsonObject.get("entry_type");
            if (jsonElement3 != null && (asString = jsonElement3.getAsString()) != null) {
                for (int i2 : CameraSelector$$ExternalSyntheticOutline0.values(2)) {
                    if (ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$5(i2).equals(asString)) {
                        i = i2;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            i = 0;
            long asLong = jsonObject.get("duration").getAsLong();
            JsonElement jsonElement4 = jsonObject.get("blocking_duration");
            Long valueOf = jsonElement4 != null ? Long.valueOf(jsonElement4.getAsLong()) : null;
            JsonElement jsonElement5 = jsonObject.get("render_start");
            Number asNumber2 = jsonElement5 != null ? jsonElement5.getAsNumber() : null;
            JsonElement jsonElement6 = jsonObject.get("style_and_layout_start");
            Number asNumber3 = jsonElement6 != null ? jsonElement6.getAsNumber() : null;
            JsonElement jsonElement7 = jsonObject.get("first_ui_event_timestamp");
            Number asNumber4 = jsonElement7 != null ? jsonElement7.getAsNumber() : null;
            JsonElement jsonElement8 = jsonObject.get("is_frozen_frame");
            Boolean valueOf2 = jsonElement8 != null ? Boolean.valueOf(jsonElement8.getAsBoolean()) : null;
            JsonElement jsonElement9 = jsonObject.get("scripts");
            if (jsonElement9 == null || (asJsonArray = jsonElement9.getAsJsonArray()) == null) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList(asJsonArray.size());
                Iterator<JsonElement> it = asJsonArray.iterator();
                while (it.hasNext()) {
                    JsonObject asJsonObject = it.next().getAsJsonObject();
                    asJsonObject.getClass();
                    arrayList2.add(com.google.android.gms.internal.mlkit_vision_face.zzdb.fromJsonObject(asJsonObject));
                }
                arrayList = arrayList2;
            }
            return new LongTaskEvent.LongTask(asString2, asNumber, i, asLong, valueOf, asNumber2, asNumber3, asNumber4, valueOf2, arrayList);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type LongTask", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type LongTask", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type LongTask", e3);
            return null;
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewShiftsSchedule.deepLinkSpecs;
    }
}
