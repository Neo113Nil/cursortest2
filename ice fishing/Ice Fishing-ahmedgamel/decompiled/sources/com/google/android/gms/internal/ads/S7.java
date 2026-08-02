package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class S7 extends VK {
    private static final S7 zze;
    private static volatile InterfaceC4071vL zzf;
    private int zza;
    private int zzb;
    private String zzc = "";
    private ZK zzd = WK.f29146x;

    static {
        S7 s72 = new S7();
        zze = s72;
        VK.u(S7.class, s72);
    }

    public static R7 A() {
        return (R7) zze.r();
    }

    public final /* synthetic */ void B(int i) {
        this.zzb = 15;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zze, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003'", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (d9 == 3) {
            return new S7();
        }
        if (d9 == 4) {
            return new R7(zze);
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
        synchronized (S7.class) {
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
