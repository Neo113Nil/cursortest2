package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.aI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2916aI extends VK {
    private static final C2916aI zze;
    private static volatile InterfaceC4048vL zzf;
    private int zza;
    private C3023cI zzb;
    private int zzc;
    private int zzd;

    static {
        C2916aI c2916aI = new C2916aI();
        zze = c2916aI;
        VK.u(C2916aI.class, c2916aI);
    }

    public static C2916aI D(JK jk, PK pk) {
        return (C2916aI) VK.m(zze, jk, pk);
    }

    public static ZH E() {
        return (ZH) zze.r();
    }

    public static C2916aI F() {
        return zze;
    }

    public final C3023cI A() {
        C3023cI c3023cI = this.zzb;
        return c3023cI == null ? C3023cI.D() : c3023cI;
    }

    public final int B() {
        return this.zzc;
    }

    public final int C() {
        return this.zzd;
    }

    public final /* synthetic */ void G(C3023cI c3023cI) {
        this.zzb = c3023cI;
        this.zza |= 1;
    }

    public final /* synthetic */ void H(int i) {
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (d2 == 3) {
            return new C2916aI();
        }
        if (d2 == 4) {
            return new ZH(zze);
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
        synchronized (C2916aI.class) {
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
