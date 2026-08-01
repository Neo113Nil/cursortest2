package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class II extends VK {
    private static final II zze;
    private static volatile InterfaceC4048vL zzf;
    private int zza;
    private KI zzb;
    private int zzc;
    private JK zzd = JK.f25675u;

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
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (d2 == 3) {
            return new II();
        }
        if (d2 == 4) {
            return new HI(zze);
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
        synchronized (II.class) {
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
