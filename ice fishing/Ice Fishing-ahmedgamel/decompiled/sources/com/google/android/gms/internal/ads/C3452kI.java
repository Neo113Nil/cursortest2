package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.kI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3452kI extends VK {
    private static final C3452kI zzf;
    private static volatile InterfaceC4048vL zzg;
    private int zza;
    private C3130eI zzb;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        C3452kI c3452kI = new C3452kI();
        zzf = c3452kI;
        VK.u(C3452kI.class, c3452kI);
    }

    public static C3398jI D() {
        return (C3398jI) zzf.r();
    }

    public final boolean A() {
        return (this.zza & 1) != 0;
    }

    public final C3130eI B() {
        C3130eI c3130eI = this.zzb;
        return c3130eI == null ? C3130eI.D() : c3130eI;
    }

    public final int C() {
        return this.zzd;
    }

    public final /* synthetic */ void E(C3130eI c3130eI) {
        this.zzb = c3130eI;
        this.zza |= 1;
    }

    public final /* synthetic */ void F(int i) {
        this.zzd = i;
    }

    public final int G() {
        int i = this.zzc;
        int i6 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i6 == 0) {
            return 1;
        }
        return i6;
    }

    public final int H() {
        int g4 = AbstractC3341iD.g(this.zze);
        if (g4 == 0) {
            return 1;
        }
        return g4;
    }

    public final void I(int i) {
        if (i != 1) {
            this.zzc = i - 2;
        } else {
            AbstractC3080dL.a();
            throw null;
        }
    }

    public final void J(int i) {
        if (i != 1) {
            this.zze = i - 2;
        } else {
            AbstractC3080dL.a();
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (d2 == 3) {
            return new C3452kI();
        }
        if (d2 == 4) {
            return new C3398jI(zzf);
        }
        if (d2 == 5) {
            return zzf;
        }
        if (d2 != 6) {
            throw null;
        }
        InterfaceC4048vL interfaceC4048vL2 = zzg;
        if (interfaceC4048vL2 != null) {
            return interfaceC4048vL2;
        }
        synchronized (C3452kI.class) {
            try {
                interfaceC4048vL = zzg;
                if (interfaceC4048vL == null) {
                    interfaceC4048vL = new UK(zzf);
                    zzg = interfaceC4048vL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4048vL;
    }
}
