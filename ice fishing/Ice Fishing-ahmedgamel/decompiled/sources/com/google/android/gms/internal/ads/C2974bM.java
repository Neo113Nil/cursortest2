package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.bM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2974bM extends VK {
    private static final C2974bM zze;
    private static volatile InterfaceC4048vL zzf;
    private int zza;
    private int zzb;
    private long zzc;
    private JK zzd = JK.f25675u;

    static {
        C2974bM c2974bM = new C2974bM();
        zze = c2974bM;
        VK.u(C2974bM.class, c2974bM);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", C3494l6.f31714E, "zzc", "zzd"});
        }
        if (d2 == 3) {
            return new C2974bM();
        }
        if (d2 == 4) {
            return new C3294hK(zze);
        }
        if (d2 == 5) {
            return zze;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzf;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (C2974bM.class) {
            try {
                interfaceC4048vL = zzf;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zze);
                    zzf = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
