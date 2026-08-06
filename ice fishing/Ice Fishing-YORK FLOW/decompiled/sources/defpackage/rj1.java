package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class rj1 extends defpackage.qj1 {
    public final java.lang.Runnable QiMR8OkAhezm;

    public rj1(java.lang.Runnable runnable, long j, boolean z) {
        super(j, z);
        this.QiMR8OkAhezm = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.QiMR8OkAhezm.run();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Task[");
        java.lang.Runnable runnable = this.QiMR8OkAhezm;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(defpackage.nn.IJ0hOnjhPOri(runnable));
        sb.append(", ");
        sb.append(this.WDYagTQQm9ns);
        sb.append(", ");
        return defpackage.pVQOaWB9QMo4.fNwYGHIYeJcR(sb, this.oh71FJcDz6S2 ? "Blocking" : "Non-blocking", ']');
    }
}
