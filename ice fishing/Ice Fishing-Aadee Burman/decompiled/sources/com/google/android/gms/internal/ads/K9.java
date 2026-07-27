package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class K9 extends VK {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final K9 zzh;
    private static volatile InterfaceC4048vL zzi;
    private int zzd;
    private int zze = 1000;
    private C4198y9 zzf;
    private C3928t9 zzg;

    static {
        K9 k9 = new K9();
        zzh = k9;
        VK.u(K9.class, k9);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", C3494l6.f31736x, "zzf", "zzg"});
        }
        if (d2 == 3) {
            return new K9();
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
        synchronized (K9.class) {
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
