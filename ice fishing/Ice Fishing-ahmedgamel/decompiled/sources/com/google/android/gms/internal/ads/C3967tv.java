package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.tv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3967tv extends VK {
    private static final C3967tv zzf;
    private static volatile InterfaceC4048vL zzg;
    private long zza;
    private long zzb;
    private InterfaceC3026cL zzc;
    private InterfaceC3026cL zzd;
    private InterfaceC3026cL zze;

    static {
        C3967tv c3967tv = new C3967tv();
        zzf = c3967tv;
        VK.u(C3967tv.class, c3967tv);
    }

    public C3967tv() {
        C4210yL c4210yL = C4210yL.f35149x;
        this.zzc = c4210yL;
        this.zzd = c4210yL;
        this.zze = c4210yL;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzf, "\u0004\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0003\u0000\u0001\u0002\u0002\u0002\u0003Ț\u0004Ț\u0005Ț", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (d2 == 3) {
            return new C3967tv();
        }
        if (d2 == 4) {
            return new I9(zzf);
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
        synchronized (C3967tv.class) {
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
