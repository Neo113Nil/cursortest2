package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.lN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3524lN extends AbstractC3199fL {
    private static final C3524lN zzd;
    private static volatile GL zze;
    private int zza;
    private String zzb = "";
    private InterfaceC3630nL zzc = JL.f25761x;

    static {
        C3524lN c3524lN = new C3524lN();
        zzd = c3524lN;
        AbstractC3199fL.u(C3524lN.class, c3524lN);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zza", "zzb", "zzc", C3470kN.class});
        }
        if (d2 == 3) {
            return new C3524lN();
        }
        if (d2 == 4) {
            return new C3364iN(zzd);
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
        synchronized (C3524lN.class) {
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
