package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.RandomAccess;
import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class Ky extends VK {
    private static final Ky zzf;
    private static volatile InterfaceC4048vL zzg;
    private int zza;
    private Object zzc;
    private int zzd;
    private int zzb = 0;
    private ZK zze = WK.f28348x;

    static {
        Ky ky = new Ky();
        zzf = ky;
        VK.u(Ky.class, ky);
    }

    public static Ky E(HK hk) {
        Ky ky = zzf;
        PK pk = PK.f26757a;
        int i = BK.f23877a;
        VK m4 = VK.m(ky, hk, PK.f26758b);
        VK.z(m4);
        return (Ky) m4;
    }

    public static Jy F() {
        return (Jy) zzf.r();
    }

    public static Ky G() {
        return zzf;
    }

    public final C3228g8 A() {
        return this.zzb == 1 ? (C3228g8) this.zzc : C3228g8.I();
    }

    public final C3120e8 B() {
        return this.zzb == 2 ? (C3120e8) this.zzc : C3120e8.D();
    }

    public final EnumC2960b8 C() {
        EnumC2960b8 a9 = EnumC2960b8.a(this.zzd);
        return a9 == null ? EnumC2960b8.UNSUPPORTED : a9;
    }

    public final List D() {
        return this.zze;
    }

    public final /* synthetic */ void H(C3228g8 c3228g8) {
        c3228g8.getClass();
        this.zzc = c3228g8;
        this.zzb = 1;
    }

    public final /* synthetic */ void I(C3120e8 c3120e8) {
        c3120e8.getClass();
        this.zzc = c3120e8;
        this.zzb = 2;
    }

    public final void J(EnumC2960b8 enumC2960b8) {
        this.zzd = enumC2960b8.f29227n;
        this.zza |= 1;
    }

    public final void K(ZK zk) {
        RandomAccess randomAccess = this.zze;
        if (!((AK) randomAccess).f23663n) {
            WK wk = (WK) randomAccess;
            int i = wk.f28350v;
            this.zze = wk.D(i + i);
        }
        AbstractC4263zK.e(zk, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzf, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003᠌\u0000\u0004'", new Object[]{"zzc", "zzb", "zza", C3228g8.class, C3120e8.class, "zzd", C3494l6.f31727o, "zze"});
        }
        if (d2 == 3) {
            return new Ky();
        }
        if (d2 == 4) {
            return new Jy(zzf);
        }
        if (d2 == 5) {
            return zzf;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzg;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (Ky.class) {
            try {
                interfaceC4048vL = zzg;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzf);
                    zzg = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
