package androidx.credentials;

import android.os.Bundle;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class RestoreCredential extends Credential {
    public RestoreCredential(Bundle bundle, String str) {
        super(bundle, "android.credentials.TYPE_PASSWORD_CREDENTIAL");
        if (str.length() > 0) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("password should not be empty");
        throw null;
    }
}
