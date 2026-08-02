package T0;

import java.util.Set;

/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: w, reason: collision with root package name */
    public static final String f3131w = J0.r.f("StopWorkRunnable");

    /* renamed from: n, reason: collision with root package name */
    public final K0.p f3132n;

    /* renamed from: u, reason: collision with root package name */
    public final K0.j f3133u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f3134v;

    public m(K0.p pVar, K0.j jVar, boolean z6) {
        this.f3132n = pVar;
        this.f3133u = jVar;
        this.f3134v = z6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean c9;
        K0.q qVar;
        if (this.f3134v) {
            K0.f fVar = this.f3132n.f1646f;
            K0.j jVar = this.f3133u;
            fVar.getClass();
            String str = jVar.f1626a.f2921a;
            synchronized (fVar.f1615E) {
                try {
                    J0.r.d().a(K0.f.f1610F, "Processor stopping foreground work " + str);
                    qVar = (K0.q) fVar.f1621y.remove(str);
                    if (qVar != null) {
                        fVar.f1611A.remove(str);
                    }
                } finally {
                }
            }
            c9 = K0.f.c(str, qVar);
        } else {
            K0.f fVar2 = this.f3132n.f1646f;
            K0.j jVar2 = this.f3133u;
            fVar2.getClass();
            String str2 = jVar2.f1626a.f2921a;
            synchronized (fVar2.f1615E) {
                try {
                    K0.q qVar2 = (K0.q) fVar2.f1622z.remove(str2);
                    if (qVar2 == null) {
                        J0.r.d().a(K0.f.f1610F, "WorkerWrapper could not be found for " + str2);
                    } else {
                        Set set = (Set) fVar2.f1611A.get(str2);
                        if (set != null && set.contains(jVar2)) {
                            J0.r.d().a(K0.f.f1610F, "Processor stopping background work " + str2);
                            fVar2.f1611A.remove(str2);
                            c9 = K0.f.c(str2, qVar2);
                        }
                    }
                    c9 = false;
                } finally {
                }
            }
        }
        J0.r.d().a(f3131w, "StopWorkRunnable for " + this.f3133u.f1626a.f2921a + "; Processor.stopWork = " + c9);
    }
}
