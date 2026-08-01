package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class EM extends VK {
    private static final EM zzd;
    private static volatile InterfaceC4048vL zze;
    private int zza;
    private int zzb;
    private String zzc = "";

    static {
        EM em = new EM();
        zzd = em;
        VK.u(EM.class, em);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zza", "zzb", C3027cM.f29461p, "zzc"});
        }
        if (d2 == 3) {
            return new EM();
        }
        if (d2 == 4) {
            return new C3294hK(zzd);
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
        synchronized (EM.class) {
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
