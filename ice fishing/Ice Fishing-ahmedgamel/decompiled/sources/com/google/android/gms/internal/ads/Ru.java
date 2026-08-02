package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class Ru extends VK {
    private static final Ru zzi;
    private static volatile InterfaceC4071vL zzj;
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
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzi, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\f\u0005Ȉ\u0006\u0004\u0007\u0004\b\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (d9 == 3) {
            return new Ru();
        }
        if (d9 == 4) {
            return new I9(zzi);
        }
        if (d9 == 5) {
            return zzi;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzj;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (Ru.class) {
            try {
                interfaceC4071vL = zzj;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzi);
                    zzj = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
