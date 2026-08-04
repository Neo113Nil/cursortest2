package com.gamericefishpro.space.i9;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends g5 {
    private static final l1 zzi;
    private int zzb;
    private int zzd;
    private m5 zze;
    private m5 zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        l1 l1Var = new l1();
        zzi = l1Var;
        g5.m(l1.class, l1Var);
    }

    public l1() {
        g6 g6Var = g6.w;
        this.zze = g6Var;
        this.zzf = g6Var;
    }

    @Override // com.gamericefishpro.space.i9.g5
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new h6(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zzd", "zze", u1.class, "zzf", n1.class, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new l1();
        }
        if (i2 == 4) {
            return new k1(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final int q() {
        return this.zzd;
    }

    public final List r() {
        return this.zze;
    }

    public final int s() {
        return this.zze.size();
    }

    public final u1 t(int i) {
        return (u1) this.zze.get(i);
    }

    public final m5 u() {
        return this.zzf;
    }

    public final int v() {
        return this.zzf.size();
    }

    public final n1 w(int i) {
        return (n1) this.zzf.get(i);
    }

    public final void x(int i, u1 u1Var) {
        m5 m5Var = this.zze;
        if (!((q4) m5Var).d) {
            int size = m5Var.size();
            this.zze = m5Var.j(size + size);
        }
        this.zze.set(i, u1Var);
    }

    public final void y(int i, n1 n1Var) {
        m5 m5Var = this.zzf;
        if (!((q4) m5Var).d) {
            int size = m5Var.size();
            this.zzf = m5Var.j(size + size);
        }
        this.zzf.set(i, n1Var);
    }
}
