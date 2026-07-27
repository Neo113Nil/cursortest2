package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.ky, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3485ky extends VK {
    private static final C3485ky zzl;
    private static volatile InterfaceC4048vL zzm;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzh;
    private boolean zzi;
    private boolean zzb = true;
    private long zze = 600000;
    private long zzf = com.anythink.core.common.g.c.f13265b;
    private String zzg = "https://pagead2.googlesyndication.com/mads/asp";
    private long zzj = 5;
    private long zzk = 60000;

    static {
        C3485ky c3485ky = new C3485ky();
        zzl = c3485ky;
        VK.u(C3485ky.class, c3485ky);
    }

    public static C3431jy H() {
        return (C3431jy) zzl.r();
    }

    public static C3485ky I() {
        return zzl;
    }

    public final boolean A() {
        return this.zzd;
    }

    public final long B() {
        return this.zzf;
    }

    public final String C() {
        return this.zzg;
    }

    public final long D() {
        return this.zzh;
    }

    public final boolean E() {
        return this.zzi;
    }

    public final long F() {
        return this.zzj;
    }

    public final long G() {
        return this.zzk;
    }

    public final /* synthetic */ void J(boolean z3) {
        this.zza |= 4;
        this.zzd = z3;
    }

    public final /* synthetic */ void K(long j6) {
        this.zza |= 64;
        this.zzh = j6;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzl, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဂ\u0006\bဇ\u0007\tဂ\b\nဂ\t", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (d2 == 3) {
            return new C3485ky();
        }
        if (d2 == 4) {
            return new C3431jy(zzl);
        }
        if (d2 == 5) {
            return zzl;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzm;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (C3485ky.class) {
            try {
                interfaceC4048vL = zzm;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzl);
                    zzm = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
