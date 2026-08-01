package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.w6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4087w6 extends VK {
    private static final C4087w6 zzf;
    private static volatile InterfaceC4048vL zzg;
    private int zza;
    private int zzb = 1000;
    private int zzc = 1000;
    private int zzd = 1000;
    private int zze = 1000;

    static {
        C4087w6 c4087w6 = new C4087w6();
        zzf = c4087w6;
        VK.u(C4087w6.class, c4087w6);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            C3494l6 c3494l6 = C3494l6.f31725m;
            return new C4264zL(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003", new Object[]{"zza", "zzb", c3494l6, "zzc", c3494l6, "zzd", c3494l6, "zze", c3494l6});
        }
        if (d2 == 3) {
            return new C4087w6();
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
        synchronized (C4087w6.class) {
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
