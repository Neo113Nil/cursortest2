package com.gamericefishpro.space.i2;

import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements z1 {
    public final ViewConfiguration a;

    public p0(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // com.gamericefishpro.space.i2.z1
    public final float a() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // com.gamericefishpro.space.i2.z1
    public final float b() {
        return this.a.getScaledTouchSlop();
    }
}
