package com.gamericefishpro.space.i9;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a3 extends g5 {
    private static final a3 zzj;
    private int zzb;
    private m5 zzd = g6.w;
    private String zze = "";
    private long zzf;
    private long zzg;
    private int zzh;
    private long zzi;

    static {
        a3 a3Var = new a3();
        zzj = a3Var;
        g5.m(a3.class, a3Var);
    }

    public static z2 z() {
        return (z2) zzj.h();
    }

    public final /* synthetic */ void A(int i, d3 d3Var) {
        J();
        this.zzd.set(i, d3Var);
    }

    public final /* synthetic */ void B(d3 d3Var) {
        d3Var.getClass();
        J();
        this.zzd.add(d3Var);
    }

    public final /* synthetic */ void C(Iterable iterable) {
        J();
        p4.c(iterable, this.zzd);
    }

    public final void D() {
        this.zzd = g6.w;
    }

    public final /* synthetic */ void E(int i) {
        J();
        this.zzd.remove(i);
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void G(long j) {
        this.zzb |= 2;
        this.zzf = j;
    }

    public final /* synthetic */ void H(long j) {
        this.zzb |= 4;
        this.zzg = j;
    }

    public final /* synthetic */ void I(long j) {
        this.zzb |= 16;
        this.zzi = j;
    }

    public final void J() {
        m5 m5Var = this.zzd;
        if (((q4) m5Var).d) {
            return;
        }
        int size = m5Var.size();
        this.zzd = m5Var.j(size + size);
    }

    @Override // com.gamericefishpro.space.i9.g5
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new h6(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004", new Object[]{"zzb", "zzd", d3.class, "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new a3();
        }
        if (i2 == 4) {
            return new z2(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        throw null;
    }

    public final List p() {
        return this.zzd;
    }

    public final int q() {
        return this.zzd.size();
    }

    public final d3 r(int i) {
        return (d3) this.zzd.get(i);
    }

    public final String s() {
        return this.zze;
    }

    public final boolean t() {
        return (this.zzb & 2) != 0;
    }

    public final long u() {
        return this.zzf;
    }

    public final boolean v() {
        return (this.zzb & 4) != 0;
    }

    public final long w() {
        return this.zzg;
    }

    public final boolean x() {
        return (this.zzb & 8) != 0;
    }

    public final int y() {
        return this.zzh;
    }
}
