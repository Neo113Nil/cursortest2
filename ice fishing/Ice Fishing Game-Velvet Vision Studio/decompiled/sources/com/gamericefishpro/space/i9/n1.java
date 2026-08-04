package com.gamericefishpro.space.i9;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 extends g5 {
    private static final n1 zzl;
    private int zzb;
    private int zzd;
    private String zze = "";
    private m5 zzf = g6.w;
    private boolean zzg;
    private s1 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        n1 n1Var = new n1();
        zzl = n1Var;
        g5.m(n1.class, n1Var);
    }

    public static m1 B() {
        return (m1) zzl.h();
    }

    public final boolean A() {
        return this.zzk;
    }

    public final /* synthetic */ void C(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    public final void D(int i, p1 p1Var) {
        m5 m5Var = this.zzf;
        if (!((q4) m5Var).d) {
            int size = m5Var.size();
            this.zzf = m5Var.j(size + size);
        }
        this.zzf.set(i, p1Var);
    }

    @Override // com.gamericefishpro.space.i9.g5
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new h6(zzl, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", p1.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new n1();
        }
        if (i2 == 4) {
            return new m1(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final int q() {
        return this.zzd;
    }

    public final String r() {
        return this.zze;
    }

    public final List s() {
        return this.zzf;
    }

    public final int t() {
        return this.zzf.size();
    }

    public final p1 u(int i) {
        return (p1) this.zzf.get(i);
    }

    public final boolean v() {
        return (this.zzb & 8) != 0;
    }

    public final s1 w() {
        s1 s1Var = this.zzh;
        return s1Var == null ? s1.y() : s1Var;
    }

    public final boolean x() {
        return this.zzi;
    }

    public final boolean y() {
        return this.zzj;
    }

    public final boolean z() {
        return (this.zzb & 64) != 0;
    }
}
