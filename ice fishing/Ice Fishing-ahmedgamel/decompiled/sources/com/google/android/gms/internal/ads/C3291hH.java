package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.hH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3291hH extends VK {
    private static final C3291hH zze;
    private static volatile InterfaceC4048vL zzf;
    private int zza;
    private int zzb;
    private C3505lH zzc;
    private YH zzd;

    static {
        C3291hH c3291hH = new C3291hH();
        zze = c3291hH;
        VK.u(C3291hH.class, c3291hH);
    }

    public static C3291hH D(JK jk, PK pk) {
        return (C3291hH) VK.m(zze, jk, pk);
    }

    public static C3237gH E() {
        return (C3237gH) zze.r();
    }

    public static InterfaceC4048vL F() {
        return zze.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final C3505lH B() {
        C3505lH c3505lH = this.zzc;
        return c3505lH == null ? C3505lH.E() : c3505lH;
    }

    public final YH C() {
        YH yh = this.zzd;
        return yh == null ? YH.F() : yh;
    }

    public final /* synthetic */ void G(C3505lH c3505lH) {
        this.zzc = c3505lH;
        this.zza |= 1;
    }

    public final /* synthetic */ void H(YH yh) {
        this.zzd = yh;
        this.zza |= 2;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (d2 == 3) {
            return new C3291hH();
        }
        if (d2 == 4) {
            return new C3237gH(zze);
        }
        if (d2 == 5) {
            return zze;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzf;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (C3291hH.class) {
            try {
                interfaceC4048vL = zzf;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zze);
                    zzf = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
