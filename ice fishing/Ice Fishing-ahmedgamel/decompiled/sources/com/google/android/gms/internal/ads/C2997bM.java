package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.bM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2997bM extends VK {
    private static final C2997bM zze;
    private static volatile InterfaceC4071vL zzf;
    private int zza;
    private int zzb;
    private long zzc;
    private JK zzd = JK.f26428u;

    static {
        C2997bM c2997bM = new C2997bM();
        zze = c2997bM;
        VK.u(C2997bM.class, c2997bM);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", C3517l6.f32494E, "zzc", "zzd"});
        }
        if (d9 == 3) {
            return new C2997bM();
        }
        if (d9 == 4) {
            return new C3317hK(zze);
        }
        if (d9 == 5) {
            return zze;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzf;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (C2997bM.class) {
            try {
                interfaceC4071vL = zzf;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zze);
                    zzf = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
