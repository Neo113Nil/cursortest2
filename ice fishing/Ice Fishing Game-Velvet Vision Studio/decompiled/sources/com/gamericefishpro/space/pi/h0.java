package com.gamericefishpro.space.pi;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends com.gamericefishpro.space.ui.p {
    public static final /* synthetic */ AtomicIntegerFieldUpdater w = AtomicIntegerFieldUpdater.newUpdater(h0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // com.gamericefishpro.space.ui.p, com.gamericefishpro.space.pi.l1
    public final void m(Object obj) throws g0 {
        q(obj);
    }

    @Override // com.gamericefishpro.space.ui.p, com.gamericefishpro.space.pi.l1
    public final void q(Object obj) throws g0 {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = w;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                com.gamericefishpro.space.ui.a.g(com.gamericefishpro.space.uh.f.b(this.v), a0.w(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
