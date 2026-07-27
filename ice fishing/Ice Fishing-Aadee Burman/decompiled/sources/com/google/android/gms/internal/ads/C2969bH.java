package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.bH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2969bH extends VK {
    private static final C2969bH zze;
    private static volatile InterfaceC4048vL zzf;
    private int zza;
    private int zzb;
    private JK zzc = JK.f25675u;
    private C3183fH zzd;

    static {
        C2969bH c2969bH = new C2969bH();
        zze = c2969bH;
        VK.u(C2969bH.class, c2969bH);
    }

    public static C2969bH D(JK jk, PK pk) {
        return (C2969bH) VK.m(zze, jk, pk);
    }

    public static C2915aH E() {
        return (C2915aH) zze.r();
    }

    public static InterfaceC4048vL F() {
        return zze.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final JK B() {
        return this.zzc;
    }

    public final C3183fH C() {
        C3183fH c3183fH = this.zzd;
        return c3183fH == null ? C3183fH.C() : c3183fH;
    }

    public final /* synthetic */ void G(JK jk) {
        jk.getClass();
        this.zzc = jk;
    }

    public final /* synthetic */ void H(C3183fH c3183fH) {
        this.zzd = c3183fH;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (d2 == 3) {
            return new C2969bH();
        }
        if (d2 == 4) {
            return new C2915aH(zze);
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
        synchronized (C2969bH.class) {
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
