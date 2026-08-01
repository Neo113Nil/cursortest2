package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.pv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3752pv extends VK {
    private static final C3752pv zzb;
    private static volatile InterfaceC4048vL zzc;
    private InterfaceC3026cL zza = C4210yL.f35149x;

    static {
        C3752pv c3752pv = new C3752pv();
        zzb = c3752pv;
        VK.u(C3752pv.class, c3752pv);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", C3698ov.class});
        }
        if (d2 == 3) {
            return new C3752pv();
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
        synchronized (C3752pv.class) {
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
