package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class Jy extends AbstractC3199fL {
    private static final Jy zzf;
    private static volatile GL zzg;
    private int zza;
    private My zzb;
    private SK zzc;
    private SK zzd;
    private int zze;

    static {
        Jy jy = new Jy();
        zzf = jy;
        AbstractC3199fL.u(Jy.class, jy);
    }

    public Jy() {
        QK qk = SK.f27529u;
        this.zzc = qk;
        this.zzd = qk;
    }

    public static Iy D() {
        return (Iy) zzf.r();
    }

    public final My A() {
        My my = this.zzb;
        return my == null ? My.G() : my;
    }

    public final SK B() {
        return this.zzc;
    }

    public final SK C() {
        return this.zzd;
    }

    public final /* synthetic */ void E(My my) {
        this.zzb = my;
        this.zza |= 1;
    }

    public final /* synthetic */ void F(SK sk) {
        sk.getClass();
        this.zza |= 2;
        this.zzc = sk;
    }

    public final /* synthetic */ void G(SK sk) {
        sk.getClass();
        this.zza |= 4;
        this.zzd = sk;
    }

    public final int H() {
        int l9 = AbstractC3194fG.l(this.zze);
        if (l9 == 0) {
            return 1;
        }
        return l9;
    }

    public final /* synthetic */ void I(int i) {
        this.zze = i - 1;
        this.zza |= 8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002\u0004᠌\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", C3293h6.f31147B});
        }
        if (d2 == 3) {
            return new Jy();
        }
        if (d2 == 4) {
            return new Iy(zzf);
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
        synchronized (Jy.class) {
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
