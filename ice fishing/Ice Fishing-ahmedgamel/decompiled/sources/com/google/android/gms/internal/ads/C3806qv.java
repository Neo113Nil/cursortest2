package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.qv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3806qv extends VK {
    private static final C3806qv zze;
    private static volatile InterfaceC4048vL zzf;
    private int zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;

    static {
        C3806qv c3806qv = new C3806qv();
        zze = c3806qv;
        VK.u(C3806qv.class, c3806qv);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zze, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0007\u0003\u0007\u0004\u0007", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (d2 == 3) {
            return new C3806qv();
        }
        if (d2 == 4) {
            return new I9(zze);
        }
        if (d2 == 5) {
            return zze;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzf;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (C3806qv.class) {
            try {
                interfaceC4048vL = zzf;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zze);
                    zzf = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
