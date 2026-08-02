package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class Ou extends VK {
    private static final Ou zzg;
    private static volatile InterfaceC4071vL zzh;
    private long zza;
    private ZK zzb = WK.f29146x;
    private InterfaceC3049cL zzc;
    private InterfaceC3049cL zzd;
    private InterfaceC3049cL zze;
    private InterfaceC3049cL zzf;

    static {
        Ou ou = new Ou();
        zzg = ou;
        VK.u(Ou.class, ou);
    }

    public Ou() {
        C4233yL c4233yL = C4233yL.f35935x;
        this.zzc = c4233yL;
        this.zzd = c4233yL;
        this.zze = c4233yL;
        this.zzf = c4233yL;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzg, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0005\u0000\u0001\u0002\u0002,\u0003Ț\u0004Ț\u0005Ț\u0006Ț", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (d9 == 3) {
            return new Ou();
        }
        if (d9 == 4) {
            return new I9(zzg);
        }
        if (d9 == 5) {
            return zzg;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzh;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (Ou.class) {
            try {
                interfaceC4071vL = zzh;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzg);
                    zzh = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
