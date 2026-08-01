package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.da, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3086da extends VK {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final C3086da zzj;
    private static volatile InterfaceC4048vL zzk;
    private int zze;
    private C2979ba zzf;
    private InterfaceC3026cL zzg = C4210yL.f35149x;
    private int zzh;
    private C3928t9 zzi;

    static {
        C3086da c3086da = new C3086da();
        zzj = c3086da;
        VK.u(C3086da.class, c3086da);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzj, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003᠌\u0001\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", C3874s9.class, "zzh", C3494l6.f31736x, "zzi"});
        }
        if (d2 == 3) {
            return new C3086da();
        }
        if (d2 == 4) {
            return new I9(zzj);
        }
        if (d2 == 5) {
            return zzj;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzk;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (C3086da.class) {
            try {
                interfaceC4048vL = zzk;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzj);
                    zzk = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
