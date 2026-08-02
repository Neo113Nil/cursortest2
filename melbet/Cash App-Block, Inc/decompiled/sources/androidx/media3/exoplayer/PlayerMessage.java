package androidx.media3.exoplayer;

import android.os.Looper;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Log;
import androidx.tracing.Trace;

/* loaded from: classes3.dex */
public final class PlayerMessage {
    public boolean isSent;
    public final Looper looper;
    public Object payload;
    public final ExoPlayerImplInternal sender;
    public final Target target;

    /* renamed from: type, reason: collision with root package name */
    public int f877type;

    public interface Target {
        void handleMessage(int i, Object obj);
    }

    public PlayerMessage(ExoPlayerImplInternal exoPlayerImplInternal, Target target, Timeline timeline, int i, Looper looper) {
        this.sender = exoPlayerImplInternal;
        this.target = target;
        this.looper = looper;
    }

    public final synchronized void markAsProcessed(boolean z) {
        notifyAll();
    }

    public final void send() {
        Trace.checkState(!this.isSent);
        this.isSent = true;
        ExoPlayerImplInternal exoPlayerImplInternal = this.sender;
        if (!exoPlayerImplInternal.releasedOnApplicationThread && exoPlayerImplInternal.playbackLooper.getThread().isAlive()) {
            exoPlayerImplInternal.handler.obtainMessage(14, this).sendToTarget();
        } else {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            markAsProcessed(false);
        }
    }
}
