package m7;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i extends v2.h implements ScheduledFuture {

    /* renamed from: n, reason: collision with root package name */
    public final ScheduledFuture f4958n;

    public i(h hVar) {
        this.f4958n = hVar.b(new g(0, this));
    }

    @Override // v2.h
    public final void c() {
        ScheduledFuture scheduledFuture = this.f4958n;
        Object obj = this.f7205g;
        scheduledFuture.cancel((obj instanceof v2.a) && ((v2.a) obj).f7185a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f4958n.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f4958n.getDelay(timeUnit);
    }
}
