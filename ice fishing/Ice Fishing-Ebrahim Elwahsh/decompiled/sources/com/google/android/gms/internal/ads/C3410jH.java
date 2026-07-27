package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.jH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3410jH extends AbstractC3199fL {
    private static final C3410jH zzd;
    private static volatile GL zze;
    private int zza;
    private int zzb;
    private C3518lH zzc;

    static {
        C3410jH c3410jH = new C3410jH();
        zzd = c3410jH;
        AbstractC3199fL.u(C3410jH.class, c3410jH);
    }

    public static C3410jH C(SK sk, YK yk) {
        return (C3410jH) AbstractC3199fL.m(zzd, sk, yk);
    }

    public static C3358iH D() {
        return (C3358iH) zzd.r();
    }

    public final int A() {
        return this.zzb;
    }

    public final C3518lH B() {
        C3518lH c3518lH = this.zzc;
        return c3518lH == null ? C3518lH.C() : c3518lH;
    }

    public final /* synthetic */ void E(int i) {
        this.zzb = i;
    }

    public final /* synthetic */ void F(C3518lH c3518lH) {
        this.zzc = c3518lH;
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
            return new C3410jH();
        }
        if (d2 == 4) {
            return new C3358iH(zzd);
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
        synchronized (C3410jH.class) {
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
