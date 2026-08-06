package A1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class B extends F1.t {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f0e = AtomicIntegerFieldUpdater.newUpdater(B.class, "_decision");
    private volatile int _decision;

    @Override // F1.t, A1.b0
    public final void p(Object obj) {
        q(obj);
    }

    @Override // F1.t, A1.b0
    public final void q(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f0e;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                F1.a.h(R1.d.t(this.f629d), AbstractC0022x.h(obj), null);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
