package com.gamericefishpro.space.i9;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n3 extends g5 {
    private static final n3 zzf;
    private int zzb;
    private int zzd;
    private l5 zze = u5.w;

    static {
        n3 n3Var = new n3();
        zzf = n3Var;
        g5.m(n3.class, n3Var);
    }

    public static m3 u() {
        return (m3) zzf.h();
    }

    @Override // com.gamericefishpro.space.i9.g5
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new h6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new n3();
        }
        if (i2 == 4) {
            return new m3(zzf);
        }
        if (i2 == 5) {
            return zzf;
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
        return ((u5) this.zze).size();
    }

    public final long t(int i) {
        return ((u5) this.zze).c(i);
    }

    public final /* synthetic */ void v(int i) {
        this.zzb |= 1;
        this.zzd = i;
    }

    public final void w(List list) {
        RandomAccess randomAccess = this.zze;
        if (!((q4) randomAccess).d) {
            u5 u5Var = (u5) randomAccess;
            int i = u5Var.i;
            this.zze = u5Var.j(i + i);
        }
        p4.c(list, this.zze);
    }
}
