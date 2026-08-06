package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class vo1 implements java.util.concurrent.Executor {
    public java.lang.Runnable QiMR8OkAhezm;
    public final java.util.concurrent.Executor WDYagTQQm9ns;
    public final java.util.ArrayDeque oh71FJcDz6S2 = new java.util.ArrayDeque();
    public final java.lang.Object P05cfTpS5W5L = new java.lang.Object();

    public vo1(java.util.concurrent.Executor executor) {
        this.WDYagTQQm9ns = executor;
    }

    public final void ZpBGe2uQfcn8() {
        synchronized (this.P05cfTpS5W5L) {
            java.lang.Object poll = this.oh71FJcDz6S2.poll();
            java.lang.Runnable runnable = (java.lang.Runnable) poll;
            this.QiMR8OkAhezm = runnable;
            if (poll != null) {
                this.WDYagTQQm9ns.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        runnable.getClass();
        synchronized (this.P05cfTpS5W5L) {
            this.oh71FJcDz6S2.offer(new defpackage.m0(2, runnable, this));
            if (this.QiMR8OkAhezm == null) {
                ZpBGe2uQfcn8();
            }
        }
    }
}
