package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class M9 extends VK {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final M9 zzh;
    private static volatile InterfaceC4071vL zzi;
    private int zzd;
    private int zze = 1000;
    private C4221y9 zzf;
    private C3951t9 zzg;

    static {
        M9 m9 = new M9();
        zzh = m9;
        VK.u(M9.class, m9);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", C3517l6.f32516x, "zzf", "zzg"});
        }
        if (d9 == 3) {
            return new M9();
        }
        if (d9 == 4) {
            return new I9(zzh);
        }
        if (d9 == 5) {
            return zzh;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzi;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (M9.class) {
            try {
                interfaceC4071vL = zzi;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzh);
                    zzi = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
