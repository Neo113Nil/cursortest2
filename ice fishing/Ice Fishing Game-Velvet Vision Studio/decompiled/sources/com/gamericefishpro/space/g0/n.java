package com.gamericefishpro.space.g0;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    public final int a;
    public final m[] b;
    public final com.gamericefishpro.space.u6.e c;
    public final List d;
    public final int e;
    public final int f;
    public final int g;

    public n(int i, m[] mVarArr, com.gamericefishpro.space.u6.e eVar, List list, int i2) {
        this.a = i;
        this.b = mVarArr;
        this.c = eVar;
        this.d = list;
        this.e = i2;
        int iMax = 0;
        for (m mVar : mVarArr) {
            iMax = Math.max(iMax, mVar.k);
        }
        this.f = iMax;
        int i3 = iMax + this.e;
        this.g = i3 >= 0 ? i3 : 0;
    }

    public final m[] a(int i, int i2, int i3) {
        m[] mVarArr = this.b;
        int length = mVarArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            m mVar = mVarArr[i4];
            int i7 = i5 + 1;
            int i8 = (int) ((b) this.d.get(i5)).a;
            int i9 = i;
            mVar.k(i9, ((int[]) this.c.c)[i6], i2, i3, this.a, i6);
            Unit unit = Unit.a;
            i6 += i8;
            i4++;
            i = i9;
            i5 = i7;
        }
        return mVarArr;
    }
}
