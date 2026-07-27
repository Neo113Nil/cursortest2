package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.t6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3925t6 extends VK {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f34219a = 0;
    private static final C3925t6 zzg;
    private static volatile InterfaceC4048vL zzh;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzb = 100;
    private long zze = 300;
    private long zzf = 1000;

    static {
        C3925t6 c3925t6 = new C3925t6();
        zzg = c3925t6;
        VK.u(C3925t6.class, c3925t6);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (d2 == 3) {
            return new C3925t6();
        }
        if (d2 == 4) {
            return new C3602n6(zzg);
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
        synchronized (C3925t6.class) {
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
