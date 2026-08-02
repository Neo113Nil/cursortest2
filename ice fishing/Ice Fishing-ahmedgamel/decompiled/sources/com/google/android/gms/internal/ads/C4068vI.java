package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.vI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4068vI extends VK {
    private static final C4068vI zzd;
    private static volatile InterfaceC4071vL zze;
    private int zza;
    private int zzb;
    private C4176xI zzc;

    static {
        C4068vI c4068vI = new C4068vI();
        zzd = c4068vI;
        VK.u(C4068vI.class, c4068vI);
    }

    public static C4068vI C(JK jk, PK pk) {
        return (C4068vI) VK.m(zzd, jk, pk);
    }

    public static C4014uI D() {
        return (C4014uI) zzd.r();
    }

    public static InterfaceC4071vL E() {
        return zzd.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final C4176xI B() {
        C4176xI c4176xI = this.zzc;
        return c4176xI == null ? C4176xI.E() : c4176xI;
    }

    public final /* synthetic */ void F(C4176xI c4176xI) {
        this.zzc = c4176xI;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d9 == 3) {
            return new C4068vI();
        }
        if (d9 == 4) {
            return new C4014uI(zzd);
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
        synchronized (C4068vI.class) {
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
