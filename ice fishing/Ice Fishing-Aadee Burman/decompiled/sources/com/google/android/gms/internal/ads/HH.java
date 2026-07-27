package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class HH extends VK {
    private static final HH zza;
    private static volatile InterfaceC4048vL zzb;

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
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zza, "\u0000\u0000", null);
        }
        if (d2 == 3) {
            return new HH();
        }
        if (d2 == 4) {
            return new I9(zza);
        }
        if (d2 == 5) {
            return zza;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzb;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (HH.class) {
            try {
                interfaceC4048vL = zzb;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zza);
                    zzb = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
