package defpackage;

import android.os.Bundle;

/* loaded from: classes10.dex */
public final class x0c {
    public final String a = "androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE";
    public final Bundle b;

    public x0c() {
        Bundle bundle = new Bundle();
        this.b = bundle;
        if (!jl40.l("androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE", "androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE") && !jl40.l("androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE", "androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            ny61.g(oyr.p("The request type ", "androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE", " is not supported."));
            throw null;
        }
        if (jl40.l("androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE", "androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            bundle.putBoolean("androidx.credentials.BUNDLE_KEY_CLEAR_RESTORE_CREDENTIAL_REQUEST", true);
        }
    }
}
