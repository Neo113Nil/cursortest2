package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.jH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3420jH extends VK {
    private static final C3420jH zzd;
    private static volatile InterfaceC4071vL zze;
    private int zza;
    private C3690oH zzb;
    private C2939aI zzc;

    static {
        C3420jH c3420jH = new C3420jH();
        zzd = c3420jH;
        VK.u(C3420jH.class, c3420jH);
    }

    public static C3420jH C(JK jk, PK pk) {
        return (C3420jH) VK.m(zzd, jk, pk);
    }

    public static C3368iH D() {
        return (C3368iH) zzd.r();
    }

    public final C3690oH A() {
        C3690oH c3690oH = this.zzb;
        return c3690oH == null ? C3690oH.D() : c3690oH;
    }

    public final C2939aI B() {
        C2939aI c2939aI = this.zzc;
        return c2939aI == null ? C2939aI.F() : c2939aI;
    }

    public final /* synthetic */ void E(C3690oH c3690oH) {
        this.zzb = c3690oH;
        this.zza |= 1;
    }

    public final /* synthetic */ void F(C2939aI c2939aI) {
        this.zzc = c2939aI;
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
            return new C4287zL(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d9 == 3) {
            return new C3420jH();
        }
        if (d9 == 4) {
            return new C3368iH(zzd);
        }
        if (d9 == 5) {
            return zzd;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zze;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (C3420jH.class) {
            try {
                interfaceC4071vL = zze;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzd);
                    zze = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
