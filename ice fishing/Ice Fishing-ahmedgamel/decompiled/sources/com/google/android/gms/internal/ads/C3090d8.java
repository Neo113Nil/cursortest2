package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.d8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3090d8 extends VK {
    private static final C3090d8 zzd;
    private static volatile InterfaceC4071vL zze;
    private int zza;
    private C3143e8 zzb;
    private JK zzc = JK.f26428u;

    static {
        C3090d8 c3090d8 = new C3090d8();
        zzd = c3090d8;
        VK.u(C3090d8.class, c3090d8);
    }

    public static C3090d8 E() {
        return zzd;
    }

    public final boolean A() {
        return (this.zza & 1) != 0;
    }

    public final C3143e8 B() {
        C3143e8 c3143e8 = this.zzb;
        return c3143e8 == null ? C3143e8.D() : c3143e8;
    }

    public final boolean C() {
        return (this.zza & 2) != 0;
    }

    public final JK D() {
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
            return new C4287zL(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d9 == 3) {
            return new C3090d8();
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
        synchronized (C3090d8.class) {
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
