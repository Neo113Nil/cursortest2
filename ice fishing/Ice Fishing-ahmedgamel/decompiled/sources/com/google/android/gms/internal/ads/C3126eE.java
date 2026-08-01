package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.eE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3126eE extends VK {
    private static final C3126eE zzd;
    private static volatile InterfaceC4048vL zze;
    private int zza;
    private long zzb;
    private int zzc;

    static {
        C3126eE c3126eE = new C3126eE();
        zzd = c3126eE;
        VK.u(C3126eE.class, c3126eE);
    }

    public static C3073dE A() {
        return (C3073dE) zzd.r();
    }

    public final /* synthetic */ void B(long j6) {
        this.zza |= 1;
        this.zzb = j6;
    }

    public final /* synthetic */ void C(int i) {
        this.zzc = i - 1;
        this.zza |= 2;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zza", "zzb", "zzc", C3494l6.f31712C});
        }
        if (d2 == 3) {
            return new C3126eE();
        }
        if (d2 == 4) {
            return new C3073dE(zzd);
        }
        if (d2 == 5) {
            return zzd;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zze;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (C3126eE.class) {
            try {
                interfaceC4048vL = zze;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzd);
                    zze = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
