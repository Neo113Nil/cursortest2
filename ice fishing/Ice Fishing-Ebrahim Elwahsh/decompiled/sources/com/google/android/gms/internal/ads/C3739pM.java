package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.pM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3739pM extends AbstractC3199fL {
    private static final C3739pM zze;
    private static volatile GL zzf;
    private int zza;
    private int zzb;
    private long zzc;
    private SK zzd = SK.f27529u;

    static {
        C3739pM c3739pM = new C3739pM();
        zze = c3739pM;
        AbstractC3199fL.u(C3739pM.class, c3739pM);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", C3293h6.f31150E, "zzc", "zzd"});
        }
        if (d2 == 3) {
            return new C3739pM();
        }
        if (d2 == 4) {
            return new UL(zze);
        }
        if (d2 == 5) {
            return zze;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzf;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (C3739pM.class) {
            try {
                gl = zzf;
                if (gl == null) {
                    gl = new C3144eL(zze);
                    zzf = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
