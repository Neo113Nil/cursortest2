package L0;

import Q0.AbstractC0068a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class A extends Q0.u {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f609i = AtomicIntegerFieldUpdater.newUpdater(A.class, "_decision");
    private volatile int _decision;

    @Override // Q0.u, L0.a0
    public final void q(Object obj) {
        r(obj);
    }

    @Override // Q0.u, L0.a0
    public final void r(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f609i;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                AbstractC0068a.i(o.g.r(this.f912h), AbstractC0064w.h(obj), null);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
