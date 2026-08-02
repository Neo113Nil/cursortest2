package androidx.credentials.playservices.controllers.identityauth.beginsignin;

import androidx.credentials.exceptions.GetCredentialException;

/* loaded from: classes3.dex */
public final /* synthetic */ class CredentialProviderBeginSignInController$$ExternalSyntheticLambda6 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CredentialProviderBeginSignInController f$0;
    public final /* synthetic */ GetCredentialException f$1;

    public /* synthetic */ CredentialProviderBeginSignInController$$ExternalSyntheticLambda6(CredentialProviderBeginSignInController credentialProviderBeginSignInController, GetCredentialException getCredentialException, int i) {
        this.$r8$classId = i;
        this.f$0 = credentialProviderBeginSignInController;
        this.f$1 = getCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        GetCredentialException getCredentialException = this.f$1;
        CredentialProviderBeginSignInController credentialProviderBeginSignInController = this.f$0;
        switch (i) {
            case 0:
                credentialProviderBeginSignInController.getCallback().onError(getCredentialException);
                break;
            case 1:
                credentialProviderBeginSignInController.getCallback().onError(getCredentialException);
                break;
            default:
                credentialProviderBeginSignInController.getCallback().onError(getCredentialException);
                break;
        }
    }
}
