package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class Z9 extends AbstractC3199fL {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final Z9 zzf;
    private static volatile GL zzg;
    private int zzc;
    private int zzd;
    private InterfaceC3414jL zze = C3254gL.f30989x;

    static {
        Z9 z9 = new Z9();
        zzf = z9;
        AbstractC3199fL.u(Z9.class, z9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u0016", new Object[]{"zzc", "zzd", C3293h6.f31172x, "zze"});
        }
        if (d2 == 3) {
            return new Z9();
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
        synchronized (Z9.class) {
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
