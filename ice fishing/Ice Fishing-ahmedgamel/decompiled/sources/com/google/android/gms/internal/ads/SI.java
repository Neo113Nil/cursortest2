package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class SI extends VK {
    private static final SI zzd;
    private static volatile InterfaceC4048vL zze;
    private int zza;
    private int zzb;
    private UI zzc;

    static {
        SI si = new SI();
        zzd = si;
        VK.u(SI.class, si);
    }

    public static SI C(JK jk, PK pk) {
        return (SI) VK.m(zzd, jk, pk);
    }

    public static RI D() {
        return (RI) zzd.r();
    }

    public final int A() {
        return this.zzb;
    }

    public final UI B() {
        UI ui = this.zzc;
        return ui == null ? UI.C() : ui;
    }

    public final /* synthetic */ void E(UI ui) {
        this.zzc = ui;
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
            return new C4264zL(zzd, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d2 == 3) {
            return new SI();
        }
        if (d2 == 4) {
            return new RI(zzd);
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
        synchronized (SI.class) {
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
