package yc;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j0 implements k0 {

    /* renamed from: g, reason: collision with root package name */
    public final ScheduledFuture f8866g;

    public j0(ScheduledFuture scheduledFuture) {
        this.f8866g = scheduledFuture;
    }

    @Override // yc.k0
    public final void a() {
        this.f8866g.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f8866g + ']';
    }
}
