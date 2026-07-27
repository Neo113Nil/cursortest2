package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.eI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3141eI extends AbstractC3199fL {
    private static final C3141eI zze;
    private static volatile GL zzf;
    private int zza;
    private int zzb;
    private C3359iI zzc;
    private SK zzd = SK.f27529u;

    static {
        C3141eI c3141eI = new C3141eI();
        zze = c3141eI;
        AbstractC3199fL.u(C3141eI.class, c3141eI);
    }

    public static C3141eI D(SK sk, YK yk) {
        return (C3141eI) AbstractC3199fL.m(zze, sk, yk);
    }

    public static C3087dI E() {
        return (C3087dI) zze.r();
    }

    public static C3141eI F() {
        return zze;
    }

    public static GL G() {
        return zze.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final C3359iI B() {
        C3359iI c3359iI = this.zzc;
        return c3359iI == null ? C3359iI.D() : c3359iI;
    }

    public final SK C() {
        return this.zzd;
    }

    public final /* synthetic */ void H(C3359iI c3359iI) {
        this.zzc = c3359iI;
        this.zza |= 1;
    }

    public final /* synthetic */ void I(SK sk) {
        sk.getClass();
        this.zzd = sk;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (d2 == 3) {
            return new C3141eI();
        }
        if (d2 == 4) {
            return new C3087dI(zze);
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
        synchronized (C3141eI.class) {
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
