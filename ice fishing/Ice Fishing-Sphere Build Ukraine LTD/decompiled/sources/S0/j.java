package S0;

import L0.AbstractC0064w;

/* loaded from: classes.dex */
public final class j extends h {

    /* renamed from: g, reason: collision with root package name */
    public final Runnable f976g;

    public j(Runnable runnable, long j2, i iVar) {
        super(j2, iVar);
        this.f976g = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f976g.run();
        } finally {
            this.f974f.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f976g;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0064w.b(runnable));
        sb.append(", ");
        sb.append(this.f973e);
        sb.append(", ");
        sb.append(this.f974f);
        sb.append(']');
        return sb.toString();
    }
}
