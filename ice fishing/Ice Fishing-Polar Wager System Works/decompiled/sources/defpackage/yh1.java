package defpackage;

/* loaded from: classes.dex */
public final class yh1 implements java.util.concurrent.Executor {
    public java.lang.Runnable AARZUJiTa;
    public final java.util.concurrent.Executor adDC3e2L;
    public final java.util.ArrayDeque xiZrDbcSW0 = new java.util.ArrayDeque();
    public final java.lang.Object EXtogiMhuM = new java.lang.Object();

    public yh1(java.util.concurrent.Executor executor) {
        this.adDC3e2L = executor;
    }

    public final void IHQe1A4L2xu() {
        synchronized (this.EXtogiMhuM) {
            java.lang.Object poll = this.xiZrDbcSW0.poll();
            java.lang.Runnable runnable = (java.lang.Runnable) poll;
            this.AARZUJiTa = runnable;
            if (poll != null) {
                this.adDC3e2L.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        runnable.getClass();
        synchronized (this.EXtogiMhuM) {
            this.xiZrDbcSW0.offer(new defpackage.l1(2, runnable, this));
            if (this.AARZUJiTa == null) {
                IHQe1A4L2xu();
            }
        }
    }
}
