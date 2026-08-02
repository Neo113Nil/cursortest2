package com.google.android.gms.internal.mlkit_vision_common;

import com.datadog.android.rum.model.ActionEvent;
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
public abstract class zzjn {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        r2.add(r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ActionEvent.Frustration fromJsonObject(JsonObject jsonObject) {
        try {
            JsonArray asJsonArray = jsonObject.get("type").getAsJsonArray();
            ArrayList arrayList = new ArrayList(asJsonArray.size());
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                String asString = it.next().getAsString();
                asString.getClass();
                ActionEvent.Type[] values = ActionEvent.Type.values();
                int length = values.length;
                for (int i = 0; i < length; i++) {
                    ActionEvent.Type type2 = values[i];
                    if (type2.jsonValue.equals(asString)) {
                        break;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return new ActionEvent.Frustration(arrayList);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Frustration", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Frustration", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Frustration", e3);
            return null;
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewPayWithOptions.deepLinkSpecs;
    }
}
