package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class v71 extends u71 {
    public final Runnable AvO7iQsrTN;

    public v71(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.AvO7iQsrTN = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.AvO7iQsrTN.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.AvO7iQsrTN;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(qj.WdrkLMV3xh(runnable));
        sb.append(", ");
        sb.append(this.OOA6hdeuvCS);
        sb.append(", ");
        sb.append(this.EljAMC1QTz ? "Blocking" : "Non-blocking");
        sb.append(']');
        return sb.toString();
    }
}
