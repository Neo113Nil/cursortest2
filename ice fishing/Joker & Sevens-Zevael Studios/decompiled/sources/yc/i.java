package yc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i extends d1 {

    /* renamed from: k, reason: collision with root package name */
    public final g f8858k;

    public i(g gVar) {
        this.f8858k = gVar;
    }

    @Override // yc.z0
    public final void d(Throwable th) {
        k1 k3 = k();
        g gVar = this.f8858k;
        Throwable o7 = gVar.o(k3);
        if (gVar.v()) {
            fc.d dVar = gVar.f8848j;
            pc.j.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            dd.h hVar = (dd.h) dVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = dd.h.f1854n;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                dd.w wVar = dd.a.f1842d;
                if (!pc.j.a(obj, wVar)) {
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
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, wVar, o7)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != wVar) {
                        break;
                    }
                }
                return;
            }
        }
        gVar.n(o7);
        if (gVar.v()) {
            return;
        }
        gVar.l();
    }
}
