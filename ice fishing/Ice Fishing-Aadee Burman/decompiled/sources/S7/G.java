package S7;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes2.dex */
public final class G implements H {

    /* renamed from: n, reason: collision with root package name */
    public final ScheduledFuture f2918n;

    public G(ScheduledFuture scheduledFuture) {
        this.f2918n = scheduledFuture;
    }

    @Override // S7.H
    public final void b() {
        this.f2918n.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f2918n + ']';
    }
}
