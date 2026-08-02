package com.google.android.gms.internal.ads;

import java.util.List;
import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class W7 extends VK {
    private static final W7 zzd;
    private static volatile InterfaceC4071vL zze;
    private int zza;
    private C3090d8 zzb;
    private ZK zzc = WK.f29146x;

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

    public final C3090d8 A() {
        C3090d8 c3090d8 = this.zzb;
        return c3090d8 == null ? C3090d8.E() : c3090d8;
    }

    public final List B() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002'", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d9 == 3) {
            return new W7();
        }
        if (d9 == 4) {
            return new C3625n6(zzd);
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
        synchronized (W7.class) {
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
