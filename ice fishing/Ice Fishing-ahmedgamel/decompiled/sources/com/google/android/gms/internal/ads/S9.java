package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class S9 extends VK {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final S9 zzh;
    private static volatile InterfaceC4071vL zzi;
    private int zzd;
    private String zze = "";
    private InterfaceC3049cL zzf = C4233yL.f35935x;
    private int zzg;

    static {
        S9 s9 = new S9();
        zzh = s9;
        VK.u(S9.class, s9);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001", new Object[]{"zzd", "zze", "zzf", R9.class, "zzg", C3517l6.f32516x});
        }
        if (d9 == 3) {
            return new S9();
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
        synchronized (S9.class) {
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
