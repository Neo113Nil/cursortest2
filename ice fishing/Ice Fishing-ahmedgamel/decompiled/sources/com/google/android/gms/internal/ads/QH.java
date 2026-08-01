package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class QH extends VK {
    private static final QH zzf;
    private static volatile InterfaceC4048vL zzg;
    private int zza;
    private int zzb;
    private LH zzc;
    private JK zzd;
    private JK zze;

    static {
        QH qh = new QH();
        zzf = qh;
        VK.u(QH.class, qh);
    }

    public QH() {
        HK hk = JK.f25675u;
        this.zzd = hk;
        this.zze = hk;
    }

    public static QH E(JK jk, PK pk) {
        return (QH) VK.m(zzf, jk, pk);
    }

    public static PH F() {
        return (PH) zzf.r();
    }

    public static QH G() {
        return zzf;
    }

    public static InterfaceC4048vL H() {
        return zzf.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final LH B() {
        LH lh = this.zzc;
        return lh == null ? LH.C() : lh;
    }

    public final JK C() {
        return this.zzd;
    }

    public final JK D() {
        return this.zze;
    }

    public final /* synthetic */ void I(LH lh) {
        this.zzc = lh;
        this.zza |= 1;
    }

    public final /* synthetic */ void J(HK hk) {
        hk.getClass();
        this.zzd = hk;
    }

    public final /* synthetic */ void K(HK hk) {
        hk.getClass();
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
            return new C4264zL(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (d2 == 3) {
            return new QH();
        }
        if (d2 == 4) {
            return new PH(zzf);
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
        synchronized (QH.class) {
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
