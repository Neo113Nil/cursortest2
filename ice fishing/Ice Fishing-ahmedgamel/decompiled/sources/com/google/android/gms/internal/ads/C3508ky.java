package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.ky, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3508ky extends VK {
    private static final C3508ky zzl;
    private static volatile InterfaceC4071vL zzm;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzh;
    private boolean zzi;
    private boolean zzb = true;
    private long zze = 600000;
    private long zzf = com.anythink.core.common.g.c.f14051b;
    private String zzg = "https://pagead2.googlesyndication.com/mads/asp";
    private long zzj = 5;
    private long zzk = 60000;

    static {
        C3508ky c3508ky = new C3508ky();
        zzl = c3508ky;
        VK.u(C3508ky.class, c3508ky);
    }

    public static C3454jy H() {
        return (C3454jy) zzl.r();
    }

    public static C3508ky I() {
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

    public final /* synthetic */ void J(boolean z6) {
        this.zza |= 4;
        this.zzd = z6;
    }

    public final /* synthetic */ void K(long j6) {
        this.zza |= 64;
        this.zzh = j6;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzl, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဂ\u0006\bဇ\u0007\tဂ\b\nဂ\t", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (d9 == 3) {
            return new C3508ky();
        }
        if (d9 == 4) {
            return new C3454jy(zzl);
        }
        if (d9 == 5) {
            return zzl;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzm;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (C3508ky.class) {
            try {
                interfaceC4071vL = zzm;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzl);
                    zzm = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
