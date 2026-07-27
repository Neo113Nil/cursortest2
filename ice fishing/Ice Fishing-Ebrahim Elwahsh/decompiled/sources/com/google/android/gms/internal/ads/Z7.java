package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class Z7 extends AbstractC3199fL {
    private static final Z7 zze;
    private static volatile GL zzf;
    private int zza;
    private C3077d8 zzb;
    private SK zzc;
    private SK zzd;

    static {
        Z7 z72 = new Z7();
        zze = z72;
        AbstractC3199fL.u(Z7.class, z72);
    }

    public Z7() {
        QK qk = SK.f27529u;
        this.zzc = qk;
        this.zzd = qk;
    }

    public static Z7 D(QK qk, YK yk) {
        return (Z7) AbstractC3199fL.m(zze, qk, yk);
    }

    public static Z7 E(byte[] bArr, YK yk) {
        AbstractC3199fL y6 = AbstractC3199fL.y(zze, bArr, bArr.length, yk);
        AbstractC3199fL.z(y6);
        return (Z7) y6;
    }

    public final C3077d8 A() {
        C3077d8 c3077d8 = this.zzb;
        return c3077d8 == null ? C3077d8.I() : c3077d8;
    }

    public final SK B() {
        return this.zzc;
    }

    public final SK C() {
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
            return new KL(zze, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (d2 == 3) {
            return new Z7();
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
        synchronized (Z7.class) {
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
