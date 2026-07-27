package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.w9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4103w9 extends AbstractC3199fL {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final C4103w9 zzj;
    private static volatile GL zzk;
    private int zze;
    private C3887s9 zzf;
    private int zzg = 1000;
    private C4049v9 zzh;
    private C3780q9 zzi;

    static {
        C4103w9 c4103w9 = new C4103w9();
        zzj = c4103w9;
        AbstractC3199fL.u(C4103w9.class, c4103w9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzj, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", "zzg", C3293h6.f31172x, "zzh", "zzi"});
        }
        if (d2 == 3) {
            return new C4103w9();
        }
        if (d2 == 4) {
            return new C3453k6(zzj);
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
        synchronized (C4103w9.class) {
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
