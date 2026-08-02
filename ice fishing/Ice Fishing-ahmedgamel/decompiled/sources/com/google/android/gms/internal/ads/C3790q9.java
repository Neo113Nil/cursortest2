package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.q9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3790q9 extends VK {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C3790q9 zzf;
    private static volatile InterfaceC4071vL zzg;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        C3790q9 c3790q9 = new C3790q9();
        zzf = c3790q9;
        VK.u(C3790q9.class, c3790q9);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        if (d9 == 3) {
            return new C3790q9();
        }
        if (d9 == 4) {
            return new C3625n6(zzf);
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
        synchronized (C3790q9.class) {
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
