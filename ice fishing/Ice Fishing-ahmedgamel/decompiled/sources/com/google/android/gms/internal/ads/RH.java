package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class RH extends VK {
    private static final RH zzb;
    private static volatile InterfaceC4048vL zzc;
    private int zza;

    static {
        RH rh = new RH();
        zzb = rh;
        VK.u(RH.class, rh);
    }

    public static RH B(JK jk, PK pk) {
        return (RH) VK.m(zzb, jk, pk);
    }

    public static RH C() {
        return zzb;
    }

    public final int A() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (d2 == 3) {
            return new RH();
        }
        if (d2 == 4) {
            return new I9(zzb);
        }
        if (d2 == 5) {
            return zzb;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzc;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (RH.class) {
            try {
                interfaceC4048vL = zzc;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzb);
                    zzc = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
