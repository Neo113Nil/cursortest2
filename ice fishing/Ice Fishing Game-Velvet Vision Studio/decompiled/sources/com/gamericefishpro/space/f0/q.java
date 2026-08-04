package com.gamericefishpro.space.f0;

import com.gamericefishpro.space.f2.m0;
import com.gamericefishpro.space.z.v0;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements m0 {
    public final r a;
    public final int b;
    public final boolean c;
    public final float d;
    public final m0 e;
    public final float f;
    public final boolean g;
    public final com.gamericefishpro.space.pi.x h;
    public final com.gamericefishpro.space.c3.c i;
    public final long j;
    public final List k;
    public final int l;
    public final int m;
    public final int n;
    public final v0 o;
    public final int p;
    public final int q;

    public q(r rVar, int i, boolean z, float f, m0 m0Var, float f2, boolean z2, com.gamericefishpro.space.pi.x xVar, com.gamericefishpro.space.c3.c cVar, long j, List list, int i2, int i3, int i4, v0 v0Var, int i5, int i6) {
        this.a = rVar;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = m0Var;
        this.f = f2;
        this.g = z2;
        this.h = xVar;
        this.i = cVar;
        this.j = j;
        this.k = list;
        this.l = i2;
        this.m = i3;
        this.n = i4;
        this.o = v0Var;
        this.p = i5;
        this.q = i6;
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

    public final q f(int i, boolean z) {
        r rVar;
        if (this.g) {
            return null;
        }
        List list = this.k;
        if (list.isEmpty() || (rVar = this.a) == null) {
            return null;
        }
        int i2 = rVar.l;
        int i3 = this.b - i;
        if (i3 < 0 || i3 >= i2) {
            return null;
        }
        r rVar2 = (r) CollectionsKt.w(list);
        r rVar3 = (r) CollectionsKt.B(list);
        if (rVar2.n || rVar3.n) {
            return null;
        }
        int i4 = this.m;
        int i5 = this.l;
        if (i < 0) {
            if (Math.min((rVar2.j + rVar2.l) - i5, (rVar3.j + rVar3.l) - i4) <= (-i)) {
                return null;
            }
        } else if (Math.min(i5 - rVar2.j, i4 - rVar3.j) <= i) {
            return null;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            r rVar4 = (r) list.get(i6);
            rVar4.getClass();
            int[] iArr = rVar4.p;
            if (!rVar4.n) {
                rVar4.j += i;
                int length = iArr.length;
                for (int i7 = 0; i7 < length; i7++) {
                    if ((i7 & 1) != 0) {
                        iArr[i7] = iArr[i7] + i;
                    }
                }
                if (z) {
                    int size2 = rVar4.b.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        rVar4.i.a(i8, rVar4.g);
                    }
                }
            }
        }
        return new q(this.a, i3, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q);
    }

    public final long g() {
        m0 m0Var = this.e;
        return (((long) m0Var.e()) << 32) | (((long) m0Var.c()) & 4294967295L);
    }
}
