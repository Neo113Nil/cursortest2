package androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential;

import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class CreatePublicKeyCredentialController$$ExternalSyntheticLambda6 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CreatePublicKeyCredentialController f$0;
    public final /* synthetic */ CreateCredentialException f$1;

    public /* synthetic */ CreatePublicKeyCredentialController$$ExternalSyntheticLambda6(CreatePublicKeyCredentialController createPublicKeyCredentialController, CreateCredentialException createCredentialException, int i) {
        this.$r8$classId = i;
        this.f$0 = createPublicKeyCredentialController;
        this.f$1 = createCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$1;
        CreatePublicKeyCredentialController createPublicKeyCredentialController = this.f$0;
        switch (i) {
            case 0:
                CredentialManagerCallback credentialManagerCallback = createPublicKeyCredentialController.callback;
                if (credentialManagerCallback == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    throw null;
                }
                if (obj == null) {
                    obj = new CreateCredentialUnknownException("No provider data returned");
                }
                credentialManagerCallback.onError(obj);
                return;
            default:
                CredentialManagerCallback credentialManagerCallback2 = createPublicKeyCredentialController.callback;
                if (credentialManagerCallback2 != null) {
                    credentialManagerCallback2.onError(obj);
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    throw null;
                }
        }
    }
}
