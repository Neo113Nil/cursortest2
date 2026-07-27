package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.gI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3251gI extends AbstractC3199fL {
    private static final C3251gI zze;
    private static volatile GL zzf;
    private int zza;
    private C3359iI zzb;
    private int zzc;
    private int zzd;

    static {
        C3251gI c3251gI = new C3251gI();
        zze = c3251gI;
        AbstractC3199fL.u(C3251gI.class, c3251gI);
    }

    public static C3251gI D(SK sk, YK yk) {
        return (C3251gI) AbstractC3199fL.m(zze, sk, yk);
    }

    public static C3196fI E() {
        return (C3196fI) zze.r();
    }

    public static C3251gI F() {
        return zze;
    }

    public final C3359iI A() {
        C3359iI c3359iI = this.zzb;
        return c3359iI == null ? C3359iI.D() : c3359iI;
    }

    public final int B() {
        return this.zzc;
    }

    public final int C() {
        return this.zzd;
    }

    public final /* synthetic */ void G(C3359iI c3359iI) {
        this.zzb = c3359iI;
        this.zza |= 1;
    }

    public final /* synthetic */ void H(int i) {
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (d2 == 3) {
            return new C3251gI();
        }
        if (d2 == 4) {
            return new C3196fI(zze);
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
        synchronized (C3251gI.class) {
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
