package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.bH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2992bH extends VK {
    private static final C2992bH zze;
    private static volatile InterfaceC4071vL zzf;
    private int zza;
    private int zzb;
    private JK zzc = JK.f26428u;
    private C3206fH zzd;

    static {
        C2992bH c2992bH = new C2992bH();
        zze = c2992bH;
        VK.u(C2992bH.class, c2992bH);
    }

    public static C2992bH D(JK jk, PK pk) {
        return (C2992bH) VK.m(zze, jk, pk);
    }

    public static C2938aH E() {
        return (C2938aH) zze.r();
    }

    public static InterfaceC4071vL F() {
        return zze.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final JK B() {
        return this.zzc;
    }

    public final C3206fH C() {
        C3206fH c3206fH = this.zzd;
        return c3206fH == null ? C3206fH.C() : c3206fH;
    }

    public final /* synthetic */ void G(JK jk) {
        jk.getClass();
        this.zzc = jk;
    }

    public final /* synthetic */ void H(C3206fH c3206fH) {
        this.zzd = c3206fH;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (d9 == 3) {
            return new C2992bH();
        }
        if (d9 == 4) {
            return new C2938aH(zze);
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
        synchronized (C2992bH.class) {
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
