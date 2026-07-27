package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class M6 extends AbstractC3199fL {
    private static final M6 zze;
    private static volatile GL zzf;
    private int zza;
    private long zzb;
    private String zzc = "";
    private SK zzd = SK.f27529u;

    static {
        M6 m62 = new M6();
        zze = m62;
        AbstractC3199fL.u(M6.class, m62);
    }

    public static M6 E() {
        return zze;
    }

    public final boolean A() {
        return (this.zza & 1) != 0;
    }

    public final long B() {
        return this.zzb;
    }

    public final String C() {
        return this.zzc;
    }

    public final SK D() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zze, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (d2 == 3) {
            return new M6();
        }
        if (d2 == 4) {
            return new C3453k6(zze);
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
        synchronized (M6.class) {
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
