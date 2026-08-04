package com.gamericefishpro.space.i2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 extends com.gamericefishpro.space.z4.s0 {
    public final com.gamericefishpro.space.t.w b;

    public o1() {
        com.gamericefishpro.space.t.w wVar = com.gamericefishpro.space.t.m.a;
        this.b = new com.gamericefishpro.space.t.w();
    }

    @Override // com.gamericefishpro.space.z4.s0
    public final void d() {
        com.gamericefishpro.space.t.w wVar = this.b;
        int[] iArr = wVar.b;
        Object[] objArr = wVar.c;
        long[] jArr = wVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8;
                int i3 = 8 - ((~(i - length)) >>> 31);
                int i4 = 0;
                while (i4 < i3) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        int i6 = iArr[i5];
                        com.gamericefishpro.space.t.d0 d0Var = (com.gamericefishpro.space.t.d0) objArr[i5];
                        Object[] objArr2 = d0Var.a;
                        int i7 = d0Var.b;
                        int i8 = 0;
                        while (i8 < i7) {
                            n1 n1Var = (n1) objArr2[i8];
                            int i9 = i2;
                            com.gamericefishpro.space.t0.g gVar = n1Var.d;
                            if (gVar != null) {
                                gVar.cancel();
                            }
                            n1Var.d = null;
                            com.gamericefishpro.space.c1.c cVar = (com.gamericefishpro.space.c1.c) n1Var.a.e;
                            cVar.e = true;
                            cVar.d = false;
                            cVar.a();
                            i8++;
                            i2 = i9;
                        }
                    }
                    int i10 = i2;
                    j >>= i10;
                    i4++;
                    i2 = i10;
                }
                if (i3 != i2) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
