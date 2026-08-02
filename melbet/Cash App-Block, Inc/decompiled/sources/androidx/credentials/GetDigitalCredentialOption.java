package androidx.credentials;

import android.os.Bundle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.collections.EmptySet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class GetDigitalCredentialOption extends CredentialOption {
    public final String requestJson;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GetDigitalCredentialOption(String str) {
        super("androidx.credentials.TYPE_DIGITAL_CREDENTIAL", r2, r3, false, r5);
        str.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
        Bundle bundle2 = new Bundle();
        EmptySet emptySet = EmptySet.INSTANCE;
        emptySet.getClass();
        this.requestJson = str;
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
