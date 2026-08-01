package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.mx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3592mx extends VK {
    private static final C3592mx zzn;
    private static volatile InterfaceC4048vL zzo;
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
    private InterfaceC2973bL zzk;
    private InterfaceC2973bL zzl;
    private InterfaceC2973bL zzm;

    static {
        C3592mx c3592mx = new C3592mx();
        zzn = c3592mx;
        VK.u(C3592mx.class, c3592mx);
    }

    public C3592mx() {
        C3509lL c3509lL = C3509lL.f31759x;
        this.zzk = c3509lL;
        this.zzl = c3509lL;
        this.zzm = c3509lL;
    }

    public static C3592mx R() {
        return zzn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(long j6) {
        InterfaceC2973bL interfaceC2973bL = this.zzl;
        if (!((AK) interfaceC2973bL).f23663n) {
            this.zzl = VK.k(interfaceC2973bL);
        }
        ((C3509lL) this.zzl).d(j6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(long j6) {
        InterfaceC2973bL interfaceC2973bL = this.zzm;
        if (!((AK) interfaceC2973bL).f23663n) {
            this.zzm = VK.k(interfaceC2973bL);
        }
        ((C3509lL) this.zzm).d(j6);
    }

    public final void C() {
        this.zzm = C3509lL.f31759x;
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

    public final InterfaceC2973bL M() {
        return this.zzk;
    }

    public final int N() {
        return ((C3509lL) this.zzk).size();
    }

    public final int O() {
        return ((C3509lL) this.zzl).size();
    }

    public final InterfaceC2973bL P() {
        return this.zzm;
    }

    public final int Q() {
        return ((C3509lL) this.zzm).size();
    }

    public final /* synthetic */ void S(String str) {
        str.getClass();
        this.zzb = str;
    }

    public final /* synthetic */ void T(long j6) {
        this.zza |= 1;
        this.zzc = j6;
    }

    public final /* synthetic */ void U(int i) {
        this.zza |= 2;
        this.zzd = i;
    }

    public final /* synthetic */ void V() {
        this.zza |= 4;
        this.zze = true;
    }

    public final /* synthetic */ void W(boolean z3) {
        this.zza |= 8;
        this.zzf = true;
    }

    public final /* synthetic */ void X(long j6) {
        this.zza |= 16;
        this.zzg = j6;
    }

    public final /* synthetic */ void Y(long j6) {
        this.zzh = j6;
    }

    public final /* synthetic */ void Z(long j6) {
        this.zza |= 32;
        this.zzi = j6;
    }

    public final /* synthetic */ void a0(long j6) {
        this.zza |= 64;
        this.zzj = j6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b0(long j6) {
        InterfaceC2973bL interfaceC2973bL = this.zzk;
        if (!((AK) interfaceC2973bL).f23663n) {
            this.zzk = VK.k(interfaceC2973bL);
        }
        ((C3509lL) this.zzk).d(j6);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzn, "\u0004\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001Ȉ\u0002ဂ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဂ\u0004\u0007\u0002\bဂ\u0005\tဂ\u0006\n%\u000b%\f%", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (d2 == 3) {
            return new C3592mx();
        }
        if (d2 == 4) {
            return new C3538lx(zzn);
        }
        if (d2 == 5) {
            return zzn;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzo;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (C3592mx.class) {
            try {
                interfaceC4048vL = zzo;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzn);
                    zzo = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
