package com.gamericefishpro.space.v8;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements d {
    public final /* synthetic */ f a;

    public e(f fVar) {
        Objects.requireNonNull(fVar);
        this.a = fVar;
    }

    @Override // com.gamericefishpro.space.v8.d
    public final void a(com.gamericefishpro.space.s8.b bVar) {
        boolean zC = bVar.c();
        f fVar = this.a;
        if (zC) {
            fVar.e(null, fVar.t());
            return;
        }
        c cVar = fVar.N;
        if (cVar != null) {
            cVar.onConnectionFailed(bVar);
        }
    }
}
