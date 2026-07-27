package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class Y9 extends AbstractC3199fL {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final Y9 zzj;
    private static volatile GL zzk;
    private int zze;
    private int zzg;
    private C3780q9 zzi;
    private String zzf = "";
    private InterfaceC3414jL zzh = C3254gL.f30989x;

    static {
        Y9 y9 = new Y9();
        zzj = y9;
        AbstractC3199fL.u(Y9.class, y9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzj, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", C3293h6.f31172x, "zzh", "zzi"});
        }
        if (d2 == 3) {
            return new Y9();
        }
        if (d2 == 4) {
            return new F9(zzj);
        }
        if (d2 == 5) {
            return zzj;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzk;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (Y9.class) {
            try {
                gl = zzk;
                if (gl == null) {
                    gl = new C3144eL(zzj);
                    zzk = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
