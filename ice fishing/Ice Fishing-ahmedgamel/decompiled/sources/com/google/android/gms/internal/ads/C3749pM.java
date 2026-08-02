package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.pM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3749pM extends VK {
    private static final C3749pM zze;
    private static volatile InterfaceC4071vL zzf;
    private int zza;
    private int zzb;
    private JK zzc;
    private JK zzd;

    static {
        C3749pM c3749pM = new C3749pM();
        zze = c3749pM;
        VK.u(C3749pM.class, c3749pM);
    }

    public C3749pM() {
        HK hk = JK.f26428u;
        this.zzc = hk;
        this.zzd = hk;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (d9 == 3) {
            return new C3749pM();
        }
        if (d9 == 4) {
            return new C3317hK(zze);
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
        synchronized (C3749pM.class) {
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
