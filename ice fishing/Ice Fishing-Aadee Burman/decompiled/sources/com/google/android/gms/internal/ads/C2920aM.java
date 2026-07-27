package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.aM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2920aM extends VK {
    private static final C2920aM zzb;
    private static volatile InterfaceC4048vL zzc;
    private InterfaceC3026cL zza = C4210yL.f35149x;

    static {
        C2920aM c2920aM = new C2920aM();
        zzb = c2920aM;
        VK.u(C2920aM.class, c2920aM);
    }

    public static ZL A() {
        return (ZL) zzb.r();
    }

    public final void B(YL yl) {
        InterfaceC3026cL interfaceC3026cL = this.zza;
        if (!((AK) interfaceC3026cL).f23663n) {
            int size = interfaceC3026cL.size();
            this.zza = interfaceC3026cL.D(size + size);
        }
        this.zza.add(yl);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", YL.class});
        }
        if (d2 == 3) {
            return new C2920aM();
        }
        if (d2 == 4) {
            return new ZL(zzb);
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
        synchronized (C2920aM.class) {
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
