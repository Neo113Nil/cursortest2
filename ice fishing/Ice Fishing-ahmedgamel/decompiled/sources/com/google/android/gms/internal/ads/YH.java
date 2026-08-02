package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class YH extends VK {
    private static final YH zze;
    private static volatile InterfaceC4071vL zzf;
    private int zza;
    private int zzb;
    private C3046cI zzc;
    private JK zzd = JK.f26428u;

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

    public static InterfaceC4071vL G() {
        return zze.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final C3046cI B() {
        C3046cI c3046cI = this.zzc;
        return c3046cI == null ? C3046cI.D() : c3046cI;
    }

    public final JK C() {
        return this.zzd;
    }

    public final /* synthetic */ void H(C3046cI c3046cI) {
        this.zzc = c3046cI;
        this.zza |= 1;
    }

    public final /* synthetic */ void I(HK hk) {
        hk.getClass();
        this.zzd = hk;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (d9 == 3) {
            return new YH();
        }
        if (d9 == 4) {
            return new XH(zze);
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
        synchronized (YH.class) {
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
