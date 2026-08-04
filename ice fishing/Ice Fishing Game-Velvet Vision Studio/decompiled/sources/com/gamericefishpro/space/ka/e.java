package com.gamericefishpro.space.ka;

import com.gamericefishpro.space.i9.a4;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends a4 {
    @Override // com.gamericefishpro.space.i9.a4
    public final void B(x xVar, float f, float f2) {
        float f3 = f2 * f;
        xVar.d(f3, 180.0f, 90.0f);
        double d = f3;
        xVar.c((float) (Math.sin(Math.toRadians(90.0f)) * d), (float) (Math.sin(Math.toRadians(0.0f)) * d));
    }
}
