package L0;

import Q0.AbstractC0068a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t0.C0252g;

/* renamed from: L0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0050h extends T {

    /* renamed from: i, reason: collision with root package name */
    public final C0048f f659i;

    public C0050h(C0048f c0048f) {
        this.f659i = c0048f;
    }

    @Override // D0.l
    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        o((Throwable) obj);
        return C0252g.f2994a;
    }

    @Override // L0.V
    public final void o(Throwable th) {
        a0 n2 = n();
        C0048f c0048f = this.f659i;
        Throwable t2 = c0048f.t(n2);
        if (c0048f.y()) {
            v0.d dVar = c0048f.f656h;
            E0.i.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            Q0.h hVar = (Q0.h) dVar;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Q0.h.f882l;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                A.j jVar = AbstractC0068a.f872d;
                if (!E0.i.a(obj, jVar)) {
                    if (!(obj instanceof Throwable)) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, jVar, t2)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != jVar) {
                        break;
                    }
                }
                return;
            }
        }
        c0048f.q(t2);
        if (c0048f.y()) {
            return;
        }
        c0048f.r();
    }
}
