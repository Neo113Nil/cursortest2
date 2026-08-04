package com.gamericefishpro.space.v8;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends x {
    public final /* synthetic */ f g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(f fVar, int i, Bundle bundle) {
        super(fVar, i, bundle);
        this.g = fVar;
    }

    @Override // com.gamericefishpro.space.v8.x
    public final boolean a() {
        this.g.H.a(com.gamericefishpro.space.s8.b.y);
        return true;
    }

    @Override // com.gamericefishpro.space.v8.x
    public final void b(com.gamericefishpro.space.s8.b bVar) {
        f fVar = this.g;
        fVar.getClass();
        fVar.H.a(bVar);
        fVar.v = bVar.e;
        fVar.w = System.currentTimeMillis();
    }
}
