package R1;

import L1.AbstractC0018t;

/* loaded from: classes.dex */
public final class j extends h {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f1042c;

    public j(Runnable runnable, long j, i iVar) {
        super(j, iVar);
        this.f1042c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f1042c.run();
        } finally {
            this.f1040b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f1042c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0018t.a(runnable));
        sb.append(", ");
        sb.append(this.f1039a);
        sb.append(", ");
        sb.append(this.f1040b);
        sb.append(']');
        return sb.toString();
    }
}
