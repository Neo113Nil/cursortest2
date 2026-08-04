package com.gamericefishpro.space.i9;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b3 extends g5 {
    private static final b3 zzf;
    private int zzb;
    private String zzd = "";
    private long zze;

    static {
        b3 b3Var = new b3();
        zzf = b3Var;
        g5.m(b3.class, b3Var);
    }

    @Override // com.gamericefishpro.space.i9.g5
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new h6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new b3();
        }
        if (i2 == 4) {
            return new q1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
