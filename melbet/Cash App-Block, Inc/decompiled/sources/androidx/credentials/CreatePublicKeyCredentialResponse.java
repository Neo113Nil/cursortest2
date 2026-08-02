package androidx.credentials;

import android.os.Bundle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class CreatePublicKeyCredentialResponse extends CreateCredentialResponse {
    public final String registrationResponseJson;

    public CreatePublicKeyCredentialResponse(Bundle bundle, String str) {
        super(bundle, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL");
        this.registrationResponseJson = str;
        if (str.length() != 0) {
            try {
                new JSONObject(str);
                return;
            } catch (Exception unused) {
            }
        }
        a$$ExternalSyntheticBUOutline0.m$3("registrationResponseJson must not be empty, and must be a valid JSON");
        throw null;
    }

    public final String getRegistrationResponseJson() {
        return this.registrationResponseJson;
    }
}
