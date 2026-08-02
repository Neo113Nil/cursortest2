package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.fH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3206fH extends VK {
    private static final C3206fH zzb;
    private static volatile InterfaceC4071vL zzc;
    private int zza;

    static {
        C3206fH c3206fH = new C3206fH();
        zzb = c3206fH;
        VK.u(C3206fH.class, c3206fH);
    }

    public static C3152eH B() {
        return (C3152eH) zzb.r();
    }

    public static C3206fH C() {
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
            return new C3206fH();
        }
        if (d9 == 4) {
            return new C3152eH(zzb);
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
        synchronized (C3206fH.class) {
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
