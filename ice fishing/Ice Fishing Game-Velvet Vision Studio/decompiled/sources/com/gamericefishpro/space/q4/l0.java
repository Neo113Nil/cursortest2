package com.gamericefishpro.space.q4;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements t0 {
    public final a a;
    public final z0 b;
    public final l c;

    public l0(z0 z0Var, l lVar, a aVar) {
        this.b = z0Var;
        lVar.getClass();
        this.c = lVar;
        this.a = aVar;
    }

    @Override // com.gamericefishpro.space.q4.t0
    public final void a(Object obj, Object obj2) {
        u0.k(this.b, obj, obj2);
    }

    @Override // com.gamericefishpro.space.q4.t0
    public final boolean b(s sVar, s sVar2) {
        this.b.getClass();
        return sVar.unknownFields.equals(sVar2.unknownFields);
    }

    @Override // com.gamericefishpro.space.q4.t0
    public final void c(Object obj) {
        this.b.getClass();
        y0 y0Var = ((s) obj).unknownFields;
        if (y0Var.e) {
            y0Var.e = false;
        }
        this.c.getClass();
        com.gamericefishpro.space.m5.a.s(obj);
        throw null;
    }

    @Override // com.gamericefishpro.space.q4.t0
    public final int d(s sVar) {
        this.b.getClass();
        y0 y0Var = sVar.unknownFields;
        int i = y0Var.d;
        if (i != -1) {
            return i;
        }
        int iX0 = 0;
        for (int i2 = 0; i2 < y0Var.a; i2++) {
            int i3 = y0Var.b[i2] >>> 3;
            iX0 += i.x0(3, (f) y0Var.c[i2]) + i.A0(i3) + i.z0(2) + (i.z0(1) * 2);
        }
        y0Var.d = iX0;
        return iX0;
    }

    @Override // com.gamericefishpro.space.q4.t0
    public final boolean e(Object obj) {
        this.c.getClass();
        com.gamericefishpro.space.m5.a.s(obj);
        throw null;
    }

    @Override // com.gamericefishpro.space.q4.t0
    public final int f(s sVar) {
        this.b.getClass();
        return sVar.unknownFields.hashCode();
    }

    @Override // com.gamericefishpro.space.q4.t0
    public final void g(Object obj, com.gamericefishpro.space.d4.z zVar, k kVar) {
        this.b.getClass();
        z0.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.gamericefishpro.space.q4.t0
    public final s h() {
        a aVar = this.a;
        return aVar instanceof s ? ((s) aVar).i() : ((q) ((s) aVar).c(5)).b();
    }

    @Override // com.gamericefishpro.space.q4.t0
    public final void i(Object obj, c0 c0Var) {
        this.c.getClass();
        com.gamericefishpro.space.m5.a.s(obj);
        throw null;
    }
}
