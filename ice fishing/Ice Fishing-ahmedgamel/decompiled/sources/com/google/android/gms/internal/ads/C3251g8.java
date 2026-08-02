package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.g8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3251g8 extends VK {
    private static final C3251g8 zzg;
    private static volatile InterfaceC4071vL zzh;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private long zzd;
    private long zze;
    private long zzf;

    static {
        C3251g8 c3251g8 = new C3251g8();
        zzg = c3251g8;
        VK.u(C3251g8.class, c3251g8);
    }

    public static C3251g8 F(HK hk) {
        C3251g8 c3251g8 = zzg;
        PK pk = PK.f27540a;
        int i = BK.f24648a;
        VK m9 = VK.m(c3251g8, hk, PK.f27541b);
        VK.z(m9);
        return (C3251g8) m9;
    }

    public static C3251g8 G(HK hk, PK pk) {
        return (C3251g8) VK.m(zzg, hk, pk);
    }

    public static C3197f8 H() {
        return (C3197f8) zzg.r();
    }

    public static C3251g8 I() {
        return zzg;
    }

    public final String A() {
        return this.zzb;
    }

    public final String B() {
        return this.zzc;
    }

    public final long C() {
        return this.zzd;
    }

    public final long D() {
        return this.zze;
    }

    public final long E() {
        return this.zzf;
    }

    public final /* synthetic */ void J(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void K(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void L(long j6) {
        this.zza |= 4;
        this.zzd = j6;
    }

    public final /* synthetic */ void M(long j6) {
        this.zza |= 8;
        this.zze = j6;
    }

    public final /* synthetic */ void N(long j6) {
        this.zza |= 16;
        this.zzf = j6;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (d9 == 3) {
            return new C3251g8();
        }
        if (d9 == 4) {
            return new C3197f8(zzg);
        }
        if (d9 == 5) {
            return zzg;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzh;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (C3251g8.class) {
            try {
                interfaceC4071vL = zzh;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzg);
                    zzh = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
