package com.gamericefishpro.space.ri;

import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.e1;
import com.gamericefishpro.space.pi.k1;
import com.gamericefishpro.space.pi.l1;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends com.gamericefishpro.space.pi.a implements q, i {
    public final e v;

    public p(CoroutineContext coroutineContext, e eVar) {
        super(coroutineContext, true);
        this.v = eVar;
    }

    @Override // com.gamericefishpro.space.ri.s
    public final Object a(com.gamericefishpro.space.th.a aVar) {
        return this.v.a(aVar);
    }

    @Override // com.gamericefishpro.space.pi.l1, com.gamericefishpro.space.pi.d1
    public final void c(CancellationException cancellationException) {
        Object obj = l1.d.get(this);
        if (obj instanceof com.gamericefishpro.space.pi.q) {
            return;
        }
        if ((obj instanceof k1) && ((k1) obj).e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new e1(A(), null, this);
        }
        u(cancellationException);
    }

    @Override // com.gamericefishpro.space.ri.t
    public final Object d(com.gamericefishpro.space.th.a aVar, Object obj) {
        return this.v.d(aVar, obj);
    }

    @Override // com.gamericefishpro.space.ri.s
    public final Object e(com.gamericefishpro.space.ti.o oVar) {
        e eVar = this.v;
        eVar.getClass();
        Object objB = e.B(eVar, oVar);
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        return objB;
    }

    @Override // com.gamericefishpro.space.ri.s
    public final Object g() {
        return this.v.g();
    }

    @Override // com.gamericefishpro.space.ri.s
    public final b iterator() {
        e eVar = this.v;
        eVar.getClass();
        return new b(eVar);
    }

    @Override // com.gamericefishpro.space.pi.a
    public final void j0(Throwable th, boolean z) {
        if (this.v.j(th, false) || z) {
            return;
        }
        a0.p(th, this.i);
    }

    @Override // com.gamericefishpro.space.ri.t
    public final Object k(Object obj) {
        return this.v.k(obj);
    }

    @Override // com.gamericefishpro.space.pi.a
    public final void k0(Object obj) {
        y3.q(this.v);
    }

    @Override // com.gamericefishpro.space.pi.l1
    public final void u(CancellationException cancellationException) {
        this.v.j(cancellationException, true);
        s(cancellationException);
    }
}
