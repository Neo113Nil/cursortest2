package com.google.android.gms.internal.mlkit_vision_common;

import com.datadog.android.rum.model.ActionEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.NoSuchElementException;
import kotlin.collections.EmptyList;

/* loaded from: classes4.dex */
public abstract class zzik {
    public static ActionEvent.ActionEventAction fromJsonObject(JsonObject jsonObject) {
        JsonObject asJsonObject;
        JsonObject asJsonObject2;
        JsonObject asJsonObject3;
        JsonObject asJsonObject4;
        JsonObject asJsonObject5;
        JsonObject asJsonObject6;
        jsonObject.getClass();
        try {
            String asString = jsonObject.get("type").getAsString();
            asString.getClass();
            for (ActionEvent.ActionEventActionType actionEventActionType : ActionEvent.ActionEventActionType.values()) {
                if (actionEventActionType.jsonValue.equals(asString)) {
                    JsonElement jsonElement = jsonObject.get("id");
                    String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
                    JsonElement jsonElement2 = jsonObject.get("loading_time");
                    Long valueOf = jsonElement2 != null ? Long.valueOf(jsonElement2.getAsLong()) : null;
                    JsonElement jsonElement3 = jsonObject.get("target");
                    ActionEvent.ActionEventActionTarget fromJsonObject = (jsonElement3 == null || (asJsonObject6 = jsonElement3.getAsJsonObject()) == null) ? null : zzil.fromJsonObject(asJsonObject6);
                    JsonElement jsonElement4 = jsonObject.get("frustration");
                    ActionEvent.Frustration fromJsonObject2 = (jsonElement4 == null || (asJsonObject5 = jsonElement4.getAsJsonObject()) == null) ? null : zzjn.fromJsonObject(asJsonObject5);
                    JsonElement jsonElement5 = jsonObject.get(BreadcrumbHelper.Category.ERROR);
                    ActionEvent.Error fromJsonObject3 = (jsonElement5 == null || (asJsonObject4 = jsonElement5.getAsJsonObject()) == null) ? null : zzjm.fromJsonObject(asJsonObject4);
                    JsonElement jsonElement6 = jsonObject.get("crash");
                    ActionEvent.Crash fromJsonObject4 = (jsonElement6 == null || (asJsonObject3 = jsonElement6.getAsJsonObject()) == null) ? null : zzjf.fromJsonObject(asJsonObject3);
                    JsonElement jsonElement7 = jsonObject.get("long_task");
                    ActionEvent.LongTask fromJsonObject5 = (jsonElement7 == null || (asJsonObject2 = jsonElement7.getAsJsonObject()) == null) ? null : zzjo.fromJsonObject(asJsonObject2);
                    JsonElement jsonElement8 = jsonObject.get("resource");
                    return new ActionEvent.ActionEventAction(actionEventActionType, asString2, valueOf, fromJsonObject, fromJsonObject2, fromJsonObject3, fromJsonObject4, fromJsonObject5, (jsonElement8 == null || (asJsonObject = jsonElement8.getAsJsonObject()) == null) ? null : zzjr.fromJsonObject(asJsonObject));
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type ActionEventAction", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type ActionEventAction", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type ActionEventAction", e3);
            return null;
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewNotificationCategoryDetails.deepLinkSpecs;
    }
}
