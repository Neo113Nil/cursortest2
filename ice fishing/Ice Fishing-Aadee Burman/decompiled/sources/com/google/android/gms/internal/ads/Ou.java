package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class Ou extends VK {
    private static final Ou zzg;
    private static volatile InterfaceC4048vL zzh;
    private long zza;
    private ZK zzb = WK.f28348x;
    private InterfaceC3026cL zzc;
    private InterfaceC3026cL zzd;
    private InterfaceC3026cL zze;
    private InterfaceC3026cL zzf;

    static {
        Ou ou = new Ou();
        zzg = ou;
        VK.u(Ou.class, ou);
    }

    public Ou() {
        C4210yL c4210yL = C4210yL.f35149x;
        this.zzc = c4210yL;
        this.zzd = c4210yL;
        this.zze = c4210yL;
        this.zzf = c4210yL;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzg, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0005\u0000\u0001\u0002\u0002,\u0003Ț\u0004Ț\u0005Ț\u0006Ț", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (d2 == 3) {
            return new Ou();
        }
        if (d2 == 4) {
            return new I9(zzg);
        }
        if (d2 == 5) {
            return zzg;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzh;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (Ou.class) {
            try {
                interfaceC4048vL = zzh;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzg);
                    zzh = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
