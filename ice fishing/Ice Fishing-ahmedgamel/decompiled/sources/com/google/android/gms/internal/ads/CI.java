package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class CI extends VK {
    private static final CI zzb;
    private static volatile InterfaceC4071vL zzc;
    private int zza;

    static {
        CI ci = new CI();
        zzb = ci;
        VK.u(CI.class, ci);
    }

    public static BI B() {
        return (BI) zzb.r();
    }

    public static CI C() {
        return zzb;
    }

    public final WH A() {
        WH a9 = WH.a(this.zza);
        return a9 == null ? WH.UNRECOGNIZED : a9;
    }

    public final /* synthetic */ void D(WH wh) {
        this.zza = wh.c();
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zza"});
        }
        if (d9 == 3) {
            return new CI();
        }
        if (d9 == 4) {
            return new BI(zzb);
        }
        if (d9 == 5) {
            return zzb;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzc;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (CI.class) {
            try {
                interfaceC4071vL = zzc;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzb);
                    zzc = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
