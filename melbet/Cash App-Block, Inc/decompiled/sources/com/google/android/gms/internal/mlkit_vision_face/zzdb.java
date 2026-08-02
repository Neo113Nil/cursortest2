package com.google.android.gms.internal.mlkit_vision_face;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.datadog.android.rum.model.ErrorEvent$Status$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.LongTaskEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.NoSuchElementException;
import kotlin.collections.EmptyList;

/* loaded from: classes4.dex */
public abstract class zzdb {
    public static LongTaskEvent.Script fromJsonObject(JsonObject jsonObject) {
        LongTaskEvent.Script script;
        LongTaskEvent.Script script2;
        LongTaskEvent.Script script3;
        String str;
        String asString;
        jsonObject.getClass();
        try {
            JsonElement jsonElement = jsonObject.get("duration");
            Long valueOf = jsonElement != null ? Long.valueOf(jsonElement.getAsLong()) : null;
            JsonElement jsonElement2 = jsonObject.get("pause_duration");
            Long valueOf2 = jsonElement2 != null ? Long.valueOf(jsonElement2.getAsLong()) : null;
            JsonElement jsonElement3 = jsonObject.get("forced_style_and_layout_duration");
            Long valueOf3 = jsonElement3 != null ? Long.valueOf(jsonElement3.getAsLong()) : null;
            JsonElement jsonElement4 = jsonObject.get("start_time");
            Number asNumber = jsonElement4 != null ? jsonElement4.getAsNumber() : null;
            JsonElement jsonElement5 = jsonObject.get("execution_start");
            Number asNumber2 = jsonElement5 != null ? jsonElement5.getAsNumber() : null;
            JsonElement jsonElement6 = jsonObject.get("source_url");
            String asString2 = jsonElement6 != null ? jsonElement6.getAsString() : null;
            JsonElement jsonElement7 = jsonObject.get("source_function_name");
            String asString3 = jsonElement7 != null ? jsonElement7.getAsString() : null;
            JsonElement jsonElement8 = jsonObject.get("source_char_position");
            Long valueOf4 = jsonElement8 != null ? Long.valueOf(jsonElement8.getAsLong()) : null;
            JsonElement jsonElement9 = jsonObject.get("invoker");
            String asString4 = jsonElement9 != null ? jsonElement9.getAsString() : null;
            JsonElement jsonElement10 = jsonObject.get("invoker_type");
            int i = 0;
            if (jsonElement10 != null && (asString = jsonElement10.getAsString()) != null) {
                int[] values = CameraSelector$$ExternalSyntheticOutline0.values(6);
                int length = values.length;
                while (i < length) {
                    int i2 = values[i];
                    script = null;
                    str = null;
                    script3 = null;
                    script2 = null;
                    try {
                        if (ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$7(i2).equals(asString)) {
                            i = i2;
                        } else {
                            i++;
                        }
                    } catch (IllegalStateException e) {
                        e = e;
                        AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Script", e);
                        return script3;
                    } catch (NullPointerException e2) {
                        e = e2;
                        AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Script", e);
                        return script2;
                    } catch (NumberFormatException e3) {
                        e = e3;
                        AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Script", e);
                        return script;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            str = null;
            JsonElement jsonElement11 = jsonObject.get("window_attribution");
            return new LongTaskEvent.Script(valueOf, valueOf2, valueOf3, asNumber, asNumber2, asString2, asString3, valueOf4, asString4, i, jsonElement11 != null ? jsonElement11.getAsString() : str);
        } catch (IllegalStateException e4) {
            e = e4;
            script3 = null;
        } catch (NullPointerException e5) {
            e = e5;
            script2 = null;
        } catch (NumberFormatException e6) {
            e = e6;
            script = null;
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewShopProductsSearch.deepLinkSpecs;
    }
}
