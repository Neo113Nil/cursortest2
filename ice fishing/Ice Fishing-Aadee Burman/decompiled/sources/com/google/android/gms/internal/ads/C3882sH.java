package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.sH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3882sH extends VK {
    private static final C3882sH zze;
    private static volatile InterfaceC4048vL zzf;
    private int zza;
    private int zzb;
    private C4098wH zzc;
    private JK zzd = JK.f25675u;

    static {
        C3882sH c3882sH = new C3882sH();
        zze = c3882sH;
        VK.u(C3882sH.class, c3882sH);
    }

    public static C3882sH D(JK jk, PK pk) {
        return (C3882sH) VK.m(zze, jk, pk);
    }

    public static C3828rH E() {
        return (C3828rH) zze.r();
    }

    public static InterfaceC4048vL F() {
        return zze.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final C4098wH B() {
        C4098wH c4098wH = this.zzc;
        return c4098wH == null ? C4098wH.C() : c4098wH;
    }

    public final JK C() {
        return this.zzd;
    }

    public final /* synthetic */ void G(C4098wH c4098wH) {
        this.zzc = c4098wH;
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
            return new C3882sH();
        }
        if (d2 == 4) {
            return new C3828rH(zze);
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
        synchronized (C3882sH.class) {
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
