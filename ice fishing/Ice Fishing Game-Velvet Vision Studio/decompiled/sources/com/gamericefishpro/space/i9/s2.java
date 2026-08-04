package com.gamericefishpro.space.i9;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class s2 extends g5 {
    private static final s2 zzh;
    private int zzb;
    private int zzd;
    private l3 zze;
    private l3 zzf;
    private boolean zzg;

    static {
        s2 s2Var = new s2();
        zzh = s2Var;
        g5.m(s2.class, s2Var);
    }

    public static r2 w() {
        return (r2) zzh.h();
    }

    public final /* synthetic */ void A(boolean z) {
        this.zzb |= 8;
        this.zzg = z;
    }

    @Override // com.gamericefishpro.space.i9.g5
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new h6(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new s2();
        }
        if (i2 == 4) {
            return new r2(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final int q() {
        return this.zzd;
    }

    public final l3 r() {
        l3 l3Var = this.zze;
        return l3Var == null ? l3.y() : l3Var;
    }

    public final boolean s() {
        return (this.zzb & 4) != 0;
    }

    public final l3 t() {
        l3 l3Var = this.zzf;
        return l3Var == null ? l3.y() : l3Var;
    }

    public final boolean u() {
        return (this.zzb & 8) != 0;
    }

    public final boolean v() {
        return this.zzg;
    }

    public final /* synthetic */ void x(int i) {
        this.zzb |= 1;
        this.zzd = i;
    }

    public final /* synthetic */ void y(l3 l3Var) {
        this.zze = l3Var;
        this.zzb |= 2;
    }

    public final /* synthetic */ void z(l3 l3Var) {
        this.zzf = l3Var;
        this.zzb |= 4;
    }
}
