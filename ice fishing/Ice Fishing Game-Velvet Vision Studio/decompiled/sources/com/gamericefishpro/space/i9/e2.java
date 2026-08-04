package com.gamericefishpro.space.i9;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 extends g5 {
    private static final e2 zzu;
    private int zzb;
    private long zzd;
    private String zze = "";
    private int zzf;
    private m5 zzg;
    private m5 zzh;
    private m5 zzi;
    private String zzj;
    private boolean zzk;
    private m5 zzl;
    private m5 zzm;
    private String zzn;
    private String zzo;
    private z1 zzp;
    private g2 zzq;
    private j2 zzr;
    private h2 zzs;
    private f2 zzt;

    static {
        e2 e2Var = new e2();
        zzu = e2Var;
        g5.m(e2.class, e2Var);
    }

    public e2() {
        g6 g6Var = g6.w;
        this.zzg = g6Var;
        this.zzh = g6Var;
        this.zzi = g6Var;
        this.zzj = "";
        this.zzl = g6Var;
        this.zzm = g6Var;
        this.zzn = "";
        this.zzo = "";
    }

    public static d2 F() {
        return (d2) zzu.h();
    }

    public static e2 G() {
        return zzu;
    }

    public final String A() {
        return this.zzn;
    }

    public final boolean B() {
        return (this.zzb & 128) != 0;
    }

    public final z1 C() {
        z1 z1Var = this.zzp;
        return z1Var == null ? z1.v() : z1Var;
    }

    public final boolean D() {
        return (this.zzb & 512) != 0;
    }

    public final j2 E() {
        j2 j2Var = this.zzr;
        return j2Var == null ? j2.r() : j2Var;
    }

    public final void H(int i, c2 c2Var) {
        m5 m5Var = this.zzh;
        if (!((q4) m5Var).d) {
            int size = m5Var.size();
            this.zzh = m5Var.j(size + size);
        }
        this.zzh.set(i, c2Var);
    }

    public final void I() {
        this.zzi = g6.w;
    }

    public final void J() {
        this.zzl = g6.w;
    }

    @Override // com.gamericefishpro.space.i9.g5
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new h6(zzu, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", i2.class, "zzh", c2.class, "zzi", l1.class, "zzj", "zzk", "zzl", u3.class, "zzm", a2.class, "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt"});
        }
        if (i2 == 3) {
            return new e2();
        }
        if (i2 == 4) {
            return new d2(zzu);
        }
        if (i2 == 5) {
            return zzu;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final long q() {
        return this.zzd;
    }

    public final boolean r() {
        return (this.zzb & 2) != 0;
    }

    public final String s() {
        return this.zze;
    }

    public final m5 t() {
        return this.zzg;
    }

    public final int u() {
        return this.zzh.size();
    }

    public final c2 v(int i) {
        return (c2) this.zzh.get(i);
    }

    public final m5 w() {
        return this.zzi;
    }

    public final m5 x() {
        return this.zzl;
    }

    public final int y() {
        return this.zzl.size();
    }

    public final List z() {
        return this.zzm;
    }
}
