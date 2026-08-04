package com.gamericefishpro.space.d4;

import android.view.WindowInsetsAnimation;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends w0 {
    public final WindowInsetsAnimation e;

    public v0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    @Override // com.gamericefishpro.space.d4.w0
    public final float a() {
        return this.e.getAlpha();
    }

    @Override // com.gamericefishpro.space.d4.w0
    public final long b() {
        return this.e.getDurationMillis();
    }

    @Override // com.gamericefishpro.space.d4.w0
    public final float c() {
        return this.e.getInterpolatedFraction();
    }

    @Override // com.gamericefishpro.space.d4.w0
    public final int d() {
        return this.e.getTypeMask();
    }

    @Override // com.gamericefishpro.space.d4.w0
    public final void e(float f) {
        this.e.setFraction(f);
    }
}
