package androidx.credentials;

import android.os.Bundle;
import androidx.camera.video.Recorder;
import bo.app.a$$ExternalSyntheticBUOutline0;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class CreatePublicKeyCredentialRequest extends CreateCredentialRequest {
    public final String requestJson;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CreatePublicKeyCredentialRequest(String str) {
        super(r0, r7, r2);
        str.getClass();
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("user");
            String string2 = jSONObject.getString("name");
            String string3 = jSONObject.isNull("displayName") ? null : jSONObject.getString("displayName");
            string2.getClass();
            Recorder.AnonymousClass4 anonymousClass4 = new Recorder.AnonymousClass4(string2, string3);
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST");
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", null);
            Bundle bundle2 = new Bundle();
            bundle2.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST");
            bundle2.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
            bundle2.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", null);
            this.requestJson = str;
            if (str.length() != 0) {
                try {
                    new JSONObject(str);
                    return;
                } catch (Exception unused) {
                }
            }
            a$$ExternalSyntheticBUOutline0.m$3("requestJson must not be empty, and must be a valid JSON");
            throw null;
        } catch (Exception unused2) {
            a$$ExternalSyntheticBUOutline0.m$3("user.name must be defined in requestJson");
            throw null;
        }
    }
}
