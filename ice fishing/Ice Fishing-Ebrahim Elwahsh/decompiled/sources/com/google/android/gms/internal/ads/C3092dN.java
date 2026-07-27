package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.dN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3092dN extends AbstractC3199fL {
    private static final C3092dN zzd;
    private static volatile GL zze;
    private int zza;
    private String zzb = "";
    private int zzc;

    static {
        C3092dN c3092dN = new C3092dN();
        zzd = c3092dN;
        AbstractC3199fL.u(C3092dN.class, c3092dN);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"zza", "zzb", "zzc", C3793qM.f33707v});
        }
        if (d2 == 3) {
            return new C3092dN();
        }
        if (d2 == 4) {
            return new UL(zzd);
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
        synchronized (C3092dN.class) {
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
