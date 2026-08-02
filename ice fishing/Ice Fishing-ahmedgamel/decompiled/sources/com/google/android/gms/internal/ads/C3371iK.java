package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.iK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3371iK extends VK {
    private static final C3371iK zzf;
    private static volatile InterfaceC4071vL zzg;
    private int zza;
    private JK zzb = JK.f26428u;
    private String zzc = "";
    private InterfaceC3049cL zzd = C4233yL.f35935x;
    private boolean zze;

    static {
        C3371iK c3371iK = new C3371iK();
        zzf = c3371iK;
        VK.u(C3371iK.class, c3371iK);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ည\u0000\u0002\u001c\u0003ဇ\u0002\u0004ဈ\u0001", new Object[]{"zza", "zzb", "zzd", "zze", "zzc"});
        }
        if (d9 == 3) {
            return new C3371iK();
        }
        if (d9 == 4) {
            return new C3317hK(zzf);
        }
        if (d9 == 5) {
            return zzf;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzg;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (C3371iK.class) {
            try {
                interfaceC4071vL = zzg;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzf);
                    zzg = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
