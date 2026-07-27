package O3;

import g1.C4523c;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import t.AbstractC5016g;
import t.C5010a;

/* loaded from: classes2.dex */
public final class h extends AbstractC5016g implements ScheduledFuture {

    /* renamed from: A, reason: collision with root package name */
    public final ScheduledFuture f2513A;

    public h(g gVar) {
        this.f2513A = gVar.a(new C4523c(9, this));
    }

    @Override // t.AbstractC5016g
    public final void b() {
        ScheduledFuture scheduledFuture = this.f2513A;
        Object obj = this.f40548n;
        scheduledFuture.cancel((obj instanceof C5010a) && ((C5010a) obj).f40530a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f2513A.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f2513A.getDelay(timeUnit);
    }
}
