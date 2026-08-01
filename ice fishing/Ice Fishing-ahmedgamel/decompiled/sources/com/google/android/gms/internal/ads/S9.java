package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class S9 extends VK {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final S9 zzh;
    private static volatile InterfaceC4048vL zzi;
    private int zzd;
    private String zze = "";
    private InterfaceC3026cL zzf = C4210yL.f35149x;
    private int zzg;

    static {
        S9 s9 = new S9();
        zzh = s9;
        VK.u(S9.class, s9);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001", new Object[]{"zzd", "zze", "zzf", R9.class, "zzg", C3494l6.f31736x});
        }
        if (d2 == 3) {
            return new S9();
        }
        if (d2 == 4) {
            return new I9(zzh);
        }
        if (d2 == 5) {
            return zzh;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzi;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (S9.class) {
            try {
                interfaceC4048vL = zzi;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzh);
                    zzi = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
