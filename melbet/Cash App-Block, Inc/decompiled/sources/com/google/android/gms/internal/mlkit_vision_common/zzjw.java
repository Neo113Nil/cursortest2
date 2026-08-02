package com.google.android.gms.internal.mlkit_vision_common;

import com.datadog.android.rum.model.ErrorEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.EmptyList;

/* loaded from: classes4.dex */
public abstract class zzjw {
    public static ErrorEvent.Action fromJsonObject(JsonObject jsonObject) {
        try {
            JsonArray asJsonArray = jsonObject.get("id").getAsJsonArray();
            ArrayList arrayList = new ArrayList(asJsonArray.size());
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getAsString());
            }
            return new ErrorEvent.Action(arrayList);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Action", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Action", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Action", e3);
            return null;
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewPendingReferralsRollupActivity.deepLinkSpecs;
    }
}
