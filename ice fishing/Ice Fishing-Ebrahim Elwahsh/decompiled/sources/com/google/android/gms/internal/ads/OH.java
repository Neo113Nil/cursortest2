package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class OH extends AbstractC3199fL {
    private static final OH zza;
    private static volatile GL zzb;

    static {
        OH oh = new OH();
        zza = oh;
        AbstractC3199fL.u(OH.class, oh);
    }

    public static void A(SK sk, YK yk) {
    }

    public static OH B() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zza, "\u0000\u0000", null);
        }
        if (d2 == 3) {
            return new OH();
        }
        if (d2 == 4) {
            return new F9(zza);
        }
        if (d2 == 5) {
            return zza;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzb;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (OH.class) {
            try {
                gl = zzb;
                if (gl == null) {
                    gl = new C3144eL(zza);
                    zzb = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
