package M0;

import J0.r;
import T0.t;
import T0.u;
import android.os.Handler;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1823n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g f1824u;

    public /* synthetic */ f(g gVar, int i) {
        this.f1823n = i;
        this.f1824u = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1823n) {
            case 0:
                g.a(this.f1824u);
                return;
            default:
                g gVar = this.f1824u;
                if (gVar.f1837z != 0) {
                    r.d().a(g.f1825F, "Already started work for " + gVar.f1833v);
                    return;
                }
                gVar.f1837z = 1;
                r.d().a(g.f1825F, "onAllConstraintsMet for " + gVar.f1833v);
                if (!gVar.f1834w.f1850w.h(gVar.f1830E, null)) {
                    gVar.b();
                    return;
                }
                u uVar = gVar.f1834w.f1849v;
                S0.j jVar = gVar.f1833v;
                synchronized (uVar.f3157d) {
                    r.d().a(u.f3153e, "Starting timer for " + jVar);
                    uVar.a(jVar);
                    t tVar = new t(uVar, jVar);
                    uVar.f3155b.put(jVar, tVar);
                    uVar.f3156c.put(jVar, gVar);
                    ((Handler) uVar.f3154a.f38154u).postDelayed(tVar, 600000L);
                }
                return;
        }
    }
}
