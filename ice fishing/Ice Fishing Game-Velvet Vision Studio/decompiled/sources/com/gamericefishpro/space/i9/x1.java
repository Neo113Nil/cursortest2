package com.gamericefishpro.space.i9;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 extends g5 {
    private static final x1 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        x1 x1Var = new x1();
        zzf = x1Var;
        g5.m(x1.class, x1Var);
    }

    @Override // com.gamericefishpro.space.i9.g5
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            r1 r1Var = r1.e;
            return new h6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", r1Var, "zze", r1Var});
        }
        if (i2 == 3) {
            return new x1();
        }
        if (i2 == 4) {
            return new q1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final int p() {
        int iT = y3.T(this.zzd);
        if (iT == 0) {
            return 1;
        }
        return iT;
    }

    public final int q() {
        int iT = y3.T(this.zze);
        if (iT == 0) {
            return 1;
        }
        return iT;
    }
}
