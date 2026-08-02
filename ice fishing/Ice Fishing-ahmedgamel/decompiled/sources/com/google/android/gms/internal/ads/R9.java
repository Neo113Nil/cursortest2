package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class R9 extends VK {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final R9 zzf;
    private static volatile InterfaceC4071vL zzg;
    private int zzc;
    private int zzd;
    private C3843r9 zze;

    static {
        R9 r9 = new R9();
        zzf = r9;
        VK.u(R9.class, r9);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", C3517l6.f32514v, "zze"});
        }
        if (d9 == 3) {
            return new R9();
        }
        if (d9 == 4) {
            return new I9(zzf);
        }
        if (d9 == 5) {
            return zzf;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzg;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (R9.class) {
            try {
                interfaceC4071vL = zzg;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzf);
                    zzg = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
