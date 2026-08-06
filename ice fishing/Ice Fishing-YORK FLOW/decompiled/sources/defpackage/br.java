package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class br implements defpackage.cr {
    public final java.util.concurrent.ScheduledFuture WDYagTQQm9ns;

    public br(java.util.concurrent.ScheduledFuture scheduledFuture) {
        this.WDYagTQQm9ns = scheduledFuture;
    }

    @Override // defpackage.cr
    public final void ZpBGe2uQfcn8() {
        this.WDYagTQQm9ns.cancel(false);
    }

    public final java.lang.String toString() {
        return "DisposableFutureHandle[" + this.WDYagTQQm9ns + ']';
    }
}
