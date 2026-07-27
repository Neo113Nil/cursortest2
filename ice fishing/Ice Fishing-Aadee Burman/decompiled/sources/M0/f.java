package M0;

import J0.s;
import T0.t;
import T0.u;
import android.os.Handler;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1790n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g f1791u;

    public /* synthetic */ f(g gVar, int i) {
        this.f1790n = i;
        this.f1791u = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1790n) {
            case 0:
                g.a(this.f1791u);
                return;
            default:
                g gVar = this.f1791u;
                if (gVar.f1804z != 0) {
                    s.d().a(g.f1792F, "Already started work for " + gVar.f1800v);
                    return;
                }
                gVar.f1804z = 1;
                s.d().a(g.f1792F, "onAllConstraintsMet for " + gVar.f1800v);
                if (!gVar.f1801w.f1817w.h(gVar.f1797E, null)) {
                    gVar.b();
                    return;
                }
                u uVar = gVar.f1801w.f1816v;
                S0.j jVar = gVar.f1800v;
                synchronized (uVar.f3074d) {
                    s.d().a(u.f3070e, "Starting timer for " + jVar);
                    uVar.a(jVar);
                    t tVar = new t(uVar, jVar);
                    uVar.f3072b.put(jVar, tVar);
                    uVar.f3073c.put(jVar, gVar);
                    ((Handler) uVar.f3071a.f37627u).postDelayed(tVar, 600000L);
                }
                return;
        }
    }
}
