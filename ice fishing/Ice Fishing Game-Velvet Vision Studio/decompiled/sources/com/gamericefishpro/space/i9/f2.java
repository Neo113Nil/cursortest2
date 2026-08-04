package com.gamericefishpro.space.i9;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 extends g5 {
    private static final f2 zzd;
    private m5 zzb = g6.w;

    static {
        f2 f2Var = new f2();
        zzd = f2Var;
        g5.m(f2.class, f2Var);
    }

    @Override // com.gamericefishpro.space.i9.g5
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new h6(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i2 == 3) {
            return new f2();
        }
        if (i2 == 4) {
            return new q1(zzd);
        }
        if (i2 == 5) {
            return zzd;
        }
        throw null;
    }
}
