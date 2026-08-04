package com.gamericefishpro.space.ka;

import com.gamericefishpro.space.i9.a4;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends a4 {
    @Override // com.gamericefishpro.space.i9.a4
    public final void B(x xVar, float f, float f2) {
        float f3 = f2 * f;
        xVar.d(f3, 180.0f, 90.0f);
        float f4 = f3 * 2.0f;
        t tVar = new t(0.0f, 0.0f, f4, f4);
        tVar.f = 180.0f;
        tVar.g = 90.0f;
        xVar.f.add(tVar);
        r rVar = new r(tVar);
        xVar.a(180.0f);
        xVar.g.add(rVar);
        xVar.d = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        double d = 270.0f;
        xVar.b = (((float) Math.cos(Math.toRadians(d))) * f6) + f5;
        xVar.c = (f6 * ((float) Math.sin(Math.toRadians(d)))) + f5;
    }
}
