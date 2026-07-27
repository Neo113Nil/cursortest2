package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.p9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3726p9 extends AbstractC3199fL {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final C3726p9 zzh;
    private static volatile GL zzi;
    private int zzd;
    private String zze = "";
    private int zzf;
    private C3780q9 zzg;

    static {
        C3726p9 c3726p9 = new C3726p9();
        zzh = c3726p9;
        AbstractC3199fL.u(C3726p9.class, c3726p9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", C3293h6.f31172x, "zzg"});
        }
        if (d2 == 3) {
            return new C3726p9();
        }
        if (d2 == 4) {
            return new C3453k6(zzh);
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
        synchronized (C3726p9.class) {
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
