package com.gamericefishpro.space.i6;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends p {
    public final /* synthetic */ com.gamericefishpro.space.t.e a;
    public final /* synthetic */ r b;

    public q(r rVar, com.gamericefishpro.space.t.e eVar) {
        this.b = rVar;
        this.a = eVar;
    }

    @Override // com.gamericefishpro.space.i6.p, com.gamericefishpro.space.i6.m
    public final void d(o oVar) {
        ((ArrayList) this.a.get(this.b.e)).remove(oVar);
        oVar.z(this);
    }
}
