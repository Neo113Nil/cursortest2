package com.google.android.gms.internal.mlkit_vision_face;

import com.datadog.android.rum.model.ResourceEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class zzed {
    public static ResourceEvent.Error fromJsonObject(JsonObject jsonObject) {
        ArrayList arrayList;
        ArrayList arrayList2;
        JsonArray asJsonArray;
        JsonArray asJsonArray2;
        jsonObject.getClass();
        try {
            String asString = jsonObject.get("message").getAsString();
            JsonElement jsonElement = jsonObject.get("code");
            String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
            JsonElement jsonElement2 = jsonObject.get("locations");
            if (jsonElement2 == null || (asJsonArray2 = jsonElement2.getAsJsonArray()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(asJsonArray2.size());
                Iterator<JsonElement> it = asJsonArray2.iterator();
                while (it.hasNext()) {
                    JsonObject asJsonObject = it.next().getAsJsonObject();
                    asJsonObject.getClass();
                    arrayList.add(zziz.fromJsonObject(asJsonObject));
                }
            }
            JsonElement jsonElement3 = jsonObject.get("path");
            if (jsonElement3 == null || (asJsonArray = jsonElement3.getAsJsonArray()) == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList(asJsonArray.size());
                for (JsonElement jsonElement4 : asJsonArray) {
                    jsonElement4.getClass();
                    arrayList2.add(zzjb.fromJsonElement(jsonElement4));
                }
            }
            asString.getClass();
            return new ResourceEvent.Error(asString, asString2, arrayList, arrayList2);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Error", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Error", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Error", e3);
            return null;
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewSystemNotificationsSettings.deepLinkSpecs;
    }
}
