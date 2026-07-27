package O7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public final class D extends T7.s {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2549x = AtomicIntegerFieldUpdater.newUpdater(D.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // T7.s, O7.h0
    public final void k(Object obj) {
        l(obj);
    }

    @Override // T7.s, O7.h0
    public final void l(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f2549x;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                T7.a.h(AbstractC0399y.q(obj), w8.a.f(this.f3164w));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
