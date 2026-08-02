package defpackage;

import android.credentials.CredentialOption;
import android.credentials.GetCredentialRequest;
import android.os.Bundle;
import android.service.credentials.BeginGetCredentialResponse;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class wi5 {
    public static /* synthetic */ CredentialOption.Builder f(String str, Bundle bundle, Bundle bundle2) {
        return new CredentialOption.Builder(str, bundle, bundle2);
    }

    public static /* synthetic */ GetCredentialRequest.Builder h(Bundle bundle) {
        return new GetCredentialRequest.Builder(bundle);
    }

    public static /* synthetic */ BeginGetCredentialResponse.Builder m() {
        return new BeginGetCredentialResponse.Builder();
    }
}
