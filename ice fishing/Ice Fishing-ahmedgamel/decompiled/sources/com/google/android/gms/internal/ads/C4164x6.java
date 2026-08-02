package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.x6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4164x6 extends VK {
    private static final C4164x6 zze;
    private static volatile InterfaceC4071vL zzf;
    private int zza;
    private long zzb = -1;
    private int zzc = 1000;
    private int zzd = 1000;

    static {
        C4164x6 c4164x6 = new C4164x6();
        zze = c4164x6;
        VK.u(C4164x6.class, c4164x6);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            C3517l6 c3517l6 = C3517l6.f32505m;
            return new C4287zL(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zza", "zzb", "zzc", c3517l6, "zzd", c3517l6});
        }
        if (d9 == 3) {
            return new C4164x6();
        }
        if (d9 == 4) {
            return new C3625n6(zze);
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
        synchronized (C4164x6.class) {
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
