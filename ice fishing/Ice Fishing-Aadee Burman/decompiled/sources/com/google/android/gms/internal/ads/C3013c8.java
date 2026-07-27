package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.c8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3013c8 extends VK {
    private static final C3013c8 zze;
    private static volatile InterfaceC4048vL zzf;
    private int zza;
    private C3228g8 zzb;
    private JK zzc;
    private JK zzd;

    static {
        C3013c8 c3013c8 = new C3013c8();
        zze = c3013c8;
        VK.u(C3013c8.class, c3013c8);
    }

    public C3013c8() {
        HK hk = JK.f25675u;
        this.zzc = hk;
        this.zzd = hk;
    }

    public static C3013c8 D(HK hk, PK pk) {
        return (C3013c8) VK.m(zze, hk, pk);
    }

    public static C3013c8 E(byte[] bArr, PK pk) {
        VK y7 = VK.y(zze, bArr, bArr.length, pk);
        VK.z(y7);
        return (C3013c8) y7;
    }

    public final C3228g8 A() {
        C3228g8 c3228g8 = this.zzb;
        return c3228g8 == null ? C3228g8.I() : c3228g8;
    }

    public final JK B() {
        return this.zzc;
    }

    public final JK C() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zze, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (d2 == 3) {
            return new C3013c8();
        }
        if (d2 == 4) {
            return new C3602n6(zze);
        }
        if (d2 == 5) {
            return zze;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzf;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (C3013c8.class) {
            try {
                interfaceC4048vL = zzf;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zze);
                    zzf = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
