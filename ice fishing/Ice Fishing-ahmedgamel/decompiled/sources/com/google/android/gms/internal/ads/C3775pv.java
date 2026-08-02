package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.pv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3775pv extends VK {
    private static final C3775pv zzb;
    private static volatile InterfaceC4071vL zzc;
    private InterfaceC3049cL zza = C4233yL.f35935x;

    static {
        C3775pv c3775pv = new C3775pv();
        zzb = c3775pv;
        VK.u(C3775pv.class, c3775pv);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", C3721ov.class});
        }
        if (d9 == 3) {
            return new C3775pv();
        }
        if (d9 == 4) {
            return new I9(zzb);
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
        synchronized (C3775pv.class) {
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
