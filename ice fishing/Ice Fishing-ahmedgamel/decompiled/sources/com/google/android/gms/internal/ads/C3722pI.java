package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.pI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3722pI extends VK {
    private static final C3722pI zzc;
    private static volatile InterfaceC4048vL zzd;
    private int zza;
    private InterfaceC3026cL zzb = C4210yL.f35149x;

    static {
        C3722pI c3722pI = new C3722pI();
        zzc = c3722pI;
        VK.u(C3722pI.class, c3722pI);
    }

    public static C3560mI A() {
        return (C3560mI) zzc.r();
    }

    public final /* synthetic */ void B(int i) {
        this.zza = i;
    }

    public final void C(C3668oI c3668oI) {
        InterfaceC3026cL interfaceC3026cL = this.zzb;
        if (!((AK) interfaceC3026cL).f23663n) {
            int size = interfaceC3026cL.size();
            this.zzb = interfaceC3026cL.D(size + size);
        }
        this.zzb.add(c3668oI);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", C3668oI.class});
        }
        if (d2 == 3) {
            return new C3722pI();
        }
        if (d2 == 4) {
            return new C3560mI(zzc);
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
        synchronized (C3722pI.class) {
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
