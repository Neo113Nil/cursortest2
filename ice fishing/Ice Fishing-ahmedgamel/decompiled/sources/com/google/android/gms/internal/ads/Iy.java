package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class Iy extends VK {
    private static final Iy zzf;
    private static volatile InterfaceC4048vL zzg;
    private int zza;
    private Ky zzb;
    private JK zzc;
    private JK zzd;
    private int zze;

    static {
        Iy iy = new Iy();
        zzf = iy;
        VK.u(Iy.class, iy);
    }

    public Iy() {
        HK hk = JK.f25675u;
        this.zzc = hk;
        this.zzd = hk;
    }

    public static Hy D() {
        return (Hy) zzf.r();
    }

    public final Ky A() {
        Ky ky = this.zzb;
        return ky == null ? Ky.G() : ky;
    }

    public final JK B() {
        return this.zzc;
    }

    public final JK C() {
        return this.zzd;
    }

    public final /* synthetic */ void E(Ky ky) {
        this.zzb = ky;
        this.zza |= 1;
    }

    public final /* synthetic */ void F(JK jk) {
        jk.getClass();
        this.zza |= 2;
        this.zzc = jk;
    }

    public final /* synthetic */ void G(JK jk) {
        jk.getClass();
        this.zza |= 4;
        this.zzd = jk;
    }

    public final int H() {
        int a9 = AbstractC2639Kg.a(this.zze);
        if (a9 == 0) {
            return 1;
        }
        return a9;
    }

    public final /* synthetic */ void I(int i) {
        this.zze = i - 1;
        this.zza |= 8;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002\u0004᠌\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", C3494l6.f31711B});
        }
        if (d2 == 3) {
            return new Iy();
        }
        if (d2 == 4) {
            return new Hy(zzf);
        }
        if (d2 == 5) {
            return zzf;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzg;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (Iy.class) {
            try {
                interfaceC4048vL = zzg;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzf);
                    zzg = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
