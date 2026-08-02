package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public abstract class y98 extends g8s {
    public int c;

    public y98(int i) {
        super(0L, false);
        this.c = i;
    }

    public abstract Continuation c();

    public Throwable e(Object obj) {
        sm5 sm5Var = obj instanceof sm5 ? (sm5) obj : null;
        if (sm5Var != null) {
            return sm5Var.a;
        }
        return null;
    }

    public final void g(Throwable th) {
        cxb.V(new tm6("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), c().getContext());
    }

    public abstract Object i();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        r4 = (defpackage.r2f) r5.get(defpackage.o6c.l);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Throwable] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        try {
            Continuation c = c();
            c.getClass();
            v98 v98Var = (v98) c;
            cg6 cg6Var = v98Var.e;
            Object obj = v98Var.g;
            CoroutineContext context = cg6Var.getContext();
            Object c2 = nfs.c(context, obj);
            r2f r2fVar = null;
            kit c3 = c2 != nfs.a ? bm6.c(cg6Var, context, c2) : null;
            try {
                CoroutineContext context2 = cg6Var.getContext();
                Object i = i();
                Throwable e = e(i);
                if (e == null) {
                    int i2 = this.c;
                    boolean z = true;
                    if (i2 != 1 && i2 != 2) {
                        z = false;
                    }
                }
                if (r2fVar != null && !r2fVar.b()) {
                    CancellationException D = r2fVar.D();
                    b(D);
                    r7o r7oVar = z7o.b;
                    CancellationException cancellationException = D;
                    if (ve7.b()) {
                        cancellationException = dar.a(D, cg6Var);
                    }
                    cg6Var.resumeWith(qgg.J(cancellationException));
                } else if (e != null) {
                    r7o r7oVar2 = z7o.b;
                    cg6Var.resumeWith(new t7o(e));
                } else {
                    r7o r7oVar3 = z7o.b;
                    cg6Var.resumeWith(f(i));
                }
                if (c3 == null || c3.q0()) {
                    nfs.a(context, c2);
                }
            } catch (Throwable th) {
                if (c3 == null || c3.q0()) {
                    nfs.a(context, c2);
                }
                throw th;
            }
        } catch (t98 e2) {
            cxb.V(e2.a, c().getContext());
        } catch (Throwable th2) {
            g(th2);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object f(Object obj) {
        return obj;
    }
}
