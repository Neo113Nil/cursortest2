package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.dv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3106dv extends VK {
    private static final C3106dv zzb;
    private static volatile InterfaceC4048vL zzc;
    private String zza = "";

    static {
        C3106dv c3106dv = new C3106dv();
        zzb = c3106dv;
        VK.u(C3106dv.class, c3106dv);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zza"});
        }
        if (d2 == 3) {
            return new C3106dv();
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
        synchronized (C3106dv.class) {
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
