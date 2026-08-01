package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class Ru extends VK {
    private static final Ru zzi;
    private static volatile InterfaceC4048vL zzj;
    private int zza;
    private int zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private int zzf;
    private int zzg;
    private boolean zzh;

    static {
        Ru ru = new Ru();
        zzi = ru;
        VK.u(Ru.class, ru);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzi, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\f\u0005Ȉ\u0006\u0004\u0007\u0004\b\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (d2 == 3) {
            return new Ru();
        }
        if (d2 == 4) {
            return new I9(zzi);
        }
        if (d2 == 5) {
            return zzi;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzj;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (Ru.class) {
            try {
                interfaceC4048vL = zzj;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzi);
                    zzj = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
