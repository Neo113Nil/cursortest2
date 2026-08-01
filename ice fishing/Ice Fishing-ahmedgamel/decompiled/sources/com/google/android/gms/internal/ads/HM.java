package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class HM extends VK {
    private static final HM zzh;
    private static volatile InterfaceC4048vL zzi;
    private int zza;
    private int zzb;
    private int zze;
    private String zzc = "";
    private ZK zzd = WK.f28348x;
    private InterfaceC3026cL zzf = C4210yL.f35149x;
    private JK zzg = JK.f25675u;

    static {
        HM hm = new HM();
        zzh = hm;
        VK.u(HM.class, hm);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzh, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", GM.class, "zzg"});
        }
        if (d2 == 3) {
            return new HM();
        }
        if (d2 == 4) {
            return new C3294hK(zzh);
        }
        if (d2 == 5) {
            return zzh;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzi;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (HM.class) {
            try {
                interfaceC4048vL = zzi;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzh);
                    zzi = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
