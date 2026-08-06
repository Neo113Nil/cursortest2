package H1;

import A1.AbstractC0022x;

/* loaded from: classes.dex */
public final class j extends h {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f691c;

    public j(Runnable runnable, long j2, i iVar) {
        super(j2, iVar);
        this.f691c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f691c.run();
        } finally {
            this.f689b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f691c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0022x.b(runnable));
        sb.append(", ");
        sb.append(this.f688a);
        sb.append(", ");
        sb.append(this.f689b);
        sb.append(']');
        return sb.toString();
    }
}
