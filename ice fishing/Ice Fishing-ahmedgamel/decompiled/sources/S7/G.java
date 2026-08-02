package S7;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes2.dex */
public final class G implements H {

    /* renamed from: n, reason: collision with root package name */
    public final ScheduledFuture f3001n;

    public G(ScheduledFuture scheduledFuture) {
        this.f3001n = scheduledFuture;
    }

    @Override // S7.H
    public final void b() {
        this.f3001n.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f3001n + ']';
    }
}
