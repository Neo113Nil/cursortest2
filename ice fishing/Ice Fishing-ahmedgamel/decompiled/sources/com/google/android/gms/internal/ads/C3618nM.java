package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.nM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3618nM extends VK {
    private static final C3618nM zze;
    private static volatile InterfaceC4048vL zzf;
    private int zza;
    private JK zzb;
    private JK zzc;
    private JK zzd;

    static {
        C3618nM c3618nM = new C3618nM();
        zze = c3618nM;
        VK.u(C3618nM.class, c3618nM);
    }

    public C3618nM() {
        HK hk = JK.f25675u;
        this.zzb = hk;
        this.zzc = hk;
        this.zzd = hk;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (d2 == 3) {
            return new C3618nM();
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
        synchronized (C3618nM.class) {
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
