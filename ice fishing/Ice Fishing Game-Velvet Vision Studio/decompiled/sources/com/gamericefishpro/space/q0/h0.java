package com.gamericefishpro.space.q0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {
    public final com.gamericefishpro.space.k0.d a;
    public final com.gamericefishpro.space.k0.d b;
    public final com.gamericefishpro.space.k0.d c;
    public final com.gamericefishpro.space.k0.d d;
    public final com.gamericefishpro.space.k0.d e;
    public final com.gamericefishpro.space.k0.d f;
    public final com.gamericefishpro.space.k0.d g;
    public final com.gamericefishpro.space.k0.d h;

    public h0() {
        com.gamericefishpro.space.k0.d dVar = g0.a;
        com.gamericefishpro.space.k0.d dVar2 = g0.b;
        com.gamericefishpro.space.k0.d dVar3 = g0.c;
        com.gamericefishpro.space.k0.d dVar4 = g0.d;
        com.gamericefishpro.space.k0.d dVar5 = g0.f;
        com.gamericefishpro.space.k0.d dVar6 = g0.e;
        com.gamericefishpro.space.k0.d dVar7 = g0.g;
        com.gamericefishpro.space.k0.d dVar8 = g0.h;
        this.a = dVar;
        this.b = dVar2;
        this.c = dVar3;
        this.d = dVar4;
        this.e = dVar5;
        this.f = dVar6;
        this.g = dVar7;
        this.h = dVar8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return Intrinsics.a(this.a, h0Var.a) && Intrinsics.a(this.b, h0Var.b) && Intrinsics.a(this.c, h0Var.c) && Intrinsics.a(this.d, h0Var.d) && Intrinsics.a(this.e, h0Var.e) && Intrinsics.a(this.f, h0Var.f) && Intrinsics.a(this.g, h0Var.g) && Intrinsics.a(this.h, h0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", largeIncreased=" + this.f + ", extraLarge=" + this.e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.h + ')';
    }
}
