package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class UM extends VK {
    private static final UM zzj;
    private static volatile InterfaceC4071vL zzk;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private InterfaceC3049cL zzd;
    private InterfaceC3049cL zze;
    private InterfaceC3049cL zzf;
    private int zzg;
    private MM zzh;
    private String zzi;

    static {
        UM um = new UM();
        zzj = um;
        VK.u(UM.class, um);
    }

    public UM() {
        C4233yL c4233yL = C4233yL.f35935x;
        this.zzd = c4233yL;
        this.zze = c4233yL;
        this.zzf = c4233yL;
        this.zzg = -1;
        this.zzi = "";
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzj, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0003\u0000\u0001ဈ\u0001\u0002\u001b\u0003\u001b\u0004င\u0002\u0005ဈ\u0000\b\u001b\tဈ\u0004\nဉ\u0003", new Object[]{"zza", "zzc", "zzd", OM.class, "zze", RM.class, "zzg", "zzb", "zzf", XM.class, "zzi", "zzh"});
        }
        if (d9 == 3) {
            return new UM();
        }
        if (d9 == 4) {
            return new SM(zzj);
        }
        if (d9 == 5) {
            return zzj;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzk;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (UM.class) {
            try {
                interfaceC4071vL = zzk;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzj);
                    zzk = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
