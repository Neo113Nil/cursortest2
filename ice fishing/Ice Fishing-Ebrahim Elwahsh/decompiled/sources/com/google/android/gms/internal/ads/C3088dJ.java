package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.dJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3088dJ extends AbstractC3199fL {
    private static final C3088dJ zzc;
    private static volatile GL zzd;
    private int zza;
    private SK zzb = SK.f27529u;

    static {
        C3088dJ c3088dJ = new C3088dJ();
        zzc = c3088dJ;
        AbstractC3199fL.u(C3088dJ.class, c3088dJ);
    }

    public static C3088dJ C(SK sk, YK yk) {
        return (C3088dJ) AbstractC3199fL.m(zzc, sk, yk);
    }

    public static C3033cJ D() {
        return (C3033cJ) zzc.r();
    }

    public static GL E() {
        return zzc.o();
    }

    public final int A() {
        return this.zza;
    }

    public final SK B() {
        return this.zzb;
    }

    public final /* synthetic */ void F(SK sk) {
        sk.getClass();
        this.zzb = sk;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zza", "zzb"});
        }
        if (d2 == 3) {
            return new C3088dJ();
        }
        if (d2 == 4) {
            return new C3033cJ(zzc);
        }
        if (d2 == 5) {
            return zzc;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzd;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (C3088dJ.class) {
            try {
                gl = zzd;
                if (gl == null) {
                    gl = new C3144eL(zzc);
                    zzd = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
