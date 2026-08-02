package androidx.credentials;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public interface CredentialProvider {
    boolean isAvailableOnDevice();

    void onCreateCredential(Context context, CreateCredentialRequest createCredentialRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback credentialManagerCallback);

    void onGetCredential(Context context, GetCredentialRequest getCredentialRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback credentialManagerCallback);
}
