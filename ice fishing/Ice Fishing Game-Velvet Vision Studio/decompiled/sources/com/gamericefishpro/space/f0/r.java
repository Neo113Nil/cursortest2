package com.gamericefishpro.space.f0;

import com.gamericefishpro.space.f2.t0;
import com.gamericefishpro.space.f2.u0;
import com.gamericefishpro.space.h0.e0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements e0 {
    public final int a;
    public final List b;
    public final com.gamericefishpro.space.h1.c c;
    public final com.gamericefishpro.space.c3.l d;
    public final int e;
    public final long f;
    public final Object g;
    public final Object h;
    public final com.gamericefishpro.space.h0.w i;
    public int j;
    public final int k;
    public final int l;
    public final int m;
    public boolean n;
    public int o = Integer.MIN_VALUE;
    public final int[] p;

    public r(int i, List list, com.gamericefishpro.space.h1.c cVar, com.gamericefishpro.space.c3.l lVar, int i2, int i3, int i4, long j, Object obj, Object obj2, com.gamericefishpro.space.h0.w wVar, long j2) {
        this.a = i;
        this.b = list;
        this.c = cVar;
        this.d = lVar;
        this.e = i4;
        this.f = j;
        this.g = obj;
        this.h = obj2;
        this.i = wVar;
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            u0 u0Var = (u0) list.get(i6);
            i5 += u0Var.e;
            iMax = Math.max(iMax, u0Var.d);
        }
        this.k = i5;
        int i7 = i5 + this.e;
        this.l = i7 >= 0 ? i7 : 0;
        this.m = iMax;
        this.p = new int[this.b.size() * 2];
    }

    @Override // com.gamericefishpro.space.h0.e0
    public final boolean a() {
        return true;
    }

    @Override // com.gamericefishpro.space.h0.e0
    public final int b() {
        return this.b.size();
    }

    @Override // com.gamericefishpro.space.h0.e0
    public final void c() {
        this.n = true;
    }

    @Override // com.gamericefishpro.space.h0.e0
    public final void d(int i, int i2, int i3) {
        k(i, i2, i3);
    }

    @Override // com.gamericefishpro.space.h0.e0
    public final int e() {
        return this.l;
    }

    @Override // com.gamericefishpro.space.h0.e0
    public final long f(int i) {
        int i2;
        long j;
        if (i == 0 && this.b.size() == 0) {
            i2 = this.j;
            j = 0;
        } else {
            int i3 = i * 2;
            int[] iArr = this.p;
            int i4 = iArr[i3];
            i2 = iArr[i3 + 1];
            j = i4;
        }
        return (4294967295L & ((long) i2)) | (j << 32);
    }

    @Override // com.gamericefishpro.space.h0.e0
    public final int g() {
        return 1;
    }

    @Override // com.gamericefishpro.space.h0.e0
    public final int getIndex() {
        return this.a;
    }

    @Override // com.gamericefishpro.space.h0.e0
    public final Object getKey() {
        return this.g;
    }

    @Override // com.gamericefishpro.space.h0.e0
    public final Object h(int i) {
        return ((u0) this.b.get(i)).i();
    }

    @Override // com.gamericefishpro.space.h0.e0
    public final int i() {
        return 0;
    }

    public final void j(t0 t0Var) {
        if (this.o == Integer.MIN_VALUE) {
            com.gamericefishpro.space.c0.a.a("position() should be called first");
        }
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            u0 u0Var = (u0) list.get(i);
            int i2 = u0Var.e;
            long jF = f(i);
            this.i.a(i, this.g);
            t0.t(t0Var, u0Var, com.gamericefishpro.space.c3.i.c(jF, this.f));
        }
    }

    public final void k(int i, int i2, int i3) {
        this.j = i;
        this.o = i3;
        List list = this.b;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            u0 u0Var = (u0) list.get(i4);
            int i5 = i4 * 2;
            com.gamericefishpro.space.h1.c cVar = this.c;
            if (cVar == null) {
                com.gamericefishpro.space.c0.a.b("null horizontalAlignment when isVertical == true");
                throw new com.gamericefishpro.space.oh.e();
            }
            int iA = cVar.a(u0Var.d, i2, this.d);
            int[] iArr = this.p;
            iArr[i5] = iA;
            iArr[i5 + 1] = i;
            i += u0Var.e;
        }
    }
}
