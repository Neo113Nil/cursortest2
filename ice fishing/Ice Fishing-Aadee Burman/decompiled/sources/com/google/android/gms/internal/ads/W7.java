package com.google.android.gms.internal.ads;

import java.util.List;
import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class W7 extends VK {
    private static final W7 zzd;
    private static volatile InterfaceC4048vL zze;
    private int zza;
    private C3067d8 zzb;
    private ZK zzc = WK.f28348x;

    static {
        W7 w72 = new W7();
        zzd = w72;
        VK.u(W7.class, w72);
    }

    public static W7 C(byte[] bArr, PK pk) {
        VK y7 = VK.y(zzd, bArr, bArr.length, pk);
        VK.z(y7);
        return (W7) y7;
    }

    public final C3067d8 A() {
        C3067d8 c3067d8 = this.zzb;
        return c3067d8 == null ? C3067d8.E() : c3067d8;
    }

    public final List B() {
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
            return new C4264zL(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002'", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d2 == 3) {
            return new W7();
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
        synchronized (W7.class) {
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
