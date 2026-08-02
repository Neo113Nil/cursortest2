package androidx.credentials.playservices.controllers.identityauth.createpublickeycredential;

import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.domerrors.DataError;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda7 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController f$0;
    public final /* synthetic */ Throwable f$1;

    public /* synthetic */ CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda7(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th, int i) {
        this.$r8$classId = i;
        this.f$0 = credentialProviderCreatePublicKeyCredentialController;
        this.f$1 = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Throwable th = this.f$1;
        CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.f$0;
        switch (i) {
            case 0:
                CredentialManagerCallback credentialManagerCallback = credentialProviderCreatePublicKeyCredentialController.callback;
                if (credentialManagerCallback != null) {
                    credentialManagerCallback.onError(new CreateCredentialUnknownException(th.getMessage()));
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    throw null;
                }
            default:
                CredentialManagerCallback credentialManagerCallback2 = credentialProviderCreatePublicKeyCredentialController.callback;
                if (credentialManagerCallback2 != null) {
                    credentialManagerCallback2.onError(new CreatePublicKeyCredentialDomException(new DataError(24), th.getMessage()));
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    throw null;
                }
        }
    }
}
