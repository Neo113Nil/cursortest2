package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.hH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3314hH extends VK {
    private static final C3314hH zze;
    private static volatile InterfaceC4071vL zzf;
    private int zza;
    private int zzb;
    private C3528lH zzc;
    private YH zzd;

    static {
        C3314hH c3314hH = new C3314hH();
        zze = c3314hH;
        VK.u(C3314hH.class, c3314hH);
    }

    public static C3314hH D(JK jk, PK pk) {
        return (C3314hH) VK.m(zze, jk, pk);
    }

    public static C3260gH E() {
        return (C3260gH) zze.r();
    }

    public static InterfaceC4071vL F() {
        return zze.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final C3528lH B() {
        C3528lH c3528lH = this.zzc;
        return c3528lH == null ? C3528lH.E() : c3528lH;
    }

    public final YH C() {
        YH yh = this.zzd;
        return yh == null ? YH.F() : yh;
    }

    public final /* synthetic */ void G(C3528lH c3528lH) {
        this.zzc = c3528lH;
        this.zza |= 1;
    }

    public final /* synthetic */ void H(YH yh) {
        this.zzd = yh;
        this.zza |= 2;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (d9 == 3) {
            return new C3314hH();
        }
        if (d9 == 4) {
            return new C3260gH(zze);
        }
        if (d9 == 5) {
            return zze;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzf;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (C3314hH.class) {
            try {
                interfaceC4071vL = zzf;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zze);
                    zzf = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
