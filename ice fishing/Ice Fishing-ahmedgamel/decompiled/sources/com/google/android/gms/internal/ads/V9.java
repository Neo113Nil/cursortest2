package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class V9 extends VK {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    private static final V9 zzn;
    private static volatile InterfaceC4071vL zzo;
    private int zzg;
    private int zzh;
    private C3951t9 zzi;
    private C3951t9 zzj;
    private C3951t9 zzk;
    private InterfaceC3049cL zzl = C4233yL.f35935x;
    private int zzm;

    static {
        V9 v9 = new V9();
        zzn = v9;
        VK.u(V9.class, v9);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzn, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzg", "zzh", "zzi", "zzj", "zzk", "zzl", C3951t9.class, "zzm"});
        }
        if (d9 == 3) {
            return new V9();
        }
        if (d9 == 4) {
            return new I9(zzn);
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
        synchronized (V9.class) {
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
