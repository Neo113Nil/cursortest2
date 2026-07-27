package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.iE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3342iE extends VK {
    private static final C3342iE zzb;
    private static volatile InterfaceC4048vL zzc;
    private InterfaceC3026cL zza = C4210yL.f35149x;

    static {
        C3342iE c3342iE = new C3342iE();
        zzb = c3342iE;
        VK.u(C3342iE.class, c3342iE);
    }

    public static C3180fE B() {
        return (C3180fE) zzb.r();
    }

    public final int A() {
        return this.zza.size();
    }

    public final void C(C3288hE c3288hE) {
        InterfaceC3026cL interfaceC3026cL = this.zza;
        if (!((AK) interfaceC3026cL).f23663n) {
            int size = interfaceC3026cL.size();
            this.zza = interfaceC3026cL.D(size + size);
        }
        this.zza.add(c3288hE);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", C3288hE.class});
        }
        if (d2 == 3) {
            return new C3342iE();
        }
        if (d2 == 4) {
            return new C3180fE(zzb);
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
        synchronized (C3342iE.class) {
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
