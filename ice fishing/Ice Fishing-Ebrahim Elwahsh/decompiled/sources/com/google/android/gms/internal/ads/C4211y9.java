package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.y9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4211y9 extends AbstractC3199fL {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final C4211y9 zzh;
    private static volatile GL zzi;
    private int zzd;
    private int zze;
    private B9 zzf;
    private D9 zzg;

    static {
        C4211y9 c4211y9 = new C4211y9();
        zzh = c4211y9;
        AbstractC3199fL.u(C4211y9.class, c4211y9);
    }

    public static C4157x9 B() {
        return (C4157x9) zzh.r();
    }

    public final void A(D9 d9) {
        this.zzg = d9;
        this.zzd |= 4;
    }

    public final void C() {
        this.zze = AbstractC5088e.d(2);
        this.zzd |= 1;
    }

    public final void D(B9 b9) {
        b9.getClass();
        this.zzf = b9;
        this.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", C3293h6.f31169u, "zzf", "zzg"});
        }
        if (d2 == 3) {
            return new C4211y9();
        }
        if (d2 == 4) {
            return new C4157x9(zzh);
        }
        if (d2 == 5) {
            return zzh;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzi;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (C4211y9.class) {
            try {
                gl = zzi;
                if (gl == null) {
                    gl = new C3144eL(zzh);
                    zzi = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
