package com.gamericefishpro.space.g0;

import com.gamericefishpro.space.f2.t0;
import com.gamericefishpro.space.f2.u0;
import com.gamericefishpro.space.h0.e0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements e0 {
    public final int a;
    public final Object b;
    public final int c;
    public final com.gamericefishpro.space.c3.l d;
    public final List e;
    public final long f;
    public final Object g;
    public final com.gamericefishpro.space.h0.w h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public int m = Integer.MIN_VALUE;
    public final long n;
    public long o;
    public int p;
    public int q;
    public boolean r;

    public m(int i, Object obj, int i2, int i3, com.gamericefishpro.space.c3.l lVar, int i4, int i5, List list, long j, Object obj2, com.gamericefishpro.space.h0.w wVar, long j2, int i6, int i7) {
        this.a = i;
        this.b = obj;
        this.c = i2;
        this.d = lVar;
        this.e = list;
        this.f = j;
        this.g = obj2;
        this.h = wVar;
        this.i = i6;
        this.j = i7;
        int size = list.size();
        int iMax = 0;
        for (int i8 = 0; i8 < size; i8++) {
            iMax = Math.max(iMax, ((u0) list.get(i8)).e);
        }
        this.k = iMax;
        int i9 = i3 + iMax;
        this.l = i9 >= 0 ? i9 : 0;
        this.n = (((long) this.c) << 32) | (((long) iMax) & 4294967295L);
        this.o = 0L;
        this.p = -1;
        this.q = -1;
    }

    @Override // com.gamericefishpro.space.h0.e0
    public final boolean a() {
        return true;
    }

    @Override // com.gamericefishpro.space.h0.e0
    public final int b() {
        return this.e.size();
    }

    @Override // com.gamericefishpro.space.h0.e0
    public final void c() {
        this.r = true;
    }

    @Override // com.gamericefishpro.space.h0.e0
    public final void d(int i, int i2, int i3) {
        k(i, 0, i2, i3, -1, -1);
    }

    @Override // com.gamericefishpro.space.h0.e0
    public final int e() {
        return this.l;
    }

    @Override // com.gamericefishpro.space.h0.e0
    public final long f(int i) {
        return this.o;
    }

    @Override // com.gamericefishpro.space.h0.e0
    public final int g() {
        return this.j;
    }

    @Override // com.gamericefishpro.space.h0.e0
    public final int getIndex() {
        return this.a;
    }

    @Override // com.gamericefishpro.space.h0.e0
    public final Object getKey() {
        return this.b;
    }

    @Override // com.gamericefishpro.space.h0.e0
    public final Object h(int i) {
        return ((u0) this.e.get(i)).i();
    }

    @Override // com.gamericefishpro.space.h0.e0
    public final int i() {
        return this.i;
    }

    public final void j(t0 t0Var) {
        if (this.m == Integer.MIN_VALUE) {
            com.gamericefishpro.space.c0.a.a("position() should be called first");
        }
        List list = this.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            u0 u0Var = (u0) list.get(i);
            int i2 = u0Var.e;
            long j = this.o;
            this.h.a(i, this.b);
            t0.t(t0Var, u0Var, com.gamericefishpro.space.c3.i.c(j, this.f));
        }
    }

    public final void k(int i, int i2, int i3, int i4, int i5, int i6) {
        this.m = i4;
        if (this.d == com.gamericefishpro.space.c3.l.e) {
            i2 = (i3 - i2) - this.c;
        }
        this.o = (((long) i2) << 32) | (((long) i) & 4294967295L);
        this.p = i5;
        this.q = i6;
    }
}
