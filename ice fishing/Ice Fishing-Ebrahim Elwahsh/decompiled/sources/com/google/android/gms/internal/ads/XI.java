package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class XI extends AbstractC3199fL {
    private static final XI zze;
    private static volatile GL zzf;
    private int zza;
    private int zzb;
    private C2979bJ zzc;
    private SK zzd = SK.f27529u;

    static {
        XI xi = new XI();
        zze = xi;
        AbstractC3199fL.u(XI.class, xi);
    }

    public static XI D(SK sk, YK yk) {
        return (XI) AbstractC3199fL.m(zze, sk, yk);
    }

    public static WI E() {
        return (WI) zze.r();
    }

    public final int A() {
        return this.zzb;
    }

    public final C2979bJ B() {
        C2979bJ c2979bJ = this.zzc;
        return c2979bJ == null ? C2979bJ.C() : c2979bJ;
    }

    public final SK C() {
        return this.zzd;
    }

    public final /* synthetic */ void F(C2979bJ c2979bJ) {
        this.zzc = c2979bJ;
        this.zza |= 1;
    }

    public final /* synthetic */ void G(SK sk) {
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
            return new XI();
        }
        if (d2 == 4) {
            return new WI(zze);
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
        synchronized (XI.class) {
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
