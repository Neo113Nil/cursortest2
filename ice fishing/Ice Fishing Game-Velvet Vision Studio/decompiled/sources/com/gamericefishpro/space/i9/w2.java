package com.gamericefishpro.space.i9;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class w2 extends g5 {
    private static final w2 zzd;
    private m5 zzb = g6.w;

    static {
        w2 w2Var = new w2();
        zzd = w2Var;
        g5.m(w2.class, w2Var);
    }

    public static t2 q() {
        return (t2) zzd.h();
    }

    public static w2 r() {
        return zzd;
    }

    @Override // com.gamericefishpro.space.i9.g5
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new h6(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", v2.class});
        }
        if (i2 == 3) {
            return new w2();
        }
        if (i2 == 4) {
            return new t2(zzd);
        }
        if (i2 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List p() {
        return this.zzb;
    }

    public final void s(ArrayList arrayList) {
        m5 m5Var = this.zzb;
        if (!((q4) m5Var).d) {
            int size = m5Var.size();
            this.zzb = m5Var.j(size + size);
        }
        p4.c(arrayList, this.zzb);
    }
}
