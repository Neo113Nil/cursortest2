package androidx.credentials.playservices.controllers.identityauth.createpublickeycredential;

import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.exceptions.CreateCredentialException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda10 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController f$0;
    public final /* synthetic */ CreateCredentialException f$1;

    public /* synthetic */ CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda10(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, CreateCredentialException createCredentialException, int i) {
        this.$r8$classId = i;
        this.f$0 = credentialProviderCreatePublicKeyCredentialController;
        this.f$1 = createCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        CreateCredentialException createCredentialException = this.f$1;
        CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.f$0;
        switch (i) {
            case 0:
                CredentialManagerCallback credentialManagerCallback = credentialProviderCreatePublicKeyCredentialController.callback;
                if (credentialManagerCallback != null) {
                    credentialManagerCallback.onError(createCredentialException);
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    throw null;
                }
            case 1:
                CredentialManagerCallback credentialManagerCallback2 = credentialProviderCreatePublicKeyCredentialController.callback;
                if (credentialManagerCallback2 != null) {
                    credentialManagerCallback2.onError(createCredentialException);
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    throw null;
                }
            default:
                CredentialManagerCallback credentialManagerCallback3 = credentialProviderCreatePublicKeyCredentialController.callback;
                if (credentialManagerCallback3 != null) {
                    credentialManagerCallback3.onError(createCredentialException);
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    throw null;
                }
        }
    }
}
