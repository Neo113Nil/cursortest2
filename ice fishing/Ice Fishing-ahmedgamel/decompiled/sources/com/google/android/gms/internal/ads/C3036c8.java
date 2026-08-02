package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.c8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3036c8 extends VK {
    private static final C3036c8 zze;
    private static volatile InterfaceC4071vL zzf;
    private int zza;
    private C3251g8 zzb;
    private JK zzc;
    private JK zzd;

    static {
        C3036c8 c3036c8 = new C3036c8();
        zze = c3036c8;
        VK.u(C3036c8.class, c3036c8);
    }

    public C3036c8() {
        HK hk = JK.f26428u;
        this.zzc = hk;
        this.zzd = hk;
    }

    public static C3036c8 D(HK hk, PK pk) {
        return (C3036c8) VK.m(zze, hk, pk);
    }

    public static C3036c8 E(byte[] bArr, PK pk) {
        VK y7 = VK.y(zze, bArr, bArr.length, pk);
        VK.z(y7);
        return (C3036c8) y7;
    }

    public final C3251g8 A() {
        C3251g8 c3251g8 = this.zzb;
        return c3251g8 == null ? C3251g8.I() : c3251g8;
    }

    public final JK B() {
        return this.zzc;
    }

    public final JK C() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zze, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (d9 == 3) {
            return new C3036c8();
        }
        if (d9 == 4) {
            return new C3625n6(zze);
        }
        if (d9 == 5) {
            return zze;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzf;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (C3036c8.class) {
            try {
                interfaceC4071vL = zzf;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zze);
                    zzf = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
