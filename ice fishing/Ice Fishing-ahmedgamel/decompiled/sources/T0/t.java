package T0;

/* loaded from: classes.dex */
public final class t implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final u f3151n;

    /* renamed from: u, reason: collision with root package name */
    public final S0.j f3152u;

    public t(u uVar, S0.j jVar) {
        this.f3151n = uVar;
        this.f3152u = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f3151n.f3157d) {
            try {
                if (((t) this.f3151n.f3155b.remove(this.f3152u)) != null) {
                    s sVar = (s) this.f3151n.f3156c.remove(this.f3152u);
                    if (sVar != null) {
                        S0.j jVar = this.f3152u;
                        M0.g gVar = (M0.g) sVar;
                        J0.r.d().a(M0.g.f1825F, "Exceeded time limits on execution for " + jVar);
                        gVar.f1826A.execute(new M0.f(gVar, 0));
                    }
                } else {
                    J0.r.d().a("WrkTimerRunnable", "Timer with " + this.f3152u + " is already marked as complete.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
