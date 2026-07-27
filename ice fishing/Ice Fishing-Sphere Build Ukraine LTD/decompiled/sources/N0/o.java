package N0;

import D.M;
import L0.AbstractC0043a;
import L0.AbstractC0064w;
import L0.C0056n;
import L0.S;
import L0.Y;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class o extends AbstractC0043a implements p, f {

    /* renamed from: h, reason: collision with root package name */
    public final b f748h;

    public o(v0.i iVar, b bVar) {
        super(iVar, true);
        this.f748h = bVar;
    }

    @Override // L0.AbstractC0043a
    public final void U(Throwable th, boolean z2) {
        if (this.f748h.f(th, false) || z2) {
            return;
        }
        AbstractC0064w.d(th, this.f645g);
    }

    @Override // L0.AbstractC0043a
    public final void V(Object obj) {
        this.f748h.f(null, false);
    }

    public final void X(M m2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        b bVar = this.f748h;
        bVar.getClass();
        do {
            atomicReferenceFieldUpdater = b.f715o;
            if (atomicReferenceFieldUpdater.compareAndSet(bVar, null, m2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(bVar) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(bVar);
            A.j jVar = d.f735q;
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

    @Override // L0.a0, L0.Q
    public final void a(CancellationException cancellationException) {
        Object E2 = E();
        if (E2 instanceof C0056n) {
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

    @Override // N0.r
    public final Object l(Object obj, v0.d dVar) {
        return this.f748h.l(obj, dVar);
    }

    @Override // N0.r
    public final Object n(Object obj) {
        return this.f748h.n(obj);
    }

    @Override // L0.a0
    public final void t(CancellationException cancellationException) {
        this.f748h.f(cancellationException, true);
        s(cancellationException);
    }
}
