package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class UH extends AbstractC3199fL {
    private static final UH zze;
    private static volatile GL zzf;
    private int zza;
    private int zzb;
    private WH zzc;
    private SK zzd = SK.f27529u;

    static {
        UH uh = new UH();
        zze = uh;
        AbstractC3199fL.u(UH.class, uh);
    }

    public static UH D(SK sk, YK yk) {
        return (UH) AbstractC3199fL.m(zze, sk, yk);
    }

    public static TH E() {
        return (TH) zze.r();
    }

    public static GL F() {
        return zze.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final WH B() {
        WH wh = this.zzc;
        return wh == null ? WH.G() : wh;
    }

    public final SK C() {
        return this.zzd;
    }

    public final /* synthetic */ void G(WH wh) {
        this.zzc = wh;
        this.zza |= 1;
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
            return new KL(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (d2 == 3) {
            return new UH();
        }
        if (d2 == 4) {
            return new TH(zze);
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
        synchronized (UH.class) {
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
