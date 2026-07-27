package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.l6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3507l6 extends AbstractC3199fL {
    private static final C3507l6 zzd;
    private static volatile GL zze;
    private int zza;
    private String zzb = "";
    private String zzc = "";

    static {
        C3507l6 c3507l6 = new C3507l6();
        zzd = c3507l6;
        AbstractC3199fL.u(C3507l6.class, c3507l6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d2 == 3) {
            return new C3507l6();
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
        synchronized (C3507l6.class) {
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
