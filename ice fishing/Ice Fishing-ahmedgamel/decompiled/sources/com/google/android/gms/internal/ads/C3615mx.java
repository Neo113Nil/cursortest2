package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.mx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3615mx extends VK {
    private static final C3615mx zzn;
    private static volatile InterfaceC4071vL zzo;
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
    private InterfaceC2996bL zzk;
    private InterfaceC2996bL zzl;
    private InterfaceC2996bL zzm;

    static {
        C3615mx c3615mx = new C3615mx();
        zzn = c3615mx;
        VK.u(C3615mx.class, c3615mx);
    }

    public C3615mx() {
        C3532lL c3532lL = C3532lL.f32539x;
        this.zzk = c3532lL;
        this.zzl = c3532lL;
        this.zzm = c3532lL;
    }

    public static C3615mx R() {
        return zzn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(long j6) {
        InterfaceC2996bL interfaceC2996bL = this.zzl;
        if (!((AK) interfaceC2996bL).f24443n) {
            this.zzl = VK.k(interfaceC2996bL);
        }
        ((C3532lL) this.zzl).d(j6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(long j6) {
        InterfaceC2996bL interfaceC2996bL = this.zzm;
        if (!((AK) interfaceC2996bL).f24443n) {
            this.zzm = VK.k(interfaceC2996bL);
        }
        ((C3532lL) this.zzm).d(j6);
    }

    public final void C() {
        this.zzm = C3532lL.f32539x;
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

    public final InterfaceC2996bL M() {
        return this.zzk;
    }

    public final int N() {
        return ((C3532lL) this.zzk).size();
    }

    public final int O() {
        return ((C3532lL) this.zzl).size();
    }

    public final InterfaceC2996bL P() {
        return this.zzm;
    }

    public final int Q() {
        return ((C3532lL) this.zzm).size();
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

    public final /* synthetic */ void W(boolean z6) {
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
        InterfaceC2996bL interfaceC2996bL = this.zzk;
        if (!((AK) interfaceC2996bL).f24443n) {
            this.zzk = VK.k(interfaceC2996bL);
        }
        ((C3532lL) this.zzk).d(j6);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzn, "\u0004\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001Ȉ\u0002ဂ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဂ\u0004\u0007\u0002\bဂ\u0005\tဂ\u0006\n%\u000b%\f%", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (d9 == 3) {
            return new C3615mx();
        }
        if (d9 == 4) {
            return new C3561lx(zzn);
        }
        if (d9 == 5) {
            return zzn;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzo;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (C3615mx.class) {
            try {
                interfaceC4071vL = zzo;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzn);
                    zzo = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
