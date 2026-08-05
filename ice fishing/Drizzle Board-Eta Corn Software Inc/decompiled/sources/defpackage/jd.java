package defpackage;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class jd implements kd {
    public final ScheduledFuture NCTxEWno;

    public jd(ScheduledFuture scheduledFuture) {
        this.NCTxEWno = scheduledFuture;
    }

    @Override // defpackage.kd
    public final void qoPGr6Ce() {
        this.NCTxEWno.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.NCTxEWno + ']';
    }
}
