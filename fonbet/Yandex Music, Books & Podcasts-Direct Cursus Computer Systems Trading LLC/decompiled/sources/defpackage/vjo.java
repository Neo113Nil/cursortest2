package defpackage;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class vjo extends a6 {
    public final em5 d;

    public vjo(CoroutineContext coroutineContext, em5 em5Var) {
        super(coroutineContext, false, true);
        this.d = em5Var;
    }

    @Override // defpackage.a6
    public final void m0(Throwable th, boolean z) {
        try {
            if (this.d.b(th)) {
                return;
            }
        } catch (Throwable th2) {
            fob.a(th, th2);
        }
        q5g.E(th, this.c);
    }

    @Override // defpackage.a6
    public final void n0(Object obj) {
        ka8 ka8Var;
        try {
            em5 em5Var = this.d;
            Object obj2 = em5Var.get();
            ra8 ra8Var = ra8.a;
            if (obj2 == ra8Var || (ka8Var = (ka8) em5Var.getAndSet(ra8Var)) == ra8Var) {
                return;
            }
            try {
                em5Var.a.onComplete();
            } finally {
                if (ka8Var != null) {
                    ka8Var.a();
                }
            }
        } catch (Throwable th) {
            q5g.E(th, this.c);
        }
    }
}
