package com.gamericefishpro.space.u8;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements com.gamericefishpro.space.v8.d {
    public final com.gamericefishpro.space.t8.a a;
    public final a b;
    public com.gamericefishpro.space.v8.j c = null;
    public Set d = null;
    public boolean e = false;
    public final /* synthetic */ d f;

    public c0(d dVar, com.gamericefishpro.space.t8.a aVar, a aVar2) {
        this.f = dVar;
        this.a = aVar;
        this.b = aVar2;
    }

    @Override // com.gamericefishpro.space.v8.d
    public final void a(com.gamericefishpro.space.s8.b bVar) {
        this.f.F.post(new com.gamericefishpro.space.r9.l(4, this, bVar));
    }

    public final void b(com.gamericefishpro.space.s8.b bVar) {
        a0 a0Var = (a0) this.f.C.get(this.b);
        if (a0Var != null) {
            a0Var.m(bVar);
        }
    }
}
