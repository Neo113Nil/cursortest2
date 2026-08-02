package androidx.credentials;

import android.credentials.CreateCredentialException;
import android.credentials.GetCredentialException;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import com.squareup.cash.session.backend.DbSessionManagerKt;
import com.squareup.cash.sheet.BasicShieetKt;
import com.squareup.cash.sheet.SheetStateKt;
import kotlinx.coroutines.rx3.RxAwaitKt$await$5$1;

/* loaded from: classes3.dex */
public final class CredentialProviderFrameworkImpl$onGetCredential$outcome$2 implements OutcomeReceiver {
    public final /* synthetic */ CredentialManagerCallback $callback;
    public final /* synthetic */ int $r8$classId = 1;

    public CredentialProviderFrameworkImpl$onGetCredential$outcome$2(RxAwaitKt$await$5$1 rxAwaitKt$await$5$1, CredentialProviderFrameworkImpl credentialProviderFrameworkImpl) {
        this.$callback = rxAwaitKt$await$5$1;
    }

    public final void onError(Throwable th) {
        int i = this.$r8$classId;
        CredentialManagerCallback credentialManagerCallback = this.$callback;
        switch (i) {
            case 0:
                GetCredentialException getCredentialException = (GetCredentialException) th;
                getCredentialException.getClass();
                Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
                String type2 = getCredentialException.getType();
                type2.getClass();
                ((RxAwaitKt$await$5$1) credentialManagerCallback).onError((Object) SheetStateKt.toJetpackGetException(getCredentialException.getMessage(), type2));
                break;
            default:
                CreateCredentialException createCredentialException = (CreateCredentialException) th;
                createCredentialException.getClass();
                Log.i("CredManProvService", "CreateCredentialResponse error returned from framework");
                String type3 = createCredentialException.getType();
                type3.getClass();
                ((CredentialManager$createCredential$2$callback$1) credentialManagerCallback).onError(SheetStateKt.toJetpackCreateException(createCredentialException.getMessage(), type3));
                break;
        }
    }

    public final void onResult(Object obj) {
        int i = this.$r8$classId;
        CredentialManagerCallback credentialManagerCallback = this.$callback;
        switch (i) {
            case 0:
                android.credentials.GetCredentialResponse getCredentialResponse = (android.credentials.GetCredentialResponse) obj;
                getCredentialResponse.getClass();
                Log.i("CredManProvService", "GetCredentialResponse returned from framework");
                android.credentials.Credential credential = getCredentialResponse.getCredential();
                credential.getClass();
                String type2 = credential.getType();
                type2.getClass();
                Bundle data = credential.getData();
                data.getClass();
                ((RxAwaitKt$await$5$1) credentialManagerCallback).onResult(new GetCredentialResponse(BasicShieetKt.createFrom(data, type2)));
                break;
            default:
                android.credentials.CreateCredentialResponse createCredentialResponse = (android.credentials.CreateCredentialResponse) obj;
                createCredentialResponse.getClass();
                Log.i("CredManProvService", "Create Result returned from framework: ");
                Bundle data2 = createCredentialResponse.getData();
                data2.getClass();
                ((CredentialManager$createCredential$2$callback$1) credentialManagerCallback).onResult(DbSessionManagerKt.createFrom(data2, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL"));
                break;
        }
    }

    public CredentialProviderFrameworkImpl$onGetCredential$outcome$2(CredentialManager$createCredential$2$callback$1 credentialManager$createCredential$2$callback$1, CreatePublicKeyCredentialRequest createPublicKeyCredentialRequest, CredentialProviderFrameworkImpl credentialProviderFrameworkImpl) {
        this.$callback = credentialManager$createCredential$2$callback$1;
    }
}
