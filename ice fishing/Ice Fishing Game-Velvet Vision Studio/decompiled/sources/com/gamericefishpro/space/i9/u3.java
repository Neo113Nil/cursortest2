package com.gamericefishpro.space.i9;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class u3 extends g5 {
    private static final u3 zzf;
    private int zzb;
    private m5 zzd = g6.w;
    private s3 zze;

    static {
        u3 u3Var = new u3();
        zzf = u3Var;
        g5.m(u3.class, u3Var);
    }

    @Override // com.gamericefishpro.space.i9.g5
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new h6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zzd", v3.class, "zze"});
        }
        if (i2 == 3) {
            return new u3();
        }
        if (i2 == 4) {
            return new q1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final List p() {
        return this.zzd;
    }

    public final s3 q() {
        s3 s3Var = this.zze;
        return s3Var == null ? s3.r() : s3Var;
    }
}
