package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.e8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3143e8 extends VK {
    private static final C3143e8 zzf;
    private static volatile InterfaceC4071vL zzg;
    private int zza;
    private C3305h8 zzb;
    private JK zzc = JK.f26428u;
    private long zzd;
    private long zze;

    static {
        C3143e8 c3143e8 = new C3143e8();
        zzf = c3143e8;
        VK.u(C3143e8.class, c3143e8);
    }

    public static C3143e8 D() {
        return zzf;
    }

    public final C3305h8 A() {
        C3305h8 c3305h8 = this.zzb;
        return c3305h8 == null ? C3305h8.C() : c3305h8;
    }

    public final JK B() {
        return this.zzc;
    }

    public final long C() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (d9 == 3) {
            return new C3143e8();
        }
        if (d9 == 4) {
            return new C3625n6(zzf);
        }
        if (d9 == 5) {
            return zzf;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzg;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (C3143e8.class) {
            try {
                interfaceC4071vL = zzg;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzf);
                    zzg = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
