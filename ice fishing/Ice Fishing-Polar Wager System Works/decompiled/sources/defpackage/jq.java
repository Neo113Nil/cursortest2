package defpackage;

/* loaded from: classes.dex */
public final class jq implements defpackage.kq {
    public final java.util.concurrent.ScheduledFuture adDC3e2L;

    public jq(java.util.concurrent.ScheduledFuture scheduledFuture) {
        this.adDC3e2L = scheduledFuture;
    }

    @Override // defpackage.kq
    public final void IHQe1A4L2xu() {
        this.adDC3e2L.cancel(false);
    }

    public final java.lang.String toString() {
        return "DisposableFutureHandle[" + this.adDC3e2L + ']';
    }
}
