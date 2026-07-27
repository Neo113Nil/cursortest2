package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class MI extends VK {
    private static final MI zzj;
    private static volatile InterfaceC4048vL zzk;
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
        HK hk = JK.f25675u;
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

    public static InterfaceC4048vL K() {
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
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzj, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (d2 == 3) {
            return new MI();
        }
        if (d2 == 4) {
            return new LI(zzj);
        }
        if (d2 == 5) {
            return zzj;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzk;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (MI.class) {
            try {
                interfaceC4048vL = zzk;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzj);
                    zzk = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
