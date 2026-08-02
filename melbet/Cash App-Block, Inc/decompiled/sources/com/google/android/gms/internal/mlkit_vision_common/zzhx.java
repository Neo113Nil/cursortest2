package com.google.android.gms.internal.mlkit_vision_common;

import androidx.room.util.DBUtil;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.okhttp.DatadogInterceptor$intercept$1;
import com.datadog.android.rum.internal.domain.event.RumEventMeta$View;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class zzhx {
    public static RumEventMeta$View fromJson(String str, InternalLogger internalLogger) {
        internalLogger.getClass();
        try {
            JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
            String asString = asJsonObject.get("type").getAsString();
            if (!Intrinsics.areEqual(asString, "view")) {
                DBUtil.log$default(internalLogger, 5, InternalLogger.Target.USER, new DatadogInterceptor$intercept$1(asString, 22), null, false, 56);
                return null;
            }
            String asString2 = asJsonObject.get("viewId").getAsString();
            long asLong = asJsonObject.get("documentVersion").getAsLong();
            JsonElement jsonElement = asJsonObject.get("hasAccessibility");
            boolean asBoolean = jsonElement == null ? false : jsonElement.getAsBoolean();
            asString2.getClass();
            return new RumEventMeta$View(asString2, asLong, Boolean.valueOf(asBoolean));
        } catch (ClassCastException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into RUM event meta", e);
            return null;
        } catch (IllegalStateException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into RUM event meta", e2);
            return null;
        } catch (NullPointerException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into RUM event meta", e3);
            return null;
        } catch (NumberFormatException e4) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into RUM event meta", e4);
            return null;
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewLocalShortlink.deepLinkSpecs;
    }
}
