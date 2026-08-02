package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.j9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3412j9 extends VK {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C3412j9 zzf;
    private static volatile InterfaceC4071vL zzg;
    private int zzc;
    private int zzd;
    private C3951t9 zze;

    static {
        C3412j9 c3412j9 = new C3412j9();
        zzf = c3412j9;
        VK.u(C3412j9.class, c3412j9);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", C3517l6.f32516x, "zze"});
        }
        if (d9 == 3) {
            return new C3412j9();
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
        synchronized (C3412j9.class) {
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
