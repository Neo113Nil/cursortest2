package com.gamericefishpro.space.g0;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    public final com.gamericefishpro.space.u6.e a;
    public final int b;
    public final int c;
    public final j d;
    public final s e;
    public final /* synthetic */ com.gamericefishpro.space.u6.e f;

    public k(com.gamericefishpro.space.u6.e eVar, int i, int i2, j jVar, s sVar) {
        this.f = eVar;
        this.a = eVar;
        this.b = i;
        this.c = i2;
        this.d = jVar;
        this.e = sVar;
    }

    public final long a(int i, int i2) {
        int i3;
        com.gamericefishpro.space.u6.e eVar = this.a;
        int[] iArr = (int[]) eVar.b;
        if (i2 == 1) {
            i3 = iArr[i];
        } else {
            int i4 = (i2 + i) - 1;
            int[] iArr2 = (int[]) eVar.c;
            i3 = (iArr2[i4] + iArr[i4]) - iArr2[i];
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i3 < 0) {
            com.gamericefishpro.space.c3.h.a("width must be >= 0");
        }
        return com.gamericefishpro.space.c3.b.g(i3, i3, 0, Integer.MAX_VALUE);
    }

    public final n b(int i) {
        r rVarB = this.e.b(i);
        int i2 = rVarB.a;
        List list = rVarB.b;
        int size = list.size();
        int i3 = 0;
        int i4 = (size == 0 || i2 + size == this.b) ? 0 : this.c;
        m[] mVarArr = new m[size];
        int i5 = 0;
        while (i3 < size) {
            int i6 = (int) ((b) list.get(i3)).a;
            int i7 = i4;
            m mVarS = this.d.s(i2 + i3, a(i5, i6), i5, i6, i7);
            i5 += i6;
            Unit unit = Unit.a;
            mVarArr[i3] = mVarS;
            i3++;
            i4 = i7;
        }
        return new n(i, mVarArr, this.f, rVarB.b, i4);
    }
}
