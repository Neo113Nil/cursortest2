package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.uH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3990uH extends VK {
    private static final C3990uH zzd;
    private static volatile InterfaceC4048vL zze;
    private int zza;
    private C4098wH zzb;
    private int zzc;

    static {
        C3990uH c3990uH = new C3990uH();
        zzd = c3990uH;
        VK.u(C3990uH.class, c3990uH);
    }

    public static C3990uH C(JK jk, PK pk) {
        return (C3990uH) VK.m(zzd, jk, pk);
    }

    public static C3936tH D() {
        return (C3936tH) zzd.r();
    }

    public final C4098wH A() {
        C4098wH c4098wH = this.zzb;
        return c4098wH == null ? C4098wH.C() : c4098wH;
    }

    public final int B() {
        return this.zzc;
    }

    public final /* synthetic */ void E(C4098wH c4098wH) {
        this.zzb = c4098wH;
        this.zza |= 1;
    }

    public final /* synthetic */ void F(int i) {
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
            return new C4264zL(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d2 == 3) {
            return new C3990uH();
        }
        if (d2 == 4) {
            return new C3936tH(zzd);
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
        synchronized (C3990uH.class) {
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
