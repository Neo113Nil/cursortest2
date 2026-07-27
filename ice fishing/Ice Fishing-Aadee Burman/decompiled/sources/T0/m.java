package T0;

import java.util.Set;

/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: w, reason: collision with root package name */
    public static final String f3048w = J0.s.f("StopWorkRunnable");

    /* renamed from: n, reason: collision with root package name */
    public final K0.p f3049n;

    /* renamed from: u, reason: collision with root package name */
    public final K0.j f3050u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f3051v;

    public m(K0.p pVar, K0.j jVar, boolean z3) {
        this.f3049n = pVar;
        this.f3050u = jVar;
        this.f3051v = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean c9;
        K0.q qVar;
        if (this.f3051v) {
            K0.f fVar = this.f3049n.f1537f;
            K0.j jVar = this.f3050u;
            fVar.getClass();
            String str = jVar.f1517a.f2792a;
            synchronized (fVar.f1506E) {
                try {
                    J0.s.d().a(K0.f.f1501F, "Processor stopping foreground work " + str);
                    qVar = (K0.q) fVar.f1512y.remove(str);
                    if (qVar != null) {
                        fVar.f1502A.remove(str);
                    }
                } finally {
                }
            }
            c9 = K0.f.c(str, qVar);
        } else {
            K0.f fVar2 = this.f3049n.f1537f;
            K0.j jVar2 = this.f3050u;
            fVar2.getClass();
            String str2 = jVar2.f1517a.f2792a;
            synchronized (fVar2.f1506E) {
                try {
                    K0.q qVar2 = (K0.q) fVar2.f1513z.remove(str2);
                    if (qVar2 == null) {
                        J0.s.d().a(K0.f.f1501F, "WorkerWrapper could not be found for " + str2);
                    } else {
                        Set set = (Set) fVar2.f1502A.get(str2);
                        if (set != null && set.contains(jVar2)) {
                            J0.s.d().a(K0.f.f1501F, "Processor stopping background work " + str2);
                            fVar2.f1502A.remove(str2);
                            c9 = K0.f.c(str2, qVar2);
                        }
                    }
                    c9 = false;
                } finally {
                }
            }
        }
        J0.s.d().a(f3048w, "StopWorkRunnable for " + this.f3050u.f1517a.f2792a + "; Processor.stopWork = " + c9);
    }
}
