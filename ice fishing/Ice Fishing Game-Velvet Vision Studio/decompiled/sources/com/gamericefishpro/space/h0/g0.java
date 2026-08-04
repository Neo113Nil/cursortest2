package com.gamericefishpro.space.h0;

import com.gamericefishpro.space.t0.s2;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements s2 {
    public final int d;
    public final int e;
    public final com.gamericefishpro.space.t0.f1 i;
    public int v;

    public g0(int i, int i2, int i3) {
        this.d = i2;
        this.e = i3;
        int i4 = (i / i2) * i2;
        this.i = new com.gamericefishpro.space.t0.f1(com.gamericefishpro.space.ji.f.f(Math.max(i4 - i3, 0), i4 + i2 + i3), com.gamericefishpro.space.t0.f.z);
        this.v = i;
    }

    public final void b(int i) {
        if (i != this.v) {
            this.v = i;
            int i2 = this.d;
            int i3 = (i / i2) * i2;
            int i4 = this.e;
            this.i.setValue(com.gamericefishpro.space.ji.f.f(Math.max(i3 - i4, 0), i3 + i2 + i4));
        }
    }

    @Override // com.gamericefishpro.space.t0.s2
    public final Object getValue() {
        return (IntRange) this.i.getValue();
    }
}
