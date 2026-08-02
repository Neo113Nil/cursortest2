package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.aI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2939aI extends VK {
    private static final C2939aI zze;
    private static volatile InterfaceC4071vL zzf;
    private int zza;
    private C3046cI zzb;
    private int zzc;
    private int zzd;

    static {
        C2939aI c2939aI = new C2939aI();
        zze = c2939aI;
        VK.u(C2939aI.class, c2939aI);
    }

    public static C2939aI D(JK jk, PK pk) {
        return (C2939aI) VK.m(zze, jk, pk);
    }

    public static ZH E() {
        return (ZH) zze.r();
    }

    public static C2939aI F() {
        return zze;
    }

    public final C3046cI A() {
        C3046cI c3046cI = this.zzb;
        return c3046cI == null ? C3046cI.D() : c3046cI;
    }

    public final int B() {
        return this.zzc;
    }

    public final int C() {
        return this.zzd;
    }

    public final /* synthetic */ void G(C3046cI c3046cI) {
        this.zzb = c3046cI;
        this.zza |= 1;
    }

    public final /* synthetic */ void H(int i) {
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (d9 == 3) {
            return new C2939aI();
        }
        if (d9 == 4) {
            return new ZH(zze);
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
        synchronized (C2939aI.class) {
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
