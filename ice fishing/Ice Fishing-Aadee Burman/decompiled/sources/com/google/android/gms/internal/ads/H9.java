package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class H9 extends VK {
    public static final int zza = 1;
    private static final H9 zzc;
    private static volatile InterfaceC4048vL zzd;
    private InterfaceC3026cL zzb = C4210yL.f35149x;

    static {
        H9 h9 = new H9();
        zzc = h9;
        VK.u(H9.class, h9);
    }

    public static C9 A() {
        return (C9) zzc.r();
    }

    public final void B(B9 b9) {
        InterfaceC3026cL interfaceC3026cL = this.zzb;
        if (!((AK) interfaceC3026cL).f23663n) {
            int size = interfaceC3026cL.size();
            this.zzb = interfaceC3026cL.D(size + size);
        }
        this.zzb.add(b9);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", B9.class});
        }
        if (d2 == 3) {
            return new H9();
        }
        if (d2 == 4) {
            return new C9(zzc);
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
        synchronized (H9.class) {
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
