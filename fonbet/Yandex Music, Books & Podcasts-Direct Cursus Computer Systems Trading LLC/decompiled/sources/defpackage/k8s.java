package defpackage;

/* loaded from: classes5.dex */
public final class k8s extends g8s {
    public final Runnable c;

    public k8s(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(ff7.B(runnable));
        sb.append(", ");
        sb.append(this.a);
        sb.append(", ");
        return dfi.i(sb, this.b ? "Blocking" : "Non-blocking", ']');
    }
}
