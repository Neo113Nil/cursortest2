package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.oH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3667oH extends VK {
    private static final C3667oH zzd;
    private static volatile InterfaceC4048vL zze;
    private int zza;
    private C3775qH zzb;
    private int zzc;

    static {
        C3667oH c3667oH = new C3667oH();
        zzd = c3667oH;
        VK.u(C3667oH.class, c3667oH);
    }

    public static C3559mH C() {
        return (C3559mH) zzd.r();
    }

    public static C3667oH D() {
        return zzd;
    }

    public final C3775qH A() {
        C3775qH c3775qH = this.zzb;
        return c3775qH == null ? C3775qH.C() : c3775qH;
    }

    public final int B() {
        return this.zzc;
    }

    public final /* synthetic */ void E(C3775qH c3775qH) {
        this.zzb = c3775qH;
        this.zza |= 1;
    }

    public final /* synthetic */ void F(int i) {
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d2 == 3) {
            return new C3667oH();
        }
        if (d2 == 4) {
            return new C3559mH(zzd);
        }
        if (d2 == 5) {
            return zzd;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zze;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (C3667oH.class) {
            try {
                interfaceC4048vL = zze;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzd);
                    zze = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
