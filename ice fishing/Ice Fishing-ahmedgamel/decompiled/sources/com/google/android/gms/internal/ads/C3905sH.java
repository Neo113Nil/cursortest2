package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.sH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3905sH extends VK {
    private static final C3905sH zze;
    private static volatile InterfaceC4071vL zzf;
    private int zza;
    private int zzb;
    private C4121wH zzc;
    private JK zzd = JK.f26428u;

    static {
        C3905sH c3905sH = new C3905sH();
        zze = c3905sH;
        VK.u(C3905sH.class, c3905sH);
    }

    public static C3905sH D(JK jk, PK pk) {
        return (C3905sH) VK.m(zze, jk, pk);
    }

    public static C3851rH E() {
        return (C3851rH) zze.r();
    }

    public static InterfaceC4071vL F() {
        return zze.o();
    }

    public final int A() {
        return this.zzb;
    }

    public final C4121wH B() {
        C4121wH c4121wH = this.zzc;
        return c4121wH == null ? C4121wH.C() : c4121wH;
    }

    public final JK C() {
        return this.zzd;
    }

    public final /* synthetic */ void G(C4121wH c4121wH) {
        this.zzc = c4121wH;
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
            return new C3905sH();
        }
        if (d9 == 4) {
            return new C3851rH(zze);
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
        synchronized (C3905sH.class) {
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
