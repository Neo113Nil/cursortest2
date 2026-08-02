package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class HH extends VK {
    private static final HH zza;
    private static volatile InterfaceC4071vL zzb;

    static {
        HH hh = new HH();
        zza = hh;
        VK.u(HH.class, hh);
    }

    public static void A(JK jk, PK pk) {
    }

    public static HH B() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zza, "\u0000\u0000", null);
        }
        if (d9 == 3) {
            return new HH();
        }
        if (d9 == 4) {
            return new I9(zza);
        }
        if (d9 == 5) {
            return zza;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzb;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (HH.class) {
            try {
                interfaceC4071vL = zzb;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zza);
                    zzb = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
