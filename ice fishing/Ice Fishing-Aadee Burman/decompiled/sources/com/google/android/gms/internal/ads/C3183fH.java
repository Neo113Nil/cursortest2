package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.fH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3183fH extends VK {
    private static final C3183fH zzb;
    private static volatile InterfaceC4048vL zzc;
    private int zza;

    static {
        C3183fH c3183fH = new C3183fH();
        zzb = c3183fH;
        VK.u(C3183fH.class, c3183fH);
    }

    public static C3129eH B() {
        return (C3129eH) zzb.r();
    }

    public static C3183fH C() {
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
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (d2 == 3) {
            return new C3183fH();
        }
        if (d2 == 4) {
            return new C3129eH(zzb);
        }
        if (d2 == 5) {
            return zzb;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzc;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (C3183fH.class) {
            try {
                interfaceC4048vL = zzc;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzb);
                    zzc = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
