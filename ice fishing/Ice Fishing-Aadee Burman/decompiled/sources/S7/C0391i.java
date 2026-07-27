package S7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import z7.InterfaceC5267d;

/* renamed from: S7.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0391i extends a0 {

    /* renamed from: x, reason: collision with root package name */
    public final C0389g f2972x;

    public C0391i(C0389g c0389g) {
        this.f2972x = c0389g;
    }

    @Override // S7.c0
    public final void i(Throwable th) {
        h0 h9 = h();
        C0389g c0389g = this.f2972x;
        Throwable p9 = c0389g.p(h9);
        if (c0389g.v()) {
            InterfaceC5267d interfaceC5267d = c0389g.f2963w;
            kotlin.jvm.internal.h.c(interfaceC5267d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            X7.h hVar = (X7.h) interfaceC5267d;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X7.h.f3833A;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                D2.b bVar = X7.a.f3823d;
                if (!kotlin.jvm.internal.h.a(obj, bVar)) {
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
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, bVar, p9)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != bVar) {
                        break;
                    }
                }
                return;
            }
        }
        c0389g.m(p9);
        if (c0389g.v()) {
            return;
        }
        c0389g.n();
    }

    @Override // I7.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((Throwable) obj);
        return u7.v.f41350a;
    }
}
