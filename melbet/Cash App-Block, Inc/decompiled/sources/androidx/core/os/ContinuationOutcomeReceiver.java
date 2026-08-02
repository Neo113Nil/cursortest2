package androidx.core.os;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class ContinuationOutcomeReceiver extends AtomicBoolean implements OutcomeReceiver {
    private final Continuation<Object> continuation;

    public ContinuationOutcomeReceiver(CancellableContinuationImpl cancellableContinuationImpl) {
        super(false);
        this.continuation = cancellableContinuationImpl;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            Continuation<Object> continuation = this.continuation;
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(SafeTrace.createFailure(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            Continuation<Object> continuation = this.continuation;
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
