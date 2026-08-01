package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.ca, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3032ca extends VK {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C3032ca zzf;
    private static volatile InterfaceC4048vL zzg;
    private int zzc;
    private int zzd;
    private ZK zze = WK.f28348x;

    static {
        C3032ca c3032ca = new C3032ca();
        zzf = c3032ca;
        VK.u(C3032ca.class, c3032ca);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u0016", new Object[]{"zzc", "zzd", C3494l6.f31736x, "zze"});
        }
        if (d2 == 3) {
            return new C3032ca();
        }
        if (d2 == 4) {
            return new I9(zzf);
        }
        if (d2 == 5) {
            return zzf;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzg;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (C3032ca.class) {
            try {
                interfaceC4048vL = zzg;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzf);
                    zzg = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
