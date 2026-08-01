package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.ov, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3698ov extends VK {
    private static final C3698ov zze;
    private static volatile InterfaceC4048vL zzf;
    private int zza;
    private int zzc;
    private String zzb = "";
    private String zzd = "";

    static {
        C3698ov c3698ov = new C3698ov();
        zze = c3698ov;
        VK.u(C3698ov.class, c3698ov);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zze, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\f\u0004Ȉ", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (d2 == 3) {
            return new C3698ov();
        }
        if (d2 == 4) {
            return new I9(zze);
        }
        if (d2 == 5) {
            return zze;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzf;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (C3698ov.class) {
            try {
                interfaceC4048vL = zzf;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zze);
                    zzf = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
