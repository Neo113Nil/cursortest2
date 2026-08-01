package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class KI extends VK {
    private static final KI zzd;
    private static volatile InterfaceC4048vL zze;
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
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d2 == 3) {
            return new KI();
        }
        if (d2 == 4) {
            return new JI(zzd);
        }
        if (d2 == 5) {
            return zzd;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zze;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (KI.class) {
            try {
                interfaceC4048vL = zze;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzd);
                    zze = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
