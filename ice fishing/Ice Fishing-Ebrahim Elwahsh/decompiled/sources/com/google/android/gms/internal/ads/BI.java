package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class BI extends AbstractC3199fL {
    private static final BI zzd;
    private static volatile GL zze;
    private int zza;
    private int zzb;
    private DI zzc;

    static {
        BI bi = new BI();
        zzd = bi;
        AbstractC3199fL.u(BI.class, bi);
    }

    public static BI C(SK sk, YK yk) {
        return (BI) AbstractC3199fL.m(zzd, sk, yk);
    }

    public static AI D() {
        return (AI) zzd.r();
    }

    public static GL E() {
        return zzd.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final DI B() {
        DI di = this.zzc;
        return di == null ? DI.E() : di;
    }

    public final /* synthetic */ void F(DI di) {
        this.zzc = di;
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
            return new KL(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d2 == 3) {
            return new BI();
        }
        if (d2 == 4) {
            return new AI(zzd);
        }
        if (d2 == 5) {
            return zzd;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zze;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (BI.class) {
            try {
                gl = zze;
                if (gl == null) {
                    gl = new C3144eL(zzd);
                    zze = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
