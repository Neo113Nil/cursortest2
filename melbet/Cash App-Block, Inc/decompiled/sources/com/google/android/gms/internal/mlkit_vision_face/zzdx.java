package com.google.android.gms.internal.mlkit_vision_face;

import com.datadog.android.rum.model.ResourceEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.franklin.common.CardModule;
import kotlin.collections.EmptyList;

/* loaded from: classes4.dex */
public abstract class zzdx {
    public static ResourceEvent.Dd fromJsonObject(JsonObject jsonObject) {
        JsonObject asJsonObject;
        JsonObject asJsonObject2;
        jsonObject.getClass();
        try {
            long asLong = jsonObject.get("format_version").getAsLong();
            JsonElement jsonElement = jsonObject.get("session");
            ResourceEvent.DdSession fromJsonObject = (jsonElement == null || (asJsonObject2 = jsonElement.getAsJsonObject()) == null) ? null : zzdy.fromJsonObject(asJsonObject2);
            JsonElement jsonElement2 = jsonObject.get(BreadcrumbHelper.Category.CONFIGURATION);
            ResourceEvent.Configuration fromJsonObject2 = (jsonElement2 == null || (asJsonObject = jsonElement2.getAsJsonObject()) == null) ? null : CardModule.Type.fromJsonObject(asJsonObject);
            JsonElement jsonElement3 = jsonObject.get("browser_sdk_version");
            String asString = jsonElement3 != null ? jsonElement3.getAsString() : null;
            JsonElement jsonElement4 = jsonObject.get("sdk_name");
            String asString2 = jsonElement4 != null ? jsonElement4.getAsString() : null;
            JsonElement jsonElement5 = jsonObject.get("span_id");
            String asString3 = jsonElement5 != null ? jsonElement5.getAsString() : null;
            JsonElement jsonElement6 = jsonObject.get("parent_span_id");
            String asString4 = jsonElement6 != null ? jsonElement6.getAsString() : null;
            JsonElement jsonElement7 = jsonObject.get("trace_id");
            String asString5 = jsonElement7 != null ? jsonElement7.getAsString() : null;
            JsonElement jsonElement8 = jsonObject.get("rule_psr");
            Number asNumber = jsonElement8 != null ? jsonElement8.getAsNumber() : null;
            JsonElement jsonElement9 = jsonObject.get("discarded");
            Boolean valueOf = jsonElement9 != null ? Boolean.valueOf(jsonElement9.getAsBoolean()) : null;
            if (asLong == 2) {
                return new ResourceEvent.Dd(fromJsonObject, fromJsonObject2, asString, asString2, asString3, asString4, asString5, asNumber, valueOf);
            }
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Dd", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Dd", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Dd", e3);
            return null;
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewSupportIncident.deepLinkSpecs;
    }
}
