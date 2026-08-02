package androidx.credentials;

import androidx.credentials.exceptions.CreateCredentialException;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancelledContinuation;
import kotlinx.coroutines.NotCompleted;

/* loaded from: classes3.dex */
public final class CredentialManager$createCredential$2$callback$1 implements CredentialManagerCallback, OnFailureListener, OnCanceledListener {
    public final /* synthetic */ CancellableContinuationImpl $continuation;

    public /* synthetic */ CredentialManager$createCredential$2$callback$1(CancellableContinuationImpl cancellableContinuationImpl) {
        this.$continuation = cancellableContinuationImpl;
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public void onCanceled() {
        this.$continuation.cancel(null);
    }

    @Override // androidx.credentials.CredentialManagerCallback
    public void onError(Object obj) {
        CreateCredentialException createCredentialException = (CreateCredentialException) obj;
        createCredentialException.getClass();
        CancellableContinuationImpl cancellableContinuationImpl = this.$continuation;
        if (cancellableContinuationImpl.getState$kotlinx_coroutines_core() instanceof NotCompleted) {
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(new Result.Failure(createCredentialException));
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        CancellableContinuationImpl cancellableContinuationImpl = this.$continuation;
        if (cancellableContinuationImpl.getState$kotlinx_coroutines_core() instanceof CancelledContinuation) {
            return;
        }
        Result.Companion companion = Result.Companion;
        cancellableContinuationImpl.resumeWith(new Result.Failure(exc));
    }

    @Override // androidx.credentials.CredentialManagerCallback
    public void onResult(Object obj) {
        CreateCredentialResponse createCredentialResponse = (CreateCredentialResponse) obj;
        createCredentialResponse.getClass();
        CancellableContinuationImpl cancellableContinuationImpl = this.$continuation;
        if (cancellableContinuationImpl.getState$kotlinx_coroutines_core() instanceof NotCompleted) {
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(createCredentialResponse);
        }
    }
}
