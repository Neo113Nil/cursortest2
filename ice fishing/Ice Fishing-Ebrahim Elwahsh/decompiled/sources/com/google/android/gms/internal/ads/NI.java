package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class NI extends AbstractC3199fL {
    private static final NI zzf;
    private static volatile GL zzg;
    private int zza;
    private int zzb;
    private JI zzc;
    private SK zzd;
    private SK zze;

    static {
        NI ni = new NI();
        zzf = ni;
        AbstractC3199fL.u(NI.class, ni);
    }

    public NI() {
        QK qk = SK.f27529u;
        this.zzd = qk;
        this.zze = qk;
    }

    public static NI E(SK sk, YK yk) {
        return (NI) AbstractC3199fL.m(zzf, sk, yk);
    }

    public static MI F() {
        return (MI) zzf.r();
    }

    public static NI G() {
        return zzf;
    }

    public static GL H() {
        return zzf.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final JI B() {
        JI ji = this.zzc;
        return ji == null ? JI.C() : ji;
    }

    public final SK C() {
        return this.zzd;
    }

    public final SK D() {
        return this.zze;
    }

    public final /* synthetic */ void I(JI ji) {
        this.zzc = ji;
        this.zza |= 1;
    }

    public final /* synthetic */ void J(QK qk) {
        qk.getClass();
        this.zzd = qk;
    }

    public final /* synthetic */ void K(QK qk) {
        qk.getClass();
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
            return new KL(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (d2 == 3) {
            return new NI();
        }
        if (d2 == 4) {
            return new MI(zzf);
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
        synchronized (NI.class) {
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
