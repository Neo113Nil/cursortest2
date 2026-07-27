package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class K9 extends AbstractC3199fL {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final K9 zzf;
    private static volatile GL zzg;
    private int zzc;
    private int zzd = 1000;
    private C4049v9 zze;

    static {
        K9 k9 = new K9();
        zzf = k9;
        AbstractC3199fL.u(K9.class, k9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", C3293h6.f31172x, "zze"});
        }
        if (d2 == 3) {
            return new K9();
        }
        if (d2 == 4) {
            return new F9(zzf);
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
        synchronized (K9.class) {
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
