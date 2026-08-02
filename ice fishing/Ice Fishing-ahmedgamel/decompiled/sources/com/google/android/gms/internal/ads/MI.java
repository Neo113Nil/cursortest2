package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class MI extends VK {
    private static final MI zzj;
    private static volatile InterfaceC4071vL zzk;
    private int zza;
    private int zzb;
    private OI zzc;
    private JK zzd;
    private JK zze;
    private JK zzf;
    private JK zzg;
    private JK zzh;
    private JK zzi;

    static {
        MI mi = new MI();
        zzj = mi;
        VK.u(MI.class, mi);
    }

    public MI() {
        HK hk = JK.f26428u;
        this.zzd = hk;
        this.zze = hk;
        this.zzf = hk;
        this.zzg = hk;
        this.zzh = hk;
        this.zzi = hk;
    }

    public static MI I(JK jk, PK pk) {
        return (MI) VK.m(zzj, jk, pk);
    }

    public static LI J() {
        return (LI) zzj.r();
    }

    public static InterfaceC4071vL K() {
        return zzj.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final OI B() {
        OI oi = this.zzc;
        return oi == null ? OI.G() : oi;
    }

    public final JK C() {
        return this.zzd;
    }

    public final JK D() {
        return this.zze;
    }

    public final JK E() {
        return this.zzf;
    }

    public final JK F() {
        return this.zzg;
    }

    public final JK G() {
        return this.zzh;
    }

    public final JK H() {
        return this.zzi;
    }

    public final /* synthetic */ void L() {
        this.zzb = 0;
    }

    public final /* synthetic */ void M(OI oi) {
        this.zzc = oi;
        this.zza |= 1;
    }

    public final /* synthetic */ void N(HK hk) {
        hk.getClass();
        this.zzd = hk;
    }

    public final /* synthetic */ void O(HK hk) {
        hk.getClass();
        this.zze = hk;
    }

    public final /* synthetic */ void P(HK hk) {
        hk.getClass();
        this.zzf = hk;
    }

    public final /* synthetic */ void Q(HK hk) {
        hk.getClass();
        this.zzg = hk;
    }

    public final /* synthetic */ void R(HK hk) {
        hk.getClass();
        this.zzh = hk;
    }

    public final /* synthetic */ void S(HK hk) {
        hk.getClass();
        this.zzi = hk;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzj, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (d9 == 3) {
            return new MI();
        }
        if (d9 == 4) {
            return new LI(zzj);
        }
        if (d9 == 5) {
            return zzj;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzk;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (MI.class) {
            try {
                interfaceC4071vL = zzk;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzj);
                    zzk = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
