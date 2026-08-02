package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class I6 extends VK {
    private static final I6 zzn;
    private static volatile InterfaceC4071vL zzo;
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
    private ZK zze = WK.f29146x;
    private InterfaceC3049cL zzh = C4233yL.f35935x;
    private InterfaceC2996bL zzm = C3532lL.f32539x;

    static {
        I6 i6 = new I6();
        zzn = i6;
        VK.u(I6.class, i6);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzn, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003\u0006ဇ\u0004\u0007\u001b\bဂ\u0005\tဂ\u0006\nဂ\u0007\u000bဉ\b\f\u0014", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", M6.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (d9 == 3) {
            return new I6();
        }
        if (d9 == 4) {
            return new C3625n6(zzn);
        }
        if (d9 == 5) {
            return zzn;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzo;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (I6.class) {
            try {
                interfaceC4071vL = zzo;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzn);
                    zzo = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
