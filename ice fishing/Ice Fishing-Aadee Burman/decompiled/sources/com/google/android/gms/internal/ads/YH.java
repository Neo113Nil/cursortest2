package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class YH extends VK {
    private static final YH zze;
    private static volatile InterfaceC4048vL zzf;
    private int zza;
    private int zzb;
    private C3023cI zzc;
    private JK zzd = JK.f25675u;

    static {
        YH yh = new YH();
        zze = yh;
        VK.u(YH.class, yh);
    }

    public static YH D(JK jk, PK pk) {
        return (YH) VK.m(zze, jk, pk);
    }

    public static XH E() {
        return (XH) zze.r();
    }

    public static YH F() {
        return zze;
    }

    public static InterfaceC4048vL G() {
        return zze.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final C3023cI B() {
        C3023cI c3023cI = this.zzc;
        return c3023cI == null ? C3023cI.D() : c3023cI;
    }

    public final JK C() {
        return this.zzd;
    }

    public final /* synthetic */ void H(C3023cI c3023cI) {
        this.zzc = c3023cI;
        this.zza |= 1;
    }

    public final /* synthetic */ void I(HK hk) {
        hk.getClass();
        this.zzd = hk;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (d2 == 3) {
            return new YH();
        }
        if (d2 == 4) {
            return new XH(zze);
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
        synchronized (YH.class) {
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
