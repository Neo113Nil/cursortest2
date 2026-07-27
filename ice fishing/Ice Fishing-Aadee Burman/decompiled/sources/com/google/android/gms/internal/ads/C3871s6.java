package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.s6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3871s6 extends VK {
    private static final C3871s6 zzi;
    private static volatile InterfaceC4048vL zzj;
    private int zza;
    private long zzb;
    private long zzc;
    private int zzd;
    private long zzg;
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        C3871s6 c3871s6 = new C3871s6();
        zzi = c3871s6;
        VK.u(C3871s6.class, c3871s6);
    }

    public static C3817r6 A() {
        return (C3817r6) zzi.r();
    }

    public final /* synthetic */ void B(long j6) {
        this.zza |= 1;
        this.zzb = j6;
    }

    public final /* synthetic */ void C(long j6) {
        this.zza |= 2;
        this.zzc = j6;
    }

    public final /* synthetic */ void D(String str) {
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zza |= 16;
        this.zzf = str;
    }

    public final /* synthetic */ void F(long j6) {
        this.zza |= 32;
        this.zzg = j6;
    }

    public final /* synthetic */ void G(String str) {
        this.zza |= 64;
        this.zzh = str;
    }

    public final /* synthetic */ void H(int i) {
        this.zzd = i - 1;
        this.zza |= 4;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzi, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"zza", "zzb", "zzc", "zzd", C3494l6.f31718e, "zze", "zzf", "zzg", "zzh"});
        }
        if (d2 == 3) {
            return new C3871s6();
        }
        if (d2 == 4) {
            return new C3817r6(zzi);
        }
        if (d2 == 5) {
            return zzi;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzj;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (C3871s6.class) {
            try {
                interfaceC4048vL = zzj;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzi);
                    zzj = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
