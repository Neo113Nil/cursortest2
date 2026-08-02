package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.oH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3690oH extends VK {
    private static final C3690oH zzd;
    private static volatile InterfaceC4071vL zze;
    private int zza;
    private C3798qH zzb;
    private int zzc;

    static {
        C3690oH c3690oH = new C3690oH();
        zzd = c3690oH;
        VK.u(C3690oH.class, c3690oH);
    }

    public static C3582mH C() {
        return (C3582mH) zzd.r();
    }

    public static C3690oH D() {
        return zzd;
    }

    public final C3798qH A() {
        C3798qH c3798qH = this.zzb;
        return c3798qH == null ? C3798qH.C() : c3798qH;
    }

    public final int B() {
        return this.zzc;
    }

    public final /* synthetic */ void E(C3798qH c3798qH) {
        this.zzb = c3798qH;
        this.zza |= 1;
    }

    public final /* synthetic */ void F(int i) {
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d9 == 3) {
            return new C3690oH();
        }
        if (d9 == 4) {
            return new C3582mH(zzd);
        }
        if (d9 == 5) {
            return zzd;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zze;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (C3690oH.class) {
            try {
                interfaceC4071vL = zze;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzd);
                    zze = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
