package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class D6 extends VK {
    private static final D6 zzA;
    private static volatile InterfaceC4048vL zzB;
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
        D6 d62 = new D6();
        zzA = d62;
        VK.u(D6.class, d62);
    }

    public static C6 A() {
        return (C6) zzA.r();
    }

    public final /* synthetic */ void B(long j6) {
        this.zza |= 1;
        this.zzb = j6;
    }

    public final /* synthetic */ void C(long j6) {
        this.zza |= 2;
        this.zzc = j6;
    }

    public final /* synthetic */ void D(long j6) {
        this.zza |= 4;
        this.zzd = j6;
    }

    public final /* synthetic */ void E(long j6) {
        this.zza |= 8;
        this.zze = j6;
    }

    public final /* synthetic */ void F() {
        this.zza &= -9;
        this.zze = -1L;
    }

    public final /* synthetic */ void G(long j6) {
        this.zza |= 16;
        this.zzf = j6;
    }

    public final /* synthetic */ void H(long j6) {
        this.zza |= 32;
        this.zzg = j6;
    }

    public final /* synthetic */ void I(long j6) {
        this.zza |= 128;
        this.zzi = j6;
    }

    public final /* synthetic */ void J(long j6) {
        this.zza |= 256;
        this.zzj = j6;
    }

    public final /* synthetic */ void K(long j6) {
        this.zza |= 512;
        this.zzk = j6;
    }

    public final /* synthetic */ void L(long j6) {
        this.zza |= 2048;
        this.zzm = j6;
    }

    public final /* synthetic */ void M(long j6) {
        this.zza |= 4096;
        this.zzn = j6;
    }

    public final /* synthetic */ void N(long j6) {
        this.zza |= 8192;
        this.zzo = j6;
    }

    public final /* synthetic */ void O(long j6) {
        this.zza |= 16384;
        this.zzp = j6;
    }

    public final /* synthetic */ void P(long j6) {
        this.zza |= 32768;
        this.zzu = j6;
    }

    public final /* synthetic */ void Q(long j6) {
        this.zza |= com.anythink.basead.exoplayer.b.aX;
        this.zzv = j6;
    }

    public final /* synthetic */ void R(long j6) {
        this.zza |= 131072;
        this.zzw = j6;
    }

    public final /* synthetic */ void S(long j6) {
        this.zza |= 262144;
        this.zzx = j6;
    }

    public final /* synthetic */ void T(int i) {
        this.zzh = i - 1;
        this.zza |= 64;
    }

    public final /* synthetic */ void U(int i) {
        this.zzl = i - 1;
        this.zza |= 1024;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            C3494l6 c3494l6 = C3494l6.f31725m;
            return new C4264zL(zzA, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", c3494l6, "zzi", "zzj", "zzk", "zzl", c3494l6, "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
        }
        if (d2 == 3) {
            return new D6();
        }
        if (d2 == 4) {
            return new C6(zzA);
        }
        if (d2 == 5) {
            return zzA;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzB;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (D6.class) {
            try {
                interfaceC4048vL = zzB;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzA);
                    zzB = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
