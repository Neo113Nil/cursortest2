package com.google.android.gms.internal.ads;

import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class JH extends VK {
    private static final JH zzd;
    private static volatile InterfaceC4071vL zze;
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
        InterfaceC4071vL interfaceC4071vL;
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return (byte) 1;
        }
        if (d9 == 2) {
            return new C4287zL(zzd, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d9 == 3) {
            return new JH();
        }
        if (d9 == 4) {
            return new IH(zzd);
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
        synchronized (JH.class) {
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
