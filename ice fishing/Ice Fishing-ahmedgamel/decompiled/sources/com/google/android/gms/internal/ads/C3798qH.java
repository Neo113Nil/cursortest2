package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.qH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3798qH extends VK {
    private static final C3798qH zzb;
    private static volatile InterfaceC4071vL zzc;
    private int zza;

    static {
        C3798qH c3798qH = new C3798qH();
        zzb = c3798qH;
        VK.u(C3798qH.class, c3798qH);
    }

    public static C3744pH B() {
        return (C3744pH) zzb.r();
    }

    public static C3798qH C() {
        return zzb;
    }

    public final int A() {
        return this.zza;
    }

    public final /* synthetic */ void D(int i) {
        this.zza = i;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (d9 == 3) {
            return new C3798qH();
        }
        if (d9 == 4) {
            return new C3744pH(zzb);
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
        synchronized (C3798qH.class) {
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
