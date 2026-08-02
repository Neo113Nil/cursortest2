package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.ay, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2972ay extends VK {
    private static final C2972ay zzE;
    private static volatile InterfaceC4071vL zzF;
    private boolean zzC;
    private boolean zzD;
    private int zza;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private int zzh;
    private C3400iy zzj;
    private boolean zzk;
    private C3508ky zzn;
    private int zzc = 1;
    private boolean zzd = true;
    private String zzg = "unknown_host";
    private boolean zzi = true;
    private long zzl = 100;
    private long zzm = com.anythink.basead.exoplayer.i.a.f8669f;
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
        C2972ay c2972ay = new C2972ay();
        zzE = c2972ay;
        VK.u(C2972ay.class, c2972ay);
    }

    public static Zx k0() {
        return (Zx) zzE.r();
    }

    public final /* synthetic */ void A(boolean z6) {
        this.zza |= 16;
        this.zzf = z6;
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzg = str;
    }

    public final /* synthetic */ void C(C3400iy c3400iy) {
        this.zzj = c3400iy;
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

    public final /* synthetic */ void F(C3508ky c3508ky) {
        this.zzn = c3508ky;
        this.zza |= 4096;
    }

    public final /* synthetic */ void G(long j6) {
        this.zza |= 524288;
        this.zzy = j6;
    }

    public final /* synthetic */ void H(boolean z6) {
        this.zza |= com.anythink.basead.exoplayer.h.o.f8528d;
        this.zzz = z6;
    }

    public final /* synthetic */ void I(boolean z6) {
        this.zza |= com.anythink.basead.exoplayer.b.bc;
        this.zzD = z6;
    }

    public final int J() {
        int o4 = SK.o(this.zzb);
        if (o4 == 0) {
            return 1;
        }
        return o4;
    }

    public final int K() {
        int o4 = SK.o(this.zzc);
        if (o4 == 0) {
            return 2;
        }
        return o4;
    }

    public final int L() {
        int i = this.zzh;
        int i4 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i4 == 0) {
            return 1;
        }
        return i4;
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

    public final C3400iy T() {
        C3400iy c3400iy = this.zzj;
        return c3400iy == null ? C3400iy.F() : c3400iy;
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

    public final C3508ky X() {
        C3508ky c3508ky = this.zzn;
        return c3508ky == null ? C3508ky.I() : c3508ky;
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

    public final /* synthetic */ void l0(boolean z6) {
        this.zza |= 4;
        this.zzd = z6;
    }

    public final /* synthetic */ void m0(boolean z6) {
        this.zza |= 8;
        this.zze = z6;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            C3517l6 c3517l6 = C3517l6.f32490A;
            return new C4287zL(zzE, "\u0004\u0019\u0000\u0001\u0001\u001a\u0019\u0000\u0000\u0000\u0001᠌\u0000\u0003ဈ\u0005\u0004ဇ\u0007\u0005ဉ\b\u0006ဇ\t\u0007ဂ\u000b\bဉ\f\tဇ\u0002\nဂ\r\u000bဂ\u000e\fဂ\u000f\rဈ\u0010\u000eဈ\u0011\u000fဂ\u0012\u0010ဂ\u0013\u0011ဇ\u0014\u0012ဂ\n\u0013ဇ\u0015\u0014ဇ\u0016\u0015ဇ\u0017\u0016᠌\u0001\u0017ဇ\u0003\u0018ဇ\u0004\u0019ဌ\u0006\u001aဇ\u0018", new Object[]{"zza", "zzb", c3517l6, "zzg", "zzi", "zzj", "zzk", "zzm", "zzn", "zzd", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzl", "zzA", "zzB", "zzC", "zzc", c3517l6, "zze", "zzf", "zzh", "zzD"});
        }
        if (d9 == 3) {
            return new C2972ay();
        }
        if (d9 == 4) {
            return new Zx(zzE);
        }
        if (d9 == 5) {
            return zzE;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzF;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (C2972ay.class) {
            try {
                interfaceC4071vL = zzF;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzE);
                    zzF = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
