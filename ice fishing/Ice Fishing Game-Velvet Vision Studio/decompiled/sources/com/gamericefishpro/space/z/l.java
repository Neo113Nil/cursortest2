package com.gamericefishpro.space.z;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements x0 {
    public final /* synthetic */ com.gamericefishpro.space.c8.h a;

    public l(com.gamericefishpro.space.c8.h hVar) {
        this.a = hVar;
    }

    @Override // com.gamericefishpro.space.z.x0
    public final float a(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        com.gamericefishpro.space.c8.h hVar = this.a;
        float fFloatValue = ((Number) ((Function1) hVar.a).invoke(Float.valueOf(f))).floatValue();
        ((com.gamericefishpro.space.t0.f1) hVar.e).setValue(Boolean.valueOf(fFloatValue > 0.0f));
        ((com.gamericefishpro.space.t0.f1) hVar.f).setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}
