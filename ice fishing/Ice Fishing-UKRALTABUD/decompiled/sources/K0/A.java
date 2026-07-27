package K0;

import P0.AbstractC0068a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class A extends P0.u {

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f461j = AtomicIntegerFieldUpdater.newUpdater(A.class, "_decision");
    private volatile int _decision;

    @Override // P0.u, K0.a0
    public final void q(Object obj) {
        r(obj);
    }

    @Override // P0.u, K0.a0
    public final void r(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f461j;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                AbstractC0068a.i(o.g.u(this.f903i), AbstractC0046w.h(obj), null);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
