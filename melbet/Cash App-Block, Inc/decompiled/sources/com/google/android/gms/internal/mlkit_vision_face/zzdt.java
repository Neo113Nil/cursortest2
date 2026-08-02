package com.google.android.gms.internal.mlkit_vision_face;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.datadog.android.rum.model.ErrorEvent$Status$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ResourceEvent;
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
public abstract class zzdt {
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        r3.add(r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ResourceEvent.Connectivity fromJsonObject(JsonObject jsonObject) {
        ArrayList arrayList;
        JsonObject asJsonObject;
        String asString;
        JsonArray asJsonArray;
        try {
            String asString2 = jsonObject.get("status").getAsString();
            asString2.getClass();
            int i = 0;
            for (int i2 : CameraSelector$$ExternalSyntheticOutline0.values(3)) {
                if (ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$23(i2).equals(asString2)) {
                    JsonElement jsonElement = jsonObject.get("interfaces");
                    if (jsonElement != null && (asJsonArray = jsonElement.getAsJsonArray()) != null) {
                        arrayList = new ArrayList(asJsonArray.size());
                        Iterator<JsonElement> it = asJsonArray.iterator();
                        while (it.hasNext()) {
                            String asString3 = it.next().getAsString();
                            asString3.getClass();
                            ResourceEvent.Interface[] values = ResourceEvent.Interface.values();
                            int length = values.length;
                            for (int i3 = 0; i3 < length; i3++) {
                                ResourceEvent.Interface r11 = values[i3];
                                if (r11.jsonValue.equals(asString3)) {
                                    break;
                                }
                            }
                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                        }
                    }
                    arrayList = null;
                    JsonElement jsonElement2 = jsonObject.get("effective_type");
                    if (jsonElement2 != null && (asString = jsonElement2.getAsString()) != null) {
                        int[] values2 = CameraSelector$$ExternalSyntheticOutline0.values(4);
                        int length2 = values2.length;
                        while (i < length2) {
                            int i4 = values2[i];
                            if (ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$14(i4).equals(asString)) {
                                i = i4;
                            } else {
                                i++;
                            }
                        }
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                    JsonElement jsonElement3 = jsonObject.get("cellular");
                    return new ResourceEvent.Connectivity(i2, arrayList, i, (jsonElement3 == null || (asJsonObject = jsonElement3.getAsJsonObject()) == null) ? null : zzdi.fromJsonObject(asJsonObject));
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Connectivity", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Connectivity", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Connectivity", e3);
            return null;
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewSupportChatFromMoneybot.deepLinkSpecs;
    }
}
