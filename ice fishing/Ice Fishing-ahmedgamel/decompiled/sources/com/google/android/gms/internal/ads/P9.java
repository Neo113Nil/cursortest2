package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class P9 extends VK {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final P9 zzf;
    private static volatile InterfaceC4048vL zzg;
    private int zzc;
    private boolean zzd;
    private int zze;

    static {
        P9 p9 = new P9();
        zzf = p9;
        VK.u(P9.class, p9);
    }

    public static O9 B() {
        return (O9) zzf.r();
    }

    public final boolean A() {
        return this.zzd;
    }

    public final void C(boolean z3) {
        this.zzc |= 1;
        this.zzd = z3;
    }

    public final void D(int i) {
        this.zzc |= 2;
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        if (d2 == 3) {
            return new P9();
        }
        if (d2 == 4) {
            return new O9(zzf);
        }
        if (d2 == 5) {
            return zzf;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzg;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (P9.class) {
            try {
                interfaceC4048vL = zzg;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzf);
                    zzg = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
