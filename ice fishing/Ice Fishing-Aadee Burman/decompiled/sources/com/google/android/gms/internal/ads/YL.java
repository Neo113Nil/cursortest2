package com.google.android.gms.internal.ads;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class YL extends VK {
    private static final YL zzd;
    private static volatile InterfaceC4048vL zze;
    private int zza;
    private long zzb;
    private long zzc;

    static {
        YL yl = new YL();
        zzd = yl;
        VK.u(YL.class, yl);
    }

    public static XL A() {
        return (XL) zzd.r();
    }

    public final /* synthetic */ void B(int i) {
        this.zza = i;
    }

    public final /* synthetic */ void C(long j6) {
        this.zzb = j6;
    }

    public final /* synthetic */ void D(long j6) {
        this.zzc = j6;
    }

    @Override // com.google.android.gms.internal.ads.VK
    public final Object w(int i, VK vk) {
        InterfaceC4048vL interfaceC4048vL;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            return (byte) 1;
        }
        if (d2 == 2) {
            return new C4264zL(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zza", "zzb", "zzc"});
        }
        if (d2 == 3) {
            return new YL();
        }
        if (d2 == 4) {
            return new XL(zzd);
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
        synchronized (YL.class) {
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
