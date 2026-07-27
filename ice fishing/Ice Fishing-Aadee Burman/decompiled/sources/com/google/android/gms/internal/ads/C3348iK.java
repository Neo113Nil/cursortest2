package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.iK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3348iK extends VK {
    private static final C3348iK zzf;
    private static volatile InterfaceC4048vL zzg;
    private int zza;
    private JK zzb = JK.f25675u;
    private String zzc = "";
    private InterfaceC3026cL zzd = C4210yL.f35149x;
    private boolean zze;

    static {
        C3348iK c3348iK = new C3348iK();
        zzf = c3348iK;
        VK.u(C3348iK.class, c3348iK);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ည\u0000\u0002\u001c\u0003ဇ\u0002\u0004ဈ\u0001", new Object[]{"zza", "zzb", "zzd", "zze", "zzc"});
        }
        if (d2 == 3) {
            return new C3348iK();
        }
        if (d2 == 4) {
            return new C3294hK(zzf);
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
        synchronized (C3348iK.class) {
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
