package com.gamericefishpro.space.f0;

import com.gamericefishpro.space.z.v0;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements com.gamericefishpro.space.h0.r {
    public final w a;

    public e(w wVar) {
        this.a = wVar;
    }

    @Override // com.gamericefishpro.space.h0.r
    public final int a() {
        return this.a.g().n;
    }

    @Override // com.gamericefishpro.space.h0.r
    public final int b() {
        return Math.min(a() - 1, ((r) CollectionsKt.B(this.a.g().k)).a);
    }

    @Override // com.gamericefishpro.space.h0.r
    public final boolean c() {
        return !this.a.g().k.isEmpty();
    }

    @Override // com.gamericefishpro.space.h0.r
    public final int d() {
        int i;
        w wVar = this.a;
        int size = 0;
        if (wVar.g().k.isEmpty()) {
            return 0;
        }
        q qVarG = wVar.g();
        int iG = (int) (qVarG.o == v0.d ? qVarG.g() & 4294967295L : qVarG.g() >> 32);
        q qVarG2 = wVar.g();
        List list = qVarG2.k;
        if (!list.isEmpty()) {
            int size2 = list.size();
            int i2 = 0;
            while (size < size2) {
                i2 += ((r) list.get(size)).k;
                size++;
            }
            size = (i2 / list.size()) + qVarG2.q;
        }
        if (size != 0 && (i = iG / size) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // com.gamericefishpro.space.h0.r
    public final int e() {
        return Math.max(0, this.a.e.b.g());
    }
}
