package K0;

import P0.AbstractC0068a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: K0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0032h extends T {

    /* renamed from: j, reason: collision with root package name */
    public final C0030f f511j;

    public C0032h(C0030f c0030f) {
        this.f511j = c0030f;
    }

    @Override // D0.l
    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        o((Throwable) obj);
        return t0.g.f2989a;
    }

    @Override // K0.V
    public final void o(Throwable th) {
        a0 n2 = n();
        C0030f c0030f = this.f511j;
        Throwable t2 = c0030f.t(n2);
        if (c0030f.y()) {
            v0.d dVar = c0030f.f508i;
            E0.i.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            P0.h hVar = (P0.h) dVar;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = P0.h.f873m;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                A.j jVar = AbstractC0068a.f863d;
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
        c0030f.q(t2);
        if (c0030f.y()) {
            return;
        }
        c0030f.r();
    }
}
