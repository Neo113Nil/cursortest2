package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.ky, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3498ky extends AbstractC3199fL {
    private static final C3498ky zzf;
    private static volatile GL zzg;
    private int zza;
    private float zzc;
    private String zzb = "https://pagead2.googlesyndication.com/pagead/ping?e=2&f=1";
    private long zzd = 1000;
    private long zze = 60000;

    static {
        C3498ky c3498ky = new C3498ky();
        zzf = c3498ky;
        AbstractC3199fL.u(C3498ky.class, c3498ky);
    }

    public static C3444jy E() {
        return (C3444jy) zzf.r();
    }

    public static C3498ky F() {
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

    public final /* synthetic */ void G(float f6) {
        this.zza |= 2;
        this.zzc = f6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (d2 == 3) {
            return new C3498ky();
        }
        if (d2 == 4) {
            return new C3444jy(zzf);
        }
        if (d2 == 5) {
            return zzf;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzg;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (C3498ky.class) {
            try {
                gl = zzg;
                if (gl == null) {
                    gl = new C3144eL(zzf);
                    zzg = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
