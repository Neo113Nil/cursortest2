package androidx.credentials.playservices.controllers.identityauth.createpublickeycredential;

import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.domerrors.DataError;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController f$0;

    public /* synthetic */ CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda1(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, int i) {
        this.$r8$classId = i;
        this.f$0 = credentialProviderCreatePublicKeyCredentialController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.f$0;
        switch (i) {
            case 0:
                CredentialManagerCallback credentialManagerCallback = credentialProviderCreatePublicKeyCredentialController.callback;
                if (credentialManagerCallback != null) {
                    credentialManagerCallback.onError(new CreatePublicKeyCredentialDomException(new DataError(24), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    throw null;
                }
            default:
                CredentialManagerCallback credentialManagerCallback2 = credentialProviderCreatePublicKeyCredentialController.callback;
                if (credentialManagerCallback2 != null) {
                    credentialManagerCallback2.onError(new CreateCredentialUnknownException("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    throw null;
                }
        }
    }
}
