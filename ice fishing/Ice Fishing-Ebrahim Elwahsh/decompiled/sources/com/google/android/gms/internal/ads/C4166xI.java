package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.xI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4166xI extends AbstractC3199fL {
    private static final C4166xI zzd;
    private static volatile GL zze;
    private int zza;
    private int zzb;
    private C4274zI zzc;

    static {
        C4166xI c4166xI = new C4166xI();
        zzd = c4166xI;
        AbstractC3199fL.u(C4166xI.class, c4166xI);
    }

    public static C4166xI C(SK sk, YK yk) {
        return (C4166xI) AbstractC3199fL.m(zzd, sk, yk);
    }

    public static C4112wI D() {
        return (C4112wI) zzd.r();
    }

    public static GL E() {
        return zzd.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final C4274zI B() {
        C4274zI c4274zI = this.zzc;
        return c4274zI == null ? C4274zI.D() : c4274zI;
    }

    public final /* synthetic */ void F(C4274zI c4274zI) {
        this.zzc = c4274zI;
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
            return new C4166xI();
        }
        if (d2 == 4) {
            return new C4112wI(zzd);
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
        synchronized (C4166xI.class) {
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
