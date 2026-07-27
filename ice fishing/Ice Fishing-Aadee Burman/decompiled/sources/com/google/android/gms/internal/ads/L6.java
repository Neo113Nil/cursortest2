package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class L6 extends VK {
    private static final L6 zzf;
    private static volatile InterfaceC4048vL zzg;
    private int zza;
    private JK zzb;
    private JK zzc;
    private JK zzd;
    private JK zze;

    static {
        L6 l62 = new L6();
        zzf = l62;
        VK.u(L6.class, l62);
    }

    public L6() {
        HK hk = JK.f25675u;
        this.zzb = hk;
        this.zzc = hk;
        this.zzd = hk;
        this.zze = hk;
    }

    public static L6 E(byte[] bArr, PK pk) {
        VK y7 = VK.y(zzf, bArr, bArr.length, pk);
        VK.z(y7);
        return (L6) y7;
    }

    public static K6 F() {
        return (K6) zzf.r();
    }

    public final JK A() {
        return this.zzb;
    }

    public final JK B() {
        return this.zzc;
    }

    public final JK C() {
        return this.zzd;
    }

    public final JK D() {
        return this.zze;
    }

    public final /* synthetic */ void G(JK jk) {
        jk.getClass();
        this.zza |= 1;
        this.zzb = jk;
    }

    public final /* synthetic */ void H(JK jk) {
        jk.getClass();
        this.zza |= 2;
        this.zzc = jk;
    }

    public final /* synthetic */ void I(HK hk) {
        hk.getClass();
        this.zza |= 4;
        this.zzd = hk;
    }

    public final /* synthetic */ void J(HK hk) {
        hk.getClass();
        this.zza |= 8;
        this.zze = hk;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (d2 == 3) {
            return new L6();
        }
        if (d2 == 4) {
            return new K6(zzf);
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
        synchronized (L6.class) {
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
