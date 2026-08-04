package com.gamericefishpro.space.g0;

import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.z.v0;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements com.gamericefishpro.space.h0.r {
    public final v a;

    public d(v vVar) {
        this.a = vVar;
    }

    @Override // com.gamericefishpro.space.h0.r
    public final int a() {
        return this.a.g().p;
    }

    @Override // com.gamericefishpro.space.h0.r
    public final int b() {
        return ((m) CollectionsKt.B(this.a.g().m)).a;
    }

    @Override // com.gamericefishpro.space.h0.r
    public final boolean c() {
        return !this.a.g().m.isEmpty();
    }

    @Override // com.gamericefishpro.space.h0.r
    public final int d() {
        int i;
        v vVar = this.a;
        int i2 = 0;
        if (vVar.g().m.isEmpty()) {
            return 0;
        }
        l lVarG = vVar.g();
        v0 v0Var = lVarG.q;
        v0 v0Var2 = v0.d;
        int iG = (int) (v0Var == v0Var2 ? lVarG.g() & 4294967295L : lVarG.g() >> 32);
        l lVarG2 = vVar.g();
        boolean z = lVarG2.q == v0Var2;
        List list = lVarG2.m;
        if (!list.isEmpty()) {
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < list.size()) {
                int iB0 = d5.b0(z, lVarG2, i3);
                if (iB0 == -1) {
                    i3++;
                } else {
                    int iMax = i2;
                    while (i3 < list.size() && d5.b0(z, lVarG2, i3) == iB0) {
                        iMax = Math.max(iMax, (int) (z ? ((m) list.get(i3)).n & 4294967295L : ((m) list.get(i3)).n >> 32));
                        i3++;
                        z = z;
                    }
                    i4 += iMax;
                    i5++;
                    z = z;
                    i2 = 0;
                }
            }
            i2 = (i4 / i5) + lVarG2.s;
        }
        if (i2 != 0 && (i = iG / i2) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // com.gamericefishpro.space.h0.r
    public final int e() {
        return this.a.d.b.g();
    }
}
