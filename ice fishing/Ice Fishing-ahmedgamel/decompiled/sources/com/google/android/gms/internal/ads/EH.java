package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class EH extends VK {
    private static final EH zzc;
    private static volatile InterfaceC4048vL zzd;
    private int zza;
    private int zzb;

    static {
        EH eh = new EH();
        zzc = eh;
        VK.u(EH.class, eh);
    }

    public static EH C(JK jk, PK pk) {
        return (EH) VK.m(zzc, jk, pk);
    }

    public static DH D() {
        return (DH) zzc.r();
    }

    public final int A() {
        return this.zza;
    }

    public final int B() {
        return this.zzb;
    }

    public final /* synthetic */ void E(int i) {
        this.zza = i;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzb", "zza"});
        }
        if (d2 == 3) {
            return new EH();
        }
        if (d2 == 4) {
            return new DH(zzc);
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
        synchronized (EH.class) {
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
