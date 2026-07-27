package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class H9 extends AbstractC3199fL {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final H9 zzh;
    private static volatile GL zzi;
    private int zzd;
    private int zze = 1000;
    private C4049v9 zzf;
    private C3780q9 zzg;

    static {
        H9 h9 = new H9();
        zzh = h9;
        AbstractC3199fL.u(H9.class, h9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", C3293h6.f31172x, "zzf", "zzg"});
        }
        if (d2 == 3) {
            return new H9();
        }
        if (d2 == 4) {
            return new F9(zzh);
        }
        if (d2 == 5) {
            return zzh;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzi;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (H9.class) {
            try {
                gl = zzi;
                if (gl == null) {
                    gl = new C3144eL(zzh);
                    zzi = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
