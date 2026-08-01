package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* renamed from: com.google.android.gms.internal.ads.i9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3337i9 extends VK {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C3337i9 zzf;
    private static volatile InterfaceC4048vL zzg;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        C3337i9 c3337i9 = new C3337i9();
        zzf = c3337i9;
        VK.u(C3337i9.class, c3337i9);
    }

    public static C3283h9 A() {
        return (C3283h9) zzf.r();
    }

    public final void B(int i) {
        this.zzd = AbstractC5049e.d(i);
        this.zzc |= 1;
    }

    public final void C(int i) {
        int i6 = 1;
        if (i == 1) {
            i6 = 0;
        } else if (i != 2) {
            if (i != 3) {
                i6 = 4;
                if (i != 4) {
                    throw null;
                }
            } else {
                i6 = 2;
            }
        }
        this.zze = i6;
        this.zzc |= 2;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzc", "zzd", C3494l6.f31730r, "zze", C3494l6.f31729q});
        }
        if (d2 == 3) {
            return new C3337i9();
        }
        if (d2 == 4) {
            return new C3283h9(zzf);
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
        synchronized (C3337i9.class) {
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
