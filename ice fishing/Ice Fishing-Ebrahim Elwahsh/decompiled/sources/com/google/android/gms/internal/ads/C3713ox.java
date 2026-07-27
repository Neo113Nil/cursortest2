package com.google.android.gms.internal.ads;

import u.AbstractC5088e;

/* renamed from: com.google.android.gms.internal.ads.ox, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3713ox extends AbstractC3199fL {
    private static final C3713ox zzn;
    private static volatile GL zzo;
    private int zza;
    private String zzb = "";
    private long zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private InterfaceC3576mL zzk;
    private InterfaceC3576mL zzl;
    private InterfaceC3576mL zzm;

    static {
        C3713ox c3713ox = new C3713ox();
        zzn = c3713ox;
        AbstractC3199fL.u(C3713ox.class, c3713ox);
    }

    public C3713ox() {
        C4061vL c4061vL = C4061vL.f34755x;
        this.zzk = c4061vL;
        this.zzl = c4061vL;
        this.zzm = c4061vL;
    }

    public static C3713ox R() {
        return zzn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(long j9) {
        InterfaceC3576mL interfaceC3576mL = this.zzl;
        if (!((JK) interfaceC3576mL).f25759n) {
            this.zzl = AbstractC3199fL.k(interfaceC3576mL);
        }
        ((C4061vL) this.zzl).d(j9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(long j9) {
        InterfaceC3576mL interfaceC3576mL = this.zzm;
        if (!((JK) interfaceC3576mL).f25759n) {
            this.zzm = AbstractC3199fL.k(interfaceC3576mL);
        }
        ((C4061vL) this.zzm).d(j9);
    }

    public final void C() {
        this.zzm = C4061vL.f34755x;
    }

    public final String D() {
        return this.zzb;
    }

    public final long E() {
        return this.zzc;
    }

    public final int F() {
        return this.zzd;
    }

    public final boolean G() {
        return this.zze;
    }

    public final boolean H() {
        return this.zzf;
    }

    public final long I() {
        return this.zzg;
    }

    public final long J() {
        return this.zzh;
    }

    public final long K() {
        return this.zzi;
    }

    public final boolean L() {
        return (this.zza & 64) != 0;
    }

    public final InterfaceC3576mL M() {
        return this.zzk;
    }

    public final int N() {
        return ((C4061vL) this.zzk).size();
    }

    public final int O() {
        return ((C4061vL) this.zzl).size();
    }

    public final InterfaceC3576mL P() {
        return this.zzm;
    }

    public final int Q() {
        return ((C4061vL) this.zzm).size();
    }

    public final /* synthetic */ void S(String str) {
        str.getClass();
        this.zzb = str;
    }

    public final /* synthetic */ void T(long j9) {
        this.zza |= 1;
        this.zzc = j9;
    }

    public final /* synthetic */ void U(int i) {
        this.zza |= 2;
        this.zzd = i;
    }

    public final /* synthetic */ void V() {
        this.zza |= 4;
        this.zze = true;
    }

    public final /* synthetic */ void W(boolean z8) {
        this.zza |= 8;
        this.zzf = true;
    }

    public final /* synthetic */ void X(long j9) {
        this.zza |= 16;
        this.zzg = j9;
    }

    public final /* synthetic */ void Y(long j9) {
        this.zzh = j9;
    }

    public final /* synthetic */ void Z(long j9) {
        this.zza |= 32;
        this.zzi = j9;
    }

    public final /* synthetic */ void a0(long j9) {
        this.zza |= 64;
        this.zzj = j9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b0(long j9) {
        InterfaceC3576mL interfaceC3576mL = this.zzk;
        if (!((JK) interfaceC3576mL).f25759n) {
            this.zzk = AbstractC3199fL.k(interfaceC3576mL);
        }
        ((C4061vL) this.zzk).d(j9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3199fL
    public final Object w(int i, AbstractC3199fL abstractC3199fL) {
        GL gl;
        int d2 = AbstractC5088e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new KL(zzn, "\u0004\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001Ȉ\u0002ဂ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဂ\u0004\u0007\u0002\bဂ\u0005\tဂ\u0006\n%\u000b%\f%", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (d2 == 3) {
            return new C3713ox();
        }
        if (d2 == 4) {
            return new C3659nx(zzn);
        }
        if (d2 == 5) {
            return zzn;
        }
        if (d2 != 6) {
            throw null;
        }
        GL gl2 = zzo;
        if (gl2 != null) {
            return gl2;
        }
        synchronized (C3713ox.class) {
            try {
                gl = zzo;
                if (gl == null) {
                    gl = new C3144eL(zzn);
                    zzo = gl;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gl;
    }
}
