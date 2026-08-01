package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class WI extends VK {
    private static final WI zzc;
    private static volatile InterfaceC4048vL zzd;
    private int zza;
    private JK zzb = JK.f25675u;

    static {
        WI wi = new WI();
        zzc = wi;
        VK.u(WI.class, wi);
    }

    public static WI C(JK jk, PK pk) {
        return (WI) VK.m(zzc, jk, pk);
    }

    public static VI D() {
        return (VI) zzc.r();
    }

    public static InterfaceC4048vL E() {
        return zzc.o();
    }

    public final int A() {
        return this.zza;
    }

    public final JK B() {
        return this.zzb;
    }

    public final /* synthetic */ void F(JK jk) {
        jk.getClass();
        this.zzb = jk;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zza", "zzb"});
        }
        if (d2 == 3) {
            return new WI();
        }
        if (d2 == 4) {
            return new VI(zzc);
        }
        if (d2 == 5) {
            return zzc;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzd;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (WI.class) {
            try {
                interfaceC4048vL = zzd;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzc);
                    zzd = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
