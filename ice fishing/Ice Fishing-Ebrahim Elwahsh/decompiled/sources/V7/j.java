package V7;

import O7.AbstractC0399y;

/* loaded from: classes2.dex */
public final class j extends i {

    /* renamed from: v, reason: collision with root package name */
    public final Runnable f3358v;

    public j(Runnable runnable, long j9, J6.i iVar) {
        super(j9, iVar);
        this.f3358v = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f3358v.run();
        } finally {
            this.f3357u.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f3358v;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0399y.j(runnable));
        sb.append(", ");
        sb.append(this.f3356n);
        sb.append(", ");
        sb.append(this.f3357u);
        sb.append(']');
        return sb.toString();
    }
}
