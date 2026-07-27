package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.jN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3416jN extends AbstractC3199fL {
    private static final C3416jN zzf;
    private static volatile GL zzg;
    private int zza;
    private int zzb;
    private int zzc;
    private int zzd;
    private InterfaceC3630nL zze = JL.f25761x;

    static {
        C3416jN c3416jN = new C3416jN();
        zzf = c3416jN;
        AbstractC3199fL.u(C3416jN.class, c3416jN);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004\u001a", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (d2 == 3) {
            return new C3416jN();
        }
        if (d2 == 4) {
            return new C3364iN(zzf);
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
        synchronized (C3416jN.class) {
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
