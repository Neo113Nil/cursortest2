package androidx.credentials.playservices.controllers.identityauth.createpublickeycredential;

import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.exceptions.domerrors.DataError;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final /* synthetic */ class CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda5 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController f$0;
    public final /* synthetic */ JSONException f$1;

    public /* synthetic */ CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda5(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException, int i) {
        this.$r8$classId = i;
        this.f$0 = credentialProviderCreatePublicKeyCredentialController;
        this.f$1 = jSONException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        JSONException jSONException = this.f$1;
        CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.f$0;
        switch (i) {
            case 0:
                CredentialManagerCallback credentialManagerCallback = credentialProviderCreatePublicKeyCredentialController.callback;
                if (credentialManagerCallback != null) {
                    credentialManagerCallback.onError(new CreatePublicKeyCredentialDomException(new DataError(4), jSONException.getMessage()));
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    throw null;
                }
            default:
                CredentialManagerCallback credentialManagerCallback2 = credentialProviderCreatePublicKeyCredentialController.callback;
                if (credentialManagerCallback2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    throw null;
                }
                String message = jSONException.getMessage();
                credentialManagerCallback2.onError((message == null || message.length() <= 0) ? new CreatePublicKeyCredentialDomException(new DataError(4), "Unknown error") : new CreatePublicKeyCredentialDomException(new DataError(4), message));
                return;
        }
    }
}
