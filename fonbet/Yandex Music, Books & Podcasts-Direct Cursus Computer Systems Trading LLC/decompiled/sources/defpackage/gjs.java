package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class gjs implements mm6 {
    public final /* synthetic */ mm6 a;
    public final AtomicReference b = new AtomicReference(null);
    public final /* synthetic */ e7o c;
    public final /* synthetic */ mm6 d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ AtomicReference f;

    public gjs(mm6 mm6Var, e7o e7oVar, mm6 mm6Var2, Function2 function2, AtomicReference atomicReference) {
        this.c = e7oVar;
        this.d = mm6Var2;
        this.e = function2;
        this.f = atomicReference;
        this.a = mm6Var;
    }

    public final long a() {
        Long l = (Long) this.b.get();
        if (l == null) {
            nsa.b.getClass();
            return nsa.c;
        }
        long longValue = l.longValue();
        this.c.getClass();
        long currentTimeMillis = longValue - System.currentTimeMillis();
        msa msaVar = nsa.b;
        return yd5.N(currentTimeMillis, ssa.MILLISECONDS);
    }

    public final void b(long j) {
        if (nsa.f(j) <= 0) {
            gld.L(this.d, new xis("Timed out immediately", this.e.hashCode()));
            return;
        }
        if (nsa.c(a(), j) < 0) {
            return;
        }
        this.c.getClass();
        this.b.set(Long.valueOf(nsa.f(j) + System.currentTimeMillis()));
        e7o e7oVar = this.c;
        mm6 mm6Var = this.d;
        r2f r2fVar = (r2f) this.f.getAndSet(x97.y(mm6Var, null, null, new lco(this, e7oVar, mm6Var, this.e, (Continuation) null, 19), 3));
        if (r2fVar != null) {
            r2fVar.g(null);
        }
    }

    @Override // defpackage.mm6
    public final CoroutineContext getCoroutineContext() {
        return this.a.getCoroutineContext();
    }
}
