package y4;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class u implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final v f8780g;

    /* renamed from: h, reason: collision with root package name */
    public final x4.j f8781h;

    public u(v vVar, x4.j jVar) {
        this.f8780g = vVar;
        this.f8781h = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f8780g.f8786d) {
            try {
                if (((u) this.f8780g.f8784b.remove(this.f8781h)) != null) {
                    t tVar = (t) this.f8780g.f8785c.remove(this.f8781h);
                    if (tVar != null) {
                        x4.j jVar = this.f8781h;
                        r4.g gVar = (r4.g) tVar;
                        o4.o.d().a(r4.g.f6060s, "Exceeded time limits on execution for " + jVar);
                        gVar.f6068n.execute(new r4.f(gVar, 0));
                    }
                } else {
                    o4.o.d().a("WrkTimerRunnable", "Timer with " + this.f8781h + " is already marked as complete.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
