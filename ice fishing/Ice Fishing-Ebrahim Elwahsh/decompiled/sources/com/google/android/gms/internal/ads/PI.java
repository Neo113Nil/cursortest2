package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class PI extends AbstractC3199fL {
    private static final PI zze;
    private static volatile GL zzf;
    private int zza;
    private RI zzb;
    private int zzc;
    private SK zzd = SK.f27529u;

    static {
        PI pi = new PI();
        zze = pi;
        AbstractC3199fL.u(PI.class, pi);
    }

    public static PI D(SK sk, YK yk) {
        return (PI) AbstractC3199fL.m(zze, sk, yk);
    }

    public static OI E() {
        return (OI) zze.r();
    }

    public final RI A() {
        RI ri = this.zzb;
        return ri == null ? RI.E() : ri;
    }

    public final int B() {
        return this.zzc;
    }

    public final SK C() {
        return this.zzd;
    }

    public final /* synthetic */ void F(RI ri) {
        this.zzb = ri;
        this.zza |= 1;
    }

    public final /* synthetic */ void G(int i) {
        this.zzc = i;
    }

    public final /* synthetic */ void H(QK qk) {
        qk.getClass();
        this.zzd = qk;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (d2 == 3) {
            return new PI();
        }
        if (d2 == 4) {
            return new OI(zze);
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
        synchronized (PI.class) {
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
