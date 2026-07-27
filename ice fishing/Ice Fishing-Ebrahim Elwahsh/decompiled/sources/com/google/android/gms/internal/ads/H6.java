package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class H6 extends AbstractC3199fL {
    private static final H6 zzf;
    private static volatile GL zzg;
    private int zza;
    private SK zzb;
    private SK zzc;
    private SK zzd;
    private SK zze;

    static {
        H6 h62 = new H6();
        zzf = h62;
        AbstractC3199fL.u(H6.class, h62);
    }

    public H6() {
        QK qk = SK.f27529u;
        this.zzb = qk;
        this.zzc = qk;
        this.zzd = qk;
        this.zze = qk;
    }

    public static H6 E(byte[] bArr, YK yk) {
        AbstractC3199fL y6 = AbstractC3199fL.y(zzf, bArr, bArr.length, yk);
        AbstractC3199fL.z(y6);
        return (H6) y6;
    }

    public static G6 F() {
        return (G6) zzf.r();
    }

    public final SK A() {
        return this.zzb;
    }

    public final SK B() {
        return this.zzc;
    }

    public final SK C() {
        return this.zzd;
    }

    public final SK D() {
        return this.zze;
    }

    public final /* synthetic */ void G(SK sk) {
        sk.getClass();
        this.zza |= 1;
        this.zzb = sk;
    }

    public final /* synthetic */ void H(QK qk) {
        qk.getClass();
        this.zza |= 2;
        this.zzc = qk;
    }

    public final /* synthetic */ void I(SK sk) {
        sk.getClass();
        this.zza |= 4;
        this.zzd = sk;
    }

    public final /* synthetic */ void J(QK qk) {
        qk.getClass();
        this.zza |= 8;
        this.zze = qk;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (d2 == 3) {
            return new H6();
        }
        if (d2 == 4) {
            return new G6(zzf);
        }
        if (d2 == 5) {
            return zzf;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzg;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (H6.class) {
            try {
                gl = zzg;
                if (gl == null) {
                    gl = new C3144eL(zzf);
                    zzg = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
