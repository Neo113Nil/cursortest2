package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class SI extends VK {
    private static final SI zzd;
    private static volatile InterfaceC4071vL zze;
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
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzd, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d9 == 3) {
            return new SI();
        }
        if (d9 == 4) {
            return new RI(zzd);
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
        synchronized (SI.class) {
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
