package androidx.credentials.playservices;

import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialUnknownException;

/* loaded from: classes3.dex */
public final /* synthetic */ class CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CredentialManagerCallback f$0;

    public /* synthetic */ CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda0(CredentialManagerCallback credentialManagerCallback, int i) {
        this.$r8$classId = i;
        this.f$0 = credentialManagerCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        CredentialManagerCallback credentialManagerCallback = this.f$0;
        switch (i) {
            case 0:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$0$0(credentialManagerCallback);
                break;
            case 1:
                CredentialProviderPlayServicesImpl.onCreateCredential$lambda$0$0(credentialManagerCallback);
                break;
            case 2:
                credentialManagerCallback.onResult(null);
                break;
            case 3:
                credentialManagerCallback.onResult(null);
                break;
            case 4:
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$1$0(credentialManagerCallback);
                break;
            case 5:
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$0$0(credentialManagerCallback);
                break;
            case 6:
                credentialManagerCallback.onResult(null);
                break;
            case 7:
                credentialManagerCallback.onError(new GetCredentialUnknownException("No provider data returned."));
                break;
            case 8:
                credentialManagerCallback.onError(new CreateCredentialUnknownException(null));
                break;
            case 9:
                credentialManagerCallback.onError(new CreateCredentialUnknownException(null));
                break;
            default:
                credentialManagerCallback.onError(new GetCredentialUnknownException("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                break;
        }
    }
}
