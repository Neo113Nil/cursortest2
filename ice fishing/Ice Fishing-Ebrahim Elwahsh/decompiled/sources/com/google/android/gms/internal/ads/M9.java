package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class M9 extends AbstractC3199fL {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final M9 zzf;
    private static volatile GL zzg;
    private int zzc;
    private boolean zzd;
    private int zze;

    static {
        M9 m9 = new M9();
        zzf = m9;
        AbstractC3199fL.u(M9.class, m9);
    }

    public static L9 B() {
        return (L9) zzf.r();
    }

    public final boolean A() {
        return this.zzd;
    }

    public final void C(boolean z8) {
        this.zzc |= 1;
        this.zzd = z8;
    }

    public final void D(int i) {
        this.zzc |= 2;
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        if (d2 == 3) {
            return new M9();
        }
        if (d2 == 4) {
            return new L9(zzf);
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
        synchronized (M9.class) {
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
