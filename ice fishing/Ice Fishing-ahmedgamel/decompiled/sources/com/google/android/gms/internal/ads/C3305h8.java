package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.h8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3305h8 extends VK {
    private static final C3305h8 zzd;
    private static volatile InterfaceC4071vL zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        C3305h8 c3305h8 = new C3305h8();
        zzd = c3305h8;
        VK.u(C3305h8.class, c3305h8);
    }

    public static C3305h8 C() {
        return zzd;
    }

    public final int A() {
        return this.zzb;
    }

    public final int B() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d9 == 3) {
            return new C3305h8();
        }
        if (d9 == 4) {
            return new C3625n6(zzd);
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
        synchronized (C3305h8.class) {
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
