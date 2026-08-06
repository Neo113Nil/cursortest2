package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class w41 implements java.util.concurrent.Executor {
    public final android.os.Handler WDYagTQQm9ns;

    public w41(android.os.Handler handler) {
        this.WDYagTQQm9ns = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        runnable.getClass();
        android.os.Handler handler = this.WDYagTQQm9ns;
        if (handler.post(runnable)) {
            return;
        }
        throw new java.util.concurrent.RejectedExecutionException(handler + " is shutting down");
    }
}
