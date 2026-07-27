package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.h8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3282h8 extends VK {
    private static final C3282h8 zzd;
    private static volatile InterfaceC4048vL zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        C3282h8 c3282h8 = new C3282h8();
        zzd = c3282h8;
        VK.u(C3282h8.class, c3282h8);
    }

    public static C3282h8 C() {
        return zzd;
    }

    public final int A() {
        return this.zzb;
    }

    public final int B() {
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
            return new C4264zL(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d2 == 3) {
            return new C3282h8();
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
        synchronized (C3282h8.class) {
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
