package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.rI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3852rI extends VK {
    private static final C3852rI zzd;
    private static volatile InterfaceC4071vL zze;
    private int zza;
    private int zzb;
    private C3960tI zzc;

    static {
        C3852rI c3852rI = new C3852rI();
        zzd = c3852rI;
        VK.u(C3852rI.class, c3852rI);
    }

    public static C3852rI C(JK jk, PK pk) {
        return (C3852rI) VK.m(zzd, jk, pk);
    }

    public static C3799qI D() {
        return (C3799qI) zzd.r();
    }

    public static InterfaceC4071vL E() {
        return zzd.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final C3960tI B() {
        C3960tI c3960tI = this.zzc;
        return c3960tI == null ? C3960tI.D() : c3960tI;
    }

    public final /* synthetic */ void F(C3960tI c3960tI) {
        this.zzc = c3960tI;
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
            return new C3852rI();
        }
        if (d9 == 4) {
            return new C3799qI(zzd);
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
        synchronized (C3852rI.class) {
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
