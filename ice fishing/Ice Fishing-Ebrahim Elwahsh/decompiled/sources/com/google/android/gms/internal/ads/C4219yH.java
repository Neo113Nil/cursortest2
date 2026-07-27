package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.yH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4219yH extends AbstractC3199fL {
    private static final C4219yH zze;
    private static volatile GL zzf;
    private int zza;
    private int zzb;
    private CH zzc;
    private SK zzd = SK.f27529u;

    static {
        C4219yH c4219yH = new C4219yH();
        zze = c4219yH;
        AbstractC3199fL.u(C4219yH.class, c4219yH);
    }

    public static C4219yH D(SK sk, YK yk) {
        return (C4219yH) AbstractC3199fL.m(zze, sk, yk);
    }

    public static C4165xH E() {
        return (C4165xH) zze.r();
    }

    public static GL F() {
        return zze.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final CH B() {
        CH ch = this.zzc;
        return ch == null ? CH.C() : ch;
    }

    public final SK C() {
        return this.zzd;
    }

    public final /* synthetic */ void G(CH ch) {
        this.zzc = ch;
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
            return new C4219yH();
        }
        if (d2 == 4) {
            return new C4165xH(zze);
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
        synchronized (C4219yH.class) {
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
