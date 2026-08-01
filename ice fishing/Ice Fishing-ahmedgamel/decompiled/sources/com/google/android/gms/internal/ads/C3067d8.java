package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.d8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3067d8 extends VK {
    private static final C3067d8 zzd;
    private static volatile InterfaceC4048vL zze;
    private int zza;
    private C3120e8 zzb;
    private JK zzc = JK.f25675u;

    static {
        C3067d8 c3067d8 = new C3067d8();
        zzd = c3067d8;
        VK.u(C3067d8.class, c3067d8);
    }

    public static C3067d8 E() {
        return zzd;
    }

    public final boolean A() {
        return (this.zza & 1) != 0;
    }

    public final C3120e8 B() {
        C3120e8 c3120e8 = this.zzb;
        return c3120e8 == null ? C3120e8.D() : c3120e8;
    }

    public final boolean C() {
        return (this.zza & 2) != 0;
    }

    public final JK D() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d2 == 3) {
            return new C3067d8();
        }
        if (d2 == 4) {
            return new C3602n6(zzd);
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
        synchronized (C3067d8.class) {
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
