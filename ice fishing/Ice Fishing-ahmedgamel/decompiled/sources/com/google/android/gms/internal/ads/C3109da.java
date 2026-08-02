package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.da, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3109da extends VK {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final C3109da zzj;
    private static volatile InterfaceC4071vL zzk;
    private int zze;
    private C3002ba zzf;
    private InterfaceC3049cL zzg = C4233yL.f35935x;
    private int zzh;
    private C3951t9 zzi;

    static {
        C3109da c3109da = new C3109da();
        zzj = c3109da;
        VK.u(C3109da.class, c3109da);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzj, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003᠌\u0001\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", C3897s9.class, "zzh", C3517l6.f32516x, "zzi"});
        }
        if (d9 == 3) {
            return new C3109da();
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
        synchronized (C3109da.class) {
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
