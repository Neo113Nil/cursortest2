package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.wM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4116wM extends AbstractC3199fL {
    private static final C4116wM zzf;
    private static volatile GL zzg;
    private int zza;
    private C4062vM zzc;
    private long zzd;
    private String zzb = "";
    private String zze = "";

    static {
        C4116wM c4116wM = new C4116wM();
        zzf = c4116wM;
        AbstractC3199fL.u(C4116wM.class, c4116wM);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (d2 == 3) {
            return new C4116wM();
        }
        if (d2 == 4) {
            return new UL(zzf);
        }
        if (d2 == 5) {
            return zzf;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzg;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (C4116wM.class) {
            try {
                gl = zzg;
                if (gl == null) {
                    gl = new C3144eL(zzf);
                    zzg = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
