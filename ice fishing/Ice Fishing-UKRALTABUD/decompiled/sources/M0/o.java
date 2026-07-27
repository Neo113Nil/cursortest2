package M0;

import D.M;
import K0.AbstractC0025a;
import K0.AbstractC0046w;
import K0.C0038n;
import K0.S;
import K0.Y;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class o extends AbstractC0025a implements p, f {

    /* renamed from: i, reason: collision with root package name */
    public final b f740i;

    public o(v0.i iVar, b bVar) {
        super(iVar, true);
        this.f740i = bVar;
    }

    @Override // K0.AbstractC0025a
    public final void U(Throwable th, boolean z2) {
        if (this.f740i.f(th, false) || z2) {
            return;
        }
        AbstractC0046w.d(th, this.f497h);
    }

    @Override // K0.AbstractC0025a
    public final void V(Object obj) {
        this.f740i.f(null, false);
    }

    public final void X(M m2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        b bVar = this.f740i;
        bVar.getClass();
        do {
            atomicReferenceFieldUpdater = b.f707p;
            if (atomicReferenceFieldUpdater.compareAndSet(bVar, null, m2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(bVar) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(bVar);
            A.j jVar = d.f727q;
            if (obj != jVar) {
                if (obj == d.r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            A.j jVar2 = d.r;
            while (!atomicReferenceFieldUpdater.compareAndSet(bVar, jVar, jVar2)) {
                if (atomicReferenceFieldUpdater.get(bVar) != jVar) {
                    break;
                }
            }
            m2.i(bVar.k());
            return;
        }
    }

    @Override // K0.a0, K0.Q
    public final void a(CancellationException cancellationException) {
        Object E2 = E();
        if (E2 instanceof C0038n) {
            return;
        }
        if ((E2 instanceof Y) && ((Y) E2).e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new S(v(), null, this);
        }
        t(cancellationException);
    }

    @Override // M0.r
    public final Object l(Object obj, v0.d dVar) {
        return this.f740i.l(obj, dVar);
    }

    @Override // M0.r
    public final Object n(Object obj) {
        return this.f740i.n(obj);
    }

    @Override // K0.a0
    public final void t(CancellationException cancellationException) {
        this.f740i.f(cancellationException, true);
        s(cancellationException);
    }
}
