package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.e8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3120e8 extends VK {
    private static final C3120e8 zzf;
    private static volatile InterfaceC4048vL zzg;
    private int zza;
    private C3282h8 zzb;
    private JK zzc = JK.f25675u;
    private long zzd;
    private long zze;

    static {
        C3120e8 c3120e8 = new C3120e8();
        zzf = c3120e8;
        VK.u(C3120e8.class, c3120e8);
    }

    public static C3120e8 D() {
        return zzf;
    }

    public final C3282h8 A() {
        C3282h8 c3282h8 = this.zzb;
        return c3282h8 == null ? C3282h8.C() : c3282h8;
    }

    public final JK B() {
        return this.zzc;
    }

    public final long C() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (d2 == 3) {
            return new C3120e8();
        }
        if (d2 == 4) {
            return new C3602n6(zzf);
        }
        if (d2 == 5) {
            return zzf;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzg;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (C3120e8.class) {
            try {
                interfaceC4048vL = zzg;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzf);
                    zzg = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
