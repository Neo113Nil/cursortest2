package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class u41 extends java.lang.Thread {
    public final int WDYagTQQm9ns;

    public u41(java.lang.Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.WDYagTQQm9ns = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        android.os.Process.setThreadPriority(this.WDYagTQQm9ns);
        super.run();
    }
}
