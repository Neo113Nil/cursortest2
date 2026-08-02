package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class OH extends VK {
    private static final OH zze;
    private static volatile InterfaceC4071vL zzf;
    private int zza;
    private int zzb;
    private QH zzc;
    private JK zzd = JK.f26428u;

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

    public static InterfaceC4071vL F() {
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
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (d9 == 3) {
            return new OH();
        }
        if (d9 == 4) {
            return new MH(zze);
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
        synchronized (OH.class) {
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
