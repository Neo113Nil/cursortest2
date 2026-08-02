package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.RandomAccess;
import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class Ky extends VK {
    private static final Ky zzf;
    private static volatile InterfaceC4071vL zzg;
    private int zza;
    private Object zzc;
    private int zzd;
    private int zzb = 0;
    private ZK zze = WK.f29146x;

    static {
        Ky ky = new Ky();
        zzf = ky;
        VK.u(Ky.class, ky);
    }

    public static Ky E(HK hk) {
        Ky ky = zzf;
        PK pk = PK.f27540a;
        int i = BK.f24648a;
        VK m9 = VK.m(ky, hk, PK.f27541b);
        VK.z(m9);
        return (Ky) m9;
    }

    public static Jy F() {
        return (Jy) zzf.r();
    }

    public static Ky G() {
        return zzf;
    }

    public final C3251g8 A() {
        return this.zzb == 1 ? (C3251g8) this.zzc : C3251g8.I();
    }

    public final C3143e8 B() {
        return this.zzb == 2 ? (C3143e8) this.zzc : C3143e8.D();
    }

    public final EnumC2983b8 C() {
        EnumC2983b8 a9 = EnumC2983b8.a(this.zzd);
        return a9 == null ? EnumC2983b8.UNSUPPORTED : a9;
    }

    public final List D() {
        return this.zze;
    }

    public final /* synthetic */ void H(C3251g8 c3251g8) {
        c3251g8.getClass();
        this.zzc = c3251g8;
        this.zzb = 1;
    }

    public final /* synthetic */ void I(C3143e8 c3143e8) {
        c3143e8.getClass();
        this.zzc = c3143e8;
        this.zzb = 2;
    }

    public final void J(EnumC2983b8 enumC2983b8) {
        this.zzd = enumC2983b8.f30015n;
        this.zza |= 1;
    }

    public final void K(ZK zk) {
        RandomAccess randomAccess = this.zze;
        if (!((AK) randomAccess).f24443n) {
            WK wk = (WK) randomAccess;
            int i = wk.f29148v;
            this.zze = wk.D(i + i);
        }
        AbstractC4286zK.e(zk, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzf, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003᠌\u0000\u0004'", new Object[]{"zzc", "zzb", "zza", C3251g8.class, C3143e8.class, "zzd", C3517l6.f32507o, "zze"});
        }
        if (d9 == 3) {
            return new Ky();
        }
        if (d9 == 4) {
            return new Jy(zzf);
        }
        if (d9 == 5) {
            return zzf;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzg;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (Ky.class) {
            try {
                interfaceC4071vL = zzg;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzf);
                    zzg = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
