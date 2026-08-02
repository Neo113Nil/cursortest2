package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class t9x extends w8x {
    public a9x h;
    public ScheduledFuture i;

    @Override // defpackage.j8x
    public final String c() {
        a9x a9xVar = this.h;
        ScheduledFuture scheduledFuture = this.i;
        if (a9xVar == null) {
            return null;
        }
        String q = hrg.q("inputFuture=[", a9xVar.toString(), "]");
        if (scheduledFuture == null) {
            return q;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return q;
        }
        return q + ", remaining delay=[" + delay + " ms]";
    }

    @Override // defpackage.j8x
    public final void d() {
        a9x a9xVar = this.h;
        if ((a9xVar != null) & (this.a instanceof z7x)) {
            Object obj = this.a;
            a9xVar.cancel((obj instanceof z7x) && ((z7x) obj).a);
        }
        ScheduledFuture scheduledFuture = this.i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.h = null;
        this.i = null;
    }
}
