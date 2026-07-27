package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.iy, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3377iy extends VK {
    private static final C3377iy zzf;
    private static volatile InterfaceC4048vL zzg;
    private int zza;
    private float zzc;
    private String zzb = "https://pagead2.googlesyndication.com/pagead/ping?e=2&f=1";
    private long zzd = 1000;
    private long zze = 60000;

    static {
        C3377iy c3377iy = new C3377iy();
        zzf = c3377iy;
        VK.u(C3377iy.class, c3377iy);
    }

    public static C3325hy E() {
        return (C3325hy) zzf.r();
    }

    public static C3377iy F() {
        return zzf;
    }

    public final String A() {
        return this.zzb;
    }

    public final float B() {
        return this.zzc;
    }

    public final long C() {
        return this.zzd;
    }

    public final long D() {
        return this.zze;
    }

    public final /* synthetic */ void G(float f3) {
        this.zza |= 2;
        this.zzc = f3;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (d2 == 3) {
            return new C3377iy();
        }
        if (d2 == 4) {
            return new C3325hy(zzf);
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
        synchronized (C3377iy.class) {
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
