package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.q6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3764q6 extends VK {
    private static final C3764q6 zzg;
    private static volatile InterfaceC4048vL zzh;
    private int zza;
    private boolean zzb;
    private int zzc = 5000;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    static {
        C3764q6 c3764q6 = new C3764q6();
        zzg = c3764q6;
        VK.u(C3764q6.class, c3764q6);
    }

    public static C3764q6 D() {
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
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzg, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (d2 == 3) {
            return new C3764q6();
        }
        if (d2 == 4) {
            return new C3602n6(zzg);
        }
        if (d2 == 5) {
            return zzg;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzh;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (C3764q6.class) {
            try {
                interfaceC4048vL = zzh;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzg);
                    zzh = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
