package S7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public final class D extends X7.s {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2913x = AtomicIntegerFieldUpdater.newUpdater(D.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // X7.s, S7.h0
    public final void h(Object obj) {
        k(obj);
    }

    @Override // X7.s, S7.h0
    public final void k(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f2913x;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                X7.a.h(AbstractC0406y.q(obj), A8.b.l(this.f3858w));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
