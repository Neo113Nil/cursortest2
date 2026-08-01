package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class JH extends VK {
    private static final JH zzd;
    private static volatile InterfaceC4048vL zze;
    private int zza;
    private LH zzb;
    private int zzc;

    static {
        JH jh = new JH();
        zzd = jh;
        VK.u(JH.class, jh);
    }

    public static JH B(JK jk, PK pk) {
        return (JH) VK.m(zzd, jk, pk);
    }

    public static IH C() {
        return (IH) zzd.r();
    }

    public final LH A() {
        LH lh = this.zzb;
        return lh == null ? LH.C() : lh;
    }

    public final /* synthetic */ void D(LH lh) {
        this.zzb = lh;
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
            return new C4264zL(zzd, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d2 == 3) {
            return new JH();
        }
        if (d2 == 4) {
            return new IH(zzd);
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
        synchronized (JH.class) {
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
