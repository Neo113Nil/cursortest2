package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.lH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3528lH extends VK {
    private static final C3528lH zze;
    private static volatile InterfaceC4071vL zzf;
    private int zza;
    private int zzb;
    private C3798qH zzc;
    private JK zzd = JK.f26428u;

    static {
        C3528lH c3528lH = new C3528lH();
        zze = c3528lH;
        VK.u(C3528lH.class, c3528lH);
    }

    public static C3474kH D() {
        return (C3474kH) zze.r();
    }

    public static C3528lH E() {
        return zze;
    }

    public final int A() {
        return this.zzb;
    }

    public final C3798qH B() {
        C3798qH c3798qH = this.zzc;
        return c3798qH == null ? C3798qH.C() : c3798qH;
    }

    public final JK C() {
        return this.zzd;
    }

    public final /* synthetic */ void F(C3798qH c3798qH) {
        this.zzc = c3798qH;
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
            return new C3528lH();
        }
        if (d9 == 4) {
            return new C3474kH(zze);
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
        synchronized (C3528lH.class) {
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
