package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.cI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3023cI extends VK {
    private static final C3023cI zzc;
    private static volatile InterfaceC4048vL zzd;
    private int zza;
    private int zzb;

    static {
        C3023cI c3023cI = new C3023cI();
        zzc = c3023cI;
        VK.u(C3023cI.class, c3023cI);
    }

    public static C2970bI C() {
        return (C2970bI) zzc.r();
    }

    public static C3023cI D() {
        return zzc;
    }

    public final WH A() {
        WH a9 = WH.a(this.zza);
        return a9 == null ? WH.UNRECOGNIZED : a9;
    }

    public final int B() {
        return this.zzb;
    }

    public final /* synthetic */ void E(WH wh) {
        this.zza = wh.c();
    }

    public final /* synthetic */ void F(int i) {
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zza", "zzb"});
        }
        if (d2 == 3) {
            return new C3023cI();
        }
        if (d2 == 4) {
            return new C2970bI(zzc);
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
        synchronized (C3023cI.class) {
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
