package com.gamericefishpro.space.f2;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements n0, p {
    public final /* synthetic */ p d;
    public final com.gamericefishpro.space.c3.l e;

    public t(p pVar, com.gamericefishpro.space.c3.l lVar) {
        this.d = pVar;
        this.e = lVar;
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float D(long j) {
        return this.d.D(j);
    }

    @Override // com.gamericefishpro.space.f2.n0
    public final m0 G(int i, int i2, Map map, Function1 function1, Function1 function2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            com.gamericefishpro.space.e2.a.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new s(i, i2, map, function1);
    }

    @Override // com.gamericefishpro.space.c3.c
    public final int J(float f) {
        return this.d.J(f);
    }

    @Override // com.gamericefishpro.space.c3.c
    public final long S(long j) {
        return this.d.S(j);
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float V(long j) {
        return this.d.V(j);
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float b() {
        return this.d.b();
    }

    @Override // com.gamericefishpro.space.c3.c
    public final long b0(float f) {
        return this.d.b0(f);
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float g() {
        return this.d.g();
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float g0(int i) {
        return this.d.g0(i);
    }

    @Override // com.gamericefishpro.space.f2.p
    public final com.gamericefishpro.space.c3.l getLayoutDirection() {
        return this.e;
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float i0(float f) {
        return this.d.i0(f);
    }

    @Override // com.gamericefishpro.space.f2.p
    public final boolean n() {
        return this.d.n();
    }

    @Override // com.gamericefishpro.space.c3.c
    public final long q(float f) {
        return this.d.q(f);
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float r(float f) {
        return this.d.r(f);
    }
}
