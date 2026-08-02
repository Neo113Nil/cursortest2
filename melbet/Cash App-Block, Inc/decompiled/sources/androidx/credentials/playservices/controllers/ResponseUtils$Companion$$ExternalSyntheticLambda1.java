package androidx.credentials.playservices.controllers;

import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;

/* loaded from: classes3.dex */
public final /* synthetic */ class ResponseUtils$Companion$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CredentialManagerCallback f$0;
    public final /* synthetic */ GetCredentialException f$1;

    public /* synthetic */ ResponseUtils$Companion$$ExternalSyntheticLambda1(CredentialManagerCallback credentialManagerCallback, GetCredentialException getCredentialException, int i) {
        this.$r8$classId = i;
        this.f$0 = credentialManagerCallback;
        this.f$1 = getCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$1;
        CredentialManagerCallback credentialManagerCallback = this.f$0;
        switch (i) {
            case 0:
                credentialManagerCallback.onError(obj);
                break;
            case 1:
                if (obj == null) {
                    obj = new GetCredentialUnknownException("No provider data returned");
                }
                credentialManagerCallback.onError(obj);
                break;
            default:
                credentialManagerCallback.onError(obj);
                break;
        }
    }
}
