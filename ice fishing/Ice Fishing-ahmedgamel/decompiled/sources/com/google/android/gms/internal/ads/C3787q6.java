package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.q6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3787q6 extends VK {
    private static final C3787q6 zzg;
    private static volatile InterfaceC4071vL zzh;
    private int zza;
    private boolean zzb;
    private int zzc = 5000;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    static {
        C3787q6 c3787q6 = new C3787q6();
        zzg = c3787q6;
        VK.u(C3787q6.class, c3787q6);
    }

    public static C3787q6 D() {
        return zzg;
    }

    public final boolean A() {
        return this.zzb;
    }

    public final int B() {
        return this.zzc;
    }

    public final boolean C() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzg, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (d9 == 3) {
            return new C3787q6();
        }
        if (d9 == 4) {
            return new C3625n6(zzg);
        }
        if (d9 == 5) {
            return zzg;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzh;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (C3787q6.class) {
            try {
                interfaceC4071vL = zzh;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzg);
                    zzh = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
