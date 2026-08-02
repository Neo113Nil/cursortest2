package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.eE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3149eE extends VK {
    private static final C3149eE zzd;
    private static volatile InterfaceC4071vL zze;
    private int zza;
    private long zzb;
    private int zzc;

    static {
        C3149eE c3149eE = new C3149eE();
        zzd = c3149eE;
        VK.u(C3149eE.class, c3149eE);
    }

    public static C3096dE A() {
        return (C3096dE) zzd.r();
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
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zza", "zzb", "zzc", C3517l6.f32492C});
        }
        if (d9 == 3) {
            return new C3149eE();
        }
        if (d9 == 4) {
            return new C3096dE(zzd);
        }
        if (d9 == 5) {
            return zzd;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zze;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (C3149eE.class) {
            try {
                interfaceC4071vL = zze;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzd);
                    zze = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
