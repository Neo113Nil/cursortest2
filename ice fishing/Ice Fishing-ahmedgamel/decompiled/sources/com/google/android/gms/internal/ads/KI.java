package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class KI extends VK {
    private static final KI zzd;
    private static volatile InterfaceC4071vL zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        KI ki = new KI();
        zzd = ki;
        VK.u(KI.class, ki);
    }

    public static JI D() {
        return (JI) zzd.r();
    }

    public static KI E() {
        return zzd;
    }

    public final WH A() {
        WH a9 = WH.a(this.zza);
        return a9 == null ? WH.UNRECOGNIZED : a9;
    }

    public final WH B() {
        WH a9 = WH.a(this.zzb);
        return a9 == null ? WH.UNRECOGNIZED : a9;
    }

    public final int C() {
        return this.zzc;
    }

    public final /* synthetic */ void F(WH wh) {
        this.zza = wh.c();
    }

    public final /* synthetic */ void G(WH wh) {
        this.zzb = wh.c();
    }

    public final /* synthetic */ void H(int i) {
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d9 == 3) {
            return new KI();
        }
        if (d9 == 4) {
            return new JI(zzd);
        }
        if (d9 == 5) {
            return zzd;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zze;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (KI.class) {
            try {
                interfaceC4071vL = zze;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzd);
                    zze = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
