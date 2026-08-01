package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class Y9 extends VK {
    public static final int zza = 5;
    public static final int zzb = 6;
    public static final int zzc = 7;
    public static final int zzd = 8;
    private static final Y9 zzj;
    private static volatile InterfaceC4048vL zzk;
    private int zze;
    private int zzf;
    private C4036v9 zzg;
    private String zzh = "";
    private String zzi = "";

    static {
        Y9 y9 = new Y9();
        zzj = y9;
        VK.u(Y9.class, y9);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzj, "\u0004\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005᠌\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zze", "zzf", C3494l6.f31735w, "zzg", "zzh", "zzi"});
        }
        if (d2 == 3) {
            return new Y9();
        }
        if (d2 == 4) {
            return new I9(zzj);
        }
        if (d2 == 5) {
            return zzj;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzk;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (Y9.class) {
            try {
                interfaceC4048vL = zzk;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzj);
                    zzk = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
