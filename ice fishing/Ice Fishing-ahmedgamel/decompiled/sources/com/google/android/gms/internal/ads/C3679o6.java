package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.o6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3679o6 extends VK {
    private static final C3679o6 zzd;
    private static volatile InterfaceC4071vL zze;
    private int zza;
    private String zzb = "";
    private String zzc = "";

    static {
        C3679o6 c3679o6 = new C3679o6();
        zzd = c3679o6;
        VK.u(C3679o6.class, c3679o6);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d9 == 3) {
            return new C3679o6();
        }
        if (d9 == 4) {
            return new C3625n6(zzd);
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
        synchronized (C3679o6.class) {
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
