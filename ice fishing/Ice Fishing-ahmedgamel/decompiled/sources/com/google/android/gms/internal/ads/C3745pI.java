package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.pI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3745pI extends VK {
    private static final C3745pI zzc;
    private static volatile InterfaceC4071vL zzd;
    private int zza;
    private InterfaceC3049cL zzb = C4233yL.f35935x;

    static {
        C3745pI c3745pI = new C3745pI();
        zzc = c3745pI;
        VK.u(C3745pI.class, c3745pI);
    }

    public static C3583mI A() {
        return (C3583mI) zzc.r();
    }

    public final /* synthetic */ void B(int i) {
        this.zza = i;
    }

    public final void C(C3691oI c3691oI) {
        InterfaceC3049cL interfaceC3049cL = this.zzb;
        if (!((AK) interfaceC3049cL).f24443n) {
            int size = interfaceC3049cL.size();
            this.zzb = interfaceC3049cL.D(size + size);
        }
        this.zzb.add(c3691oI);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", C3691oI.class});
        }
        if (d9 == 3) {
            return new C3745pI();
        }
        if (d9 == 4) {
            return new C3583mI(zzc);
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
        synchronized (C3745pI.class) {
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
