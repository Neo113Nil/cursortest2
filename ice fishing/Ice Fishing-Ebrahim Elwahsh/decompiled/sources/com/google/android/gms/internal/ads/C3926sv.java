package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.sv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3926sv extends AbstractC3199fL {
    private static final C3926sv zze;
    private static volatile GL zzf;
    private int zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;

    static {
        C3926sv c3926sv = new C3926sv();
        zze = c3926sv;
        AbstractC3199fL.u(C3926sv.class, c3926sv);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zze, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0007\u0003\u0007\u0004\u0007", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (d2 == 3) {
            return new C3926sv();
        }
        if (d2 == 4) {
            return new F9(zze);
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
        synchronized (C3926sv.class) {
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
