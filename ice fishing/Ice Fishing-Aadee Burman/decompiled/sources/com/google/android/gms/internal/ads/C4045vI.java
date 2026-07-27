package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.vI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4045vI extends VK {
    private static final C4045vI zzd;
    private static volatile InterfaceC4048vL zze;
    private int zza;
    private int zzb;
    private C4153xI zzc;

    static {
        C4045vI c4045vI = new C4045vI();
        zzd = c4045vI;
        VK.u(C4045vI.class, c4045vI);
    }

    public static C4045vI C(JK jk, PK pk) {
        return (C4045vI) VK.m(zzd, jk, pk);
    }

    public static C3991uI D() {
        return (C3991uI) zzd.r();
    }

    public static InterfaceC4048vL E() {
        return zzd.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final C4153xI B() {
        C4153xI c4153xI = this.zzc;
        return c4153xI == null ? C4153xI.E() : c4153xI;
    }

    public final /* synthetic */ void F(C4153xI c4153xI) {
        this.zzc = c4153xI;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d2 == 3) {
            return new C4045vI();
        }
        if (d2 == 4) {
            return new C3991uI(zzd);
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
        synchronized (C4045vI.class) {
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
