package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.a8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2913a8 extends AbstractC3199fL {
    private static final C2913a8 zzd;
    private static volatile GL zze;
    private int zza;
    private C2968b8 zzb;
    private SK zzc = SK.f27529u;

    static {
        C2913a8 c2913a8 = new C2913a8();
        zzd = c2913a8;
        AbstractC3199fL.u(C2913a8.class, c2913a8);
    }

    public static C2913a8 E() {
        return zzd;
    }

    public final boolean A() {
        return (this.zza & 1) != 0;
    }

    public final C2968b8 B() {
        C2968b8 c2968b8 = this.zzb;
        return c2968b8 == null ? C2968b8.D() : c2968b8;
    }

    public final boolean C() {
        return (this.zza & 2) != 0;
    }

    public final SK D() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d2 == 3) {
            return new C2913a8();
        }
        if (d2 == 4) {
            return new C3453k6(zzd);
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
        synchronized (C2913a8.class) {
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
