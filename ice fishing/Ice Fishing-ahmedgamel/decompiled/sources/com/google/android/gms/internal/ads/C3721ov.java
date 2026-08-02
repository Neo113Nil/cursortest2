package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.ov, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3721ov extends VK {
    private static final C3721ov zze;
    private static volatile InterfaceC4071vL zzf;
    private int zza;
    private int zzc;
    private String zzb = "";
    private String zzd = "";

    static {
        C3721ov c3721ov = new C3721ov();
        zze = c3721ov;
        VK.u(C3721ov.class, c3721ov);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zze, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\f\u0004Ȉ", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (d9 == 3) {
            return new C3721ov();
        }
        if (d9 == 4) {
            return new I9(zze);
        }
        if (d9 == 5) {
            return zze;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzf;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (C3721ov.class) {
            try {
                interfaceC4071vL = zzf;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zze);
                    zzf = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
