package com.gamericefishpro.space.i9;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l3 extends g5 {
    private static final l3 zzg;
    private l5 zzb;
    private l5 zzd;
    private m5 zze;
    private m5 zzf;

    static {
        l3 l3Var = new l3();
        zzg = l3Var;
        g5.m(l3.class, l3Var);
    }

    public l3() {
        u5 u5Var = u5.w;
        this.zzb = u5Var;
        this.zzd = u5Var;
        g6 g6Var = g6.w;
        this.zze = g6Var;
        this.zzf = g6Var;
    }

    public static k3 x() {
        return (k3) zzg.h();
    }

    public static l3 y() {
        return zzg;
    }

    public final void A() {
        this.zzb = u5.w;
    }

    public final void B(List list) {
        RandomAccess randomAccess = this.zzd;
        if (!((q4) randomAccess).d) {
            u5 u5Var = (u5) randomAccess;
            int i = u5Var.i;
            this.zzd = u5Var.j(i + i);
        }
        p4.c(list, this.zzd);
    }

    public final void C() {
        this.zzd = u5.w;
    }

    public final void D(ArrayList arrayList) {
        m5 m5Var = this.zze;
        if (!((q4) m5Var).d) {
            int size = m5Var.size();
            this.zze = m5Var.j(size + size);
        }
        p4.c(arrayList, this.zze);
    }

    public final void E() {
        this.zze = g6.w;
    }

    public final void F(Iterable iterable) {
        m5 m5Var = this.zzf;
        if (!((q4) m5Var).d) {
            int size = m5Var.size();
            this.zzf = m5Var.j(size + size);
        }
        p4.c(iterable, this.zzf);
    }

    public final void G() {
        this.zzf = g6.w;
    }

    @Override // com.gamericefishpro.space.i9.g5
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new h6(zzg, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zzd", "zze", y2.class, "zzf", n3.class});
        }
        if (i2 == 3) {
            return new l3();
        }
        if (i2 == 4) {
            return new k3(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }

    public final List p() {
        return this.zzb;
    }

    public final int q() {
        return ((u5) this.zzb).size();
    }

    public final List r() {
        return this.zzd;
    }

    public final int s() {
        return ((u5) this.zzd).size();
    }

    public final m5 t() {
        return this.zze;
    }

    public final int u() {
        return this.zze.size();
    }

    public final List v() {
        return this.zzf;
    }

    public final int w() {
        return this.zzf.size();
    }

    public final void z(Iterable iterable) {
        RandomAccess randomAccess = this.zzb;
        if (!((q4) randomAccess).d) {
            u5 u5Var = (u5) randomAccess;
            int i = u5Var.i;
            this.zzb = u5Var.j(i + i);
        }
        p4.c(iterable, this.zzb);
    }
}
