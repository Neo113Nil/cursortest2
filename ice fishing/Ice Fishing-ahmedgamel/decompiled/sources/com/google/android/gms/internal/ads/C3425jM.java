package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.jM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3425jM extends VK {
    private static final C3425jM zzf;
    private static volatile InterfaceC4071vL zzg;
    private int zza;
    private int zzb;
    private int zzc;
    private boolean zzd;
    private long zze;

    static {
        C3425jM c3425jM = new C3425jM();
        zzf = c3425jM;
        VK.u(C3425jM.class, c3425jM);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", C3050cM.f30236g, "zzc", C3050cM.f30235f, "zzd", "zze"});
        }
        if (d9 == 3) {
            return new C3425jM();
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
        synchronized (C3425jM.class) {
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
