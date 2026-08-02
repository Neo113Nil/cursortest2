package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class BM extends VK {
    private static final BM zzf;
    private static volatile InterfaceC4071vL zzg;
    private int zza;
    private String zzb = "";
    private InterfaceC3049cL zzc;
    private InterfaceC3049cL zzd;
    private String zze;

    static {
        BM bm = new BM();
        zzf = bm;
        VK.u(BM.class, bm);
    }

    public BM() {
        C4233yL c4233yL = C4233yL.f35935x;
        this.zzc = c4233yL;
        this.zzd = c4233yL;
        this.zze = "";
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001a\u0004ဈ\u0001", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (d9 == 3) {
            return new BM();
        }
        if (d9 == 4) {
            return new C3317hK(zzf);
        }
        if (d9 == 5) {
            return zzf;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzg;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (BM.class) {
            try {
                interfaceC4071vL = zzg;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzf);
                    zzg = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
