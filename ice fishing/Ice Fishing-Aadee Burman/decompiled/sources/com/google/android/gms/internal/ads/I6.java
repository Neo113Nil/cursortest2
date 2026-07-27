package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class I6 extends VK {
    private static final I6 zzn;
    private static volatile InterfaceC4048vL zzo;
    private int zza;
    private long zzb;
    private int zzc;
    private boolean zzd;
    private long zzf;
    private boolean zzg;
    private long zzi;
    private long zzj;
    private long zzk;
    private J6 zzl;
    private ZK zze = WK.f28348x;
    private InterfaceC3026cL zzh = C4210yL.f35149x;
    private InterfaceC2973bL zzm = C3509lL.f31759x;

    static {
        I6 i6 = new I6();
        zzn = i6;
        VK.u(I6.class, i6);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzn, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003\u0006ဇ\u0004\u0007\u001b\bဂ\u0005\tဂ\u0006\nဂ\u0007\u000bဉ\b\f\u0014", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", M6.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (d2 == 3) {
            return new I6();
        }
        if (d2 == 4) {
            return new C3602n6(zzn);
        }
        if (d2 == 5) {
            return zzn;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzo;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (I6.class) {
            try {
                interfaceC4048vL = zzo;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzn);
                    zzo = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
