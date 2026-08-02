package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.y6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4218y6 extends VK {
    private static final C4218y6 zzc;
    private static volatile InterfaceC4071vL zzd;
    private int zza;
    private long zzb = -1;

    static {
        C4218y6 c4218y6 = new C4218y6();
        zzc = c4218y6;
        VK.u(C4218y6.class, c4218y6);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"zza", "zzb"});
        }
        if (d9 == 3) {
            return new C4218y6();
        }
        if (d9 == 4) {
            return new C3625n6(zzc);
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
        synchronized (C4218y6.class) {
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
