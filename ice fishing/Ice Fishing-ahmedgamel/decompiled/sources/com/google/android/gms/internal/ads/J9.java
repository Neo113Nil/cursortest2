package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class J9 extends VK {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final J9 zzl;
    private static volatile InterfaceC4071vL zzm;
    private int zzf;
    private int zzg = 1000;
    private C4221y9 zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    static {
        J9 j9 = new J9();
        zzl = j9;
        VK.u(J9.class, j9);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzl, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzf", "zzg", C3517l6.f32516x, "zzh", "zzi", "zzj", "zzk"});
        }
        if (d9 == 3) {
            return new J9();
        }
        if (d9 == 4) {
            return new I9(zzl);
        }
        if (d9 == 5) {
            return zzl;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzm;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (J9.class) {
            try {
                interfaceC4071vL = zzm;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzl);
                    zzm = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
