package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class UM extends VK {
    private static final UM zzj;
    private static volatile InterfaceC4048vL zzk;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private InterfaceC3026cL zzd;
    private InterfaceC3026cL zze;
    private InterfaceC3026cL zzf;
    private int zzg;
    private MM zzh;
    private String zzi;

    static {
        UM um = new UM();
        zzj = um;
        VK.u(UM.class, um);
    }

    public UM() {
        C4210yL c4210yL = C4210yL.f35149x;
        this.zzd = c4210yL;
        this.zze = c4210yL;
        this.zzf = c4210yL;
        this.zzg = -1;
        this.zzi = "";
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzj, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0003\u0000\u0001ဈ\u0001\u0002\u001b\u0003\u001b\u0004င\u0002\u0005ဈ\u0000\b\u001b\tဈ\u0004\nဉ\u0003", new Object[]{"zza", "zzc", "zzd", OM.class, "zze", RM.class, "zzg", "zzb", "zzf", XM.class, "zzi", "zzh"});
        }
        if (d2 == 3) {
            return new UM();
        }
        if (d2 == 4) {
            return new SM(zzj);
        }
        if (d2 == 5) {
            return zzj;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzk;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (UM.class) {
            try {
                interfaceC4048vL = zzk;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzj);
                    zzk = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
