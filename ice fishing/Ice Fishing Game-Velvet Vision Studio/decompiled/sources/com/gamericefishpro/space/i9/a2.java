package com.gamericefishpro.space.i9;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 extends g5 {
    private static final a2 zzg;
    private int zzb;
    private String zzd = "";
    private m5 zze = g6.w;
    private boolean zzf;

    static {
        a2 a2Var = new a2();
        zzg = a2Var;
        g5.m(a2.class, a2Var);
    }

    @Override // com.gamericefishpro.space.i9.g5
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new h6(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zzd", "zze", h2.class, "zzf"});
        }
        if (i2 == 3) {
            return new a2();
        }
        if (i2 == 4) {
            return new q1(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }

    public final String p() {
        return this.zzd;
    }
}
