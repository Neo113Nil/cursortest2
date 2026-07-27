package S3;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import t.AbstractC4985g;
import t.C4979a;

/* loaded from: classes2.dex */
public final class h extends AbstractC4985g implements ScheduledFuture {

    /* renamed from: A, reason: collision with root package name */
    public final ScheduledFuture f2879A;

    public h(g gVar) {
        this.f2879A = gVar.a(new F1.a(7, this));
    }

    @Override // t.AbstractC4985g
    public final void c() {
        ScheduledFuture scheduledFuture = this.f2879A;
        Object obj = this.f40520n;
        scheduledFuture.cancel((obj instanceof C4979a) && ((C4979a) obj).f40501a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f2879A.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f2879A.getDelay(timeUnit);
    }
}
