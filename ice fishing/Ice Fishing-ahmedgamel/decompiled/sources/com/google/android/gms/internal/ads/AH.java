package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class AH extends VK {
    private static final AH zzc;
    private static volatile InterfaceC4048vL zzd;
    private int zza;
    private int zzb;

    static {
        AH ah = new AH();
        zzc = ah;
        VK.u(AH.class, ah);
    }

    public static AH C(JK jk, PK pk) {
        return (AH) VK.m(zzc, jk, pk);
    }

    public static C4260zH D() {
        return (C4260zH) zzc.r();
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
            return new C4264zL(zzc, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb"});
        }
        if (d2 == 3) {
            return new AH();
        }
        if (d2 == 4) {
            return new C4260zH(zzc);
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
        synchronized (AH.class) {
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
