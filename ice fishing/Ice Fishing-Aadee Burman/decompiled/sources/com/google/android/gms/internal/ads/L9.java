package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class L9 extends VK {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    private static final L9 zzn;
    private static volatile InterfaceC4048vL zzo;
    private int zzg;
    private int zzh = 1000;
    private C4198y9 zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;

    static {
        L9 l9 = new L9();
        zzn = l9;
        VK.u(L9.class, l9);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzn, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzg", "zzh", C3494l6.f31736x, "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (d2 == 3) {
            return new L9();
        }
        if (d2 == 4) {
            return new I9(zzn);
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
        synchronized (L9.class) {
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
