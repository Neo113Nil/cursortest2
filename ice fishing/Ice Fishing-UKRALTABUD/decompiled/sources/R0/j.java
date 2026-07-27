package R0;

import K0.AbstractC0046w;

/* loaded from: classes.dex */
public final class j extends h {

    /* renamed from: h, reason: collision with root package name */
    public final Runnable f965h;

    public j(Runnable runnable, long j2, i iVar) {
        super(j2, iVar);
        this.f965h = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f965h.run();
        } finally {
            this.f963g.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f965h;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0046w.b(runnable));
        sb.append(", ");
        sb.append(this.f962f);
        sb.append(", ");
        sb.append(this.f963g);
        sb.append(']');
        return sb.toString();
    }
}
