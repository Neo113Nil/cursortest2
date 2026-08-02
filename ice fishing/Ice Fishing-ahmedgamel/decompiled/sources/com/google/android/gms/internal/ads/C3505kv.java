package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.kv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3505kv extends VK {
    private static final C3505kv zzb;
    private static volatile InterfaceC4071vL zzc;
    private boolean zza;

    static {
        C3505kv c3505kv = new C3505kv();
        zzb = c3505kv;
        VK.u(C3505kv.class, c3505kv);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"zza"});
        }
        if (d9 == 3) {
            return new C3505kv();
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
        synchronized (C3505kv.class) {
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
