package A1;

import h1.C0239i;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: A1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0007h extends U {

    /* renamed from: e, reason: collision with root package name */
    public final C0005f f50e;

    public C0007h(C0005f c0005f) {
        this.f50e = c0005f;
    }

    @Override // t1.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        k((Throwable) obj);
        return C0239i.f3393a;
    }

    @Override // A1.W
    public final void k(Throwable th) {
        b0 j2 = j();
        C0005f c0005f = this.f50e;
        Throwable s2 = c0005f.s(j2);
        if (c0005f.x()) {
            l1.d dVar = c0005f.f47d;
            kotlin.jvm.internal.i.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            F1.h hVar = (F1.h) dVar;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = F1.h.f602h;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                C.j jVar = F1.a.f592d;
                if (!kotlin.jvm.internal.i.a(obj, jVar)) {
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
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, jVar, s2)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != jVar) {
                        break;
                    }
                }
                return;
            }
        }
        c0005f.p(s2);
        if (c0005f.x()) {
            return;
        }
        c0005f.q();
    }
}
