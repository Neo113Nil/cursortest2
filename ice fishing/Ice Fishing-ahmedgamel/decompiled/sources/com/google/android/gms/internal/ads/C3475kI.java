package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* renamed from: com.google.android.gms.internal.ads.kI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3475kI extends VK {
    private static final C3475kI zzf;
    private static volatile InterfaceC4071vL zzg;
    private int zza;
    private C3153eI zzb;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        C3475kI c3475kI = new C3475kI();
        zzf = c3475kI;
        VK.u(C3475kI.class, c3475kI);
    }

    public static C3421jI D() {
        return (C3421jI) zzf.r();
    }

    public final boolean A() {
        return (this.zza & 1) != 0;
    }

    public final C3153eI B() {
        C3153eI c3153eI = this.zzb;
        return c3153eI == null ? C3153eI.D() : c3153eI;
    }

    public final int C() {
        return this.zzd;
    }

    public final /* synthetic */ void E(C3153eI c3153eI) {
        this.zzb = c3153eI;
        this.zza |= 1;
    }

    public final /* synthetic */ void F(int i) {
        this.zzd = i;
    }

    public final int G() {
        int i = this.zzc;
        int i4 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }

    public final int H() {
        int g9 = AbstractC3364iD.g(this.zze);
        if (g9 == 0) {
            return 1;
        }
        return g9;
    }

    public final void I(int i) {
        if (i != 1) {
            this.zzc = i - 2;
        } else {
            AbstractC3103dL.a();
            throw null;
        }
    }

    public final void J(int i) {
        if (i != 1) {
            this.zze = i - 2;
        } else {
            AbstractC3103dL.a();
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (d9 == 3) {
            return new C3475kI();
        }
        if (d9 == 4) {
            return new C3421jI(zzf);
        }
        if (d9 == 5) {
            return zzf;
        }
        if (d9 != 6) {
            throw null;
        }
        InterfaceC4071vL interfaceC4071vL2 = zzg;
        if (interfaceC4071vL2 != null) {
            return interfaceC4071vL2;
        }
        synchronized (C3475kI.class) {
            try {
                interfaceC4071vL = zzg;
                if (interfaceC4071vL == null) {
                    interfaceC4071vL = new UK(zzf);
                    zzg = interfaceC4071vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4071vL;
    }
}
