package defpackage;

/* loaded from: classes.dex */
public final class af1 extends defpackage.ze1 {
    public final java.lang.Runnable AARZUJiTa;

    public af1(java.lang.Runnable runnable, long j, boolean z) {
        super(j, z);
        this.AARZUJiTa = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.AARZUJiTa.run();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Task[");
        java.lang.Runnable runnable = this.AARZUJiTa;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(defpackage.fm.UsuH8pd5P(runnable));
        sb.append(", ");
        sb.append(this.adDC3e2L);
        sb.append(", ");
        sb.append(this.xiZrDbcSW0 ? "Blocking" : "Non-blocking");
        sb.append(']');
        return sb.toString();
    }
}
