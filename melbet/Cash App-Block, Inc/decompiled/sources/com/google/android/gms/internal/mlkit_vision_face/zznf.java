package com.google.android.gms.internal.mlkit_vision_face;

import android.content.ContextWrapper;
import android.widget.FrameLayout;
import androidx.savedstate.SavedStateRegistryOwner;
import com.datadog.android.telemetry.model.TelemetryErrorEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$filter$1;
import com.squareup.util.cash.Countries;
import com.squareup.workflow1.ui.TextControllerKt;
import com.squareup.workflow1.ui.ViewRegistryKt;
import com.squareup.workflow1.ui.ViewShowRenderingKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClasses;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes8.dex */
public abstract class zznf {
    public static TelemetryErrorEvent.Telemetry fromJsonObject(JsonObject jsonObject) {
        JsonObject asJsonObject;
        JsonObject asJsonObject2;
        JsonObject asJsonObject3;
        jsonObject.getClass();
        try {
            JsonElement jsonElement = jsonObject.get("device");
            TelemetryErrorEvent.Device fromJsonObject = (jsonElement == null || (asJsonObject3 = jsonElement.getAsJsonObject()) == null) ? null : TextControllerKt.fromJsonObject(asJsonObject3);
            JsonElement jsonElement2 = jsonObject.get("os");
            TelemetryErrorEvent.Os fromJsonObject2 = (jsonElement2 == null || (asJsonObject2 = jsonElement2.getAsJsonObject()) == null) ? null : ViewShowRenderingKt.fromJsonObject(asJsonObject2);
            JsonElement jsonElement3 = jsonObject.get("type");
            String asString = jsonElement3 != null ? jsonElement3.getAsString() : null;
            String asString2 = jsonObject.get("status").getAsString();
            String asString3 = jsonObject.get("message").getAsString();
            JsonElement jsonElement4 = jsonObject.get(BreadcrumbHelper.Category.ERROR);
            TelemetryErrorEvent.Error fromJsonObject3 = (jsonElement4 == null || (asJsonObject = jsonElement4.getAsJsonObject()) == null) ? null : ViewRegistryKt.fromJsonObject(asJsonObject);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                if (!ArraysKt___ArraysKt.contains(TelemetryErrorEvent.Telemetry.RESERVED_PROPERTIES, entry.getKey())) {
                    String key = entry.getKey();
                    key.getClass();
                    linkedHashMap.put(key, entry.getValue());
                }
            }
            if (asString != null && !asString.equals("log")) {
                throw new IllegalStateException("Check failed.");
            }
            if (!Intrinsics.areEqual(asString2, BreadcrumbHelper.Category.ERROR)) {
                throw new IllegalStateException("Check failed.");
            }
            asString3.getClass();
            return new TelemetryErrorEvent.Telemetry(fromJsonObject, fromJsonObject2, asString3, fromJsonObject3, linkedHashMap);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Telemetry", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Telemetry", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Telemetry", e3);
            return null;
        }
    }

    public static RealGooglePayer$createWallet$$inlined$filter$1 getProfileFlow(RealProfileManager realProfileManager) {
        return new RealGooglePayer$createWallet$$inlined$filter$1(realProfileManager.bitcoinDisplayUnits(), 3);
    }

    public static SavedStateRegistryOwner stateRegistryOwnerFromViewTreeOrContext(FrameLayout frameLayout) {
        SavedStateRegistryOwner savedStateRegistryOwner = Countries.get(frameLayout);
        if (savedStateRegistryOwner == null) {
            Object context = frameLayout.getContext();
            context.getClass();
            KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SavedStateRegistryOwner.class);
            while (!orCreateKotlinClass.isInstance(context)) {
                ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
                if (contextWrapper == null || (context = contextWrapper.getBaseContext()) == null) {
                    context = null;
                    break;
                }
            }
            KClasses.cast(orCreateKotlinClass, context);
            savedStateRegistryOwner = (SavedStateRegistryOwner) context;
        }
        if (savedStateRegistryOwner != null) {
            return savedStateRegistryOwner;
        }
        Path$$ExternalSyntheticBUOutline0.m((Object) Intrinsics.stringPlus(frameLayout, "Expected to find a SavedStateRegistryOwner either in a parent view or the Context of "));
        return null;
    }
}
