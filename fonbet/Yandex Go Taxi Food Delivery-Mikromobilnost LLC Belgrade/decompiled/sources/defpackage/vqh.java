package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final class vqh extends ga implements ScheduledFuture {
    public final ScheduledFuture A;

    public vqh(uqh uqhVar) {
        this.A = uqhVar.a(new zgf(24, this));
    }

    @Override // defpackage.ga
    public final void b() {
        ScheduledFuture scheduledFuture = this.A;
        Object obj = this.a;
        scheduledFuture.cancel((obj instanceof v9) && ((v9) obj).a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.A.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.A.getDelay(timeUnit);
    }
}
