package T0;

/* loaded from: classes.dex */
public final class t implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final u f3068n;

    /* renamed from: u, reason: collision with root package name */
    public final S0.j f3069u;

    public t(u uVar, S0.j jVar) {
        this.f3068n = uVar;
        this.f3069u = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f3068n.f3074d) {
            try {
                if (((t) this.f3068n.f3072b.remove(this.f3069u)) != null) {
                    s sVar = (s) this.f3068n.f3073c.remove(this.f3069u);
                    if (sVar != null) {
                        S0.j jVar = this.f3069u;
                        M0.g gVar = (M0.g) sVar;
                        J0.s.d().a(M0.g.f1792F, "Exceeded time limits on execution for " + jVar);
                        gVar.f1793A.execute(new M0.f(gVar, 0));
                    }
                } else {
                    J0.s.d().a("WrkTimerRunnable", "Timer with " + this.f3069u + " is already marked as complete.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
