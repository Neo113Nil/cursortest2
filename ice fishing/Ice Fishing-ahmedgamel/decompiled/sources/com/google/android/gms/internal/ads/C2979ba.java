package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.ba, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2979ba extends VK {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final C2979ba zzj;
    private static volatile InterfaceC4048vL zzk;
    private int zze;
    private int zzg;
    private C3928t9 zzi;
    private String zzf = "";
    private ZK zzh = WK.f28348x;

    static {
        C2979ba c2979ba = new C2979ba();
        zzj = c2979ba;
        VK.u(C2979ba.class, c2979ba);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzj, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", C3494l6.f31736x, "zzh", "zzi"});
        }
        if (d2 == 3) {
            return new C2979ba();
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
        synchronized (C2979ba.class) {
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
