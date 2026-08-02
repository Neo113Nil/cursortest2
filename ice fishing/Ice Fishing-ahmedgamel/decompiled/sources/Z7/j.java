package Z7;

import S7.AbstractC0410y;

/* loaded from: classes2.dex */
public final class j extends i {

    /* renamed from: v, reason: collision with root package name */
    public final Runnable f4192v;

    public j(Runnable runnable, long j6, N6.i iVar) {
        super(j6, iVar);
        this.f4192v = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f4192v.run();
        } finally {
            this.f4191u.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f4192v;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0410y.j(runnable));
        sb.append(", ");
        sb.append(this.f4190n);
        sb.append(", ");
        sb.append(this.f4191u);
        sb.append(']');
        return sb.toString();
    }
}
