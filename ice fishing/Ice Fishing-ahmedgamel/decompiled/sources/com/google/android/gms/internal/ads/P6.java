package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class P6 extends VK {
    private static final P6 zze;
    private static volatile InterfaceC4071vL zzf;
    private int zza;
    private long zzb;
    private String zzc = "";
    private JK zzd = JK.f26428u;

    static {
        P6 p62 = new P6();
        zze = p62;
        VK.u(P6.class, p62);
    }

    public static P6 E() {
        return zze;
    }

    public final boolean A() {
        return (this.zza & 1) != 0;
    }

    public final long B() {
        return this.zzb;
    }

    public final String C() {
        return this.zzc;
    }

    public final JK D() {
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
            return new C4287zL(zze, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (d9 == 3) {
            return new P6();
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
        synchronized (P6.class) {
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
