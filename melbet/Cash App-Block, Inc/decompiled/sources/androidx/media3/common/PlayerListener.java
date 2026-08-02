package androidx.media3.common;

import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayerImpl;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes3.dex */
public final class PlayerListener implements Player.Listener {
    public final CancellableContinuationImpl continuation;
    public final AtomicBoolean isCancelled;
    public final Function2 onEvents;

    public PlayerListener(Function2 function2, CancellableContinuationImpl cancellableContinuationImpl) {
        function2.getClass();
        this.onEvents = function2;
        this.continuation = cancellableContinuationImpl;
        this.isCancelled = new AtomicBoolean(false);
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onEvents(ExoPlayerImpl exoPlayerImpl, Player.Events events) {
        AtomicBoolean atomicBoolean = this.isCancelled;
        exoPlayerImpl.getClass();
        try {
            if (atomicBoolean.get()) {
                return;
            }
            this.onEvents.invoke(exoPlayerImpl, events);
        } catch (Throwable th) {
            atomicBoolean.set(true);
            Result.Companion companion = Result.Companion;
            this.continuation.resumeWith(new Result.Failure(th));
        }
    }
}
