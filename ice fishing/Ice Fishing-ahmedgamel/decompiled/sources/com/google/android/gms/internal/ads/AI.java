package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class AI extends VK {
    private static final AI zze;
    private static volatile InterfaceC4048vL zzf;
    private int zza;
    private CI zzb;
    private int zzc;
    private JK zzd = JK.f25675u;

    static {
        AI ai = new AI();
        zze = ai;
        VK.u(AI.class, ai);
    }

    public static AI D(JK jk, PK pk) {
        return (AI) VK.m(zze, jk, pk);
    }

    public static C4261zI E() {
        return (C4261zI) zze.r();
    }

    public final CI A() {
        CI ci = this.zzb;
        return ci == null ? CI.C() : ci;
    }

    public final int B() {
        return this.zzc;
    }

    public final JK C() {
        return this.zzd;
    }

    public final /* synthetic */ void F(CI ci) {
        this.zzb = ci;
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
            return new AI();
        }
        if (d2 == 4) {
            return new C4261zI(zze);
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
        synchronized (AI.class) {
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
