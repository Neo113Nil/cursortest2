package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.nv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3644nv extends VK {
    private static final C3644nv zzg;
    private static volatile InterfaceC4048vL zzh;
    private int zzb;
    private int zzc;
    private boolean zzd;
    private boolean zzf;
    private String zza = "";
    private String zze = "";

    static {
        C3644nv c3644nv = new C3644nv();
        zzg = c3644nv;
        VK.u(C3644nv.class, c3644nv);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzg, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0007\u0005Ȉ\u0006\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (d2 == 3) {
            return new C3644nv();
        }
        if (d2 == 4) {
            return new I9(zzg);
        }
        if (d2 == 5) {
            return zzg;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzh;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (C3644nv.class) {
            try {
                interfaceC4048vL = zzh;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzg);
                    zzh = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
