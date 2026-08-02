package androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential;

import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class CreatePublicKeyCredentialController$$ExternalSyntheticLambda7 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CreatePublicKeyCredentialController f$0;

    public /* synthetic */ CreatePublicKeyCredentialController$$ExternalSyntheticLambda7(CreatePublicKeyCredentialController createPublicKeyCredentialController, int i) {
        this.$r8$classId = i;
        this.f$0 = createPublicKeyCredentialController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        CreatePublicKeyCredentialController createPublicKeyCredentialController = this.f$0;
        switch (i) {
            case 0:
                CredentialManagerCallback credentialManagerCallback = createPublicKeyCredentialController.callback;
                if (credentialManagerCallback != null) {
                    credentialManagerCallback.onError(new CreateCredentialUnknownException("No provider data returned."));
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    throw null;
                }
            default:
                CredentialManagerCallback credentialManagerCallback2 = createPublicKeyCredentialController.callback;
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
