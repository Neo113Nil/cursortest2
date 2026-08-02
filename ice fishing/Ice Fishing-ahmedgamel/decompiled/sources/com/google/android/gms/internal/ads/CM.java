package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class CM extends VK {
    private static final CM zzd;
    private static volatile InterfaceC4071vL zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        CM cm = new CM();
        zzd = cm;
        VK.u(CM.class, cm);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            C3050cM c3050cM = C3050cM.f30242n;
            return new C4287zL(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zza", "zzb", c3050cM, "zzc", c3050cM});
        }
        if (d9 == 3) {
            return new CM();
        }
        if (d9 == 4) {
            return new C3317hK(zzd);
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
        synchronized (CM.class) {
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
