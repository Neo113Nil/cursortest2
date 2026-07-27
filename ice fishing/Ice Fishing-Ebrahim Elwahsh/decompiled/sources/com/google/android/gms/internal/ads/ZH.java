package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class ZH extends AbstractC3199fL {
    private static final ZH zze;
    private static volatile GL zzf;
    private int zza;
    private int zzb;
    private SK zzc = SK.f27529u;
    private C2978bI zzd;

    static {
        ZH zh = new ZH();
        zze = zh;
        AbstractC3199fL.u(ZH.class, zh);
    }

    public static ZH D(SK sk, YK yk) {
        return (ZH) AbstractC3199fL.m(zze, sk, yk);
    }

    public static YH E() {
        return (YH) zze.r();
    }

    public static GL F() {
        return zze.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final SK B() {
        return this.zzc;
    }

    public final C2978bI C() {
        C2978bI c2978bI = this.zzd;
        return c2978bI == null ? C2978bI.E() : c2978bI;
    }

    public final /* synthetic */ void G(SK sk) {
        sk.getClass();
        this.zzc = sk;
    }

    public final /* synthetic */ void H(C2978bI c2978bI) {
        this.zzd = c2978bI;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (d2 == 3) {
            return new ZH();
        }
        if (d2 == 4) {
            return new YH(zze);
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
        synchronized (ZH.class) {
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
