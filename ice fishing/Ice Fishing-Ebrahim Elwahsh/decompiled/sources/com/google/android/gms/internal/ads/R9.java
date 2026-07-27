package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class R9 extends AbstractC3199fL {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final R9 zzl;
    private static volatile GL zzm;
    private int zzf;
    private String zzg = "";
    private InterfaceC3630nL zzh = JL.f25761x;
    private int zzi = 1000;
    private int zzj = 1000;
    private int zzk = 1000;

    static {
        R9 r9 = new R9();
        zzl = r9;
        AbstractC3199fL.u(R9.class, r9);
    }

    public static R9 A() {
        return zzl;
    }

    public final void B(String str) {
        str.getClass();
        this.zzf |= 1;
        this.zzg = str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            C3293h6 c3293h6 = C3293h6.f31172x;
            return new KL(zzl, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzf", "zzg", "zzh", O9.class, "zzi", c3293h6, "zzj", c3293h6, "zzk", c3293h6});
        }
        if (d2 == 3) {
            return new R9();
        }
        if (d2 == 4) {
            return new Q9(zzl);
        }
        if (d2 == 5) {
            return zzl;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzm;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (R9.class) {
            try {
                gl = zzm;
                if (gl == null) {
                    gl = new C3144eL(zzl);
                    zzm = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
