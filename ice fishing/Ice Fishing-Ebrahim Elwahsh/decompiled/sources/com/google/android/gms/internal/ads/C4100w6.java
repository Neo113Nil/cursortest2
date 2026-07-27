package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.w6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4100w6 extends AbstractC3199fL {
    private static final C4100w6 zzd;
    private static volatile GL zze;
    private int zza;
    private int zzb;
    private long zzc = -1;

    static {
        C4100w6 c4100w6 = new C4100w6();
        zzd = c4100w6;
        AbstractC3199fL.u(C4100w6.class, c4100w6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zza", "zzb", C3293h6.f31156g, "zzc"});
        }
        if (d2 == 3) {
            return new C4100w6();
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
        synchronized (C4100w6.class) {
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
