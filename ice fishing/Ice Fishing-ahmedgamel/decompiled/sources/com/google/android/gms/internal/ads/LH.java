package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class LH extends VK {
    private static final LH zzd;
    private static volatile InterfaceC4048vL zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        LH lh = new LH();
        zzd = lh;
        VK.u(LH.class, lh);
    }

    public static KH B() {
        return (KH) zzd.r();
    }

    public static LH C() {
        return zzd;
    }

    public final WH A() {
        WH a9 = WH.a(this.zza);
        return a9 == null ? WH.UNRECOGNIZED : a9;
    }

    public final /* synthetic */ void D(WH wh) {
        this.zza = wh.c();
    }

    public final int E() {
        int i = this.zzb;
        int i6 = i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 7 : 6 : 5 : 4 : 2;
        if (i6 == 0) {
            return 1;
        }
        return i6;
    }

    public final int F() {
        int i = this.zzc;
        int i6 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
        if (i6 == 0) {
            return 1;
        }
        return i6;
    }

    public final void G(int i) {
        if (i != 1) {
            this.zzb = i - 2;
        } else {
            AbstractC3080dL.a();
            throw null;
        }
    }

    public final void H(int i) {
        if (i != 1) {
            this.zzc = i - 2;
        } else {
            AbstractC3080dL.a();
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d2 == 3) {
            return new LH();
        }
        if (d2 == 4) {
            return new KH(zzd);
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
        synchronized (LH.class) {
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
