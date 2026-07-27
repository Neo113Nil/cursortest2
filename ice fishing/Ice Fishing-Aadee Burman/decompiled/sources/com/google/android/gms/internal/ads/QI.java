package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class QI extends VK {
    private static final QI zze;
    private static volatile InterfaceC4048vL zzf;
    private int zza;
    private int zzb;
    private UI zzc;
    private JK zzd = JK.f25675u;

    static {
        QI qi = new QI();
        zze = qi;
        VK.u(QI.class, qi);
    }

    public static QI D(JK jk, PK pk) {
        return (QI) VK.m(zze, jk, pk);
    }

    public static PI E() {
        return (PI) zze.r();
    }

    public final int A() {
        return this.zzb;
    }

    public final UI B() {
        UI ui = this.zzc;
        return ui == null ? UI.C() : ui;
    }

    public final JK C() {
        return this.zzd;
    }

    public final /* synthetic */ void F(UI ui) {
        this.zzc = ui;
        this.zza |= 1;
    }

    public final /* synthetic */ void G(JK jk) {
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
            return new QI();
        }
        if (d2 == 4) {
            return new PI(zze);
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
        synchronized (QI.class) {
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
