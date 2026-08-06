package C1;

import A1.AbstractC0000a;
import A1.AbstractC0022x;
import A1.C0013n;
import A1.T;
import A1.Z;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class q extends AbstractC0000a implements r, g {

    /* renamed from: d, reason: collision with root package name */
    public final c f195d;

    public q(l1.i iVar, c cVar) {
        super(iVar, true);
        this.f195d = cVar;
    }

    @Override // A1.AbstractC0000a
    public final void T(Throwable th, boolean z2) {
        if (this.f195d.f(th, false) || z2) {
            return;
        }
        AbstractC0022x.d(th, this.f32c);
    }

    @Override // A1.AbstractC0000a
    public final void U(Object obj) {
        this.f195d.f(null, false);
    }

    public final void W(p pVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c cVar = this.f195d;
        cVar.getClass();
        do {
            atomicReferenceFieldUpdater = c.f158k;
            if (atomicReferenceFieldUpdater.compareAndSet(cVar, null, pVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(cVar) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(cVar);
            C.j jVar = e.f178q;
            if (obj != jVar) {
                if (obj == e.f179r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            C.j jVar2 = e.f179r;
            while (!atomicReferenceFieldUpdater.compareAndSet(cVar, jVar, jVar2)) {
                if (atomicReferenceFieldUpdater.get(cVar) != jVar) {
                    break;
                }
            }
            pVar.invoke(cVar.m());
            return;
        }
    }

    @Override // A1.b0, A1.S
    public final void a(CancellationException cancellationException) {
        Object D2 = D();
        if (D2 instanceof C0013n) {
            return;
        }
        if ((D2 instanceof Z) && ((Z) D2).e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new T(u(), null, this);
        }
        s(cancellationException);
    }

    @Override // C1.t
    public final Object g(Object obj) {
        return this.f195d.g(obj);
    }

    @Override // C1.t
    public final Object j(Object obj, l1.d dVar) {
        return this.f195d.j(obj, dVar);
    }

    @Override // A1.b0
    public final void s(CancellationException cancellationException) {
        this.f195d.f(cancellationException, true);
        r(cancellationException);
    }
}
