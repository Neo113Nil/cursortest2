package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.iy, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3400iy extends VK {
    private static final C3400iy zzf;
    private static volatile InterfaceC4071vL zzg;
    private int zza;
    private float zzc;
    private String zzb = "https://pagead2.googlesyndication.com/pagead/ping?e=2&f=1";
    private long zzd = 1000;
    private long zze = 60000;

    static {
        C3400iy c3400iy = new C3400iy();
        zzf = c3400iy;
        VK.u(C3400iy.class, c3400iy);
    }

    public static C3348hy E() {
        return (C3348hy) zzf.r();
    }

    public static C3400iy F() {
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

    public final /* synthetic */ void G(float f2) {
        this.zza |= 2;
        this.zzc = f2;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (d9 == 3) {
            return new C3400iy();
        }
        if (d9 == 4) {
            return new C3348hy(zzf);
        }
        if (d9 == 5) {
            return zzf;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzg;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (C3400iy.class) {
            try {
                interfaceC4071vL = zzg;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzf);
                    zzg = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
