package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.rv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3872rv extends AbstractC3199fL {
    private static final C3872rv zzb;
    private static volatile GL zzc;
    private InterfaceC3630nL zza = JL.f25761x;

    static {
        C3872rv c3872rv = new C3872rv();
        zzb = c3872rv;
        AbstractC3199fL.u(C3872rv.class, c3872rv);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", C3819qv.class});
        }
        if (d2 == 3) {
            return new C3872rv();
        }
        if (d2 == 4) {
            return new F9(zzb);
        }
        if (d2 == 5) {
            return zzb;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzc;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (C3872rv.class) {
            try {
                gl = zzc;
                if (gl == null) {
                    gl = new C3144eL(zzb);
                    zzc = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
