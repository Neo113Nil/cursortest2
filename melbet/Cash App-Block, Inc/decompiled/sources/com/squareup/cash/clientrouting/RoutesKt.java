package com.squareup.cash.clientrouting;

import com.datadog.android.rum.model.ViewEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.franklin.api.ClientScenario;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class RoutesKt {
    public static ViewEvent.Cellular fromJsonObject(JsonObject jsonObject) {
        try {
            JsonElement jsonElement = jsonObject.get("technology");
            String asString = jsonElement != null ? jsonElement.getAsString() : null;
            JsonElement jsonElement2 = jsonObject.get("carrier_name");
            return new ViewEvent.Cellular(asString, jsonElement2 != null ? jsonElement2.getAsString() : null);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Cellular", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Cellular", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Cellular", e3);
            return null;
        }
    }

    public static final ClientScenario getClientScenarioProto(ClientRoute.ClientScenario clientScenario) {
        clientScenario.getClass();
        String str = clientScenario.clientScenarioName;
        Locale locale = Locale.ROOT;
        locale.getClass();
        String upperCase = str.toUpperCase(locale);
        upperCase.getClass();
        return ClientScenario.valueOf(upperCase);
    }
}
