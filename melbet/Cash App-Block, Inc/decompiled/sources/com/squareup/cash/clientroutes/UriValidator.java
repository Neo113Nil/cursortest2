package com.squareup.cash.clientroutes;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.datadog.android.rum.model.ViewEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonObject;
import java.net.URI;
import java.net.URISyntaxException;

/* loaded from: classes6.dex */
public abstract class UriValidator {
    public static ViewEvent.Action fromJsonObject(JsonObject jsonObject) {
        jsonObject.getClass();
        try {
            return new ViewEvent.Action(jsonObject.get("count").getAsLong());
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

    public static void validate(String str) {
        str.getClass();
        try {
            new URI(str);
        } catch (URISyntaxException e) {
            String input = e.getInput();
            input.getClass();
            String reason = e.getReason();
            reason.getClass();
            throw new UriSyntaxException(CameraSelector$$ExternalSyntheticOutline0.m("Input: ", input, " is invalid due to ", reason));
        }
    }
}
