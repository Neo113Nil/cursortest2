package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class D9 extends AbstractC3199fL {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final D9 zzh;
    private static volatile GL zzi;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        D9 d9 = new D9();
        zzh = d9;
        AbstractC3199fL.u(D9.class, d9);
    }

    public static C9 B() {
        return (C9) zzh.r();
    }

    public final void A(int i) {
        this.zzd |= 4;
        this.zzg = i;
    }

    public final void C(boolean z8) {
        this.zzd |= 1;
        this.zze = z8;
    }

    public final void D(boolean z8) {
        this.zzd |= 2;
        this.zzf = z8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (d2 == 3) {
            return new D9();
        }
        if (d2 == 4) {
            return new C9(zzh);
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
        synchronized (D9.class) {
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
