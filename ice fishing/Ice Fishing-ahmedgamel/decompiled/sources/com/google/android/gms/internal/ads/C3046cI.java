package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.cI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3046cI extends VK {
    private static final C3046cI zzc;
    private static volatile InterfaceC4071vL zzd;
    private int zza;
    private int zzb;

    static {
        C3046cI c3046cI = new C3046cI();
        zzc = c3046cI;
        VK.u(C3046cI.class, c3046cI);
    }

    public static C2993bI C() {
        return (C2993bI) zzc.r();
    }

    public static C3046cI D() {
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
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zza", "zzb"});
        }
        if (d9 == 3) {
            return new C3046cI();
        }
        if (d9 == 4) {
            return new C2993bI(zzc);
        }
        if (d9 == 5) {
            return zzc;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzd;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (C3046cI.class) {
            try {
                interfaceC4071vL = zzd;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzc);
                    zzd = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
