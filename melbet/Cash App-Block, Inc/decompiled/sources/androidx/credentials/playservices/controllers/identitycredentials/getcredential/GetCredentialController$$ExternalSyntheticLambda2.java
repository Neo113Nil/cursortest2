package androidx.credentials.playservices.controllers.identitycredentials.getcredential;

import android.content.Context;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.CreatePublicKeyCredentialRequest;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.CredentialOption;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final /* synthetic */ class GetCredentialController$$ExternalSyntheticLambda2 implements OnFailureListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ CredentialProviderController f$1;
    public final /* synthetic */ CredentialManagerCallback f$2;
    public final /* synthetic */ Executor f$3;
    public final /* synthetic */ CancellationSignal f$4;

    public /* synthetic */ GetCredentialController$$ExternalSyntheticLambda2(Object obj, CredentialProviderController credentialProviderController, CredentialManagerCallback credentialManagerCallback, Executor executor, CancellationSignal cancellationSignal, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = credentialProviderController;
        this.f$2 = credentialManagerCallback;
        this.f$3 = executor;
        this.f$4 = cancellationSignal;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        int i = this.$r8$classId;
        CancellationSignal cancellationSignal = this.f$4;
        Executor executor = this.f$3;
        CredentialManagerCallback credentialManagerCallback = this.f$2;
        CredentialProviderController credentialProviderController = this.f$1;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                GetCredentialRequest getCredentialRequest = (GetCredentialRequest) obj;
                GetCredentialController getCredentialController = (GetCredentialController) credentialProviderController;
                CredentialProviderPlayServicesImpl.INSTANCE.getClass();
                getCredentialRequest.getClass();
                for (CredentialOption credentialOption : getCredentialRequest.credentialOptions) {
                }
                Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
                new CredentialProviderBeginSignInController(getCredentialController.context).invokePlayServices(getCredentialRequest, cancellationSignal, executor, credentialManagerCallback);
                break;
            default:
                CreatePublicKeyCredentialRequest createPublicKeyCredentialRequest = (CreatePublicKeyCredentialRequest) obj;
                createPublicKeyCredentialRequest.getClass();
                Log.w("CreatePublicKey", "Pre-u credman PK create flow failed " + exc + "; retrying with gis flow");
                Context context = ((CreatePublicKeyCredentialController) credentialProviderController).context;
                context.getClass();
                new CredentialProviderCreatePublicKeyCredentialController(context).invokePlayServices(createPublicKeyCredentialRequest, credentialManagerCallback, executor, cancellationSignal);
                break;
        }
    }
}
