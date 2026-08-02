package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class WM extends VK {
    private static final WM zze;
    private static volatile InterfaceC4071vL zzf;
    private int zza;
    private String zzb = "";
    private int zzc;
    private int zzd;

    static {
        WM wm = new WM();
        zze = wm;
        VK.u(WM.class, wm);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003င\u0002", new Object[]{"zza", "zzb", "zzc", C3050cM.f30251w, "zzd"});
        }
        if (d9 == 3) {
            return new WM();
        }
        if (d9 == 4) {
            return new SM(zze);
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
        synchronized (WM.class) {
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
