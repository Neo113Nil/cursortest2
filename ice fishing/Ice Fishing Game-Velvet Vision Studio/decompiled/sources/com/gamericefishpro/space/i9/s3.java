package com.gamericefishpro.space.i9;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class s3 extends g5 {
    private static final s3 zzd;
    private m5 zzb = g6.w;

    static {
        s3 s3Var = new s3();
        zzd = s3Var;
        g5.m(s3.class, s3Var);
    }

    public static s3 r() {
        return zzd;
    }

    @Override // com.gamericefishpro.space.i9.g5
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new h6(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", t3.class});
        }
        if (i2 == 3) {
            return new s3();
        }
        if (i2 == 4) {
            return new q1(zzd);
        }
        if (i2 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List p() {
        return this.zzb;
    }

    public final int q() {
        return this.zzb.size();
    }
}
