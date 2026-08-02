package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class HM extends VK {
    private static final HM zzh;
    private static volatile InterfaceC4071vL zzi;
    private int zza;
    private int zzb;
    private int zze;
    private String zzc = "";
    private ZK zzd = WK.f29146x;
    private InterfaceC3049cL zzf = C4233yL.f35935x;
    private JK zzg = JK.f26428u;

    static {
        HM hm = new HM();
        zzh = hm;
        VK.u(HM.class, hm);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzh, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", GM.class, "zzg"});
        }
        if (d9 == 3) {
            return new HM();
        }
        if (d9 == 4) {
            return new C3317hK(zzh);
        }
        if (d9 == 5) {
            return zzh;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzi;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (HM.class) {
            try {
                interfaceC4071vL = zzi;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzh);
                    zzi = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
