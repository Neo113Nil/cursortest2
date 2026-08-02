package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.v9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4059v9 extends VK {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final C4059v9 zzh;
    private static volatile InterfaceC4071vL zzi;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C4059v9 c4059v9 = new C4059v9();
        zzh = c4059v9;
        VK.u(C4059v9.class, c4059v9);
    }

    public static C4005u9 B() {
        return (C4005u9) zzh.r();
    }

    public final void A(int i) {
        this.zzd |= 4;
        this.zzg = i;
    }

    public final void C(int i) {
        this.zzd |= 1;
        this.zze = i;
    }

    public final void D(int i) {
        this.zzd |= 2;
        this.zzf = i;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (d9 == 3) {
            return new C4059v9();
        }
        if (d9 == 4) {
            return new C4005u9(zzh);
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
        synchronized (C4059v9.class) {
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
