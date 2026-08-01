package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.r9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3820r9 extends VK {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C3820r9 zzf;
    private static volatile InterfaceC4048vL zzg;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        C3820r9 c3820r9 = new C3820r9();
        zzf = c3820r9;
        VK.u(C3820r9.class, c3820r9);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        if (d2 == 3) {
            return new C3820r9();
        }
        if (d2 == 4) {
            return new C3602n6(zzf);
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
        synchronized (C3820r9.class) {
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
