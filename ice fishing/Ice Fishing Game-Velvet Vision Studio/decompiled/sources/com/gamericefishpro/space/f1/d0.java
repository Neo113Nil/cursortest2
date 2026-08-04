package com.gamericefishpro.space.f1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d0 implements c0 {
    public final com.gamericefishpro.space.b1.a d = new com.gamericefishpro.space.b1.a(0);

    public final boolean e(int i) {
        return (i & this.d.get()) != 0;
    }

    public final void f(int i) {
        com.gamericefishpro.space.b1.a aVar;
        int i2;
        do {
            aVar = this.d;
            i2 = aVar.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!aVar.compareAndSet(i2, i2 | i));
    }
}
