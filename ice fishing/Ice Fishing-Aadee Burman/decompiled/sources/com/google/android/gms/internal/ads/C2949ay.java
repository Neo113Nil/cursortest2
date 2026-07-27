package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.ay, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2949ay extends VK {
    private static final C2949ay zzE;
    private static volatile InterfaceC4048vL zzF;
    private boolean zzC;
    private boolean zzD;
    private int zza;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private int zzh;
    private C3377iy zzj;
    private boolean zzk;
    private C3485ky zzn;
    private int zzc = 1;
    private boolean zzd = true;
    private String zzg = "unknown_host";
    private boolean zzi = true;
    private long zzl = 100;
    private long zzm = com.anythink.basead.exoplayer.i.a.f7883f;
    private long zzo = 10;
    private long zzp = 100;
    private long zzu = 20000;
    private String zzv = "";
    private String zzw = "";
    private long zzx = 500;
    private long zzy = com.anythink.expressad.video.module.a.a.m.ai;
    private boolean zzz = true;
    private boolean zzA = true;
    private boolean zzB = true;

    static {
        C2949ay c2949ay = new C2949ay();
        zzE = c2949ay;
        VK.u(C2949ay.class, c2949ay);
    }

    public static Zx k0() {
        return (Zx) zzE.r();
    }

    public final /* synthetic */ void A(boolean z3) {
        this.zza |= 16;
        this.zzf = z3;
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzg = str;
    }

    public final /* synthetic */ void C(C3377iy c3377iy) {
        this.zzj = c3377iy;
        this.zza |= 256;
    }

    public final /* synthetic */ void D(long j6) {
        this.zza |= 1024;
        this.zzl = j6;
    }

    public final /* synthetic */ void E(long j6) {
        this.zza |= 2048;
        this.zzm = j6;
    }

    public final /* synthetic */ void F(C3485ky c3485ky) {
        this.zzn = c3485ky;
        this.zza |= 4096;
    }

    public final /* synthetic */ void G(long j6) {
        this.zza |= 524288;
        this.zzy = j6;
    }

    public final /* synthetic */ void H(boolean z3) {
        this.zza |= com.anythink.basead.exoplayer.h.o.f7742d;
        this.zzz = z3;
    }

    public final /* synthetic */ void I(boolean z3) {
        this.zza |= com.anythink.basead.exoplayer.b.bc;
        this.zzD = z3;
    }

    public final int J() {
        int o6 = SK.o(this.zzb);
        if (o6 == 0) {
            return 1;
        }
        return o6;
    }

    public final int K() {
        int o6 = SK.o(this.zzc);
        if (o6 == 0) {
            return 2;
        }
        return o6;
    }

    public final int L() {
        int i = this.zzh;
        int i6 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i6 == 0) {
            return 1;
        }
        return i6;
    }

    public final /* synthetic */ void M(int i) {
        this.zzb = i - 1;
        this.zza |= 1;
    }

    public final void N() {
        this.zzh = 1;
        this.zza |= 64;
    }

    public final boolean O() {
        return this.zzd;
    }

    public final boolean P() {
        return this.zze;
    }

    public final boolean Q() {
        return this.zzf;
    }

    public final String R() {
        return this.zzg;
    }

    public final boolean S() {
        return this.zzi;
    }

    public final C3377iy T() {
        C3377iy c3377iy = this.zzj;
        return c3377iy == null ? C3377iy.F() : c3377iy;
    }

    public final boolean U() {
        return this.zzk;
    }

    public final long V() {
        return this.zzl;
    }

    public final long W() {
        return this.zzm;
    }

    public final C3485ky X() {
        C3485ky c3485ky = this.zzn;
        return c3485ky == null ? C3485ky.I() : c3485ky;
    }

    public final long Y() {
        return this.zzo;
    }

    public final long Z() {
        return this.zzp;
    }

    public final long a0() {
        return this.zzu;
    }

    public final String b0() {
        return this.zzv;
    }

    public final String c0() {
        return this.zzw;
    }

    public final long d0() {
        return this.zzx;
    }

    public final long e0() {
        return this.zzy;
    }

    public final boolean f0() {
        return this.zzz;
    }

    public final boolean g0() {
        return this.zzA;
    }

    public final boolean h0() {
        return this.zzB;
    }

    public final boolean i0() {
        return this.zzC;
    }

    public final boolean j0() {
        return this.zzD;
    }

    public final /* synthetic */ void l0(boolean z3) {
        this.zza |= 4;
        this.zzd = z3;
    }

    public final /* synthetic */ void m0(boolean z3) {
        this.zza |= 8;
        this.zze = z3;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            C3494l6 c3494l6 = C3494l6.f31710A;
            return new C4264zL(zzE, "\u0004\u0019\u0000\u0001\u0001\u001a\u0019\u0000\u0000\u0000\u0001᠌\u0000\u0003ဈ\u0005\u0004ဇ\u0007\u0005ဉ\b\u0006ဇ\t\u0007ဂ\u000b\bဉ\f\tဇ\u0002\nဂ\r\u000bဂ\u000e\fဂ\u000f\rဈ\u0010\u000eဈ\u0011\u000fဂ\u0012\u0010ဂ\u0013\u0011ဇ\u0014\u0012ဂ\n\u0013ဇ\u0015\u0014ဇ\u0016\u0015ဇ\u0017\u0016᠌\u0001\u0017ဇ\u0003\u0018ဇ\u0004\u0019ဌ\u0006\u001aဇ\u0018", new Object[]{"zza", "zzb", c3494l6, "zzg", "zzi", "zzj", "zzk", "zzm", "zzn", "zzd", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzl", "zzA", "zzB", "zzC", "zzc", c3494l6, "zze", "zzf", "zzh", "zzD"});
        }
        if (d2 == 3) {
            return new C2949ay();
        }
        if (d2 == 4) {
            return new Zx(zzE);
        }
        if (d2 == 5) {
            return zzE;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzF;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (C2949ay.class) {
            try {
                interfaceC4048vL = zzF;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzE);
                    zzF = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
