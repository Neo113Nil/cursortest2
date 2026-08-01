package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.v9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4036v9 extends VK {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final C4036v9 zzh;
    private static volatile InterfaceC4048vL zzi;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C4036v9 c4036v9 = new C4036v9();
        zzh = c4036v9;
        VK.u(C4036v9.class, c4036v9);
    }

    public static C3982u9 B() {
        return (C3982u9) zzh.r();
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
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (d2 == 3) {
            return new C4036v9();
        }
        if (d2 == 4) {
            return new C3982u9(zzh);
        }
        if (d2 == 5) {
            return zzh;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzi;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (C4036v9.class) {
            try {
                interfaceC4048vL = zzi;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzh);
                    zzi = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
