package com.gamericefishpro.space.h2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {
    public com.gamericefishpro.space.h1.l a;
    public int b;
    public com.gamericefishpro.space.v0.e c;
    public com.gamericefishpro.space.v0.e d;
    public boolean e;
    public final /* synthetic */ a1 f;

    public y0(a1 a1Var, com.gamericefishpro.space.h1.l lVar, int i, com.gamericefishpro.space.v0.e eVar, com.gamericefishpro.space.v0.e eVar2, boolean z) {
        this.f = a1Var;
        this.a = lVar;
        this.b = i;
        this.c = eVar;
        this.d = eVar2;
        this.e = z;
    }

    public final boolean a(int i, int i2) {
        com.gamericefishpro.space.v0.e eVar = this.c;
        int i3 = this.b;
        com.gamericefishpro.space.h1.k kVar = (com.gamericefishpro.space.h1.k) eVar.d[i + i3];
        com.gamericefishpro.space.h1.k kVar2 = (com.gamericefishpro.space.h1.k) this.d.d[i3 + i2];
        return Intrinsics.a(kVar, kVar2) || kVar.getClass() == kVar2.getClass();
    }
}
