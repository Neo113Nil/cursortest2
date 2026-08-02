package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.iM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3373iM extends VK {
    private static final C3373iM zzf;
    private static volatile InterfaceC4071vL zzg;
    private int zza;
    private C3319hM zzc;
    private long zzd;
    private String zzb = "";
    private String zze = "";

    static {
        C3373iM c3373iM = new C3373iM();
        zzf = c3373iM;
        VK.u(C3373iM.class, c3373iM);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (d9 == 3) {
            return new C3373iM();
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
        synchronized (C3373iM.class) {
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
