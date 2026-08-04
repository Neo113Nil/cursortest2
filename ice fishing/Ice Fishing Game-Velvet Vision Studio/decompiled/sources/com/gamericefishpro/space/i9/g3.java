package com.gamericefishpro.space.i9;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g3 extends g5 {
    private static final g3 zzh;
    private int zzb;
    private m5 zzd = g6.w;
    private String zze = "";
    private String zzf = "";
    private int zzg;

    static {
        g3 g3Var = new g3();
        zzh = g3Var;
        g5.m(g3.class, g3Var);
    }

    public static f3 w() {
        return (f3) zzh.h();
    }

    public static f3 x(g3 g3Var) {
        f5 f5VarH = zzh.h();
        f5VarH.f(g3Var);
        return (f3) f5VarH;
    }

    public final /* synthetic */ void A(ArrayList arrayList) {
        E();
        p4.c(arrayList, this.zzd);
    }

    public final void B() {
        this.zzd = g6.w;
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final void E() {
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
            return new h6(zzh, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zzd", i3.class, "zze", "zzf", "zzg", r1.j});
        }
        if (i2 == 3) {
            return new g3();
        }
        if (i2 == 4) {
            return new f3(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    public final List p() {
        return this.zzd;
    }

    public final int q() {
        return this.zzd.size();
    }

    public final i3 r(int i) {
        return (i3) this.zzd.get(i);
    }

    public final boolean s() {
        return (this.zzb & 1) != 0;
    }

    public final String t() {
        return this.zze;
    }

    public final boolean u() {
        return (this.zzb & 2) != 0;
    }

    public final String v() {
        return this.zzf;
    }

    public final /* synthetic */ void y(int i, i3 i3Var) {
        E();
        this.zzd.set(i, i3Var);
    }

    public final /* synthetic */ void z(i3 i3Var) {
        E();
        this.zzd.add(i3Var);
    }
}
