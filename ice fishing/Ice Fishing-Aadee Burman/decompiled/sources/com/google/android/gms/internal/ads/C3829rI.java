package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.rI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3829rI extends VK {
    private static final C3829rI zzd;
    private static volatile InterfaceC4048vL zze;
    private int zza;
    private int zzb;
    private C3937tI zzc;

    static {
        C3829rI c3829rI = new C3829rI();
        zzd = c3829rI;
        VK.u(C3829rI.class, c3829rI);
    }

    public static C3829rI C(JK jk, PK pk) {
        return (C3829rI) VK.m(zzd, jk, pk);
    }

    public static C3776qI D() {
        return (C3776qI) zzd.r();
    }

    public static InterfaceC4048vL E() {
        return zzd.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final C3937tI B() {
        C3937tI c3937tI = this.zzc;
        return c3937tI == null ? C3937tI.D() : c3937tI;
    }

    public final /* synthetic */ void F(C3937tI c3937tI) {
        this.zzc = c3937tI;
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
            return new C3829rI();
        }
        if (d2 == 4) {
            return new C3776qI(zzd);
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
        synchronized (C3829rI.class) {
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
