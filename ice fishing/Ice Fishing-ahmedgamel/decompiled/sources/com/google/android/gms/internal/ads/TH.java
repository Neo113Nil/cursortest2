package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class TH extends VK {
    private static final TH zze;
    private static volatile InterfaceC4071vL zzf;
    private int zza;
    private int zzb;
    private JK zzc = JK.f26428u;
    private VH zzd;

    static {
        TH th = new TH();
        zze = th;
        VK.u(TH.class, th);
    }

    public static TH D(JK jk, PK pk) {
        return (TH) VK.m(zze, jk, pk);
    }

    public static SH E() {
        return (SH) zze.r();
    }

    public static InterfaceC4071vL F() {
        return zze.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final JK B() {
        return this.zzc;
    }

    public final VH C() {
        VH vh = this.zzd;
        return vh == null ? VH.E() : vh;
    }

    public final /* synthetic */ void G(JK jk) {
        jk.getClass();
        this.zzc = jk;
    }

    public final /* synthetic */ void H(VH vh) {
        this.zzd = vh;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (d9 == 3) {
            return new TH();
        }
        if (d9 == 4) {
            return new SH(zze);
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
        synchronized (TH.class) {
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
