package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class GI extends VK {
    private static final GI zzf;
    private static volatile InterfaceC4071vL zzg;
    private int zza;
    private int zzb;
    private CI zzc;
    private JK zzd;
    private JK zze;

    static {
        GI gi = new GI();
        zzf = gi;
        VK.u(GI.class, gi);
    }

    public GI() {
        HK hk = JK.f26428u;
        this.zzd = hk;
        this.zze = hk;
    }

    public static GI E(JK jk, PK pk) {
        return (GI) VK.m(zzf, jk, pk);
    }

    public static FI F() {
        return (FI) zzf.r();
    }

    public static GI G() {
        return zzf;
    }

    public static InterfaceC4071vL H() {
        return zzf.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final CI B() {
        CI ci = this.zzc;
        return ci == null ? CI.C() : ci;
    }

    public final JK C() {
        return this.zzd;
    }

    public final JK D() {
        return this.zze;
    }

    public final /* synthetic */ void I(CI ci) {
        this.zzc = ci;
        this.zza |= 1;
    }

    public final /* synthetic */ void J(HK hk) {
        hk.getClass();
        this.zzd = hk;
    }

    public final /* synthetic */ void K(HK hk) {
        hk.getClass();
        this.zze = hk;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (d9 == 3) {
            return new GI();
        }
        if (d9 == 4) {
            return new FI(zzf);
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
        synchronized (GI.class) {
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
