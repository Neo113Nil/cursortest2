package S7;

import E2.C0316m;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import z7.InterfaceC5240d;

/* renamed from: S7.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0395i extends a0 {

    /* renamed from: x, reason: collision with root package name */
    public final C0393g f3055x;

    public C0395i(C0393g c0393g) {
        this.f3055x = c0393g;
    }

    @Override // S7.c0
    public final void i(Throwable th) {
        h0 h3 = h();
        C0393g c0393g = this.f3055x;
        Throwable p9 = c0393g.p(h3);
        if (c0393g.v()) {
            InterfaceC5240d interfaceC5240d = c0393g.f3046w;
            kotlin.jvm.internal.h.c(interfaceC5240d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            X7.h hVar = (X7.h) interfaceC5240d;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X7.h.f3788A;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                C0316m c0316m = X7.a.f3778d;
                if (!kotlin.jvm.internal.h.a(obj, c0316m)) {
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
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, c0316m, p9)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != c0316m) {
                        break;
                    }
                }
                return;
            }
        }
        c0393g.m(p9);
        if (c0393g.v()) {
            return;
        }
        c0393g.n();
    }

    @Override // I7.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((Throwable) obj);
        return u7.v.f41073a;
    }
}
