package Z7;

import S7.AbstractC0406y;

/* loaded from: classes2.dex */
public final class j extends i {

    /* renamed from: v, reason: collision with root package name */
    public final Runnable f4214v;

    public j(Runnable runnable, long j6, N6.i iVar) {
        super(j6, iVar);
        this.f4214v = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f4214v.run();
        } finally {
            this.f4213u.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f4214v;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0406y.j(runnable));
        sb.append(", ");
        sb.append(this.f4212n);
        sb.append(", ");
        sb.append(this.f4213u);
        sb.append(']');
        return sb.toString();
    }
}
