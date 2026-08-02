package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class Y9 extends VK {
    public static final int zza = 5;
    public static final int zzb = 6;
    public static final int zzc = 7;
    public static final int zzd = 8;
    private static final Y9 zzj;
    private static volatile InterfaceC4071vL zzk;
    private int zze;
    private int zzf;
    private C4059v9 zzg;
    private String zzh = "";
    private String zzi = "";

    static {
        Y9 y9 = new Y9();
        zzj = y9;
        VK.u(Y9.class, y9);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzj, "\u0004\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005᠌\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zze", "zzf", C3517l6.f32515w, "zzg", "zzh", "zzi"});
        }
        if (d9 == 3) {
            return new Y9();
        }
        if (d9 == 4) {
            return new I9(zzj);
        }
        if (d9 == 5) {
            return zzj;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzk;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (Y9.class) {
            try {
                interfaceC4071vL = zzk;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzj);
                    zzk = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
