package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class II extends VK {
    private static final II zze;
    private static volatile InterfaceC4071vL zzf;
    private int zza;
    private KI zzb;
    private int zzc;
    private JK zzd = JK.f26428u;

    static {
        II ii = new II();
        zze = ii;
        VK.u(II.class, ii);
    }

    public static II D(JK jk, PK pk) {
        return (II) VK.m(zze, jk, pk);
    }

    public static HI E() {
        return (HI) zze.r();
    }

    public final KI A() {
        KI ki = this.zzb;
        return ki == null ? KI.E() : ki;
    }

    public final int B() {
        return this.zzc;
    }

    public final JK C() {
        return this.zzd;
    }

    public final /* synthetic */ void F(KI ki) {
        this.zzb = ki;
        this.zza |= 1;
    }

    public final /* synthetic */ void G(int i) {
        this.zzc = i;
    }

    public final /* synthetic */ void H(JK jk) {
        jk.getClass();
        this.zzd = jk;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (d9 == 3) {
            return new II();
        }
        if (d9 == 4) {
            return new HI(zze);
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
        synchronized (II.class) {
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
