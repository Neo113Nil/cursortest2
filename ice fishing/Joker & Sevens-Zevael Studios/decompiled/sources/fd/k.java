package fd;

import yc.a0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k extends i {

    /* renamed from: i, reason: collision with root package name */
    public final Runnable f2385i;

    public k(Runnable runnable, long j3, j jVar) {
        super(j3, jVar);
        this.f2385i = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f2385i.run();
        } finally {
            this.f2383h.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f2385i;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(a0.j(runnable));
        sb.append(", ");
        sb.append(this.f2382g);
        sb.append(", ");
        sb.append(this.f2383h);
        sb.append(']');
        return sb.toString();
    }
}
