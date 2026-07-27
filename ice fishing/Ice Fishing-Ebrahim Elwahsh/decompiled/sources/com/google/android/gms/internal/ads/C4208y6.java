package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.y6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4208y6 extends AbstractC3199fL {
    private static final C4208y6 zzd;
    private static volatile GL zze;
    private int zza;
    private long zzb = -1;
    private int zzc = 1000;

    static {
        C4208y6 c4208y6 = new C4208y6();
        zzd = c4208y6;
        AbstractC3199fL.u(C4208y6.class, c4208y6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zza", "zzb", "zzc", C3293h6.f31161m});
        }
        if (d2 == 3) {
            return new C4208y6();
        }
        if (d2 == 4) {
            return new C3453k6(zzd);
        }
        if (d2 == 5) {
            return zzd;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zze;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (C4208y6.class) {
            try {
                gl = zze;
                if (gl == null) {
                    gl = new C3144eL(zzd);
                    zze = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
