package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.f9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3187f9 extends AbstractC3199fL {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C3187f9 zzf;
    private static volatile GL zzg;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        C3187f9 c3187f9 = new C3187f9();
        zzf = c3187f9;
        AbstractC3199fL.u(C3187f9.class, c3187f9);
    }

    public static C3132e9 A() {
        return (C3132e9) zzf.r();
    }

    public final void B(int i) {
        this.zzd = AbstractC5088e.d(i);
        this.zzc |= 1;
    }

    public final void C(int i) {
        int i4 = 1;
        if (i == 1) {
            i4 = 0;
        } else if (i != 2) {
            if (i != 3) {
                i4 = 4;
                if (i != 4) {
                    throw null;
                }
            } else {
                i4 = 2;
            }
        }
        this.zze = i4;
        this.zzc |= 2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzc", "zzd", C3293h6.f31166r, "zze", C3293h6.f31165q});
        }
        if (d2 == 3) {
            return new C3187f9();
        }
        if (d2 == 4) {
            return new C3132e9(zzf);
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
        synchronized (C3187f9.class) {
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
