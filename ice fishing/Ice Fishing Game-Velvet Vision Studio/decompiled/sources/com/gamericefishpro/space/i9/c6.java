package com.gamericefishpro.space.i9;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c6 implements i6 {
    public final p4 a;
    public final e5 b;

    public c6(e5 e5Var, p4 p4Var) {
        e5 e5Var2 = a5.a;
        this.b = e5Var;
        this.a = p4Var;
    }

    @Override // com.gamericefishpro.space.i9.i6
    public final g5 a() {
        p4 p4Var = this.a;
        return p4Var instanceof g5 ? (g5) ((g5) p4Var).o(4) : ((f5) ((g5) p4Var).o(5)).d();
    }

    @Override // com.gamericefishpro.space.i9.i6
    public final void b(Object obj) {
        this.b.getClass();
        o6 o6Var = ((g5) obj).zzc;
        if (o6Var.e) {
            o6Var.e = false;
        }
        e5 e5Var = a5.a;
        throw com.gamericefishpro.space.t0.y0.e(obj);
    }

    @Override // com.gamericefishpro.space.i9.i6
    public final boolean c(g5 g5Var, g5 g5Var2) {
        return g5Var.zzc.equals(g5Var2.zzc);
    }

    @Override // com.gamericefishpro.space.i9.i6
    public final void d(Object obj, Object obj2) {
        j6.b(obj, obj2);
    }

    @Override // com.gamericefishpro.space.i9.i6
    public final void e(Object obj, v5 v5Var) {
        throw com.gamericefishpro.space.t0.y0.e(obj);
    }

    @Override // com.gamericefishpro.space.i9.i6
    public final void f(Object obj, byte[] bArr, int i, int i2, s4 s4Var) {
        g5 g5Var = (g5) obj;
        if (g5Var.zzc == o6.f) {
            g5Var.zzc = o6.a();
        }
        throw com.gamericefishpro.space.t0.y0.e(obj);
    }

    @Override // com.gamericefishpro.space.i9.i6
    public final int g(g5 g5Var) {
        return g5Var.zzc.hashCode();
    }

    @Override // com.gamericefishpro.space.i9.i6
    public final int h(p4 p4Var) {
        o6 o6Var = ((g5) p4Var).zzc;
        int i = o6Var.d;
        if (i != -1) {
            return i;
        }
        int iC = 0;
        for (int i2 = 0; i2 < o6Var.a; i2++) {
            int i3 = o6Var.b[i2] >>> 3;
            w4 w4Var = (w4) o6Var.c[i2];
            int iG0 = x4.g0(8);
            int iG1 = x4.g0(i3) + x4.g0(16);
            int iG2 = x4.g0(24);
            int iD = w4Var.d();
            iC += iG0 + iG0 + iG1 + com.gamericefishpro.space.m5.a.c(iD, iD, iG2);
        }
        o6Var.d = iC;
        return iC;
    }

    @Override // com.gamericefishpro.space.i9.i6
    public final boolean i(Object obj) {
        throw com.gamericefishpro.space.t0.y0.e(obj);
    }
}
