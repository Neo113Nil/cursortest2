package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class WL extends VK {
    private static final WL zzc;
    private static volatile InterfaceC4071vL zzd;
    private ZK zza;
    private ZK zzb;

    static {
        WL wl = new WL();
        zzc = wl;
        VK.u(WL.class, wl);
    }

    public WL() {
        WK wk = WK.f29146x;
        this.zza = wk;
        this.zzb = wk;
    }

    public static WL A(byte[] bArr, PK pk) {
        return (WL) VK.n(zzc, bArr, pk);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzc, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u0016\u0003\u0016", new Object[]{"zza", "zzb"});
        }
        if (d9 == 3) {
            return new WL();
        }
        if (d9 == 4) {
            return new C3317hK(zzc);
        }
        if (d9 == 5) {
            return zzc;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzd;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (WL.class) {
            try {
                interfaceC4071vL = zzd;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzc);
                    zzd = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
