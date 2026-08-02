package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.sM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3910sM extends VK {
    private static final C3910sM zzd;
    private static volatile InterfaceC4071vL zze;
    private int zza;
    private String zzb = "";
    private long zzc;

    static {
        C3910sM c3910sM = new C3910sM();
        zzd = c3910sM;
        VK.u(C3910sM.class, c3910sM);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d9 == 3) {
            return new C3910sM();
        }
        if (d9 == 4) {
            return new C3317hK(zzd);
        }
        if (d9 == 5) {
            return zzd;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zze;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (C3910sM.class) {
            try {
                interfaceC4071vL = zze;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzd);
                    zze = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
