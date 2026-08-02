package androidx.compose.runtime;

import androidx.compose.runtime.internal.AwaiterQueue$Awaiter;
import app.cash.trifle.KeyHandle$keyPair$2;

/* loaded from: classes3.dex */
public final class NextFrameEndCallbackQueue$NextFrameEndAwaiter extends AwaiterQueue$Awaiter {
    public KeyHandle$keyPair$2 onNextFrameEnd;

    public NextFrameEndCallbackQueue$NextFrameEndAwaiter(KeyHandle$keyPair$2 keyHandle$keyPair$2) {
        this.onNextFrameEnd = keyHandle$keyPair$2;
    }

    @Override // androidx.compose.runtime.internal.AwaiterQueue$Awaiter
    public final void cancel() {
        this.onNextFrameEnd = null;
    }

    public final void resume$1() {
        KeyHandle$keyPair$2 keyHandle$keyPair$2 = this.onNextFrameEnd;
        if (keyHandle$keyPair$2 != null) {
            keyHandle$keyPair$2.invoke();
        }
    }

    @Override // androidx.compose.runtime.internal.AwaiterQueue$Awaiter
    public final void resumeWithException(Throwable th) {
        throw th;
    }
}
