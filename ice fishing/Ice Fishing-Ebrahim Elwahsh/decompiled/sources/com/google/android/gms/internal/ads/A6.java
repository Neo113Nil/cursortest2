package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class A6 extends AbstractC3199fL {
    private static final A6 zzA;
    private static volatile GL zzB;
    private int zza;
    private long zzu;
    private long zzv;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private int zzh = 1000;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private int zzl = 1000;
    private long zzm = -1;
    private long zzn = -1;
    private long zzo = -1;
    private long zzp = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;
    private long zzz = -1;

    static {
        A6 a62 = new A6();
        zzA = a62;
        AbstractC3199fL.u(A6.class, a62);
    }

    public static C4262z6 A() {
        return (C4262z6) zzA.r();
    }

    public final /* synthetic */ void B(long j9) {
        this.zza |= 1;
        this.zzb = j9;
    }

    public final /* synthetic */ void C(long j9) {
        this.zza |= 2;
        this.zzc = j9;
    }

    public final /* synthetic */ void D(long j9) {
        this.zza |= 4;
        this.zzd = j9;
    }

    public final /* synthetic */ void E(long j9) {
        this.zza |= 8;
        this.zze = j9;
    }

    public final /* synthetic */ void F() {
        this.zza &= -9;
        this.zze = -1L;
    }

    public final /* synthetic */ void G(long j9) {
        this.zza |= 16;
        this.zzf = j9;
    }

    public final /* synthetic */ void H(long j9) {
        this.zza |= 32;
        this.zzg = j9;
    }

    public final /* synthetic */ void I(long j9) {
        this.zza |= 128;
        this.zzi = j9;
    }

    public final /* synthetic */ void J(long j9) {
        this.zza |= 256;
        this.zzj = j9;
    }

    public final /* synthetic */ void K(long j9) {
        this.zza |= 512;
        this.zzk = j9;
    }

    public final /* synthetic */ void L(long j9) {
        this.zza |= 2048;
        this.zzm = j9;
    }

    public final /* synthetic */ void M(long j9) {
        this.zza |= 4096;
        this.zzn = j9;
    }

    public final /* synthetic */ void N(long j9) {
        this.zza |= 8192;
        this.zzo = j9;
    }

    public final /* synthetic */ void O(long j9) {
        this.zza |= 16384;
        this.zzp = j9;
    }

    public final /* synthetic */ void P(long j9) {
        this.zza |= 32768;
        this.zzu = j9;
    }

    public final /* synthetic */ void Q(long j9) {
        this.zza |= com.anythink.basead.exoplayer.b.aX;
        this.zzv = j9;
    }

    public final /* synthetic */ void R(long j9) {
        this.zza |= 131072;
        this.zzw = j9;
    }

    public final /* synthetic */ void S(long j9) {
        this.zza |= 262144;
        this.zzx = j9;
    }

    public final /* synthetic */ void T(int i) {
        this.zzh = i - 1;
        this.zza |= 64;
    }

    public final /* synthetic */ void U(int i) {
        this.zzl = i - 1;
        this.zza |= 1024;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            C3293h6 c3293h6 = C3293h6.f31161m;
            return new KL(zzA, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", c3293h6, "zzi", "zzj", "zzk", "zzl", c3293h6, "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
        }
        if (d2 == 3) {
            return new A6();
        }
        if (d2 == 4) {
            return new C4262z6(zzA);
        }
        if (d2 == 5) {
            return zzA;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzB;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (A6.class) {
            try {
                gl = zzB;
                if (gl == null) {
                    gl = new C3144eL(zzA);
                    zzB = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
