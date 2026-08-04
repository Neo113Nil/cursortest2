package com.gamericefishpro.space.g0;

import com.gamericefishpro.space.f2.m0;
import com.gamericefishpro.space.z.v0;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements m0 {
    public final n a;
    public final int b;
    public final boolean c;
    public final float d;
    public final m0 e;
    public final float f;
    public final boolean g;
    public final com.gamericefishpro.space.pi.x h;
    public final com.gamericefishpro.space.c3.c i;
    public final int j;
    public final Function1 k;
    public final Function1 l;
    public final List m;
    public final int n;
    public final int o;
    public final int p;
    public final v0 q;
    public final int r;
    public final int s;

    public l(n nVar, int i, boolean z, float f, m0 m0Var, float f2, boolean z2, com.gamericefishpro.space.pi.x xVar, com.gamericefishpro.space.c3.c cVar, int i2, Function1 function1, Function1 function2, List list, int i3, int i4, int i5, v0 v0Var, int i6, int i7) {
        this.a = nVar;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = m0Var;
        this.f = f2;
        this.g = z2;
        this.h = xVar;
        this.i = cVar;
        this.j = i2;
        this.k = function1;
        this.l = function2;
        this.m = list;
        this.n = i3;
        this.o = i4;
        this.p = i5;
        this.q = v0Var;
        this.r = i6;
        this.s = i7;
    }

    @Override // com.gamericefishpro.space.f2.m0
    public final Map a() {
        return this.e.a();
    }

    @Override // com.gamericefishpro.space.f2.m0
    public final void b() {
        this.e.b();
    }

    @Override // com.gamericefishpro.space.f2.m0
    public final int c() {
        return this.e.c();
    }

    @Override // com.gamericefishpro.space.f2.m0
    public final Function1 d() {
        return this.e.d();
    }

    @Override // com.gamericefishpro.space.f2.m0
    public final int e() {
        return this.e.e();
    }

    public final l f(int i, boolean z) {
        n nVar;
        int i2;
        if (this.g) {
            return null;
        }
        List list = this.m;
        if (list.isEmpty() || (nVar = this.a) == null) {
            return null;
        }
        int i3 = nVar.g;
        int i4 = this.b - i;
        if (i4 < 0 || i4 >= i3) {
            return null;
        }
        m mVar = (m) CollectionsKt.w(list);
        m mVar2 = (m) CollectionsKt.B(list);
        if (mVar.r || mVar2.r) {
            return null;
        }
        int i5 = this.o;
        int i6 = this.n;
        v0 v0Var = this.q;
        if (i < 0) {
            if (Math.min((com.gamericefishpro.space.a.a.z(mVar, v0Var) + mVar.l) - i6, (com.gamericefishpro.space.a.a.z(mVar2, v0Var) + mVar2.l) - i5) <= (-i)) {
                return null;
            }
        } else if (Math.min(i6 - com.gamericefishpro.space.a.a.z(mVar, v0Var), i5 - com.gamericefishpro.space.a.a.z(mVar2, v0Var)) <= i) {
            return null;
        }
        int size = list.size();
        int i7 = 0;
        while (i7 < size) {
            m mVar3 = (m) list.get(i7);
            mVar3.getClass();
            if (mVar3.r) {
                i2 = i7;
            } else {
                long j = mVar3.o;
                i2 = i7;
                mVar3.o = (((long) ((int) (j >> 32))) << 32) | (((long) (((int) (j & 4294967295L)) + i)) & 4294967295L);
                if (z) {
                    int size2 = mVar3.e.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        mVar3.h.a(i8, mVar3.b);
                    }
                }
            }
            i7 = i2 + 1;
        }
        return new l(this.a, i4, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, v0Var, this.r, this.s);
    }

    public final long g() {
        m0 m0Var = this.e;
        return (((long) m0Var.e()) << 32) | (((long) m0Var.c()) & 4294967295L);
    }
}
