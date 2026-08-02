package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class QI extends VK {
    private static final QI zze;
    private static volatile InterfaceC4071vL zzf;
    private int zza;
    private int zzb;
    private UI zzc;
    private JK zzd = JK.f26428u;

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
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (d9 == 3) {
            return new QI();
        }
        if (d9 == 4) {
            return new PI(zze);
        }
        if (d9 == 5) {
            return zze;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzf;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (QI.class) {
            try {
                interfaceC4071vL = zzf;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zze);
                    zzf = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
