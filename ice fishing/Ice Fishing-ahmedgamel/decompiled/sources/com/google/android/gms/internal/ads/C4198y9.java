package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.y9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4198y9 extends VK {
    public static final int zza = 1;
    private static final C4198y9 zzd;
    private static volatile InterfaceC4048vL zze;
    private int zzb;
    private int zzc;

    static {
        C4198y9 c4198y9 = new C4198y9();
        zzd = c4198y9;
        VK.u(C4198y9.class, c4198y9);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzd, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzb", "zzc", C3494l6.f31732t});
        }
        if (d2 == 3) {
            return new C4198y9();
        }
        if (d2 == 4) {
            return new C3602n6(zzd);
        }
        if (d2 == 5) {
            return zzd;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zze;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (C4198y9.class) {
            try {
                interfaceC4048vL = zze;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzd);
                    zze = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
