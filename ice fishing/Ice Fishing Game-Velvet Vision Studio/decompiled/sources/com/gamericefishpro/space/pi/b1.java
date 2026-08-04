package com.gamericefishpro.space.pi;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends h1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater y = AtomicIntegerFieldUpdater.newUpdater(b1.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;
    public final g1 w;

    public b1(g1 g1Var) {
        this.w = g1Var;
    }

    @Override // com.gamericefishpro.space.pi.h1
    public final boolean k() {
        return true;
    }

    @Override // com.gamericefishpro.space.pi.h1
    public final void l(Throwable th) {
        if (y.compareAndSet(this, 0, 1)) {
            this.w.invoke(th);
        }
    }
}
