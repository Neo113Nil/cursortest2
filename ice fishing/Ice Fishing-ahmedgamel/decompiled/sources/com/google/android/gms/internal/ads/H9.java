package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class H9 extends VK {
    public static final int zza = 1;
    private static final H9 zzc;
    private static volatile InterfaceC4071vL zzd;
    private InterfaceC3049cL zzb = C4233yL.f35935x;

    static {
        H9 h9 = new H9();
        zzc = h9;
        VK.u(H9.class, h9);
    }

    public static C9 A() {
        return (C9) zzc.r();
    }

    public final void B(B9 b9) {
        InterfaceC3049cL interfaceC3049cL = this.zzb;
        if (!((AK) interfaceC3049cL).f24443n) {
            int size = interfaceC3049cL.size();
            this.zzb = interfaceC3049cL.D(size + size);
        }
        this.zzb.add(b9);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", B9.class});
        }
        if (d9 == 3) {
            return new H9();
        }
        if (d9 == 4) {
            return new C9(zzc);
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
        synchronized (H9.class) {
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
