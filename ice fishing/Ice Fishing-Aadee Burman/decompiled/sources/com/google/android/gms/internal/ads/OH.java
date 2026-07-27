package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class OH extends VK {
    private static final OH zze;
    private static volatile InterfaceC4048vL zzf;
    private int zza;
    private int zzb;
    private QH zzc;
    private JK zzd = JK.f25675u;

    static {
        OH oh = new OH();
        zze = oh;
        VK.u(OH.class, oh);
    }

    public static OH D(JK jk, PK pk) {
        return (OH) VK.m(zze, jk, pk);
    }

    public static MH E() {
        return (MH) zze.r();
    }

    public static InterfaceC4048vL F() {
        return zze.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final QH B() {
        QH qh = this.zzc;
        return qh == null ? QH.G() : qh;
    }

    public final JK C() {
        return this.zzd;
    }

    public final /* synthetic */ void G(QH qh) {
        this.zzc = qh;
        this.zza |= 1;
    }

    public final /* synthetic */ void H(JK jk) {
        jk.getClass();
        this.zzd = jk;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (d2 == 3) {
            return new OH();
        }
        if (d2 == 4) {
            return new MH(zze);
        }
        if (d2 == 5) {
            return zze;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzf;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (OH.class) {
            try {
                interfaceC4048vL = zzf;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zze);
                    zzf = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
