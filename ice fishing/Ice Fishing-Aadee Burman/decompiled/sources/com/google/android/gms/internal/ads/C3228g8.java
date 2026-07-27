package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.g8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3228g8 extends VK {
    private static final C3228g8 zzg;
    private static volatile InterfaceC4048vL zzh;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private long zzd;
    private long zze;
    private long zzf;

    static {
        C3228g8 c3228g8 = new C3228g8();
        zzg = c3228g8;
        VK.u(C3228g8.class, c3228g8);
    }

    public static C3228g8 F(HK hk) {
        C3228g8 c3228g8 = zzg;
        PK pk = PK.f26757a;
        int i = BK.f23877a;
        VK m4 = VK.m(c3228g8, hk, PK.f26758b);
        VK.z(m4);
        return (C3228g8) m4;
    }

    public static C3228g8 G(HK hk, PK pk) {
        return (C3228g8) VK.m(zzg, hk, pk);
    }

    public static C3174f8 H() {
        return (C3174f8) zzg.r();
    }

    public static C3228g8 I() {
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
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (d2 == 3) {
            return new C3228g8();
        }
        if (d2 == 4) {
            return new C3174f8(zzg);
        }
        if (d2 == 5) {
            return zzg;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzh;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (C3228g8.class) {
            try {
                interfaceC4048vL = zzh;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzg);
                    zzh = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
