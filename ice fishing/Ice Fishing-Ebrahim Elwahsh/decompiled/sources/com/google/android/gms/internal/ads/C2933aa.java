package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.aa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2933aa extends AbstractC3199fL {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final C2933aa zzj;
    private static volatile GL zzk;
    private int zze;
    private Y9 zzf;
    private InterfaceC3630nL zzg = JL.f25761x;
    private int zzh;
    private C3780q9 zzi;

    static {
        C2933aa c2933aa = new C2933aa();
        zzj = c2933aa;
        AbstractC3199fL.u(C2933aa.class, c2933aa);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzj, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003᠌\u0001\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", C3726p9.class, "zzh", C3293h6.f31172x, "zzi"});
        }
        if (d2 == 3) {
            return new C2933aa();
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
        synchronized (C2933aa.class) {
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
