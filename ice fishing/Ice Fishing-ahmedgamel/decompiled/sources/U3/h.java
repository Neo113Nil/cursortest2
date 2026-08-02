package U3;

import i1.C4586c;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import t.AbstractC4984g;
import t.C4978a;

/* loaded from: classes2.dex */
public final class h extends AbstractC4984g implements ScheduledFuture {

    /* renamed from: A, reason: collision with root package name */
    public final ScheduledFuture f3318A;

    public h(g gVar) {
        this.f3318A = gVar.a(new C4586c(10, this));
    }

    @Override // t.AbstractC4984g
    public final void c() {
        ScheduledFuture scheduledFuture = this.f3318A;
        Object obj = this.f40576n;
        scheduledFuture.cancel((obj instanceof C4978a) && ((C4978a) obj).f40558a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f3318A.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f3318A.getDelay(timeUnit);
    }
}
