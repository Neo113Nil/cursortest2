package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.jH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3397jH extends VK {
    private static final C3397jH zzd;
    private static volatile InterfaceC4048vL zze;
    private int zza;
    private C3667oH zzb;
    private C2916aI zzc;

    static {
        C3397jH c3397jH = new C3397jH();
        zzd = c3397jH;
        VK.u(C3397jH.class, c3397jH);
    }

    public static C3397jH C(JK jk, PK pk) {
        return (C3397jH) VK.m(zzd, jk, pk);
    }

    public static C3345iH D() {
        return (C3345iH) zzd.r();
    }

    public final C3667oH A() {
        C3667oH c3667oH = this.zzb;
        return c3667oH == null ? C3667oH.D() : c3667oH;
    }

    public final C2916aI B() {
        C2916aI c2916aI = this.zzc;
        return c2916aI == null ? C2916aI.F() : c2916aI;
    }

    public final /* synthetic */ void E(C3667oH c3667oH) {
        this.zzb = c3667oH;
        this.zza |= 1;
    }

    public final /* synthetic */ void F(C2916aI c2916aI) {
        this.zzc = c2916aI;
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
            return new C4264zL(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d2 == 3) {
            return new C3397jH();
        }
        if (d2 == 4) {
            return new C3345iH(zzd);
        }
        if (d2 == 5) {
            return zzd;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zze;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (C3397jH.class) {
            try {
                interfaceC4048vL = zze;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzd);
                    zze = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
