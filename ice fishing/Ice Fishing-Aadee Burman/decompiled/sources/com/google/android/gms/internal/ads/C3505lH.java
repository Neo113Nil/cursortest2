package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.lH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3505lH extends VK {
    private static final C3505lH zze;
    private static volatile InterfaceC4048vL zzf;
    private int zza;
    private int zzb;
    private C3775qH zzc;
    private JK zzd = JK.f25675u;

    static {
        C3505lH c3505lH = new C3505lH();
        zze = c3505lH;
        VK.u(C3505lH.class, c3505lH);
    }

    public static C3451kH D() {
        return (C3451kH) zze.r();
    }

    public static C3505lH E() {
        return zze;
    }

    public final int A() {
        return this.zzb;
    }

    public final C3775qH B() {
        C3775qH c3775qH = this.zzc;
        return c3775qH == null ? C3775qH.C() : c3775qH;
    }

    public final JK C() {
        return this.zzd;
    }

    public final /* synthetic */ void F(C3775qH c3775qH) {
        this.zzc = c3775qH;
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
            return new C3505lH();
        }
        if (d2 == 4) {
            return new C3451kH(zze);
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
        synchronized (C3505lH.class) {
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
