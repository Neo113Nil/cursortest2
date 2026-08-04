package com.gamericefishpro.space.t0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final com.gamericefishpro.space.t.w e;
    public final com.gamericefishpro.space.oh.s f;

    public k1(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            m1.a("Invalid start index");
        }
        this.d = new ArrayList();
        com.gamericefishpro.space.t.w wVar = new com.gamericefishpro.space.t.w();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            p0 p0Var = (p0) this.a.get(i3);
            int i4 = p0Var.c;
            int i5 = p0Var.d;
            wVar.h(i4, new j0(i3, i2, i5));
            i2 += i5;
        }
        this.e = wVar;
        this.f = com.gamericefishpro.space.oh.i.b(new com.gamericefishpro.space.a7.d(2, this));
    }

    public final boolean a(int i, int i2) {
        int i3;
        com.gamericefishpro.space.t.w wVar = this.e;
        j0 j0Var = (j0) wVar.b(i);
        if (j0Var == null) {
            return false;
        }
        int i4 = j0Var.b;
        int i5 = i2 - j0Var.c;
        j0Var.c = i2;
        if (i5 == 0) {
            return true;
        }
        Object[] objArr = wVar.c;
        long[] jArr = wVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i6 = 0;
        while (true) {
            long j = jArr[i6];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i6 - length)) >>> 31);
                for (int i8 = 0; i8 < i7; i8++) {
                    if ((255 & j) < 128) {
                        j0 j0Var2 = (j0) objArr[(i6 << 3) + i8];
                        if (j0Var2.b >= i4 && !j0Var2.equals(j0Var) && (i3 = j0Var2.b + i5) >= 0) {
                            j0Var2.b = i3;
                        }
                    }
                    j >>= 8;
                }
                if (i7 != 8) {
                    return true;
                }
            }
            if (i6 == length) {
                return true;
            }
            i6++;
        }
    }
}
