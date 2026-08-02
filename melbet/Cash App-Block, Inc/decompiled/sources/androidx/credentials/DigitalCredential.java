package androidx.credentials;

import android.os.Bundle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class DigitalCredential extends Credential {
    public final String credentialJson;

    public DigitalCredential(Bundle bundle, String str) {
        super(bundle, "androidx.credentials.TYPE_DIGITAL_CREDENTIAL");
        this.credentialJson = str;
        if (str.length() != 0) {
            try {
                new JSONObject(str);
                return;
            } catch (Exception unused) {
            }
        }
        a$$ExternalSyntheticBUOutline0.m$3("credentialJson must not be empty, and must be a valid JSON");
        throw null;
    }
}
