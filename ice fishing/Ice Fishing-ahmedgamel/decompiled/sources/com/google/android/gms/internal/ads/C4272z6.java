package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.z6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4272z6 extends VK {
    private static final C4272z6 zzd;
    private static volatile InterfaceC4071vL zze;
    private int zza;
    private int zzb;
    private long zzc = -1;

    static {
        C4272z6 c4272z6 = new C4272z6();
        zzd = c4272z6;
        VK.u(C4272z6.class, c4272z6);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zza", "zzb", C3517l6.f32500g, "zzc"});
        }
        if (d9 == 3) {
            return new C4272z6();
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
        synchronized (C4272z6.class) {
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
