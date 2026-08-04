package com.gamericefishpro.space.i9;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 extends g5 {
    private static final z1 zzi;
    private int zzb;
    private m5 zzd;
    private m5 zze;
    private m5 zzf;
    private boolean zzg;
    private m5 zzh;

    static {
        z1 z1Var = new z1();
        zzi = z1Var;
        g5.m(z1.class, z1Var);
    }

    public z1() {
        g6 g6Var = g6.w;
        this.zzd = g6Var;
        this.zze = g6Var;
        this.zzf = g6Var;
        this.zzh = g6Var;
    }

    public static z1 v() {
        return zzi;
    }

    @Override // com.gamericefishpro.space.i9.g5
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new h6(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zzd", w1.class, "zze", x1.class, "zzf", y1.class, "zzg", "zzh", w1.class});
        }
        if (i2 == 3) {
            return new z1();
        }
        if (i2 == 4) {
            return new q1(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }

    public final List p() {
        return this.zzd;
    }

    public final List q() {
        return this.zze;
    }

    public final List r() {
        return this.zzf;
    }

    public final boolean s() {
        return (this.zzb & 1) != 0;
    }

    public final boolean t() {
        return this.zzg;
    }

    public final m5 u() {
        return this.zzh;
    }
}
