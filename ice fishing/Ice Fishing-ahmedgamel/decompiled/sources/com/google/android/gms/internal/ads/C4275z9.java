package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.z9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4275z9 extends VK {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final C4275z9 zzj;
    private static volatile InterfaceC4071vL zzk;
    private int zze;
    private C4059v9 zzf;
    private int zzg = 1000;
    private C4221y9 zzh;
    private C3951t9 zzi;

    static {
        C4275z9 c4275z9 = new C4275z9();
        zzj = c4275z9;
        VK.u(C4275z9.class, c4275z9);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzj, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", "zzg", C3517l6.f32516x, "zzh", "zzi"});
        }
        if (d9 == 3) {
            return new C4275z9();
        }
        if (d9 == 4) {
            return new C3625n6(zzj);
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
        synchronized (C4275z9.class) {
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
