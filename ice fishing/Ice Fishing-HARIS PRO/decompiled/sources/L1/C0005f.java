package L1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: L1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0005f extends M {
    public final C0003d e;

    public C0005f(C0003d c0003d) {
        this.e = c0003d;
    }

    @Override // C1.l
    public final /* bridge */ /* synthetic */ Object g(Object obj) {
        o((Throwable) obj);
        return t1.i.f4388c;
    }

    @Override // L1.O
    public final void o(Throwable th) {
        T n2 = n();
        C0003d c0003d = this.e;
        c0003d.getClass();
        CancellationException n3 = n2.n();
        if (c0003d.u()) {
            v1.d dVar = c0003d.f558d;
            D1.i.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            Q1.g gVar = (Q1.g) dVar;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Q1.g.f944h;
                Object obj = atomicReferenceFieldUpdater.get(gVar);
                Q1.u uVar = Q1.a.f936d;
                if (!D1.i.a(obj, uVar)) {
                    if (!(obj instanceof Throwable)) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(gVar, uVar, n3)) {
                    if (atomicReferenceFieldUpdater.get(gVar) != uVar) {
                        break;
                    }
                }
                return;
            }
        }
        c0003d.n(n3);
        if (c0003d.u()) {
            return;
        }
        c0003d.o();
    }
}
